package mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.biz.service;

import java.util.ArrayList;

import org.slf4j.Logger; // import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;

import mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.ws.model.ReqRegistrarSolicitud;
import mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.ws.model.RespAsegurado;
import mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.ws.model.RespCobertura;
import mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.ws.model.RespRegistrarSolicitud;
import mx.t2i.t2iInteropHDI.util.UtilConstants;
import mx.t2i.tekhne.core.exceptions.ServiceException;
import mx.t2i.tekhne.core.exceptions.ServiceExceptionDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.biz.model.Cliente;;
import mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.core.model.Catclix0;;
import mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.core.service.Catclix0CoreService;;
import mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.ws.model.RespCliente;;
/**
 * Despachador (Dispatcher) del servicio para ConsultarAsegurado
 */

@Service
public class RegistrarSolicitudService {
	/** The logger. */
	private final Logger log = LoggerFactory.getLogger(RegistrarSolicitudService.class);

	@Autowired
	private Catclix0CoreService Catclix0CoreService;

	@Autowired
	private RespRegistrarSolicitud wsModel;

	/**
	 * Constructor default
	 */
	public RegistrarSolicitudService() {
		super();
	}

	/**
	 * Obtener Respuesta del core service
	 *
	 * @return RespRegistrarSolicitud- response
	 * @throws ServiceException
	 */
	public RespRegistrarSolicitud registrarSolicitud(ReqRegistrarSolicitud reqRegistrarSolicitud)
			throws ServiceException {
		RespRegistrarSolicitud respuesta = null;

		String contrat = reqRegistrarSolicitud.getCliente().getContrat();

		if (contrat.contentEquals("DUMMY")) {
			respuesta = registrarSolicitudDummy( reqRegistrarSolicitud );
		} else if (contrat.contentEquals("ERROR")) {
			respuesta = registrarSolicitudDummyError( reqRegistrarSolicitud );
		} else if (contrat.contentEquals("EXCEPTION")) {
			respuesta = registrarSolicitudDummyException( reqRegistrarSolicitud );
		} else {
			respuesta = registrarSolicitudDesdeCore( reqRegistrarSolicitud );
		}
		return respuesta;
	}

	public RespRegistrarSolicitud registrarSolicitudDesdeCore(ReqRegistrarSolicitud reqRegistrarSolicitud)
			throws ServiceException {
		RespRegistrarSolicitud respuesta = new RespRegistrarSolicitud();

		try {
			Catclix0 catclix0CoreModel = new Catclix0();
			catclix0WsModelToCoreModel(reqRegistrarSolicitud,  catclix0CoreModel);
			catclix0CoreService.insertCore( catclix0CoreModel);
			RespCliente respCliente = respuesta.getRespCliente();
			catclix0CoreModelToWsModel( catclix0CoreModel, respCliente);

			
			respuesta.setMessage( catclix0CoreModel.getMessage());
			if ((respuesta.getMessage() != null) && (! respuesta.equals("")))
			{
				respuesta.setStatusCode(-1);
			}
			log.debug("respuesta.getMessage(): ["+respuesta.getMessage()+"]");
			log.debug("respuesta: "+respuesta);
		} catch (Exception ex) {
			String msg = UtilConstants.MSG_ERR_CORE; 
			log.error(msg+": " + ex.getMessage());
			// 2021-03-10 ati: En lugar de levantar Exception responder con statusCode=1 de manera controlada
///			throw ServiceExceptionDetails.buildServiceException("-1", msg, new String[] { msg });
			respuesta.setMessage(msg);
			respuesta.setStatusCode(-1); // 2021-03-11 ati+lra+czg: Acordamos mandar -1 como en caso de Error como se dijo al definir
		}
		return respuesta;
	}
	
		

	protected void catclix0CoreModelToWsModel(catclix0 coreModel, RespRegistrarSolicitud wsModel)
			throws ServiceException {
		wsModel.setMessage(coreModel.getMessage());
	}

