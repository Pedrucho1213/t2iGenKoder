package mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.core.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ObjectRetrievalFailureException;
import org.springframework.stereotype.Service;

import mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.core.model.Polgpoz1;
import mx.t2i.tekhne.core.exceptions.ServiceException;
import mx.t2i.tekhne.core.exceptions.ServiceExceptionDetails;
import mx.t2i.tekhne.core.utils.Utils;
import mx.t2i.tekhne.core.utils.log.LogTools;
import mx.t2i.tekhne.syscore.lux.dao.CoreDao;
import mx.t2i.tekhne.syscore.utils.CoreTools;

/**
 * Despachador (Dispatcher) del servicio para Polgpoz1CoreService
 */
@Service
public class Polgpoz1CoreService {
	private static final Logger log = LoggerFactory.getLogger(Polgpoz1CoreService.class);

	private static final String MSG_ERROR_AL_EJECUTAR = "Error intentando ejecutar";

	private static final String MSG_NOT_FOUND = "registro(s) no encontrado(s)";
	// Poner aqui el nombre del Sistema, programa y version
	public static final String CORE_SYSTEM = "TIIGCAYE";
	public static final String CORE_PROGRAM = "POLGPOZ1"; // Es el programa de enlace, no el de proceso
	public static final String CORE_PROGRAM_VERSION = "v1";
	public static final String CORE_PROGRAM_FUNCTION_C = "C";
	public static final String CORE_PROGRAM_FUNCTION_L = "L";
	public static final String CORE_PROGRAM_FUNCTION_A = "A";
	public static final String CORE_PROGRAM_FUNCTION_M = "M";
	public static final String CORE_PROGRAM_FUNCTION_B = "B";
	public static final String CORE_PROGRAM_FUNCTION_P = "P";
	public static final String CORE_PROGRAM_FUNCTION_T = "T";

	private CoreDao coreDaoSabe = null;

	@Autowired
	public void setCoreDao(CoreDao coreDaoSabe) {
		this.coreDaoSabe = coreDaoSabe;
		log.debug("Preparando CoreDao para " + CORE_PROGRAM + " de " + CORE_SYSTEM);
	}

	/**
	 * Constructor default
	 */
	public Polgpoz1CoreService() {
		super();
	}

	public void getCore(Polgpoz1 coreModel) throws ServiceException {
		// Preparar input fields
		Map<String, String> inputFields = coreModel.auxGetSearchFields();

		try {
			coreDao_get(inputFields, coreModel);
		} catch (ObjectRetrievalFailureException ex) {
			String msg = MSG_NOT_FOUND;
			LogTools.logError(log, ex, msg);
			coreModel.setMessage(msg);
			coreModel.setStatusCode(-1);
		} catch (Exception ex) {
			String msg = MSG_ERROR_AL_EJECUTAR + " " + CORE_PROGRAM;
			LogTools.logError(log, ex, msg);
			throw ServiceExceptionDetails.buildServiceException("-1", msg, Utils.getErrorMsg(ex.getLocalizedMessage()));
		}
	}

	public List<Polgpoz1> getCoreList(final Polgpoz1 coreModel) throws ServiceException {

		Map<String, String> inputFields = coreModel.auxGetSearchFields();

		List<Polgpoz1> list = new ArrayList<>();

		try {
			list = coreDao_getList(inputFields, coreModel);
		} catch (ObjectRetrievalFailureException ex) {
			String msg = MSG_NOT_FOUND;
			log.error(msg);
		} catch (Exception ex) {
			String msg = MSG_ERROR_AL_EJECUTAR + " " + CORE_PROGRAM + " (" + ex.getMessage() + ") desde "
					+ this.getClass().getName() + "." + (new Throwable().getStackTrace()[0].getMethodName());
			log.error(msg, ex);
			throw ServiceExceptionDetails.buildServiceException("-1", msg, Utils.getErrorMsg(ex.getLocalizedMessage()));
		}

		return list;
	}

