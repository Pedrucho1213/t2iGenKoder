package ${FTL_package};

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ${FTL_ReqList} 
{

	private Integer ramsubramo = null;

	public ${FTL_ReqList}() 
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
		return "${FTL_ReqList} [ramsubramo=" + ramsubramo + "]";
	}

	public void clear() {
		ramsubramo = new Integer(0);	
	}
}

