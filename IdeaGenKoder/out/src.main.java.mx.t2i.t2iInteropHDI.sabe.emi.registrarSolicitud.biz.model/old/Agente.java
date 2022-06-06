package mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.biz.model;

import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.springframework.stereotype.Component;
 
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <h4>Description:</h4> Model para interfaz de webservice de
 * AseguradoImprimirCertificado
 *
 */
@XmlType(propOrder = {
		"idAgente",
		"nombreAgente",
		"porcPartc",
})
@Component
public class Agente extends mx.t2i.tekhne.core.model.RootObject {

	private static final long serialVersionUID = 1L;

	
	private Integer idAgente = null;
	
	private String nombreAgente = null;
	
	private Double porcPartc = null;

	/**
	 *
	 * Default constructor
	 */
	public Agente() {
		super();
	}

        public Integer getIdAgente() {
		return idAgente;
	}

    public void setIdAgente(Integer idAgente) {
		this.idAgente = idAgente;
	}

        public String getNombreAgente() {
		return nombreAgente;
	}

    public void setNombreAgente(String nombreAgente) {
		this.nombreAgente = nombreAgente;
	}

        public Double getPorcPartc() {
		return porcPartc;
	}

    public void setPorcPartc(Double porcPartc) {
		this.porcPartc = porcPartc;
	}

	public void clear(){
		idAgente = null;
		nombreAgente = null;
		porcPartc = null;
	}

	public String toString(){
		StringBuilder r = new StringBuilder() ;

		r
		.append("idAgente=").append( idAgente ).append("&")
		.append("nombreAgente=").append( nombreAgente ).append("&")
		.append("porcPartc=").append( porcPartc ).append("&")
		;
		
		return r.toString() ;
	}

	public boolean equals( Object obj ){
		boolean r = false;

		if ( obj == null )
            return false;
		if ( ! ( obj instanceof Agente ) )
            return false;

		final Agente other = ( Agente ) obj ;
		final EqualsBuilder equalsBuilder = new EqualsBuilder();

		equalsBuilder.append( this.getClass().getName() , other.getClass().getName() );

		equalsBuilder.append( idAgente , other.idAgente );
		equalsBuilder.append( nombreAgente , other.nombreAgente );
		equalsBuilder.append( porcPartc , other.porcPartc );

		r = equalsBuilder.isEquals() ;
		return r ;
	}

	public int hashCode(){
		final HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();

		hashCodeBuilder.append( this.getClass().getName() );

		hashCodeBuilder.append( idAgente );
		hashCodeBuilder.append( nombreAgente );
		hashCodeBuilder.append( porcPartc );

		return hashCodeBuilder.toHashCode() ;
	}
}