	public void insertCore(Polgpoz1 coreModel) throws ServiceException {
		// Preparar input fields
		Map<String, String> inputFields = coreModel.auxGetTransactionFields();

		try {
			coreDao_insert(inputFields, coreModel);
		} catch (ObjectRetrievalFailureException ex) {
			String msg = MSG_NOT_FOUND;
			log.error(msg);

			coreModel.setMessage(msg);
			coreModel.setStatusCode(-1);
		} catch (Exception ex) {
			String msg = MSG_ERROR_AL_EJECUTAR + " " + CORE_PROGRAM;
			log.error(msg, ex);
			throw ServiceExceptionDetails.buildServiceException("-1", msg, Utils.getErrorMsg(ex.getLocalizedMessage()));
		}
	}

	public void updateCore(Polgpoz1 coreModel) throws ServiceException {
		// Preparar input fields
		Map<String, String> inputFields = coreModel.auxGetTransactionFields();

		try {
			coreDao_update(inputFields, coreModel);
		} catch (ObjectRetrievalFailureException ex) {
			String msg = MSG_NOT_FOUND;
			log.error(msg);

			coreModel.setMessage(msg);
			coreModel.setStatusCode(-1);
		} catch (Exception ex) {
			String msg = MSG_ERROR_AL_EJECUTAR + " " + CORE_PROGRAM;
			log.error(msg, ex);
			throw ServiceExceptionDetails.buildServiceException("-1", msg, Utils.getErrorMsg(ex.getLocalizedMessage()));
		}
	}

	public void deleteCore(Polgpoz1 coreModel) throws ServiceException {
		// Preparar input fields
		Map<String, String> inputFields = coreModel.auxGetSearchFields();

		try {
			coreDao_delete(inputFields, coreModel);
		} catch (ObjectRetrievalFailureException ex) {
			String msg = MSG_NOT_FOUND;
			log.error(msg);

			coreModel.setMessage(msg);
			coreModel.setStatusCode(-1);
		} catch (Exception ex) {
			String msg = MSG_ERROR_AL_EJECUTAR + " " + CORE_PROGRAM;
			log.error(msg, ex);
			throw ServiceExceptionDetails.buildServiceException("-1", msg, Utils.getErrorMsg(ex.getLocalizedMessage()));
		}
	}

	public void previousCore(Polgpoz1 coreModel) throws ServiceException {
		// Preparar input fields
		Map<String, String> inputFields = coreModel.auxGetSearchFields();

		try {

			coreDao_previous(inputFields, coreModel);

		} catch (ObjectRetrievalFailureException ex) {
			String msg = MSG_NOT_FOUND;
			log.error(msg);

			coreModel.setMessage(msg);
			coreModel.setStatusCode(-1);
		} catch (Exception ex) {
			String msg = MSG_ERROR_AL_EJECUTAR + " " + CORE_PROGRAM;
			log.error(msg, ex);
			throw ServiceExceptionDetails.buildServiceException("-1", msg, Utils.getErrorMsg(ex.getLocalizedMessage()));
		}
	}

	/*
	 * Declaracion de coreDao_functions
	 */
	protected void coreDao_get(Map<String, String> inputFields, Polgpoz1 coreModel)
			throws ObjectRetrievalFailureException, Exception {

		Map<String, String> coreResponse = null;

		coreResponse = coreDaoSabe.execute(CORE_SYSTEM, CORE_PROGRAM, CORE_PROGRAM_VERSION, CORE_PROGRAM_FUNCTION_C,
				inputFields);

		if (coreModel == null) {
			throw new Exception("coreModel == null");
		}

		coreModel.auxSetValuesFromMap(coreResponse);

		String coremsg = CoreTools.getCoreMessage(coreResponse);

		if (coremsg != null && !coremsg.equals("")) {
			coreModel.setMessage(coremsg);
			coreModel.setStatusCode(-1);
		}

//        coreModel.setUsuario(coreResponse.get("usuario")); // 2021-02-25 ati: No viene definido  
	}

