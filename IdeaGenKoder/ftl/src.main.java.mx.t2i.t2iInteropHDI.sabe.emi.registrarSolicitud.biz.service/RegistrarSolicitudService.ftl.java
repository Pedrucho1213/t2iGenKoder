package ${FTL_package};

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

<#list FTL_imports as FTL_import>
<#if FTL_import?exists>${FTL_import};</#if>
</#list>
/**
 * Despachador (Dispatcher) del servicio para ConsultarAsegurado
 */

@Service
public class ${FTL_Model}Service {
	/** The logger. */
	private final Logger log = LoggerFactory.getLogger(${FTL_Model}Service.class);

	@Autowired
	private ${FTL_CoreService} ${FTL_CoreService};

	@Autowired
	private Resp${FTL_Model} wsModel;

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
	public Resp${FTL_Model} registrarSolicitud(Req${FTL_Model} req${FTL_Model})
			throws ServiceException {
		Resp${FTL_Model} respuesta = null;

		String contrat = req${FTL_Model}.getCliente().getContrat();

		if (contrat.contentEquals("DUMMY")) {
			respuesta = registrarSolicitudDummy( req${FTL_Model} );
		} else if (contrat.contentEquals("ERROR")) {
			respuesta = registrarSolicitudDummyError( req${FTL_Model} );
		} else if (contrat.contentEquals("EXCEPTION")) {
			respuesta = registrarSolicitudDummyException( req${FTL_Model} );
		} else {
			respuesta = registrarSolicitudDesdeCore( req${FTL_Model} );
		}
		return respuesta;
	}

	public Resp${FTL_Model} registrarSolicitudDesdeCore(Req${FTL_Model} req${FTL_Model})
			throws ServiceException {
		Resp${FTL_Model} respuesta = new Resp${FTL_Model}();

		try {
			${FTL_Core} ${FTL_coreModel} = new ${FTL_Core}();
			${FTL_core}WsModelToCoreModel(reqRegistrarSolicitud,  ${FTL_coreModel});
			${FTL_coreService}.insertCore( ${FTL_coreModel});
			RespCliente respCliente = respuesta.getRespCliente();
			${FTL_core}CoreModelToWsModel( ${FTL_coreModel}, respCliente);

			
			respuesta.setMessage( ${FTL_coreModel}.getMessage());
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
	
		

	protected void ${FTL_coreModel}ToWsModel(${FTL_core} coreModel, Resp${FTL_Model} wsModel)
			throws ServiceException {
		wsModel.setMessage(coreModel.getMessage());
	}

	protected void ${FTL_coreModel}WsModelToCoreModel(Req${FTL_Model} wsModel, ${FTL_core} coreModel)
			throws ServiceException {

		coreModel.setMessage(wsModel.getMessage());

	}

	public Resp${FTL_Model} ${FTL_model}Dummy(Req${FTL_Model} req${FTL_Model}) throws ServiceException
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

	public Resp${FTL_Model} ${FTL_model}DummyError(Req${FTL_Model} req${FTL_Model})
			throws ServiceException {
		Resp${FTL_Model} resp${FTL_Model} = new Resp${FTL_Model}();

		String contrat = req${FTL_Model}.getCliente().getContrat();

		if (contrat.contentEquals("ERROR")) {
			String msg = UtilConstants.PREFIJO_ERROR_CORE + " consultarAseguradoDummyError 'desde CORE'";
			log.warn(msg);
			resp${FTL_Model}.setStatusCode(-1);
			resp${FTL_Model}.setMessage(msg);
		}
		return resp${FTL_Model};
	}

	public Resp${FTL_Model} ${FTL_model}DummyException(Req${FTL_Model} reqRegistrarSolicitud)
			throws ServiceException {
		Resp${FTL_Model} resp${FTL_Model} = new Resp${FTL_Model}();

		String contrat = req${FTL_Model}.getCliente().getContrat();

		if (contrat.contentEquals("EXCEPTION")) {
			String msg = "consultarAseguradoDummyException";
			log.warn(msg);
			throw ServiceExceptionDetails.buildServiceException("FaultCode: " + "-1", "FaultTitle: " + msg,
					new String[] { "FaultMessages[]: " + msg });
		}
		return resp${FTL_Model};
	}
}
