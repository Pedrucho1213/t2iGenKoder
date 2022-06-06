package ${FTL_package};

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

import mx.t2i.core.util.biz.model.CommonResult;
import mx.t2i.sabe.opcger.biz.model.ResultOpcgerList;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Component
public class ${FTL_RespList} extends CommonResult // 2021-07-15 ati: Extienda CommonResult para heredar codigoError y mensajeError
{

	ResultOpcgerList serviceResult = null;
	
	/**
	 * Default Constructor
	 */
	public ${FTL_RespList}() {
		super();
	}
	
	/**
	 * @return the ResultSolicitarCfdiRecibo
	 */
	public ${FTL_ResultList} getServiceResult() {
		return serviceResult;
	}
	
	/**
	 * @param the solicitarCfdiReciboServiceResponse to set
	 */
	public void setServiceResult(${FTL_ResultList} serviceResult) {
		this.serviceResult = serviceResult;
	}

	@Override
	public String toString() {
		return "${FTL_RespList} [serviceResult=" + serviceResult + "]";
	}

	public void clear() {
		serviceResult.clear();	
	}
}
