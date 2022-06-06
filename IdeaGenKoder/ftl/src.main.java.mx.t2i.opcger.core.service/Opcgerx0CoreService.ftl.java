package ${FTL_package};

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ObjectRetrievalFailureException;
import org.springframework.stereotype.Service;

import mx.t2i.core.util.LogBackUtil;
import mx.t2i.core.util.UtilConstants;
import mx.t2i.sabe.opcger.core.model.Opcgerx0;
import mx.t2i.sabe.opcger.core.model.Opcgerx0VO;
import mx.t2i.tekhne.core.exceptions.ServiceException;
import mx.t2i.tekhne.core.exceptions.ServiceExceptionDetails;
import mx.t2i.tekhne.core.utils.Utils;
import mx.t2i.tekhne.core.utils.log.LogTools;
import mx.t2i.tekhne.syscore.lux.dao.CoreDao;
import mx.t2i.tekhne.syscore.utils.CoreTools;

/**
 * Despachador (Dispatcher) del servicio para Opcgerx0
 */
@Service
public class ${FTL_CoreService} 
{
	private static final boolean isTraceable = LogBackUtil.addClassToTrace(${FTL_CoreService}.class);

    private static final Logger log                         = LoggerFactory.getLogger(${FTL_CoreService}.class);

    private static final String MSG_ERROR_AL_EJECUTAR       = "No se ha recibido la respuesta esperada al ejecutar";

    private static final String MSG_NOT_FOUND               = "registro(s) no encontrado(s)";
    // Poner aqui el nombre del Sistema, programa y version
    public static final String  CORE_SYSTEM                 = "${FTL_CORE_SYSTEM}";
    public static final String  CORE_PROGRAM                = "${FTL_CORE_PROGRAM}"; // Es el programa de enlace, no el de proceso 
    public static final String  CORE_PROGRAM_VERSION        = "v1";
    public static final String  CORE_PROGRAM_FUNCTION_C     = "C";
    public static final String  CORE_PROGRAM_FUNCTION_L     = "L";
    public static final String  CORE_PROGRAM_FUNCTION_A     = "A";
    public static final String  CORE_PROGRAM_FUNCTION_M     = "M";
    public static final String  CORE_PROGRAM_FUNCTION_B     = "B";
    public static final String  CORE_PROGRAM_FUNCTION_P     = "P";
    public static final String  CORE_PROGRAM_FUNCTION_T     = "T";

    @Autowired
    private CoreDao             coreDaoSabe                 = null;

    /**
     * Constructor default
     */
    public ${FTL_CoreService}() {
    	super();
    	if (isTraceable) { log.trace("Creando instancia sin atributos: "+this.toString()); }
    }

    public void setCoreDao(CoreDao coreDaoSabe) {
        this.coreDaoSabe = coreDaoSabe;
        log.debug("Preparando CoreDao para "+CORE_PROGRAM+" de "+CORE_SYSTEM);
    }

    public Opcgerx0 getCore(Opcgerx0 coreModel) throws ServiceException {
        // Preparar input fields
        Map<String, String> inputFields = coreModel.auxGetSearchFields();

        try {
            coreModel = coreDao_get(inputFields, coreModel);
        } catch (ObjectRetrievalFailureException ex) {
            String msg = MSG_NOT_FOUND;
            LogTools.logError(log, ex, msg);

            coreModel.setMessage(msg);
            coreModel.setStatusCode(UtilConstants.JAVA_ERR_CODE);
        } catch (Exception ex) {
            String msg = MSG_ERROR_AL_EJECUTAR+" "+CORE_PROGRAM;
///            LogTools.logError(log, ex, msg);
            throw ServiceExceptionDetails.buildServiceException(""+UtilConstants.JAVA_ERR_CODE, msg, Utils.getErrorMsg(ex.getLocalizedMessage()));
        }
        return coreModel;
    }

    public List<${FTL_ListVO}> getCoreList(final Opcgerx0 coreModel) throws ServiceException {

        Map<String, String> inputFields = coreModel.auxGetSearchFields();

        List<${FTL_ListVO}> list = new ArrayList<>();

        try {
            list = coreDao_getList(inputFields, coreModel);
        } catch (ObjectRetrievalFailureException ex) {
            String msg = MSG_NOT_FOUND;
            log.error(msg);

            coreModel.setMessage(msg);
            coreModel.setStatusCode(UtilConstants.JAVA_ERR_CODE);
        } catch (Exception ex) {
            String msg = MSG_ERROR_AL_EJECUTAR+" "+CORE_PROGRAM+
            		" ("+ex.getMessage()+") desde "+this.getClass().getName()+"."+
            		(new Throwable().getStackTrace()[0].getMethodName());
///            log.error(msg, ex);
            throw ServiceExceptionDetails.buildServiceException(""+UtilConstants.JAVA_ERR_CODE, msg, Utils.getErrorMsg(ex.getLocalizedMessage()));
        }

        return list;
    }

