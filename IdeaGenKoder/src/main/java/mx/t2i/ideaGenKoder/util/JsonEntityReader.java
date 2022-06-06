package mx.t2i.ideaGenKoder.util;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import mx.t2i.ideaGenKoder.mapper.GenOpcgerx0;
import mx.t2i.ideaGenKoder.model.FtlAttribute;
import mx.t2i.ideaGenKoder.model.ImportArray;

import java.io.File;
import java.io.IOException;

public class JsonEntityReader extends GenOpcgerx0 {

    public void loadJsonFile(String file) {
        try {
            String dato = "";
            String tipo = "";
            String valor = "";
            String itemActual = "";


            JsonFactory factory = new JsonFactory();

            // Create JsonParser
            File archivoJson = new File(file);

            JsonParser parser = factory.createParser(archivoJson);
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
                        System.out.println(parser.getText());
                        importArray.add(new ImportArray(parser.getText()));

                    }
                }
                System.out.println("importArray --" + importArray);
            }

            token = parser.nextToken();
            token = parser.nextToken();
            token = parser.nextToken();
            //token = parser.nextToken();
            System.out.println("x Caracter  " + parser.getText());
            //token = parser.nextToken();
            //System.out.println("y Caracter  " + parser.getText());

            if (token == JsonToken.FIELD_NAME && "respListObjMap".equals(parser.getCurrentName())) {

                System.out.println("Objeto respListObjMap  - ");
                token = parser.nextToken(); // // Read left bracket i.e. [
                // Loop to print array elements until right bracket i.e ]
                while (token != JsonToken.END_OBJECT) {
                    token = parser.nextToken();

                    if (token == JsonToken.VALUE_STRING) {
                        System.out.println("Valores " + parser.getCurrentName() + " " + parser.getText());
                        respListDefMap.put(parser.getCurrentName(), parser.getText());
                    }
                }
                System.out.println("respListDefMap --X" + respListDefMap);
            }

            token = parser.nextToken();
            token = parser.nextToken();
            token = parser.nextToken();

            //token = parser.nextToken();
            System.out.println("Antes de seccion de search  " + parser.getText());
            if (token == JsonToken.FIELD_NAME && "searchAttributes".equals(parser.getCurrentName())) {

                System.out.println("Objeto searchAttributes  - ");
                token = parser.nextToken(); // // Read left bracket i.e. [
                // Loop to print array elements until right bracket i.e ]
                while (token != JsonToken.END_ARRAY) {
                    //  token = parser.nextToken();
                    //if (token != JsonToken.END_ARRAY)
                    //	  break;


                    if (token == JsonToken.VALUE_STRING && parser.getCurrentName() != "]") {
                        //System.out.println( "Valores Att " +parser.getCurrentName()+" "+parser.getText());
                        itemActual = parser.getCurrentName();
                        if (itemActual == "nombre")
                            dato = parser.getText();
                            //System.out.println("dato...".dato);
                        else if (itemActual == "tipo")
                            tipo = parser.getText();
                        else if (itemActual == "valor")
                            valor = parser.getText();
                        if ((dato != "" && tipo != "" && valor != "") && (dato != null && tipo != null && valor != null)) {
                            fieldAttributes.add(new FtlAttribute(dato, tipo, valor));
                            dato = "";
                            tipo = "";
                            valor = "";
                            //System.out.println("fieldAttributes -- "+fieldAttributes);
                        }
                        if (parser.nextToken().equals(']')) {
                            break;
                        }
                    }
                    //System.out.println("parser.nextToken()..........."+parser.nextToken()); // parser.getCurrentName() != "]"
                    token = parser.nextToken();
                    if (parser.currentToken() == JsonToken.END_ARRAY) {
                        break;
                    }
                }
                System.out.println("searchAttributes final -- " + fieldAttributes);
            }

            token = parser.nextToken();
            token = parser.nextToken();
            token = parser.nextToken();

            //token = parser.nextToken();
            System.out.println("Antes de seccion de attributes  " + parser.getText());
            if (token == JsonToken.FIELD_NAME && "attributesObjMap".equals(parser.getCurrentName())) {

                System.out.println("Objeto attributesObjMap  - ");
                token = parser.nextToken(); // // Read left bracket i.e. [
                // Loop to print array elements until right bracket i.e ]
                while (token != JsonToken.END_ARRAY) {
                    //  token = parser.nextToken();
                    //if (token != JsonToken.END_ARRAY)
                    //	  break;


                    if (token == JsonToken.VALUE_STRING && parser.getCurrentName() != "]") {
                        //System.out.println( "Valores Att " +parser.getCurrentName()+" "+parser.getText());
                        itemActual = parser.getCurrentName();
                        if (itemActual == "nombre")
                            dato = parser.getText();
                            //System.out.println("dato...".dato);
                        else if (itemActual == "tipo")
                            tipo = parser.getText();
                        else if (itemActual == "valor")
                            valor = parser.getText();
                        if ((dato != "" && tipo != "" && valor != "") && (dato != null && tipo != null && valor != null)) {
                            fieldAttributes.add(new FtlAttribute(dato, tipo, valor));
                            dato = "";
                            tipo = "";
                            valor = "";
                            //System.out.println("fieldAttributes -- "+fieldAttributes);
                        }
                        if (parser.nextToken().equals(']')) {
                            break;
                        }
                    }
                    //System.out.println("parser.nextToken()..........."+parser.nextToken()); // parser.getCurrentName() != "]"
                    token = parser.nextToken();
                    if (parser.currentToken() == JsonToken.END_ARRAY) {
                        break;
                    }
                }
                System.out.println("fieldAttributes final -- " + fieldAttributes);
            }

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
