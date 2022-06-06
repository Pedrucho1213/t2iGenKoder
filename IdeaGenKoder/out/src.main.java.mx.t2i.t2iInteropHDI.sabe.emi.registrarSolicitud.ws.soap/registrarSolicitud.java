package mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.ws.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;

import mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.ws.model.ReqRegistrarSolicitud;
import mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.ws.model.RespRegistrarSolicitud;
import mx.t2i.tekhne.core.exceptions.ServiceException;

/**
 * Interface para el WebService de RegistrarSolicitud
 */

@WebService(name="t2iSabe_RegistrarSolicitud") // Este nombre aparece en el WSDL como <wsdl:binding ... type=
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
public interface RegistrarSolicitudWs
{
     @WebMethod(operationName = "registrarSolicitud") // Este nombre aparece en el WSDL como <wsdl:operation name= y <wsdl:input name=
     public @WebResult(name="response") // Este nombre aparece en el response
     	RespRegistrarSolicitud registrarSolicitud
	       (
               @WebParam(name = "request") // Este nombre aparece en el request
                   @XmlElement(required=true,nillable=false) @NotNull ReqRegistrarSolicitud reqRegistrarSolicitud
	       )
	       throws ServiceException;

}