    public Opcgerx0 insertCore(Opcgerx0 coreModel) throws ServiceException {
        // Preparar input fields
        Map<String, String> inputFields = coreModel.auxGetTransactionFields();

        try {
            coreModel = coreDao_insert(inputFields, coreModel);
        } catch (ObjectRetrievalFailureException ex) {
            String msg = MSG_NOT_FOUND;
            log.error(msg);

            coreModel.setMessage(msg);
            coreModel.setStatusCode(UtilConstants.JAVA_ERR_CODE);
        } catch (Exception ex) {
            String msg = MSG_ERROR_AL_EJECUTAR+" "+CORE_PROGRAM;
///            log.error(msg, ex);
            throw ServiceExceptionDetails.buildServiceException(""+UtilConstants.JAVA_ERR_CODE, msg, Utils.getErrorMsg(ex.getLocalizedMessage()));
        }
        return coreModel;
    }

    public Opcgerx0 updateCore(Opcgerx0 coreModel) throws ServiceException {
        // Preparar input fields
        Map<String, String> inputFields = coreModel.auxGetTransactionFields();

        try {
            coreModel = coreDao_update(inputFields, coreModel);
            return coreModel;
        } catch (ObjectRetrievalFailureException ex) {
            String msg = MSG_NOT_FOUND;
            log.error(msg);

            coreModel.setMessage(msg);
            coreModel.setStatusCode(UtilConstants.JAVA_ERR_CODE);
            return coreModel;
        } catch (Exception ex) {
            String msg = MSG_ERROR_AL_EJECUTAR+" "+CORE_PROGRAM;
///            log.error(msg, ex);
            throw ServiceExceptionDetails.buildServiceException(""+UtilConstants.JAVA_ERR_CODE, msg, Utils.getErrorMsg(ex.getLocalizedMessage()));
        }
    }

    public Opcgerx0 deleteCore(Opcgerx0 coreModel) throws ServiceException {
        // Preparar input fields
        Map<String, String> inputFields = coreModel.auxGetSearchFields();

        try {
            coreModel = coreDao_delete(inputFields, coreModel);
            return coreModel;
        } catch (ObjectRetrievalFailureException ex) {
            String msg = MSG_NOT_FOUND;
            log.error(msg);

            coreModel.setMessage(msg);
            coreModel.setStatusCode(UtilConstants.JAVA_ERR_CODE);
            return coreModel;
        } catch (Exception ex) {
            String msg = MSG_ERROR_AL_EJECUTAR+" "+CORE_PROGRAM;
///            log.error(msg, ex);
            throw ServiceExceptionDetails.buildServiceException(""+UtilConstants.JAVA_ERR_CODE, msg, Utils.getErrorMsg(ex.getLocalizedMessage()));
        }
    }

    public Opcgerx0 previousCore(Opcgerx0 coreModel) throws ServiceException {
        // Preparar input fields
        Map<String, String> inputFields = coreModel.auxGetSearchFields();

        try {
            coreModel = coreDao_previous(inputFields, coreModel);
            return coreModel;
        } catch (ObjectRetrievalFailureException ex) {
            String msg = MSG_NOT_FOUND;
            log.error(msg);

            coreModel.setMessage(msg);
            coreModel.setStatusCode(UtilConstants.JAVA_ERR_CODE);
            return coreModel;
        } catch (Exception ex) {
            String msg = MSG_ERROR_AL_EJECUTAR+" "+CORE_PROGRAM;
///            log.error(msg, ex);
            throw ServiceExceptionDetails.buildServiceException(""+UtilConstants.JAVA_ERR_CODE, msg, Utils.getErrorMsg(ex.getLocalizedMessage()));
        }
    }

