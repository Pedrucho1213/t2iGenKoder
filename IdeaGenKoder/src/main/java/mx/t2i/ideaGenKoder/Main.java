package mx.t2i.ideaGenKoder;

import java.io.IOException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.lang.String;

import freemarker.template.TemplateException;
import mx.t2i.ideaGenKoder.mapper.GenOpcgerx0;
import mx.t2i.ideaGenKoder.mapper.GenSampleBlog;
import mx.t2i.ideaGenKoder.mapper.DefEntityReader;

import mx.t2i.ideaGenKoder.model.Post;
import mx.t2i.ideaGenKoder.model.Tag;

import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.FileInputStream;
import java.util.Iterator;

import com.fasterxml.jackson.databind.ObjectMapper;// in play 2.3
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;



public class Main {

    public static void main(String[] args) {
	try {
		
		String inFile = "";// "./def/GenInteropHDI_core_service_Cobaplz0CoreService.def";
		inFile = args[0]; 
		
		System.out.println("Argumento de entrada:");
         for (String item : args) {
            System.out.println(  item );
        } 

	    Config.prepareConfiguration();

	    //GenSampleBlog generable = new GenSampleBlog();
	    GenOpcgerx0 generable = new GenOpcgerx0();
	    
	    generable.setConfig(Config.getConfiguration());
	    /*
	    DefEntityReader defEntityReader = new DefEntityReader();
	    defEntityReader.inputData(inFile);
	    */
	    generable.inputData(inFile);
	            
	    generable.input();

	    generable.process();

	    generable.output();
	    /*
	    defEntityReader.input();

	    defEntityReader.process();

	    defEntityReader.output();
		*/
	} catch (IOException e) {
	    e.printStackTrace();
	} catch (TemplateException e) {
	    e.printStackTrace();
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
    
}
