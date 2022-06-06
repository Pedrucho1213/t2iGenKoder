package mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.ws.model;

import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.springframework.stereotype.Component;
 
import java.util.ArrayList;;
import java.util.List;;
import javax.xml.bind.annotation.XmlElement;;
import org.springframework.beans.factory.annotation.Autowired;;

@XmlType(propOrder={
		"ramsubramo",
		"npoliza",
		"ndepend",
		"coberturas",
					})
@Component
public class RespAsegurado extends mx.t2i.tekhne.core.model.BaseInterfaceModel 
{
	
	private String ramsubramo = null;
	
	private Integer npoliza = null;
	
	private Integer ndepend = null;
	@Autowired
	private List<RespCobertura> coberturas = null;


	public RespAsegurado() {
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

		public Integer getNdepend() {
		return ndepend;
	}

	public void setNdepend(Integer ndepend) {
		this.ndepend = ndepend;
	}

	@XmlElement(name="coberturas") // Este nombre aparece en el response por cada item
	public List<RespCobertura> getCoberturas() {
		return coberturas;
	}

	public void setCoberturas(List<RespCobertura> coberturas) {
		this.coberturas = coberturas;
	}

	public void clear()
    {
		ramsubramo = null;
		npoliza = null;
		ndepend = null;
		coberturas = null;
    }
    
	public String toString()
    {
        StringBuilder r = new StringBuilder() ;

        r
        .append("ramsubramo=").append( ramsubramo ).append("&")
        .append("npoliza=").append( npoliza ).append("&")
        .append("ndepend=").append( ndepend ).append("&")
        .append("coberturas=").append( coberturas ).append("&")

        ;
        return r.toString() ;
    }

    public boolean equals( Object obj )
    {
        boolean r = false;

        if ( obj == null ) return false;
        if ( ! ( obj instanceof RespAsegurado ) )  return false;

        final RespAsegurado other = ( RespAsegurado ) obj ;
        final EqualsBuilder equalsBuilder = new EqualsBuilder();

        equalsBuilder.append( this.getClass().getName() , other.getClass().getName() );

        equalsBuilder.append( ramsubramo , other.ramsubramo );
        equalsBuilder.append( npoliza , other.npoliza );
        equalsBuilder.append( ndepend , other.ndepend );
        equalsBuilder.append( coberturas , other.coberturas );

        r = equalsBuilder.isEquals() ;
        return r ;
    }

    public int hashCode()
    {
        final HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();

        hashCodeBuilder.append( this.getClass().getName() );

        hashCodeBuilder.append( ramsubramo );
        hashCodeBuilder.append( npoliza );
        hashCodeBuilder.append( ndepend );
        hashCodeBuilder.append( coberturas );

        return hashCodeBuilder.toHashCode() ;
    }


}
