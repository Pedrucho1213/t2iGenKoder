package mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.ws.model;

import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.springframework.stereotype.Component;
 
import java.util.List;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.springframework.beans.factory.annotation.Autowired;
import mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.biz.model.Cliente;
import mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.biz.model.Poliza;
import mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.biz.model.Asegurado;

/**
 * <h4>Description:</h4>
 * Model para interfaz de webservice de ReqRegistrarSolicitud
 *
 */
 
@XmlType(propOrder={
		"cliente",
		"poliza",
		"asegurados",
					})
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqRegistrarSolicitud // 2022-06-01 ati OMITIR: extends mx.t2i.tekhne.core.model.BaseInterfaceModel 
{
	
	private Cliente cliente = null;
	
	private Poliza poliza = null;
	@Autowired
	private List<Asegurado> asegurados = null;


	public ReqRegistrarSolicitud() {
		super();
	}

		public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

		public Poliza getPoliza() {
		return poliza;
	}

	public void setPoliza(Poliza poliza) {
		this.poliza = poliza;
	}

	//@XmlElement(name="asegurados") // Este nombre aparece en el response por cada item
	public List<Asegurado> getAsegurados() {
		return asegurados;
	}

	public void setAsegurados(List<Asegurado> asegurados) {
		this.asegurados = asegurados;
	}

	public void clear()
    {
		cliente = null;
		poliza = null;
		asegurados = null;
    }
    
	public String toString()
    {
        StringBuilder r = new StringBuilder() ;

        r
        .append( super.toString()).append( "&" )
        .append("cliente=").append( cliente ).append("&")
        .append("poliza=").append( poliza ).append("&")
        .append("asegurados=").append( asegurados ).append("&")
        ;
        return r.toString() ;
    }

    public boolean equals( Object obj )
    {
        boolean r = false;

        if ( obj == null ) return false;
        if ( ! ( obj instanceof ReqRegistrarSolicitud ) )  return false;

        final ReqRegistrarSolicitud other = ( ReqRegistrarSolicitud ) obj ;
        final EqualsBuilder equalsBuilder = new EqualsBuilder();

        equalsBuilder.append( this.getClass().getName() , other.getClass().getName() );

        equalsBuilder.append( cliente , other.cliente );
        equalsBuilder.append( poliza , other.poliza );
        equalsBuilder.append( asegurados , other.asegurados );

        r = equalsBuilder.isEquals() ;
        return r ;
    }

    public int hashCode()
    {
        final HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();

        hashCodeBuilder.append( this.getClass().getName() );

        hashCodeBuilder.append( cliente );
        hashCodeBuilder.append( poliza );
        hashCodeBuilder.append( asegurados );

        return hashCodeBuilder.toHashCode() ;
    }

}
