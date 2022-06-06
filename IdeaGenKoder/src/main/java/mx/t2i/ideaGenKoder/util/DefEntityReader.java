package mx.t2i.ideaGenKoder.util;

import mx.t2i.ideaGenKoder.mapper.GenOpcgerx0;
import mx.t2i.ideaGenKoder.model.ImportArray;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DefEntityReader extends GenOpcgerx0 {



/*
    public void inputData(String file) {

        String cabeceraSeccion = "";

        String[] cases = {
                "entityObjMap"
                , "entityPojoObjMap"
                , "coreServiceObjMap"
                , "resultListObjMap"
                , "reqListObjMap"
                , "respListObjMap"
                , "entityServiceObjMap"
                , "entityDTOObjMap"
                , "entityResourceObjMap"
                , "attributesObjMap"
                , "searchAttributes"
                , "CoreService"
                , "BizService"
                , "WebService"
                , "importList"
        };
        int i, j;
        j = 0;

        try (
                BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {
                if (line.contains("#")) {
                    cabeceraSeccion = line.substring(1, line.length());
                    System.out.println("Cabecera: " + cabeceraSeccion);
                    j = 100;
                    for (i = 0; i < cases.length; i++) {
                        if (cabeceraSeccion.equals(cases[i]))
                            j = i;
                    }
                    System.out.println("indice out: " + j);
                    line = br.readLine();
                    switch (j) {
                        case 0: //
                            System.out.println("entityDefMap");
                            while (line.contains(":") && !(line.contains("#"))) {//while (line.contains("FTL")) {
                                System.out.println("Valor de: " + cabeceraSeccion + " " + line);
                                entityDefMap.put(line.substring(0, line.indexOf(":")), line.substring(line.indexOf(":") + 2, line.length()));
                                line = br.readLine();
                            }
                            System.out.println(entityDefMap.keySet());
                            break;
                        case 1: //
                            System.out.println("entityPojoDefMap");
                            while (line.contains(":") && !(line.contains("#"))) {//while (line.contains("FTL")) {
                                System.out.println("Valor de: " + cabeceraSeccion + " " + line);
                                entityPojoDefMap.put(line.substring(0, line.indexOf(":")), line.substring(line.indexOf(":") + 2, line.length()));
                                line = br.readLine();
                            }
                            System.out.println(entityPojoDefMap.keySet());
                            break;
                        case 2:
                            System.out.println("coreServiceDefMap");
                            while (line.contains(":") && !(line.contains("#"))) {//while (line.contains("FTL")) {
                                System.out.println("Valor de: " + cabeceraSeccion + " " + line);
                                coreServiceDefMap.put(line.substring(0, line.indexOf(":")), line.substring(line.indexOf(":") + 2, line.length()));
                                line = br.readLine();
                            }
                            System.out.println(coreServiceDefMap.keySet());
                            break;
                        case 3: //
                            while (line.contains(":") && !(line.contains("#"))) {//while (line.contains("FTL")) {
                                System.out.println("Valor de: " + cabeceraSeccion + " " + line);
                                resultListDefMap.put(line.substring(0, line.indexOf(":")), line.substring(line.indexOf(":") + 2, line.length()));
                                line = br.readLine();
                            }
                            System.out.println(resultListDefMap.keySet());
                            break;
                        case 4:
                            System.out.println("reqListDefMap");
                            while (line.contains(":") && !(line.contains("#"))) {//while (line.contains("FTL")) {
                                System.out.println("Valor de: " + cabeceraSeccion + " " + line);
                                reqListDefMap.put(line.substring(0, line.indexOf(":")), line.substring(line.indexOf(":") + 2, line.length()));
                                line = br.readLine();
                            }
                            System.out.println(reqListDefMap.keySet());
                            break;
                        case 5:
                            System.out.println("#respListDefMap");
                            while (line.contains(":") && !(line.contains("#"))) {//while (line.contains("FTL")) {
                                System.out.println("Valor de: " + cabeceraSeccion + " " + line);
                                respListDefMap.put(line.substring(0, line.indexOf(":")), line.substring(line.indexOf(":") + 2, line.length()));
                                line = br.readLine();
                            }
                            System.out.println(respListDefMap.keySet());
                            System.out.println(respListDefMap.values());
                            System.out.println(respListDefMap);
                            //String mStringArray[] = respListDefMap;//{ "String1", "String2" };
                            //JSONArray mJSONArray = new JSONArray(Arrays.asList(mStringArray));
                            //System.out.println(mJSONArray);
                            break;
                        case 6:
                            System.out.println("#entityServiceDefMap");
                            while (line.contains(":") && !(line.contains("#"))) {//while (line.contains("FTL")) {
                                System.out.println("Valor de: " + cabeceraSeccion + " " + line);
                                entityServiceDefMap.put(line.substring(0, line.indexOf(":")), line.substring(line.indexOf(":") + 2, line.length()));
                                line = br.readLine();
                            }
                            System.out.println(respListDefMap.keySet());
                            break;
                        case 7:
                            System.out.println("entityDTODefMap");
                            while (line.contains(":") && !(line.contains("#"))) {//while (line.contains("FTL")) {
                                System.out.println("Valor de: " + cabeceraSeccion + " " + line);
                                entityDTODefMap.put(line.substring(0, line.indexOf(":")), line.substring(line.indexOf(":") + 2, line.length()));
                                line = br.readLine();
                            }
                            System.out.println(entityDTODefMap.keySet());
                            break;
                        case 8:
                            System.out.println("entityResourceDefMap");
                            while (line.contains(":") && !(line.contains("#"))) {//while (line.contains(",")) {
                                System.out.println("Valor de: " + cabeceraSeccion + " " + line);
                                entityResourceDefMap.put(line.substring(0, line.indexOf(":")), line.substring(line.indexOf(":") + 2, line.length()));
                                line = br.readLine();
                            }
                            System.out.println(entityResourceDefMap.keySet());
                            break;
                        case 9:
                            this.readAttributes(br, cabeceraSeccion, line, fieldAttributes);
                            System.out.println(attributesDefMap.keySet());
                            System.out.println(attributesDefMap.values());
                            break;
                        case 10:
                            readAttributes(br, cabeceraSeccion, line, searchAttributes);
                            System.out.println(attributesDefMap.keySet());
                            System.out.println(attributesDefMap.values());
                            break;
                        case 11:
                            System.out.println("dataFileCore");
                            while (line.contains(":") && !(line.contains("#"))) {
                                System.out.println("Valor de: " + cabeceraSeccion);
                                dataFileCore.put(line.substring(0, line.indexOf(":")), line.substring(line.indexOf(":") + 2, line.length()));
                                line = br.readLine();
                                System.out.println("siguiente ftl de: " + line);
                            }
                            System.out.println(dataFileCore.keySet());
                            System.out.println(dataFileCore.get("entityFtlFileName"));
                            break;
                        case 12: //
                            System.out.println("Biz");
                            while (line.contains(":") && !(line.contains("#"))) { //line.contains("entity") &&
                                System.out.println("ftl de: " + cabeceraSeccion + " " + line);
                                dataFileBizService.put(line.substring(0, line.indexOf(":")), line.substring(line.indexOf(":") + 2, line.length()));
                                line = br.readLine();
                            }
                            System.out.println(dataFileBizService.keySet());
                            System.out.println(dataFileBizService.values());
                            break;
                        case 13: //
                            System.out.println("WebServer");
                            while (line.contains(":") && !(line.contains("#"))) {//line.contains("entity") &&
                                System.out.println("Valor de: " + cabeceraSeccion);
                                dataFileWebService.put(line.substring(0, line.indexOf(":")), line.substring(line.indexOf(":") + 2, line.length()));
                                line = br.readLine();
                            }
                            System.out.println(dataFileWebService.keySet());
                            System.out.println(dataFileWebService.values());
                            break;
                        case 14: //
                            System.out.println("importList");
                            while ((line.length() > 0) || !(line.contains("#"))) {//line.contains("entity") &&
                                if (line.length() == 0)
                                    break;
                                System.out.println("Valor de: " + cabeceraSeccion);
                                //fieldAttributes.add(new FtlAttribute(tipo, dato, valor));
                                importArray.add(new ImportArray(line));
                                //dataImportList.put(line.substring(0,line.indexOf(":")),line.substring(line.indexOf(":")+2,line.length()));
                                line = br.readLine();
                                if (line.length() == 0)
                                    break;
                            }
                            System.out.println(importArray);
                            //System.out.println(JSON.Stringfy (importArray));

                            //System.out.println(dataFileWebService.values());
                            break;
                        default:
                            System.out.println("DEFAULT ");
                    }
                }
                //System.out.println("Fin de case");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
*/



}
