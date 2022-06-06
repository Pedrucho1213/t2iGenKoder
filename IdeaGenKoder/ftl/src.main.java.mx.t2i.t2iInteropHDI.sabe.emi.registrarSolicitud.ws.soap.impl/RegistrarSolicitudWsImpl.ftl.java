package ${FTL_package};

import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mx.t2i.t2iInteropHDI.sabe.emi.${FTL_model}.biz.service.${FTL_Model}Service;
import mx.t2i.t2iInteropHDI.sabe.emi.${FTL_model}.ws.model.Req${FTL_Model};
import mx.t2i.t2iInteropHDI.sabe.emi.${FTL_model}.ws.model.Resp${FTL_Model};
import mx.t2i.t2iInteropHDI.sabe.emi.${FTL_model}.ws.soap.${FTL_Model}Ws;
import mx.t2i.t2iInteropHDI.util.UtilConstants;
import mx.t2i.tekhne.core.exceptions.ServiceException;
import mx.t2i.tekhne.core.services.Messages;
import mx.t2i.tekhne.core.services.web.ServiceCommon;



/**
 * Clase de Implementacion para el WebService para procesamiento de AseguradosWSImpl
 *
 */
@Component
@WebService(serviceName="${FTL_model}") // Este nombre aparece en el WSDL en <wsdl:service name= y como parte de <wsdl:port binding
public class RegistrarSolicitudWsImpl<T> extends ServiceCommon<T> implements ${FTL_Model}Ws // Este nombre Impl aparece en el WSDL como parte de <wsdl:port ... name= 
{

    private static final Logger	log = LoggerFactory.getLogger(${FTL_Model}WsImpl.class);

    @Autowired
    private ${FTL_Model}Service ${FTL_model}Service = null;

    /**
     * Contructor default de la clase
     */
    public RegistrarSolicitudWsImpl()
    {
        super();
    }


	@Override
	public Resp${FTL_Model} registrarSolicitud( Req${FTL_Model} req${FTL_Model} ) throws ServiceException
	{
		String ramosubramo = req${FTL_Model}.getPoliza().getRamsubramo();

		chkCondition(ramosubramo		!= null, Messages.ERROR_CODE_GET, "ramsubramo no debe ser null."	, "ramsubramo no debe ser null."		);

        log.debug("ramosubramo request =" + ramosubramo);

        Resp${FTL_Model} respuesta = null		;

    	respuesta = ${FTL_model}Service.${FTL_model}( req${FTL_Model} );

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