	protected void catclix0CoreModelWsModelToCoreModel(ReqRegistrarSolicitud wsModel, catclix0 coreModel)
			throws ServiceException {

		coreModel.setMessage(wsModel.getMessage());

	}

	public RespRegistrarSolicitud registrarSolicitudDummy(ReqRegistrarSolicitud reqRegistrarSolicitud) throws ServiceException
	{
//		RespRegistrarSolicitud wsModel = new RespRegistrarSolicitud();

		wsModel.getRespCliente().setNumcliente( 123 );
		wsModel.getRespCliente().setStatusCode( 0 );
		wsModel.getRespCliente().setMessage(new String( "" ));

		wsModel.getRespPoliza().setRamsubramo(new String( "1010" ));
		wsModel.getRespPoliza().setNpoliza(  1234 );
		wsModel.getRespPoliza().setStatusCode( 0 );
		wsModel.getRespPoliza().setMessage(new String( "" ));

		RespAsegurado respAsegurado = new RespAsegurado();
		respAsegurado.setCoberturas( new ArrayList<RespCobertura>() );// Asignar instancia porque no aplica @Autowired
		respAsegurado.setRamsubramo( "1010" );
		respAsegurado.setNpoliza( 1234 );
		respAsegurado.setNdepend( 0 );
		wsModel.getRespPoliza().getAsegurados().add(respAsegurado);

		RespCobertura respCobertura = new RespCobertura();
		respCobertura.setRamsubramo( "1010 " );
		respCobertura.setNpoliza( 1234 );
		respCobertura.setNdepend( 0 );
		respCobertura.setTipoadic( 0 );
		respAsegurado.getCoberturas().add(respCobertura);

		RespAsegurado respAsegurado1 = new RespAsegurado();
		respAsegurado1.setCoberturas( new ArrayList<RespCobertura>() );// Asignar instancia porque no aplica @Autowired
		respAsegurado1.setRamsubramo( "1010" );
		respAsegurado1.setNpoliza( 1234 );
		respAsegurado1.setNdepend( 1 );
		wsModel.getRespPoliza().getAsegurados().add(respAsegurado1);

		RespCobertura respCobertura1 = new RespCobertura();
		respCobertura1.setRamsubramo( "1010" );
		respCobertura1.setNpoliza( 1234 );
		respCobertura1.setNdepend( 0 );
		respCobertura1.setTipoadic( 1 );
		respAsegurado1.getCoberturas().add(respCobertura1);


		return wsModel;
	}

	public RespRegistrarSolicitud registrarSolicitudDummyError(ReqRegistrarSolicitud reqRegistrarSolicitud)
			throws ServiceException {
		RespRegistrarSolicitud respRegistrarSolicitud = new RespRegistrarSolicitud();

		String contrat = reqRegistrarSolicitud.getCliente().getContrat();

		if (contrat.contentEquals("ERROR")) {
			String msg = UtilConstants.PREFIJO_ERROR_CORE + " consultarAseguradoDummyError 'desde CORE'";
			log.warn(msg);
			respRegistrarSolicitud.setStatusCode(-1);
			respRegistrarSolicitud.setMessage(msg);
		}
		return respRegistrarSolicitud;
	}

	public RespRegistrarSolicitud registrarSolicitudDummyException(ReqRegistrarSolicitud reqRegistrarSolicitud)
			throws ServiceException {
		RespRegistrarSolicitud respRegistrarSolicitud = new RespRegistrarSolicitud();

		String contrat = reqRegistrarSolicitud.getCliente().getContrat();

		if (contrat.contentEquals("EXCEPTION")) {
			String msg = "consultarAseguradoDummyException";
			log.warn(msg);
			throw ServiceExceptionDetails.buildServiceException("FaultCode: " + "-1", "FaultTitle: " + msg,
					new String[] { "FaultMessages[]: " + msg });
		}
		return respRegistrarSolicitud;
	}
}
