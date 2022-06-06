package mx.t2i.sabe.opcger.ws.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqOpcgerList 
{

	private Integer ramsubramo = null;

	public ReqOpcgerList() 
	{
		super();
	}

	public Integer getRamsubramo() {
		return ramsubramo;
	}

	public void setRamsubramo(Integer ramsubramo) {
		this.ramsubramo = ramsubramo;
	}

	@Override
	public String toString() {
		return "ReqOpcgerList [ramsubramo=" + ramsubramo + "]";
	}

	public void clear() {
		ramsubramo = new Integer(0);	
	}
}

