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
import freemarker.template.TemplateExceptionHandler;
import freemarker.template.TemplateNotFoundException;
import mx.t2i.ideaGenKoder.Config;
import mx.t2i.ideaGenKoder.model.Blog;
import mx.t2i.ideaGenKoder.model.BlogUrl;

public class GenSampleBlog {

	private Configuration config;
	private Template ftlTemplate;
	private Map<String, Object> dataSource;
	private Writer outputFile;

	public static final String TEMPLATE_FILENAME = "SampleBlog.ftl.html";
	public static final String OUTPUT_FILENAME = "SampleBlog.html";
	
	private Blog item;

	public GenSampleBlog() {
	}
	
	public Configuration getConfig() {
		return config;
	}

	public void setConfig(Configuration config) {
		this.config = config;
	}

	public void input() throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, IOException
	{
        //Instantiate template ( https://freemarker.apache.org/docs/pgui_quickstart_gettemplate.html ) 
        /* Templates are represented by freemarker.template.Template instances. 
         * Typically you obtain a Template instance from the Configuration instance, using its. getTemplate method. 
         * If you store the example template in the test.ftlh file of the earlier set directory, then you can do this:
         */
        ftlTemplate = config.getTemplate(TEMPLATE_FILENAME);
        /* This gives you a Template instance that was created by reading /where/you/store/templates/YourTemplate.ftlh 
         * and parsing it. The Template instance stores the template in parsed form, and not as text. 
         * If the template is missing or syntactically incorrect, getTemplate will throw exception instead.
         * 
         * Configuration caches Template instances, so when you call config.getTemplate("YourTemplate.ftlh") next time,
         * it probably won't read and parse the template file again, just returns the same Template instance as for the first time.
         */
	}
	
	public void process() throws TemplateException, IOException
	{
        //Create Data Model ( https://freemarker.apache.org/docs/pgui_quickstart_createdatamodel.html )
        /* (...) As demonstrated above, for hashes (something that stores other named items) 
         * you can use either a Map or any kind of public class that has public getXxx/isXxx methods as prescribed by the JavaBeans specification.
         */
        dataSource = new HashMap<>();

        item = this.createDummy();

        dataSource.put("blogTitle"	, item.getBlogTitle());
        dataSource.put("message"	, item.getMessage());
        dataSource.put("references"	, item.getListaUrl());
        /* Regardless if BlogUrl is a Map that contains the "title" and "url" keys, or it's a JavaBean as shown above, 
         * in the template you can use ${reference.title}. The root itself need not be a Map either; 
         * it could be an object with getTitle() and getUrl() methods too.
         */

        //Console or File output ( https://freemarker.apache.org/docs/pgui_quickstart_merge.html )
        /* As you might already know, data-model + template = output. We already have a data-model (dataSource) and a template (ftlTemplate),
         * so to get the output we have to merge them. This is done by the process method of the template. 
         * It takes the data-model and a Writer as parameters. It writes the produced output to the Writer
         */
        Writer console = new OutputStreamWriter(System.out);
        ftlTemplate.process(dataSource, console);
        console.flush();
	}
	
	public void output() throws IOException, TemplateException
	{
    	// File output
        outputFile = new FileWriter (new File(Config.OUTPUT_PATH + OUTPUT_FILENAME));
        ftlTemplate.process(dataSource, outputFile);
        outputFile.flush();
        outputFile.close();
	}

	private Blog createDummy() {
		Blog blog = new Blog();
		blog.setBlogTitle("Freemarker Template Demo");
		blog.setMessage("Getting started with Freemarker.<br/>Find a simple Freemarker demo.");
		blog.getListaUrl().add(new BlogUrl("http://url1.com","BlogUrl One"));
		blog.getListaUrl().add(new BlogUrl("http://url2.com","BlogUrl Two"));
		blog.getListaUrl().add(new BlogUrl("http://url3.com","BlogUrl Three"));
		return blog;
	}
}
