package mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.ws.model;

import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.springframework.stereotype.Component;
 

@XmlType(propOrder={
		"numcliente",
					})
@Component
public class RespCliente extends mx.t2i.tekhne.core.model.BaseInterfaceModel 
{
	
	private Integer numcliente = null;


	public RespCliente() {
		super();
	}

		public Integer getNumcliente() {
		return numcliente;
	}

	public void setNumcliente(Integer numcliente) {
		this.numcliente = numcliente;
	}

	public void clear()
    {
		numcliente = null;
    }
    
	public String toString()
    {
        StringBuilder r = new StringBuilder() ;

        r
        .append("numcliente=").append( numcliente ).append("&")

        ;
        return r.toString() ;
    }

    public boolean equals( Object obj )
    {
        boolean r = false;

        if ( obj == null ) return false;
        if ( ! ( obj instanceof RespCliente ) )  return false;

        final RespCliente other = ( RespCliente ) obj ;
        final EqualsBuilder equalsBuilder = new EqualsBuilder();

        equalsBuilder.append( this.getClass().getName() , other.getClass().getName() );

        equalsBuilder.append( numcliente , other.numcliente );

        r = equalsBuilder.isEquals() ;
        return r ;
    }

    public int hashCode()
    {
        final HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();

        hashCodeBuilder.append( this.getClass().getName() );

        hashCodeBuilder.append( numcliente );

        return hashCodeBuilder.toHashCode() ;
    }


}
