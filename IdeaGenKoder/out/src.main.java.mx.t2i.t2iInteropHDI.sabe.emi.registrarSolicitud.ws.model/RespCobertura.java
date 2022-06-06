package mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.ws.model;

import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.springframework.stereotype.Component;
 
import java.util.ArrayList;;

@XmlType(propOrder={
		"ramsubramo",
		"npoliza",
		"ndepend",
		"tipoadic",
					})
@Component
public class RespCobertura extends mx.t2i.tekhne.core.model.BaseInterfaceModel 
{
	
	private String ramsubramo = null;
	
	private Integer npoliza = null;
	
	private Integer ndepend = null;
	
	private Integer tipoadic = null;


	public RespCobertura() {
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

		public Integer getTipoadic() {
		return tipoadic;
	}

	public void setTipoadic(Integer tipoadic) {
		this.tipoadic = tipoadic;
	}

	public void clear()
    {
		ramsubramo = null;
		npoliza = null;
		ndepend = null;
		tipoadic = null;
    }
    
	public String toString()
    {
        StringBuilder r = new StringBuilder() ;

        r
        .append("ramsubramo=").append( ramsubramo ).append("&")
        .append("npoliza=").append( npoliza ).append("&")
        .append("ndepend=").append( ndepend ).append("&")
        .append("tipoadic=").append( tipoadic ).append("&")

        ;
        return r.toString() ;
    }

    public boolean equals( Object obj )
    {
        boolean r = false;

        if ( obj == null ) return false;
        if ( ! ( obj instanceof RespCobertura ) )  return false;

        final RespCobertura other = ( RespCobertura ) obj ;
        final EqualsBuilder equalsBuilder = new EqualsBuilder();

        equalsBuilder.append( this.getClass().getName() , other.getClass().getName() );

        equalsBuilder.append( ramsubramo , other.ramsubramo );
        equalsBuilder.append( npoliza , other.npoliza );
        equalsBuilder.append( ndepend , other.ndepend );
        equalsBuilder.append( tipoadic , other.tipoadic );

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
        hashCodeBuilder.append( tipoadic );

        return hashCodeBuilder.toHashCode() ;
    }


}
