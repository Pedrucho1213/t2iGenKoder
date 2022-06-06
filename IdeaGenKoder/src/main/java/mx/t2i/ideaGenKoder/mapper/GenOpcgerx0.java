package mx.t2i.ideaGenKoder.mapper;

import java.io.*;
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

import java.lang.String;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import mx.t2i.ideaGenKoder.util.DefEntityReader;
import mx.t2i.ideaGenKoder.util.JsonEntityReader;


public class GenOpcgerx0 {

    public Configuration config;
    public List<FtlAttribute> searchAttributes;///searchAttributesList
    public List<FtlAttribute> fieldAttributes;///fieldAttributesList
    public List<ImportArray> importArray;// 2022-05-26 ggm: Para el manejo de las cabeceras de imports en las plantillas

    public String entityFtlFileName = "";// "src.main.java.mx.t2i.opcger.core.model/Opcgerx0.ftl.java";///entityFtlFileName
    public String entityOutFileName = "";///entityOutFileName
    public Template entityTemplate;//Opcgerx0;///entityTemplate
    public Map<String, String> entityDefMap;///entityDefMap
    public Map<String, Object> entityObjMap;///entityObjMap

    public String entityPojoFtlFileName = "";///entityPojoFtlFileName
    public String entityPojoOutFileName = "";///entityPojoOutFileName
    public Template entityPojoTemplate;///entityPojoTemplate
    public Map<String, String> entityPojoDefMap;///entityPojoDefMap
    public Map<String, Object> entityPojoObjMap;///entityPojoObjMap

    public String coreServiceFtlFileName = "";///coreServiceFtlFileName
    public String coreServiceOutFileName = "";///coreServiceOutFileName
    public Template coreServiceTemplate;///coreServiceTemplate
    public Map<String, String> coreServiceDefMap;///coreServiceDefMap
    public Map<String, Object> coreServiceObjMap;///coreServiceObjMap

    public String resultListFtlFileName = "";///resultListFtlFileName
    public String resultListOutFileName = "";///resultListOutFileName
    public Template resultListTemplate;///resultListTemplate ftlResultOpcgerList
    public Map<String, String> resultListDefMap;///resultListDefMap
    public Map<String, Object> resultListObjMap;///resultListObjMap

    public String reqListFtlFileName = "";///reqListFtlFileName
    public String reqListOutFileName = "";///reqListOutFileName
    public Template reqListTemplate;///reqListTemplate
    public Map<String, String> reqListDefMap;///reqListDefMap
    public Map<String, Object> reqListObjMap;///reqListObjMap

    public String respListFtlFileName = "";///respListFtlFileName
    public String respListOutFileName = "";///respListOutFileName
    public Template respListTemplate;///respListTemplate
    public Map<String, String> respListDefMap;///respListDefMap
    public Map<String, Object> respListObjMap;///respListObjMap

    // Variables de tiigcaye
    public String entityServiceFtlFileName = "";///itemServiceFtlFileName
    public String entityServiceOutFileName = "";///itemServiceOutFileName
    public Template entityServiceTemplate;///itemServiceTemplate
    public Map<String, String> entityServiceDefMap;///itemServiceDefMap
    public Map<String, Object> entityServiceObjMap;///itemServiceObjMap

    public String entityDTOFtlFileName = "";///itemDTOFtlFileName
    public String entityDTOutFileNam = "";///itemDTOutFileNam
    public Template entityDTOTemplate;///itemDTOTemplate
    public Map<String, String> entityDTODefMap;///itemDTODefMap
    public Map<String, Object> entityDTOObjMap;///itemDTOObjMap

    public String entityResourceFtlFileName = "";///itemResourceFtlFileName
    public String entityResourceOutFileName = "";///itemResourceOutFileName
    public Template entityResourceTemplate;///itemResourceTemplate
    public Map<String, String> entityResourceDefMap;///itemResourceDefMap
    public Map<String, Object> entityResourceObjMap;///itemResourceObjMap

    public Map<String, Object> attributesObjMap = new HashMap<>();///attributesObjMap
    public Map<String, Object> dataSourceCore = new HashMap<>();
    public Map<String, Object> dataSourceBizService = new HashMap<>();
    public Map<String, Object> dataSourceWebService = new HashMap<>();

    public Map<String, String> attributesDefMap = new HashMap<>();///attributesDefMap
    public Map<String, String> dataFileCore = new HashMap<>();
    ;
    public Map<String, String> dataFileBizService = new HashMap<>();
    public Map<String, String> dataFileWebService = new HashMap<>();

