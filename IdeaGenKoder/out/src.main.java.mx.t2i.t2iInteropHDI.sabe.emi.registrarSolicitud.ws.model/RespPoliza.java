package mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.ws.model;

import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.springframework.stereotype.Component;
 
import java.util.List;;
import javax.xml.bind.annotation.XmlElement;;
import org.springframework.beans.factory.annotation.Autowired;;

@XmlType(propOrder={
		"ramsubramo",
		"npoliza",
		"asegurados",
					})
@Component
public class RespPoliza extends mx.t2i.tekhne.core.model.BaseInterfaceModel 
{
	
	private String ramsubramo = null;
	
	private Integer npoliza = null;
	@Autowired
	private List<RespAsegurado> asegurados = null;


	public RespPoliza() {
		super();
	}

		public String getRamsubramo() {
		return ramsubramo;
	}

	public void setRamsubramo(String ramsubramo) {
		this.ramsubramo = ramsubramo;
	}

		public Integer getNpoliza() {
		return npoliza;
	}

	public void setNpoliza(Integer npoliza) {
		this.npoliza = npoliza;
	}

	@XmlElement(name="asegurados") // Este nombre aparece en el response por cada item
	public List<RespAsegurado> getAsegurados() {
		return asegurados;
	}

	public void setAsegurados(List<RespAsegurado> asegurados) {
		this.asegurados = asegurados;
	}

	public void clear()
    {
		ramsubramo = null;
		npoliza = null;
		asegurados = null;
    }
    
	public String toString()
    {
        StringBuilder r = new StringBuilder() ;

        r
        .append("ramsubramo=").append( ramsubramo ).append("&")
        .append("npoliza=").append( npoliza ).append("&")
        .append("asegurados=").append( asegurados ).append("&")

        ;
        return r.toString() ;
    }

    public boolean equals( Object obj )
    {
        boolean r = false;

        if ( obj == null ) return false;
        if ( ! ( obj instanceof RespPoliza ) )  return false;

        final RespPoliza other = ( RespPoliza ) obj ;
        final EqualsBuilder equalsBuilder = new EqualsBuilder();

        equalsBuilder.append( this.getClass().getName() , other.getClass().getName() );

        equalsBuilder.append( ramsubramo , other.ramsubramo );
        equalsBuilder.append( npoliza , other.npoliza );
        equalsBuilder.append( asegurados , other.asegurados );

        r = equalsBuilder.isEquals() ;
        return r ;
    }

    public int hashCode()
    {
        final HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();

        hashCodeBuilder.append( this.getClass().getName() );

        hashCodeBuilder.append( ramsubramo );
        hashCodeBuilder.append( npoliza );
        hashCodeBuilder.append( asegurados );

        return hashCodeBuilder.toHashCode() ;
    }


}
