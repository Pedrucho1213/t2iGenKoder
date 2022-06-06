package mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.ws.soap.impl;

import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.biz.service.RegistrarSolicitudService;
import mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.ws.model.ReqRegistrarSolicitud;
import mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.ws.model.RespRegistrarSolicitud;
import mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.ws.soap.RegistrarSolicitudWs;
import mx.t2i.t2iInteropHDI.util.UtilConstants;
import mx.t2i.tekhne.core.exceptions.ServiceException;
import mx.t2i.tekhne.core.services.Messages;
import mx.t2i.tekhne.core.services.web.ServiceCommon;



/**
 * Clase de Implementacion para el WebService para procesamiento de AseguradosWSImpl
 *
 */
@Component
@WebService(serviceName="registrarSolicitud") // Este nombre aparece en el WSDL en <wsdl:service name= y como parte de <wsdl:port binding
public class RegistrarSolicitudWsImpl<T> extends ServiceCommon<T> implements RegistrarSolicitudWs // Este nombre Impl aparece en el WSDL como parte de <wsdl:port ... name= 
{

    private static final Logger	log = LoggerFactory.getLogger(RegistrarSolicitudWsImpl.class);

    @Autowired
    private RegistrarSolicitudService registrarSolicitudService = null;

    /**
     * Contructor default de la clase
     */
    public RegistrarSolicitudWsImpl()
    {
        super();
    }


	@Override
	public RespRegistrarSolicitud registrarSolicitud( ReqRegistrarSolicitud reqRegistrarSolicitud ) throws ServiceException
	{
		String ramosubramo = reqRegistrarSolicitud.getPoliza().getRamsubramo();

		chkCondition(ramosubramo		!= null, Messages.ERROR_CODE_GET, "ramsubramo no debe ser null."	, "ramsubramo no debe ser null."		);

        log.debug("ramosubramo request =" + ramosubramo);

        RespRegistrarSolicitud respuesta = null		;

    	respuesta = registrarSolicitudService.registrarSolicitud( reqRegistrarSolicitud );

    	log.debug("registrarSolicitud response =" + respuesta);

		if(respuesta != null)
		{
	        if (respuesta.getMessage() != null && !respuesta.getMessage().trim().equals(""))
	        {
	            if(respuesta.getMessage().toUpperCase().contains(UtilConstants.PREFIJO_ERROR_CORE))
	            {
	            	return respuesta;
	            }

	        	String msg = respuesta.getMessage();
	            log.error(msg);
	            // throw ServiceExceptionDetails.buildServiceException("-1", msg, new String []{msg}); // 2021-03-06 ati: No amerita ServiceException
	            respuesta.setStatusCode(-1); // 2021-03-06 ati: Informe de la respuesta inesperada

	        }
	        else
	        {
	        	return respuesta;
	        }

		}

		return respuesta;
	}
}
