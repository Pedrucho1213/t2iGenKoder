package mx.t2i.sabe.opcger.biz.model;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.springframework.stereotype.Component;

import mx.t2i.core.util.biz.model.CommonResult;
import mx.t2i.tiigcaye.service.dto.OpcgerDTO;

/**
 * <h4>Description:</h4>
 * Model para interfaz de webservice de ResultConsultarAsegurado
 *
 */
@XmlType(propOrder={
		"opcgerDTOList",
					})
@Component
public class ResultOpcgerList extends CommonResult
{
	private static final long serialVersionUID = 1L;

	private List<OpcgerDTO> opcgerDTOList;

	public ResultOpcgerList()
	{
		super();
	}

	public List<OpcgerDTO> getOpcgerDTOList() {
		return opcgerDTOList;
	}

	public void setOpcgerDTOList(List<OpcgerDTO> opcgerDTOList) {
		this.opcgerDTOList = opcgerDTOList;
	}

	public String toString()
    {
        StringBuilder r = new StringBuilder() ;

        r
        .append( super.toString()).append( "&" )
        .append("opcgerDTOList=").append( opcgerDTOList ).append("&")
        ;
        return r.toString() ;
    }

    public boolean equals( Object obj )
    {
        boolean r = false;

        if ( obj == null ) return false;
        if ( ! ( obj instanceof ResultOpcgerList ) )  return false;

        final ResultOpcgerList other = ( ResultOpcgerList ) obj ;
        final EqualsBuilder equalsBuilder = new EqualsBuilder();

        equalsBuilder.append( this.getClass().getName() , other.getClass().getName() );

        equalsBuilder.append( opcgerDTOList , other.opcgerDTOList );

        r = equalsBuilder.isEquals() ;
        return r ;
    }

    public int hashCode()
    {
        final HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();

        hashCodeBuilder.append( this.getClass().getName() );

        hashCodeBuilder.append( opcgerDTOList );
        return hashCodeBuilder.toHashCode() ;
    }


	@Override
    public void clear()
    {
    	super.clear();
    	opcgerDTOList.clear();
    }
}
