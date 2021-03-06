package mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.ws.model;

import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.springframework.stereotype.Component;
 
import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.ws.model.RespCliente;
import mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.ws.model.RespPoliza;

/**
 * <h4>Description:</h4>
 * Model para interfaz de webservice de RespRegistrarSolicitud
 *
 */
 
@XmlType(propOrder={
		"respCliente",
		"respPoliza",
					})
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class RespRegistrarSolicitud extends mx.t2i.tekhne.core.model.BaseInterfaceModel 
{
	
	private RespCliente respCliente = null;
	
	private RespPoliza respPoliza = null;


	public RespRegistrarSolicitud() {
		super();
	}

		public RespCliente getRespCliente() {
		return respCliente;
	}

	public void setRespCliente(RespCliente respCliente) {
		this.respCliente = respCliente;
	}

		public RespPoliza getRespPoliza() {
		return respPoliza;
	}

	public void setRespPoliza(RespPoliza respPoliza) {
		this.respPoliza = respPoliza;
	}

	public void clear()
    {
		respCliente = null;
		respPoliza = null;
    }
    
	public String toString()
    {
        StringBuilder r = new StringBuilder() ;

        r
        .append( super.toString()).append( "&" )
        .append("respCliente=").append( respCliente ).append("&")
        .append("respPoliza=").append( respPoliza ).append("&")
        ;
        return r.toString() ;
    }

    public boolean equals( Object obj )
    {
        boolean r = false;

        if ( obj == null ) return false;
        if ( ! ( obj instanceof RespRegistrarSolicitud ) )  return false;

        final RespRegistrarSolicitud other = ( RespRegistrarSolicitud ) obj ;
        final EqualsBuilder equalsBuilder = new EqualsBuilder();

        equalsBuilder.append( this.getClass().getName() , other.getClass().getName() );

        equalsBuilder.append( respCliente , other.respCliente );
        equalsBuilder.append( respPoliza , other.respPoliza );

        r = equalsBuilder.isEquals() ;
        return r ;
    }

    public int hashCode()
    {
        final HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();

        hashCodeBuilder.append( this.getClass().getName() );

        hashCodeBuilder.append( respCliente );
        hashCodeBuilder.append( respPoliza );

        return hashCodeBuilder.toHashCode() ;
    }

}