    public GenOpcgerx0() {
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

    public void initilizeVals() {
        entityDefMap = new HashMap<>();
        entityPojoDefMap = new HashMap<>();
        coreServiceDefMap = new HashMap<>();
        resultListDefMap = new HashMap<>();
        reqListDefMap = new HashMap<>();
        respListDefMap = new HashMap<>();
        entityServiceDefMap = new HashMap<>();
        entityDTODefMap = new HashMap<>();
        entityResourceDefMap = new HashMap<>();
        attributesDefMap = new HashMap<>();
        dataFileCore = new HashMap<>();
        dataFileBizService = new HashMap<>();
        dataFileWebService = new HashMap<>();

        entityObjMap = new HashMap<>();
        entityPojoObjMap = new HashMap<>();
        coreServiceObjMap = new HashMap<>();
        resultListObjMap = new HashMap<>();
        reqListObjMap = new HashMap<>();
        respListObjMap = new HashMap<>();
        entityServiceObjMap = new HashMap<>();
        entityDTOObjMap = new HashMap<>();
        entityResourceObjMap = new HashMap<>();
        attributesObjMap = new HashMap<>();
        dataSourceCore = new HashMap<>();
        dataSourceBizService = new HashMap<>();
        dataSourceWebService = new HashMap<>();
    }

    public void inputData(String file) {
        this.initilizeVals();

        if (file.contains("json") || file.contains("JSON")) {
            JsonEntityReader json = new JsonEntityReader();
            json.loadJsonFile(file);
        }

        if (file.contains("def") || file.contains("DEF")) {
            DefEntityReader def = new DefEntityReader();
            def.loadDefFile(file);
        }

    }

    public void input() throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, IOException {
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
        entityObjMap.put("FTL_searchAttributes", searchAttributes);
        entityObjMap.put("FTL_fieldAttributes", fieldAttributes);
        entityObjMap.put("FTL_package", entityDefMap.get("FTL_package"));//"t2iSabeOpcger.opcger");
        entityObjMap.put("FTL_Model", entityDefMap.get("FTL_Model"));//"Opcgerx0");
        entityObjMap.put("FTL_model", entityDefMap.get("FTL_model"));//"opcgerx0");
        entityObjMap.put("FTL_MODEL", entityDefMap.get("FTL_MODEL"));//"OPCGERX0");
        entityObjMap.put("FTL_ListVO", entityDefMap.get("FTL_ListVO"));//"Opcgerx0VO");
        entityObjMap.put("FTL_CORE_PROGRAM", entityPojoDefMap.get("FTL_CORE_PROGRAM"));//"OPCGERX0");

        entityPojoObjMap = new HashMap<>();
        entityPojoObjMap.put("FTL_searchAttributes", searchAttributes);
        entityPojoObjMap.put("FTL_fieldAttributes", fieldAttributes);
        entityPojoObjMap.put("FTL_package", entityPojoDefMap.get("FTL_package"));// "t2iSabeOpcger.opcger");
        entityPojoObjMap.put("FTL_Model", entityPojoDefMap.get("FTL_Model"));//"Opcgerx0VO");
        entityPojoObjMap.put("FTL_model", entityPojoDefMap.get("FTL_model"));//"opcgerx0VO");
        entityPojoObjMap.put("FTL_MODEL", entityPojoDefMap.get("FTL_MODEL"));//"OPCGERX0VO");
        entityPojoObjMap.put("FTL_CORE_PROGRAM", entityPojoDefMap.get("FTL_CORE_PROGRAM"));//"OPCGERX0");
        entityPojoObjMap.put("FTL_ListVO", entityPojoDefMap.get("FTL_ListVO"));//"Opcgerx0VO");

        coreServiceObjMap = new HashMap<>();
        coreServiceObjMap.put("FTL_searchAttributes", searchAttributes);
        coreServiceObjMap.put("FTL_fieldAttributes", fieldAttributes);
        coreServiceObjMap.put("FTL_package", coreServiceDefMap.get("FTL_package"));//"mx.t2i.sabe.opcger.core.service");
        coreServiceObjMap.put("FTL_CoreService", coreServiceDefMap.get("FTL_CoreService"));//"Opcgerx0CoreService");
        coreServiceObjMap.put("FTL_coreService", coreServiceDefMap.get("FTL_coreService"));//"opcgerx0CoreService");
        coreServiceObjMap.put("FTL_CORESERVICE", coreServiceDefMap.get("FTL_CORESERVICE"));//"OPCGERX0CoreService");
        coreServiceObjMap.put("FTL_CORE_SYSTEM", coreServiceDefMap.get("FTL_CORE_SYSTEM"));//"TIIGCAYE");
        coreServiceObjMap.put("FTL_CORE_PROGRAM", coreServiceDefMap.get("FTL_CORE_PROGRAM"));//"OPCGERZ0");
        coreServiceObjMap.put("FTL_ListVO", coreServiceDefMap.get("FTL_ListVO"));//"Opcgerx0VO");

        resultListObjMap = new HashMap<>();
        resultListObjMap.put("FTL_searchAttributes", searchAttributes);
        resultListObjMap.put("FTL_fieldAttributes", fieldAttributes);
        resultListObjMap.put("FTL_package", resultListDefMap.get("FTL_package"));//"mx.t2i.sabe.opcger.biz.model");
        resultListObjMap.put("FTL_ResultList", resultListDefMap.get("FTL_ResultList"));//"ResultOpcgerList");
        resultListObjMap.put("FT_resultList", resultListDefMap.get("FT_resultList"));//"resultOpcgerList");

        reqListObjMap = new HashMap<>();
        reqListObjMap.put("FTL_searchAttributes", searchAttributes);
        reqListObjMap.put("FTL_fieldAttributes", fieldAttributes);
        reqListObjMap.put("FTL_package", reqListDefMap.get("FTL_package"));//"mx.t2i.sabe.opcger.ws.model");
        reqListObjMap.put("FTL_ReqList", reqListDefMap.get("FTL_ReqList"));//"ReqOpcgerList");
        reqListObjMap.put("FT_reqtList", reqListDefMap.get("FT_reqtList"));//"reqOpcgerList");

        respListObjMap = new HashMap<>();
        respListObjMap.put("FTL_searchAttributes", searchAttributes);
        respListObjMap.put("FTL_fieldAttributes", fieldAttributes);
        respListObjMap.put("FTL_package", respListDefMap.get("FTL_package"));//"mx.t2i.sabe.opcger.ws.model");
        respListObjMap.put("FTL_RespList", respListDefMap.get("FTL_RespList"));
        respListObjMap.put("FTL_ResultList", respListDefMap.get("FTL_ResultList"));
        respListObjMap.put("FT_respList", respListDefMap.get("FT_respList"));
        respListObjMap.put("FTL_Model", respListDefMap.get("FTL_Model"));// Se adiciona por respRecobertura
        respListObjMap.put("FTL_model", respListDefMap.get("FTL_model"));// Se adiciona por Registrarsolicitud biz Service
        respListObjMap.put("FTL_instanceOf", respListDefMap.get("FTL_instanceOf"));// Se adiciona por respRecobertura
        respListObjMap.put("FTL_imports", importArray);// Se adiciona para adicionar imports a las clases
        respListObjMap.put("FTL_extends", respListDefMap.get("FTL_extends"));// Se adiciona para adicionar imports a las clases
        respListObjMap.put("FTL_CoreService", respListDefMap.get("FTL_CoreService"));//"Polgmcc0CoreService");
        respListObjMap.put("FTL_coreService", respListDefMap.get("FTL_coreService"));//"Polgmcc0CoreService");
        respListObjMap.put("FTL_coreModel", respListDefMap.get("FTL_coreModel"));//"Polgmcc0CoreService");
        respListObjMap.put("FTL_core", respListDefMap.get("FTL_core"));//"Polgmcc0CoreService");
        respListObjMap.put("FTL_Core", respListDefMap.get("FTL_Core"));//"Polgmcc0CoreService");
        respListObjMap.put("FTL_CORE_SYSTEM", respListDefMap.get("FTL_CORE_SYSTEM"));//"TIIGCAYE");
        respListObjMap.put("FTL_CORE_PROGRAM", respListDefMap.get("FTL_CORE_PROGRAM"));//"OPCGERZ0");


        entityServiceObjMap = new HashMap<>();
        entityServiceObjMap.put("FTL_searchAttributes", searchAttributes);
        entityServiceObjMap.put("FTL_fieldAttributes", fieldAttributes);
        entityServiceObjMap.put("FTL_package", entityServiceDefMap.get("FTL_package"));//"mx.t2i.tiigcaye.service"); // Revisar sino falta .criteria
        entityServiceObjMap.put("FTL_Service", entityServiceDefMap.get("FTL_Service"));//"OpcgerService");
        entityServiceObjMap.put("FTL_CoreService", entityServiceDefMap.get("FTL_CoreService"));// "Opcgerx0CoreService");
        entityServiceObjMap.put("FTL_coreService", entityServiceDefMap.get("FTL_coreService"));//"opcgerx0CoreService");
        entityServiceObjMap.put("FTL_Model", entityServiceDefMap.get("FTL_Model"));//"Opcgerx0");
        entityServiceObjMap.put("FT_respList", entityServiceDefMap.get("FT_respList"));//"respOpcgerList");

        entityDTOObjMap = new HashMap<>();
        entityDTOObjMap.put("FTL_package", entityDTODefMap.get("FTL_package"));//"mx.t2i.tiigcaye.service.dto");
        entityDTOObjMap.put("FTL_ClassDTO", entityDTODefMap.get("FTL_ClassDTO"));//"OpcgerDTO");
        entityDTOObjMap.put("FTL_CatDTO", entityDTODefMap.get("FTL_CatDTO"));//CatramosDTO");
        entityDTOObjMap.put("FTL_catDTO", entityDTODefMap.get("FTL_catDTO"));// "catramosDTO");
        entityDTOObjMap.put("FTL_Cat", entityDTODefMap.get("FTL_Cat"));// "Catramos");
        entityDTOObjMap.put("FTL_cat", entityDTODefMap.get("FTL_cat"));// "catramos");

        entityResourceObjMap = new HashMap<>();
        entityResourceObjMap.put("FTL_package", entityResourceDefMap.get("FTL_package"));//"mx.t2i.tiigcaye.web.rest");
        entityResourceObjMap.put("FTL_Class", entityResourceDefMap.get("FTL_Class"));//"OpcgerResource");
        entityResourceObjMap.put("FTL_opcGer", entityResourceDefMap.get("FTL_opcGer"));//"t2iSabeOpcger");
        entityResourceObjMap.put("FTL_model", entityResourceDefMap.get("FTL_model"));//"opcger");
        entityResourceObjMap.put("FTL_Model", entityResourceDefMap.get("FTL_Model"));//"Opcger");
        entityResourceObjMap.put("FTL_Service", entityResourceDefMap.get("FTL_Service"));//"OpcgerService");
        entityResourceObjMap.put("FTL_service", entityResourceDefMap.get("FTL_service"));//"opcgerService");
        entityResourceObjMap.put("FTL_OpcDTO", entityResourceDefMap.get("FTL_OpcDTO"));//"OpcgerDTO");
        entityResourceObjMap.put("FTL_opcDTO", entityResourceDefMap.get("FTL_opcDTO"));//"opcgerDTO");
        entityResourceObjMap.put("FTL_clientApp", entityResourceDefMap.get("FTL_clientApp"));//"${app.clientApp.name}");

        dataSourceCore = new HashMap<>();
        dataSourceCore.put("FTL_package", dataFileCore.get("FTL_package"));//"t2iSabeOpcger.opcger");
        dataSourceCore.put("FTL_Model", dataFileCore.get("FTL_Model"));//"Opcgerx0");
        dataSourceCore.put("FTL_model", dataFileCore.get("FTL_model"));//"opcgerx0");
        dataSourceCore.put("FTL_MODEL", dataFileCore.get("FTL_MODEL"));//"OPCGERX0");
        dataSourceCore.put("FTL_ListVO", dataFileCore.get("FTL_ListVO"));//"Opcgerx0VO");

        dataSourceBizService = new HashMap<>();
        dataSourceBizService.put("FTL_package", dataFileBizService.get("FTL_package"));//"t2iSabeOpcger.opcger");
        dataSourceBizService.put("FTL_Model", dataFileBizService.get("FTL_Model"));//"Opcgerx0");
        dataSourceBizService.put("FTL_model", dataFileBizService.get("FTL_model"));//"opcgerx0");
        dataSourceBizService.put("FTL_MODEL", dataFileBizService.get("FTL_MODEL"));//"OPCGERX0");
        dataSourceBizService.put("FTL_ListVO", dataFileBizService.get("FTL_ListVO"));//"Opcgerx0VO");

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

    public void process() throws TemplateException, IOException {
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

    public void output() throws IOException, TemplateException {
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
        Writer outputFileRespItemList = new FileWriter(new File(Config.OUTPUT_PATH + respListDefMap.get("respListOutFileName")));//respListOutFileName));
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
