package mx.t2i.ideaGenKoder.mapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import freemarker.core.ParseException;
import freemarker.template.Configuration;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;
import mx.t2i.ideaGenKoder.Config;
import mx.t2i.ideaGenKoder.model.FtlAttribute;
import mx.t2i.ideaGenKoder.model.ImportArray;

import java.io.BufferedReader;
import java.io.FileReader;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

public class DefEntityReader2 {

        private Configuration config;
        private List<FtlAttribute> searchAttributes;///searchAttributesList
        private List<FtlAttribute> fieldAttributes;///fieldAttributesList
        private List<ImportArray> importArray;// 2022-05-26 ggm: Para el manejo de las cabeceras de imports en las plantillas
        
        private String entityFtlFileName = "";// "src.main.java.mx.t2i.opcger.core.model/Opcgerx0.ftl.java";///entityFtlFileName 
        private String entityOutFileName = "";///entityOutFileName 
        private Template entityTemplate;//Opcgerx0;///entityTemplate 
        private Map<String, String> entityDefMap;///entityDefMap
        private Map<String, Object> entityObjMap;///entityObjMap

        private String entityPojoFtlFileName = "";///entityPojoFtlFileName
        private String entityPojoOutFileName = "";///entityPojoOutFileName
        private Template entityPojoTemplate;///entityPojoTemplate 
        private Map<String, String> entityPojoDefMap;///entityPojoDefMap
        private Map<String, Object> entityPojoObjMap;///entityPojoObjMap
        
        private String coreServiceFtlFileName = "";///coreServiceFtlFileName
        private String coreServiceOutFileName = "";///coreServiceOutFileName
        private Template coreServiceTemplate;///coreServiceTemplate
        private Map<String, String> coreServiceDefMap;///coreServiceDefMap
        private Map<String, Object> coreServiceObjMap;///coreServiceObjMap
        
        private String resultListFtlFileName = "";///resultListFtlFileName
        private String resultListOutFileName = "";///resultListOutFileName
        private Template resultListTemplate;///resultListTemplate ftlResultOpcgerList
        private Map<String, String> resultListDefMap;///resultListDefMap
        private Map<String, Object> resultListObjMap;///resultListObjMap
        
        private String reqListFtlFileName = "";///reqListFtlFileName
        private String reqListOutFileName = "";///reqListOutFileName
        private Template reqListTemplate;///reqListTemplate
        private Map<String, String> reqListDefMap;///reqListDefMap
        private Map<String, Object> reqListObjMap;///reqListObjMap
             
        private String respListFtlFileName = "";///respListFtlFileName
        private String respListOutFileName = "";///respListOutFileName
        private Template respListTemplate;///respListTemplate
        private Map<String, String> respListDefMap;///respListDefMap
        private Map<String, Object> respListObjMap;///respListObjMap

        // Variables de tiigcaye
        private String entityServiceFtlFileName = "";///itemServiceFtlFileName
        private String entityServiceOutFileName = "";///itemServiceOutFileName
        private Template entityServiceTemplate;///itemServiceTemplate
        private Map<String, String> entityServiceDefMap;///itemServiceDefMap
        private Map<String, Object> entityServiceObjMap;///itemServiceObjMap

        private String entityDTOFtlFileName = "";///itemDTOFtlFileName
        private String entityDTOutFileNam = "";///itemDTOutFileNam
        private Template entityDTOTemplate;///itemDTOTemplate
        private Map<String, String> entityDTODefMap;///itemDTODefMap
        private Map<String, Object> entityDTOObjMap;///itemDTOObjMap
                
        private String entityResourceFtlFileName = "";///itemResourceFtlFileName
        private String entityResourceOutFileName = "";///itemResourceOutFileName
        private Template entityResourceTemplate;///itemResourceTemplate
        private Map<String, String> entityResourceDefMap;///itemResourceDefMap
        private Map<String, Object> entityResourceObjMap;///itemResourceObjMap
               
        private Map<String, Object> attributesObjMap = new HashMap<>();///attributesObjMap
        private Map<String, Object> dataSourceCore= new HashMap<>();
        private Map<String, Object> dataSourceBizService = new HashMap<>();
        private Map<String, Object> dataSourceWebService = new HashMap<>();
        
        private Map<String, String> attributesDefMap = new HashMap<>();///attributesDefMap
        private Map<String, String> dataFileCore= new HashMap<>();;
        private Map<String, String> dataFileBizService = new HashMap<>();
        private Map<String, String> dataFileWebService = new HashMap<>();        

        public DefEntityReader2() {
            searchAttributes = new ArrayList<FtlAttribute>();
            fieldAttributes = new ArrayList<FtlAttribute>();
            importArray = new ArrayList<ImportArray>();
        }

        public Configuration getConfig() {
            return config;
        }

        public void setConfig(Configuration config) {
            this.config = config;
        }

