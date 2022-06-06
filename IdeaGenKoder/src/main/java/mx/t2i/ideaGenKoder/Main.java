package mx.t2i.ideaGenKoder;

import java.io.IOException;

import java.lang.String;

import freemarker.template.TemplateException;
import mx.t2i.ideaGenKoder.mapper.GenOpcgerx0;


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
