package mx.t2i.sabe.opcger.ws.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

import mx.t2i.core.util.biz.model.CommonResult;
import mx.t2i.sabe.opcger.biz.model.ResultOpcgerList;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Component
public class RespOpcgerList extends CommonResult // 2021-07-15 ati: Extienda CommonResult para heredar codigoError y mensajeError
{

	ResultOpcgerList serviceResult = null;
	
	/**
	 * Default Constructor
	 */
	public RespOpcgerList() {
		super();
	}
	
	/**
	 * @return the ResultSolicitarCfdiRecibo
	 */
	public ResultOpcgerList getServiceResult() {
		return serviceResult;
	}
	
	/**
	 * @param the solicitarCfdiReciboServiceResponse to set
	 */
	public void setServiceResult(ResultOpcgerList serviceResult) {
		this.serviceResult = serviceResult;
	}

	@Override
	public String toString() {
		return "RespOpcgerList [serviceResult=" + serviceResult + "]";
	}

	public void clear() {
		serviceResult.clear();	
	}
}