        public void inputData(String file) {
            
        	String line;
            entityDefMap            = new HashMap<>();
            entityPojoDefMap        = new HashMap<>();
            coreServiceDefMap       = new HashMap<>();
            resultListDefMap        = new HashMap<>();
            reqListDefMap           = new HashMap<>();
            respListDefMap          = new HashMap<>();
            entityServiceDefMap     = new HashMap<>();
            entityDTODefMap         = new HashMap<>();
            entityResourceDefMap    = new HashMap<>();
            attributesDefMap        = new HashMap<>(); 
            dataFileCore            = new HashMap<>();  
            dataFileBizService      = new HashMap<>();  
            dataFileWebService      = new HashMap<>();  
            
            entityObjMap            = new HashMap<>();
            entityPojoObjMap        = new HashMap<>();
            coreServiceObjMap       = new HashMap<>();
            resultListObjMap        = new HashMap<>(); 
            reqListObjMap           = new HashMap<>(); 
            respListObjMap          = new HashMap<>(); 
            entityServiceObjMap     = new HashMap<>();
            entityDTOObjMap         = new HashMap<>(); 
            entityResourceObjMap    = new HashMap<>(); 
            attributesObjMap        = new HashMap<>(); 
            dataSourceCore          = new HashMap<>();                  
            dataSourceBizService    = new HashMap<>();  
            dataSourceWebService    = new HashMap<>();  	
        /**************/
        try {	
         JsonFactory factory = new JsonFactory();
        
         // Create JsonParser
         File archivo = new File(file);
         
         JsonParser parser = factory.createParser(archivo);
         //20202-06-02 ggm: Para leer elarchivo se dividia n secciones para los Arrays y para los objetos
         //1. Lectura de imports
         JsonToken token = parser.nextToken(); // Read first object i.e. {
         System.out.println("Primer Caracter : " + parser.getText());

         token = parser.nextToken();
         System.out.println("segundo Caracter : " + parser.getText());
         token = parser.nextToken();
         if (token == JsonToken.FIELD_NAME && "importList".equals(parser.getCurrentName())) {

             System.out.println("Los imports son - ");
             token = parser.nextToken(); // // Read left bracket i.e. [
             // Loop to print array elements until right bracket i.e ]
             while (token != JsonToken.END_ARRAY) {
                 token = parser.nextToken();
                 	
                 if (token == JsonToken.VALUE_STRING) {
                	 importArray.add(new ImportArray(parser.getText()));
                	 System.out.println(parser.getText());
                 }
             }
             System.out.println("importArray "+importArray);
         }
         
         token = parser.nextToken();
         token = parser.nextToken();
         token = parser.nextToken();
         //token = parser.nextToken();
         System.out.println("x Caracter  " + parser.getText());
         //token = parser.nextToken();
         //System.out.println("y Caracter  " + parser.getText());

         token = parser.nextToken();
         token = parser.nextToken();
         
         if (token == JsonToken.FIELD_NAME && "attributesObjMap".equals(parser.getCurrentName())) {

             System.out.println("Objeto respListObjMap  - ");
             token = parser.nextToken(); // // Read left bracket i.e. [
             // Loop to print array elements until right bracket i.e ]
             while (token != JsonToken.END_OBJECT) {
                 token = parser.nextToken();

                 if (token == JsonToken.VALUE_STRING) {
                     respListDefMap.put(parser.getCurrentName(),parser.getText());
                     System.out.println( parser.getCurrentName()+" "+parser.getText());
                 }
             }
             System.out.println(respListDefMap.keySet());
             System.out.println(respListDefMap.values());
         }
         
         if (token == JsonToken.FIELD_NAME && "respListObjMap".equals(parser.getCurrentName())) {

             System.out.println("Objeto respListObjMap  - ");
             token = parser.nextToken(); // // Read left bracket i.e. [
             // Loop to print array elements until right bracket i.e ]
             while (token != JsonToken.END_OBJECT) {
                 token = parser.nextToken();

                 if (token == JsonToken.VALUE_STRING) {
                     respListDefMap.put(parser.getCurrentName(),parser.getText());
                     System.out.println( parser.getCurrentName()+" "+parser.getText());
                 }
             }
             System.out.println(respListDefMap.keySet());
             System.out.println(respListDefMap.values());
         }
         System.out.println("x Caracter  " + parser.getText());

         parser.close();
    	} catch (IOException e) {
    	    e.printStackTrace();
    	}  catch (Exception e) {
    	    e.printStackTrace();
    	}
        	/***************/
        	
        	System.out.println("Clase DefEntity: "+file);
        	String cabeceraSeccion  = "";
            
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
            int i,j;
            j=0;

            try(BufferedReader br = new BufferedReader(new FileReader(file))) 
            {
                

                while ((line = br.readLine()) != null) {
                    if (line.contains("#")) {
                        cabeceraSeccion=line.substring(1,line.length());
                        System.out.println("Cabecera: "+cabeceraSeccion);
                        j=100;
                        for(i = 0; i < cases.length; i++) {
                            if(cabeceraSeccion.equals(cases[i]))
                                j=i;
                        }
                        System.out.println("indice out: "+j);
                        line = br.readLine();
                        switch(j) {
                            case 0: //
                                System.out.println("entityDefMap");
                                  while (line.contains(":") && !(line.contains("#"))) {//while (line.contains("FTL")) {
                                     System.out.println("Valor de: "+cabeceraSeccion + " " +line);
                                     entityDefMap.put(line.substring(0,line.indexOf(":")),line.substring(line.indexOf(":")+2,line.length()));
                                     line = br.readLine();
                                  }
                                System.out.println(entityDefMap.keySet());
                                break;
                            case 1: //
                                System.out.println("entityPojoDefMap");
                                 while (line.contains(":") && !(line.contains("#"))) {//while (line.contains("FTL")) {
                                    System.out.println("Valor de: "+cabeceraSeccion + " " +line);
                                    entityPojoDefMap.put(line.substring(0,line.indexOf(":")),line.substring(line.indexOf(":")+2,line.length()));
                                    line = br.readLine();
                                 }
                                 System.out.println(entityPojoDefMap.keySet());
                            break;
                            case 2: 
                                System.out.println("coreServiceDefMap");
                                while (line.contains(":") && !(line.contains("#"))) {//while (line.contains("FTL")) {
                                    System.out.println("Valor de: "+cabeceraSeccion + " " +line);
                                    coreServiceDefMap.put(line.substring(0,line.indexOf(":")),line.substring(line.indexOf(":")+2,line.length()));
                                    line = br.readLine();
                                }
                                System.out.println(coreServiceDefMap.keySet());
                                break;
                            case 3: //
                                while (line.contains(":") && !(line.contains("#"))) {//while (line.contains("FTL")) {
                                    System.out.println("Valor de: "+cabeceraSeccion + " " +line);
                                    resultListDefMap.put(line.substring(0,line.indexOf(":")),line.substring(line.indexOf(":")+2,line.length()));
                                    line = br.readLine();
                                }
                                System.out.println(resultListDefMap.keySet());
                                break;
                            case 4: 
                                System.out.println("reqListDefMap");
                                while (line.contains(":") && !(line.contains("#"))) {//while (line.contains("FTL")) {
                                    System.out.println("Valor de: "+cabeceraSeccion + " " +line);
                                    reqListDefMap.put(line.substring(0,line.indexOf(":")),line.substring(line.indexOf(":")+2,line.length()));
                                    line = br.readLine();
                                }
                                System.out.println(reqListDefMap.keySet());
                                break;
                            case 5:
                                System.out.println("#respListDefMap");
                                while (line.contains(":") && !(line.contains("#"))) {//while (line.contains("FTL")) {
                                    System.out.println("Valor de: "+cabeceraSeccion + " " +line);
                                    respListDefMap.put(line.substring(0,line.indexOf(":")),line.substring(line.indexOf(":")+2,line.length()));
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
                                    System.out.println("Valor de: "+cabeceraSeccion + " " +line);
                                    entityServiceDefMap.put(line.substring(0,line.indexOf(":")),line.substring(line.indexOf(":")+2,line.length()));
                                    line = br.readLine();
                                }
                                System.out.println(respListDefMap.keySet());
                                break;
                            case 7:
                                System.out.println("entityDTODefMap");
                                while (line.contains(":") && !(line.contains("#"))) {//while (line.contains("FTL")) {
                                    System.out.println("Valor de: "+cabeceraSeccion + " " +line);
                                    entityDTODefMap.put(line.substring(0,line.indexOf(":")),line.substring(line.indexOf(":")+2,line.length()));
                                    line = br.readLine();
                                }
                                System.out.println(entityDTODefMap.keySet());
                                break;
                            case 8: 
                                System.out.println("entityResourceDefMap");
                                while (line.contains(":") && !(line.contains("#"))) {//while (line.contains(",")) {
                                    System.out.println("Valor de: "+cabeceraSeccion + " " +line);
                                    entityResourceDefMap.put(line.substring(0,line.indexOf(":")),line.substring(line.indexOf(":")+2,line.length()));
                                    line = br.readLine();
                                }
                                System.out.println(entityResourceDefMap.keySet());
                                break;
                            case 9:
                                readAttributes(br, cabeceraSeccion, line, fieldAttributes);
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
                                    System.out.println("Valor de: "+cabeceraSeccion);
                                    dataFileCore.put(line.substring(0,line.indexOf(":")),line.substring(line.indexOf(":")+2,line.length()));
                                    line = br.readLine();
                                    System.out.println("siguiente ftl de: "+line);
                                    }
                                System.out.println(dataFileCore.keySet());
                                System.out.println(dataFileCore.get("entityFtlFileName"));
                                break;
                            case 12: //
                                System.out.println("Biz");
                                while (line.contains(":") && !(line.contains("#"))) { //line.contains("entity") && 
                                    System.out.println("ftl de: "+cabeceraSeccion +" "+line);
                                    dataFileBizService.put(line.substring(0,line.indexOf(":")),line.substring(line.indexOf(":")+2,line.length()));
                                    line = br.readLine();
                                }
                                System.out.println(dataFileBizService.keySet());
                                System.out.println(dataFileBizService.values());
                                break;
                            case 13: //
                                System.out.println("WebServer");
                                while (line.contains(":") && !(line.contains("#"))) {//line.contains("entity") && 
                                    System.out.println("Valor de: "+cabeceraSeccion);
                                    dataFileWebService.put(line.substring(0,line.indexOf(":")),line.substring(line.indexOf(":")+2,line.length()));
                                    line = br.readLine();
                                }
                                System.out.println(dataFileWebService.keySet());
                                System.out.println(dataFileWebService.values());
                                break;
                            case 14: //
                                System.out.println("importList");
                                while ( (line.length() > 0) || !(line.contains("#")) ) {//line.contains("entity") && 
                                    if (line.length() == 0) 
                                        break;
                                	System.out.println("Valor de: "+cabeceraSeccion);
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
            }
            catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            //return data;
        }
       
        private void readAttributes(BufferedReader br, String cabeceraSeccion, String line, List<FtlAttribute> ftlAttributes) throws IOException {
            System.out.println("attributesObjMap: " +line);
            int k =0;
            int finType, finDato,ixValue = 0;
            String datoValor = "";
            String tipo = "";
            String dato = "";
            String valor ="";
            while ( (line.length() > 0) || !(line.contains("#")) ) { //line.contains(",") &&   //&& !(line.contains("") ) ) { //contains(""   || !(line.length()>0)
                System.out.println("*Valor de: "+cabeceraSeccion + " "+line);
                if (line.length() == 0) 
                    break;
                finType = line.indexOf(" ");
                tipo = line.substring(1, finType -2);
                //System.out.println("tipo:" + tipo);
                datoValor = line.substring(finType+1,line.length() );
                //System.out.println("DatoValor::" + datoValor);
                finDato =  datoValor.indexOf(" ");
                dato = datoValor.substring( 1 ,finDato -2  );// line.substring(line.indexOf(" ")+2 ,
                valor= datoValor.substring( finDato+2 ,datoValor.length() -1 );
                //System.out.println("datoValor:" + k +" " +datoValor);
                //System.out.println("dato:"+ dato+ "--- Valor: "+valor);
                //System.out.println( line.substring(0,finType) + " ---" );//+ datoValor.substring(line.indexOf(" ")+2 , datoValor.lenght() ) );
                //attributesDefMap.put(String.valueOf( k ),line);//line.substring(0,line.indexOf(":")),line.substring(line.indexOf(":")+2,line.length()));

                //System.out.println("Valor de: "+cabeceraSeccion + "l??nea: " +k +": "+line +"(line.length()"+(line.length()));
                ftlAttributes.add(new FtlAttribute(tipo, dato, valor));
                //fieldAttributes.add(new FtlAttribute("respCliente", "String", "null"));
                finType=0;
                finDato=0;//,ixValu
                k++;
                line = br.readLine();
                if (line.length() == 0) 
                    break;
            }
            
        }

        
        public void input() throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, IOException
        {
            //Instantiate template ( https://freemarker.apache.org/docs/pgui_quickstart_gettemplate.html ) 
            /* Templates are represented by freemarker.template.Template instances. 
             * Typically you obtain a Template instance from the Configuration instance, using its getTemplate method. 
             * If you store the example template in the /where/you/store/templates/YourTemplate.ftlh file of the earlier set directory, then you can load it doing this:
             */
          //  entityTemplate = config.getTemplate(entityDefMap.get("entityFtlFileName"));
          //  entityPojoTemplate = config.getTemplate(entityPojoDefMap.get("entityPojoFtlFileName"));
          //  coreServiceTemplate = config.getTemplate(coreServiceDefMap.get("coreServiceFtlFileName"));
          //  resultListTemplate = config.getTemplate(resultListDefMap.get("resultListFtlFileName"));
          //  reqListTemplate = config.getTemplate(reqListDefMap.get("reqListFtlFileName"));
            respListTemplate = config.getTemplate(respListDefMap.get("respListFtlFileName"));
          //  entityServiceTemplate = config.getTemplate(entityServiceDefMap.get("entityServiceFtlFileName"));
          //  entityDTOTemplate = config.getTemplate(entityDTODefMap.get("entityDTOFtlFileName"));
          //  entityResourceTemplate = config.getTemplate(entityResourceDefMap.get("entityResourceFtlFileName"));
            
            /* This gives you a Template instance that was created by reading /where/you/store/templates/YourTemplate.ftlh 
             * and parsing it. The Template instance stores the template in parsed form, and not as text. 
             * If the template is missing or syntactically incorrect, getTemplate will throw exception instead.
             * 
             * Configuration caches Template instances, so when you call config.getTemplate("YourTemplate.ftlh") next time,
             * it probably won't read and parse the template file again, just returns the same Template instance as for the first time.
             */

            //Create Data Model ( https://freemarker.apache.org/docs/pgui_quickstart_createdatamodel.html )
            /* (...) As demonstrated above, for hashes (something that stores other named items) 
             * you can use either a Map or any kind of public class that has public getXxx/isXxx methods as prescribed by the JavaBeans specification.
             */
            entityObjMap = new HashMap<>();
            entityObjMap.put("FTL_searchAttributes"     , searchAttributes);
            entityObjMap.put("FTL_fieldAttributes"      , fieldAttributes);
            entityObjMap.put("FTL_package"              , entityDefMap.get("FTL_package"));//"t2iSabeOpcger.opcger");
            entityObjMap.put("FTL_Model"                , entityDefMap.get("FTL_Model"));//"Opcgerx0");
            entityObjMap.put("FTL_model"                , entityDefMap.get("FTL_model"));//"opcgerx0");
            entityObjMap.put("FTL_MODEL"                , entityDefMap.get("FTL_MODEL"));//"OPCGERX0");
            entityObjMap.put("FTL_ListVO"               , entityDefMap.get("FTL_ListVO"));//"Opcgerx0VO");
            entityObjMap.put("FTL_CORE_PROGRAM"         , entityPojoDefMap.get("FTL_CORE_PROGRAM" ));//"OPCGERX0");
            
            entityPojoObjMap = new HashMap<>();
            entityPojoObjMap.put("FTL_searchAttributes" , searchAttributes);
            entityPojoObjMap.put("FTL_fieldAttributes"  , fieldAttributes);
            entityPojoObjMap.put("FTL_package"             , entityPojoDefMap.get("FTL_package"));// "t2iSabeOpcger.opcger");
            entityPojoObjMap.put("FTL_Model"               , entityPojoDefMap.get("FTL_Model"           ));//"Opcgerx0VO");
            entityPojoObjMap.put("FTL_model"               , entityPojoDefMap.get("FTL_model"           ));//"opcgerx0VO");
            entityPojoObjMap.put("FTL_MODEL"               , entityPojoDefMap.get("FTL_MODEL"           ));//"OPCGERX0VO");
            entityPojoObjMap.put("FTL_CORE_PROGRAM"        , entityPojoDefMap.get("FTL_CORE_PROGRAM" ));//"OPCGERX0");
            entityPojoObjMap.put("FTL_ListVO"              , entityPojoDefMap.get("FTL_ListVO"          ));//"Opcgerx0VO");
     
            coreServiceObjMap = new HashMap<>();
            coreServiceObjMap.put("FTL_searchAttributes" , searchAttributes);
            coreServiceObjMap.put("FTL_fieldAttributes"  , fieldAttributes);
            coreServiceObjMap.put("FTL_package"         , coreServiceDefMap.get("FTL_package"));//"mx.t2i.sabe.opcger.core.service");
            coreServiceObjMap.put("FTL_CoreService"       , coreServiceDefMap.get("FTL_CoreService" ));//"Opcgerx0CoreService");
            coreServiceObjMap.put("FTL_coreService"       , coreServiceDefMap.get("FTL_coreService" ));//"opcgerx0CoreService");
            coreServiceObjMap.put("FTL_CORESERVICE"       , coreServiceDefMap.get("FTL_CORESERVICE" ));//"OPCGERX0CoreService");
            coreServiceObjMap.put("FTL_CORE_SYSTEM"       , coreServiceDefMap.get("FTL_CORE_SYSTEM" ));//"TIIGCAYE");
            coreServiceObjMap.put("FTL_CORE_PROGRAM"       , coreServiceDefMap.get("FTL_CORE_PROGRAM"));//"OPCGERZ0");
            coreServiceObjMap.put("FTL_ListVO"          , coreServiceDefMap.get("FTL_ListVO"      ));//"Opcgerx0VO");
            
            resultListObjMap = new HashMap<>();
            resultListObjMap.put("FTL_searchAttributes" , searchAttributes);
            resultListObjMap.put("FTL_fieldAttributes"  , fieldAttributes);
            resultListObjMap.put("FTL_package"             , resultListDefMap.get("FTL_package"));//"mx.t2i.sabe.opcger.biz.model");
            resultListObjMap.put("FTL_ResultList"       , resultListDefMap.get("FTL_ResultList"));//"ResultOpcgerList");
            resultListObjMap.put("FT_resultList"           , resultListDefMap.get("FT_resultList" ));//"resultOpcgerList");

            reqListObjMap = new HashMap<>();
            reqListObjMap.put("FTL_searchAttributes"     , searchAttributes);
            reqListObjMap.put("FTL_fieldAttributes"      , fieldAttributes);
            reqListObjMap.put("FTL_package"             , reqListDefMap.get("FTL_package" ));//"mx.t2i.sabe.opcger.ws.model");
            reqListObjMap.put("FTL_ReqList"               , reqListDefMap.get("FTL_ReqList" ));//"ReqOpcgerList");
            reqListObjMap.put("FT_reqtList"               , reqListDefMap.get("FT_reqtList" ));//"reqOpcgerList");
         
            respListObjMap = new HashMap<>();
            respListObjMap.put("FTL_searchAttributes"     , searchAttributes);
            respListObjMap.put("FTL_fieldAttributes"      , fieldAttributes);
            respListObjMap.put("FTL_package"             , respListDefMap.get("FTL_package"     ));//"mx.t2i.sabe.opcger.ws.model");
            respListObjMap.put("FTL_RespList"           , respListDefMap.get("FTL_RespList"  ));
            respListObjMap.put("FTL_ResultList"           , respListDefMap.get("FTL_ResultList"));
            respListObjMap.put("FT_respList"               , respListDefMap.get("FT_respList"   ));
            respListObjMap.put("FTL_Model"               , respListDefMap.get("FTL_Model"  ));// Se adiciona por respRecobertura
            respListObjMap.put("FTL_model"               , respListDefMap.get("FTL_model"  ));// Se adiciona por Registrarsolicitud biz Service
            respListObjMap.put("FTL_instanceOf"           , respListDefMap.get("FTL_instanceOf"  ));// Se adiciona por respRecobertura
            respListObjMap.put("FTL_imports"               , importArray  );// Se adiciona para adicionar imports a las clases
            respListObjMap.put("FTL_extends"               , respListDefMap.get("FTL_extends"  ));// Se adiciona para adicionar imports a las clases
            respListObjMap.put("FTL_CoreService"       , respListDefMap.get("FTL_CoreService" ));//"Polgmcc0CoreService");
            respListObjMap.put("FTL_coreService"       , respListDefMap.get("FTL_coreService" ));//"Polgmcc0CoreService");
            respListObjMap.put("FTL_coreModel"       , respListDefMap.get("FTL_coreModel" ));//"Polgmcc0CoreService");
            respListObjMap.put("FTL_core"       , respListDefMap.get("FTL_core" ));//"Polgmcc0CoreService");
            respListObjMap.put("FTL_Core"       , respListDefMap.get("FTL_Core" ));//"Polgmcc0CoreService");
            respListObjMap.put("FTL_CORE_SYSTEM"       , respListDefMap.get("FTL_CORE_SYSTEM" ));//"TIIGCAYE");
            respListObjMap.put("FTL_CORE_PROGRAM"       , respListDefMap.get("FTL_CORE_PROGRAM"));//"OPCGERZ0");

            
            entityServiceObjMap = new HashMap<>();
            entityServiceObjMap.put("FTL_searchAttributes"     , searchAttributes);
            entityServiceObjMap.put("FTL_fieldAttributes"      , fieldAttributes);
            entityServiceObjMap.put("FTL_package"             , entityServiceDefMap.get("FTL_package"     ));//"mx.t2i.tiigcaye.service"); // Revisar sino falta .criteria
            entityServiceObjMap.put("FTL_Service"               , entityServiceDefMap.get("FTL_Service"       ));//"OpcgerService");
            entityServiceObjMap.put("FTL_CoreService"         , entityServiceDefMap.get("FTL_CoreService" ));// "Opcgerx0CoreService");
            entityServiceObjMap.put("FTL_coreService"           , entityServiceDefMap.get("FTL_coreService" ));//"opcgerx0CoreService");
            entityServiceObjMap.put("FTL_Model"               , entityServiceDefMap.get("FTL_Model"       ));//"Opcgerx0");
            entityServiceObjMap.put("FT_respList"               , entityServiceDefMap.get("FT_respList"       ));//"respOpcgerList");

            entityDTOObjMap = new HashMap<>();
            entityDTOObjMap.put("FTL_package"                 , entityDTODefMap.get("FTL_package"));//"mx.t2i.tiigcaye.service.dto");
            entityDTOObjMap.put("FTL_ClassDTO"                 , entityDTODefMap.get("FTL_ClassDTO" ));//"OpcgerDTO");
            entityDTOObjMap.put("FTL_CatDTO"                  , entityDTODefMap.get("FTL_CatDTO" ));//CatramosDTO");
            entityDTOObjMap.put("FTL_catDTO"                  , entityDTODefMap.get("FTL_catDTO" ));// "catramosDTO");
            entityDTOObjMap.put("FTL_Cat"                     , entityDTODefMap.get("FTL_Cat" ));// "Catramos");
            entityDTOObjMap.put("FTL_cat"                     , entityDTODefMap.get("FTL_cat" ));// "catramos");
        
            entityResourceObjMap = new HashMap<>();
            entityResourceObjMap.put("FTL_package"             , entityResourceDefMap.get("FTL_package"     ));//"mx.t2i.tiigcaye.web.rest");
            entityResourceObjMap.put("FTL_Class"                 , entityResourceDefMap.get("FTL_Class"         ));//"OpcgerResource");
            entityResourceObjMap.put("FTL_opcGer"                , entityResourceDefMap.get("FTL_opcGer"        ));//"t2iSabeOpcger");
            entityResourceObjMap.put("FTL_model"                 , entityResourceDefMap.get("FTL_model"         ));//"opcger");
            entityResourceObjMap.put("FTL_Model"                 , entityResourceDefMap.get("FTL_Model"         ));//"Opcger");
            entityResourceObjMap.put("FTL_Service"             , entityResourceDefMap.get("FTL_Service"     ));//"OpcgerService");
            entityResourceObjMap.put("FTL_service"             , entityResourceDefMap.get("FTL_service"     ));//"opcgerService");
            entityResourceObjMap.put("FTL_OpcDTO"             , entityResourceDefMap.get("FTL_OpcDTO"     ));//"OpcgerDTO");
            entityResourceObjMap.put("FTL_opcDTO"             , entityResourceDefMap.get("FTL_opcDTO"     ));//"opcgerDTO");
            entityResourceObjMap.put("FTL_clientApp"             , entityResourceDefMap.get("FTL_clientApp"     ));//"${app.clientApp.name}");

            dataSourceCore = new HashMap<>();
            dataSourceCore.put("FTL_package"             , dataFileCore.get("FTL_package"));//"t2iSabeOpcger.opcger");
            dataSourceCore.put("FTL_Model"               , dataFileCore.get("FTL_Model"));//"Opcgerx0");
            dataSourceCore.put("FTL_model"               , dataFileCore.get("FTL_model"));//"opcgerx0");
            dataSourceCore.put("FTL_MODEL"               , dataFileCore.get("FTL_MODEL"));//"OPCGERX0");
            dataSourceCore.put("FTL_ListVO"              , dataFileCore.get("FTL_ListVO"));//"Opcgerx0VO");
        
            dataSourceBizService = new HashMap<>();
            dataSourceBizService.put("FTL_package"             , dataFileBizService.get("FTL_package"));//"t2iSabeOpcger.opcger");
            dataSourceBizService.put("FTL_Model"               , dataFileBizService.get("FTL_Model"));//"Opcgerx0");
            dataSourceBizService.put("FTL_model"               , dataFileBizService.get("FTL_model"));//"opcgerx0");
            dataSourceBizService.put("FTL_MODEL"               , dataFileBizService.get("FTL_MODEL"));//"OPCGERX0");
            dataSourceBizService.put("FTL_ListVO"              , dataFileBizService.get("FTL_ListVO"));//"Opcgerx0VO");
            
          /* Regardless if Data Model is a Map that contains, let's say, a "javaName" and "javaType" keys, or it's a JavaBean as shown above, 
             * in the template you can use ${searchAttributes.title}. The root itself need not be a Map either; 
             * it could be an object with getJavaName() and getJavaType() methods too.
             */
            
            /*
            searchAttributes.add(new FtlAttribute("ramsubramo", "Integer", "null"));
            searchAttributes.add(new FtlAttribute("moneda"    , "Integer", "null"));
            searchAttributes.add(new FtlAttribute("numnorma"  , "Integer", "null"));
            searchAttributes.add(new FtlAttribute("finivig"   , "Date"   , "null"));
            searchAttributes.add(new FtlAttribute("descnorm"  , "String" , "null"));
            */
            //importList.add

            //fieldAttributes.add(new FtlAttribute("valor01", "Double", "null"));
         /*   fieldAttributes.add(new FtlAttribute("ramsubramo", "String", "null"));
            fieldAttributes.add(new FtlAttribute("npoliza", "Integer", "null"));
            fieldAttributes.add(new FtlAttribute("ndepend", "Integer", "null"));
            fieldAttributes.add(new FtlAttribute("tipoadic", "Integer", "null"));
         */   /*
            fieldAttributes.add(new FtlAttribute("valor01", "Double", "null"));
            fieldAttributes.add(new FtlAttribute("valor02", "Double", "null"));
            fieldAttributes.add(new FtlAttribute("valor03", "Double", "null"));
            fieldAttributes.add(new FtlAttribute("valor04", "Double", "null"));
            fieldAttributes.add(new FtlAttribute("valor05", "Double", "null"));
            fieldAttributes.add(new FtlAttribute("valor06", "Double", "null"));
            fieldAttributes.add(new FtlAttribute("valor07", "Double", "null"));
            fieldAttributes.add(new FtlAttribute("valor08", "Double", "null"));
            fieldAttributes.add(new FtlAttribute("valor09", "Double", "null"));
            fieldAttributes.add(new FtlAttribute("valor10", "Double", "null"));
            fieldAttributes.add(new FtlAttribute("valor11", "Double", "null"));
            fieldAttributes.add(new FtlAttribute("valor12", "Double", "null"));
            fieldAttributes.add(new FtlAttribute("descval01", "String", "null"));
            fieldAttributes.add(new FtlAttribute("descval02", "String", "null"));
            fieldAttributes.add(new FtlAttribute("descval03", "String", "null"));
            fieldAttributes.add(new FtlAttribute("descval04", "String", "null"));
            fieldAttributes.add(new FtlAttribute("descval05", "String", "null"));
            fieldAttributes.add(new FtlAttribute("descval06", "String", "null"));
            fieldAttributes.add(new FtlAttribute("descval07", "String", "null"));
            fieldAttributes.add(new FtlAttribute("descval08", "String", "null"));
            fieldAttributes.add(new FtlAttribute("descval09", "String", "null"));
            fieldAttributes.add(new FtlAttribute("descval10", "String", "null"));
            fieldAttributes.add(new FtlAttribute("descval11", "String", "null"));
            fieldAttributes.add(new FtlAttribute("descval12", "String", "null"));
            fieldAttributes.add(new FtlAttribute("nombrel", "String", "null"));
            fieldAttributes.add(new FtlAttribute("moneda_i", "String", "null"));
            */
        }

        public void process() throws TemplateException, IOException
        {
            //Console or File output ( https://freemarker.apache.org/docs/pgui_quickstart_merge.html )
            /* As you might already know, data-model + template = output. We already have a data-model (dataSource) and a template (ftlOpcgerx0),
             * so to get the output we have to merge them. This is done by the process method of the template. 
             * It takes the data-model and a Writer as parameters. It writes the produced output to the Writer
             */
            
         /*   Writer entityConsoleWriter = new OutputStreamWriter(System.out);
            entityTemplate.process(entityObjMap, entityConsoleWriter);
            entityConsoleWriter.flush();

            Writer entityPojoWriter = new OutputStreamWriter(System.out);
            entityPojoTemplate.process(entityPojoObjMap, entityPojoWriter);
            entityPojoWriter.flush();
            
            Writer coreServiceConsoleWriter = new OutputStreamWriter(System.out);
            coreServiceTemplate.process(coreServiceObjMap, coreServiceConsoleWriter);
            coreServiceConsoleWriter.flush();

            Writer resultListConsoleWriter = new OutputStreamWriter(System.out);
            resultListTemplate.process(resultListObjMap, resultListConsoleWriter);
            resultListConsoleWriter.flush();

            Writer reqListConsoleWriter = new OutputStreamWriter(System.out);
            reqListTemplate.process(reqListObjMap, reqListConsoleWriter);
            reqListConsoleWriter.flush();
*/
            Writer respListConsoleWriter = new OutputStreamWriter(System.out);
            respListTemplate.process(respListObjMap, respListConsoleWriter);
            respListConsoleWriter.flush();
/*
            Writer entityServiceConsoleWriter = new OutputStreamWriter(System.out);
            entityServiceTemplate.process(entityServiceObjMap,entityServiceConsoleWriter);
            entityServiceConsoleWriter.flush();

            Writer entityDTOConsoleWriter = new OutputStreamWriter(System.out);
            entityDTOTemplate.process(entityDTOObjMap, entityDTOConsoleWriter);
            entityDTOConsoleWriter.flush();

            Writer entityResourceConsoleWriter = new OutputStreamWriter(System.out);
            entityResourceTemplate.process(entityResourceObjMap, entityResourceConsoleWriter);
            entityResourceConsoleWriter.flush();
        */    
            System.out.println("Fin de process");

        }

        public void output() throws IOException, TemplateException
        {
            // File output
/*
            Writer outputFileItem = new FileWriter (new File(Config.OUTPUT_PATH + entityDefMap.get("entityOutFileName")));
            entityTemplate.process(entityObjMap, outputFileItem);
            outputFileItem.flush();
            outputFileItem.close();

            Writer outputFileItemVO = new FileWriter (new File(Config.OUTPUT_PATH + entityPojoDefMap.get("entityPojoOutFileName")));//entityPojoOutFileName));
            entityPojoTemplate.process(entityPojoObjMap, outputFileItemVO);
            outputFileItemVO.flush();
            outputFileItemVO.close();
        
            Writer outputFileItemCoreService = new FileWriter (new File(Config.OUTPUT_PATH + coreServiceDefMap.get("coreServiceOutFileName")));//coreServiceOutFileName));
            coreServiceTemplate.process(coreServiceObjMap, outputFileItemCoreService);
            outputFileItemCoreService.flush();
            outputFileItemCoreService.close();

            Writer outputFileResultList = new FileWriter (new File(Config.OUTPUT_PATH + resultListDefMap.get("resultListOutFileName")));//resultListOutFileName));
            resultListTemplate.process(resultListObjMap, outputFileResultList);
            outputFileResultList.flush();
            outputFileResultList.close();

            Writer outputFileReqList = new FileWriter (new File(Config.OUTPUT_PATH + reqListDefMap.get("reqListOutFileName")));//reqListOutFileName));
            reqListTemplate.process(reqListObjMap, outputFileReqList);
            outputFileReqList.flush();
            outputFileReqList.close();
*/
            Writer outputFileRespItemList = new FileWriter (new File(Config.OUTPUT_PATH + respListDefMap.get("respListOutFileName")));//respListOutFileName));
            respListTemplate.process(respListObjMap, outputFileRespItemList);
            outputFileRespItemList.flush();
            outputFileRespItemList.close();
   /*         
            Writer outputFileItemService = new FileWriter (new File(Config.OUTPUT_PATH + entityServiceDefMap.get("entityServiceOutFileName")));//itemServiceOutFileName));
            entityServiceTemplate.process(entityServiceObjMap, outputFileItemService);
            outputFileItemService.flush();
            outputFileItemService.close();

            Writer outputFileItemDTO = new FileWriter (new File(Config.OUTPUT_PATH + entityDTODefMap.get("entityDTOutFileNam")));//itemDTOutFileNam));
            entityDTOTemplate.process(entityDTOObjMap, outputFileItemDTO);
            outputFileItemDTO.flush();
            outputFileItemDTO.close();

            Writer outputFileItemResource = new FileWriter (new File(Config.OUTPUT_PATH + entityResourceDefMap.get("entityResourceOutFileName")));//itemResourceOutFileName));
            entityResourceTemplate.process(entityResourceObjMap, outputFileItemResource);
            outputFileItemResource.flush();
            outputFileItemResource.close();
         */               
            System.out.println("Fin de output");
        }

     
}