	protected List<Polgpoz1> coreDao_getList(Map<String, String> inputFields, Polgpoz1 coreModel)
			throws ObjectRetrievalFailureException, Exception {

		Map<String, String> coreResponse = coreDaoSabe.execute(CORE_SYSTEM, CORE_PROGRAM, CORE_PROGRAM_VERSION,
				CORE_PROGRAM_FUNCTION_L, inputFields);

		if (coreModel == null) {
			throw new Exception("coreModel == null");
		}

		List<Polgpoz1> list = Polgpoz1.auxGetListFromCore(coreResponse);

		String coremsg = CoreTools.getCoreMessage(coreResponse);

		if (coremsg != null && !coremsg.equals("")) {
			coreModel.setMessage(coremsg);
			coreModel.setStatusCode(-1);
		}

		return list;
	}

	protected void coreDao_insert(Map<String, String> inputFields, Polgpoz1 coreModel)
			throws ObjectRetrievalFailureException, Exception {

		Map<String, String> coreResponse = coreDaoSabe.execute(CORE_SYSTEM, CORE_PROGRAM, CORE_PROGRAM_VERSION,
				CORE_PROGRAM_FUNCTION_A, inputFields);
		if (coreModel == null) {
			throw new Exception("coreModel == null");
		}

		coreModel.auxSetValuesFromMap(coreResponse);

		String coremsg = CoreTools.getCoreMessage(coreResponse);

		if (coremsg != null && !coremsg.equals("")) {
			coreModel.setMessage(coremsg);
			coreModel.setStatusCode(-1);
		}
	}

	protected void coreDao_update(Map<String, String> inputFields, Polgpoz1 coreModel)
			throws ObjectRetrievalFailureException, Exception {

		Map<String, String> coreResponse = coreDaoSabe.execute(CORE_SYSTEM, CORE_PROGRAM, CORE_PROGRAM_VERSION,
				CORE_PROGRAM_FUNCTION_M, inputFields);

		if (coreModel == null) {
			throw new Exception("coreModel == null");
		}

		coreModel.auxSetValuesFromMap(coreResponse);

		String coremsg = CoreTools.getCoreMessage(coreResponse);

		if (coremsg != null && !coremsg.equals("")) {
			coreModel.setMessage(coremsg);
			coreModel.setStatusCode(-1);
		}
	}

	protected void coreDao_delete(Map<String, String> inputFields, Polgpoz1 coreModel)
			throws ObjectRetrievalFailureException, Exception {

		Map<String, String> coreResponse = coreDaoSabe.execute(CORE_SYSTEM, CORE_PROGRAM, CORE_PROGRAM_VERSION,
				CORE_PROGRAM_FUNCTION_B, inputFields);
		if (coreModel == null) {
			throw new Exception("coreModel == null");
		}

		coreModel.auxSetValuesFromMap(coreResponse);

		String coremsg = CoreTools.getCoreMessage(coreResponse);

		if (coremsg != null && !coremsg.equals("")) {
			coreModel.setMessage(coremsg);
			coreModel.setStatusCode(-1);
		}
	}

	protected void coreDao_previous(Map<String, String> inputFields, Polgpoz1 coreModel)
			throws ObjectRetrievalFailureException, Exception {
		Map<String, String> coreResponse = coreDaoSabe.execute(CORE_SYSTEM, CORE_PROGRAM, CORE_PROGRAM_VERSION,
				CORE_PROGRAM_FUNCTION_P, inputFields);
		if (coreModel == null) {
			throw new Exception("coreModel == null");
		}

		coreModel.auxSetValuesFromMap(coreResponse);

		String coremsg = CoreTools.getCoreMessage(coreResponse);

		if (coremsg != null && !coremsg.equals("")) {
			coreModel.setMessage(coremsg);
			coreModel.setStatusCode(-1);
		}
	}
}
