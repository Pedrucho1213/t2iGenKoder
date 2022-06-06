package ${FTL_package};

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;

import mx.t2i.t2iInteropHDI.sabe.emi.${FTL_model}.ws.model.Req${FTL_Model};
import mx.t2i.t2iInteropHDI.sabe.emi.${FTL_model}.ws.model.Resp${FTL_Model};
import mx.t2i.tekhne.core.exceptions.ServiceException;

/**
 * Interface para el WebService de ${FTL_Model}
 */

@WebService(name="t2iSabe_${FTL_Model}") // Este nombre aparece en el WSDL como <wsdl:binding ... type=
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
public interface ${FTL_Model}Ws
{
     @WebMethod(operationName = "${FTL_model}") // Este nombre aparece en el WSDL como <wsdl:operation name= y <wsdl:input name=
     public @WebResult(name="response") // Este nombre aparece en el response
     	RespRegistrarSolicitud ${FTL_model}
	       (
               @WebParam(name = "request") // Este nombre aparece en el request
                   @XmlElement(required=true,nillable=false) @NotNull Req${FTL_Model} req${FTL_Model}
	       )
	       throws ServiceException;

}