    /*
     * Declaracion de
     * coreDao_functions
     */
    private void assignErrorMessage(Map<String, String> coreResponse, Opcgerx0 coreModel)
    {
        String messageError = coreResponse.get("messageError");
        if (messageError != null && !messageError.equals("")) {
            log.warn("messageError: "+messageError);
            coreModel.setMessage(messageError);
            coreModel.setStatusCode(UtilConstants.JAVA_ERR_CODE); // 2021-05-27 ati: codigoError > 0 viene de Core, negativo, de Java
        }
        else
        {
	        String coremsg = CoreTools.getCoreMessage(coreResponse);
	        if (coremsg != null && !coremsg.equals("")) {
	            log.warn("coremsg: "+coremsg);
	            coreModel.setMessage(coremsg);
	            coreModel.setStatusCode(UtilConstants.CORE_ERR_CODE); // 2021-05-27 ati: codigoError > 0 viene de Core, negativo, de Java
	        }
        }
    }

    protected Opcgerx0 coreDao_get(Map<String, String> inputFields, Opcgerx0 coreModel)
            throws ObjectRetrievalFailureException, Exception {

        Map<String, String> coreResponse = null;

        coreResponse = coreDaoSabe.execute(CORE_SYSTEM, CORE_PROGRAM, CORE_PROGRAM_VERSION, CORE_PROGRAM_FUNCTION_C, inputFields);
        
        if (coreModel == null) {
            throw new Exception("coreModel == null");
        }
        
        coreModel.auxSetValuesFromMap(coreResponse);

        assignErrorMessage(coreResponse, coreModel);

        return coreModel;
    }

    protected List<Opcgerx0VO> coreDao_getList(Map<String, String> inputFields, Opcgerx0 coreModel)
            throws ObjectRetrievalFailureException, Exception {

    	Map<String, String> coreResponse = coreDaoSabe.execute(CORE_SYSTEM, CORE_PROGRAM, CORE_PROGRAM_VERSION, CORE_PROGRAM_FUNCTION_L, inputFields);

        if (coreModel == null) {
            throw new Exception("coreModel == null");
        }

        List<Opcgerx0VO> list = coreModel.auxGetListFromCore(coreResponse);

        assignErrorMessage(coreResponse, coreModel);

        return list;
    }

    protected Opcgerx0 coreDao_insert(Map<String, String> inputFields, Opcgerx0 coreModel)
            throws ObjectRetrievalFailureException, Exception {

        Map<String, String> coreResponse = coreDaoSabe.execute(CORE_SYSTEM, CORE_PROGRAM, CORE_PROGRAM_VERSION, CORE_PROGRAM_FUNCTION_A, inputFields);

        if (coreModel == null) {
            throw new Exception("coreModel == null");
        }

        coreModel.auxSetValuesFromMap(coreResponse);

        assignErrorMessage(coreResponse, coreModel);

        return coreModel;
    }

    protected Opcgerx0 coreDao_update(Map<String, String> inputFields, Opcgerx0 coreModel)
            throws ObjectRetrievalFailureException, Exception {

    	Map<String, String> coreResponse = coreDaoSabe.execute(CORE_SYSTEM, CORE_PROGRAM, CORE_PROGRAM_VERSION, CORE_PROGRAM_FUNCTION_M, inputFields);

    	if (coreModel == null) {
            throw new Exception("coreModel == null");
        }

        coreModel.auxSetValuesFromMap(coreResponse);

        assignErrorMessage(coreResponse, coreModel);

        return coreModel;
    }

    protected Opcgerx0 coreDao_delete(Map<String, String> inputFields, Opcgerx0 coreModel)
            throws ObjectRetrievalFailureException, Exception {

    	Map<String, String> coreResponse = coreDaoSabe.execute(CORE_SYSTEM, CORE_PROGRAM, CORE_PROGRAM_VERSION, CORE_PROGRAM_FUNCTION_B, inputFields);

    	if (coreModel == null) {
            throw new Exception("coreModel == null");
        }

        coreModel.auxSetValuesFromMap(coreResponse);

        assignErrorMessage(coreResponse, coreModel);

        return coreModel;
    }

    protected Opcgerx0 coreDao_previous(Map<String, String> inputFields, Opcgerx0 coreModel)
            throws ObjectRetrievalFailureException, Exception {

    	Map<String, String> coreResponse = coreDaoSabe.execute(CORE_SYSTEM, CORE_PROGRAM, CORE_PROGRAM_VERSION,
                CORE_PROGRAM_FUNCTION_P, inputFields);

    	if (coreModel == null) {
            throw new Exception("coreModel == null");
        }

        coreModel.auxSetValuesFromMap(coreResponse);

        assignErrorMessage(coreResponse, coreModel);

        return coreModel;
    }

}
