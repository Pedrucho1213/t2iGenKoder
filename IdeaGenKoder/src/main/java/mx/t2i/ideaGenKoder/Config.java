package mx.t2i.ideaGenKoder;

import java.io.File;
import java.io.IOException;

import freemarker.template.Configuration;
import freemarker.template.TemplateExceptionHandler;

public class Config {
	public static final String TEMPLATES_PATH = "ftl/";	
	public static final String OUTPUT_PATH = "out/";	

	public static final String DATA_PATH = "def/";	
	
	private static Configuration configuration; 
	
	public static final void prepareConfiguration() throws IOException {
		
	String templatesPath = TEMPLATES_PATH;
		
    	//Instantiate Configuration class ( https://freemarker.apache.org/docs/pgui_quickstart_createconfiguration.html )

    	// Create your Configuration instance, and specify if up to what FreeMarker
    	// version (here 2.3.31) do you want to apply the fixes that are not 100%
    	// backward-compatible. See the Configuration JavaDoc for details.
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_31);

        // Specify the source where the template files come from. Here I set a
        // plain directory for it, but non-file-system sources are possible too:
	cfg.setDirectoryForTemplateLoading(new File(templatesPath));

        // Set the preferred charset template files are stored in. UTF-8 is
        // a good choice in most applications:
        cfg.setDefaultEncoding("UTF-8");
        
        // Sets how errors will appear.
        // During web page *development* TemplateExceptionHandler.HTML_DEBUG_HANDLER is better.
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

        // Don't log exceptions inside FreeMarker that it will thrown at you anyway:
        cfg.setLogTemplateExceptions(false);

        // Wrap unchecked exceptions thrown during template processing into TemplateException-s:
        cfg.setWrapUncheckedExceptions(true);

        // Do not fall back to higher scopes when reading a null loop variable:
        cfg.setFallbackOnNullLoopVariable(false);

		configuration = cfg;
	}

	public static Configuration getConfiguration() {
		return configuration;
	}

	public static void setConfiguration(Configuration configuration) {
		Config.configuration = configuration;
	}
	
}
