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
		"nombreContratante",
		"tipoPersona",
		"rfcContratante",
		"eMail",
		"calle",
		"numExt",
		"numInt",
		"colonia",
		"poblacion",
		"codigoPostal",
		"cveEstado",
		"estado",
		"referencia",
})
@Component
public class Contratante extends mx.t2i.tekhne.core.model.RootObject {

	private static final long serialVersionUID = 1L;

	
	private String nombreContratante = null;
	
	private String tipoPersona = null;
	
	private String rfcContratante = null;
	
	private String eMail = null;
	
	private String calle = null;
	
	private String numExt = null;
	
	private String numInt = null;
	
	private String colonia = null;
	
	private String poblacion = null;
	
	private Integer codigoPostal = null;
	
	private Integer cveEstado = null;
	
	private String estado = null;
	
	private String referencia = null;

	/**
	 *
	 * Default constructor
	 */
	public Contratante() {
		super();
	}

        public String getNombreContratante() {
		return nombreContratante;
	}

    public void setNombreContratante(String nombreContratante) {
		this.nombreContratante = nombreContratante;
	}

        public String getTipoPersona() {
		return tipoPersona;
	}

    public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

        public String getRfcContratante() {
		return rfcContratante;
	}

    public void setRfcContratante(String rfcContratante) {
		this.rfcContratante = rfcContratante;
	}

        public String getEMail() {
		return eMail;
	}

    public void setEMail(String eMail) {
		this.eMail = eMail;
	}

        public String getCalle() {
		return calle;
	}

    public void setCalle(String calle) {
		this.calle = calle;
	}

        public String getNumExt() {
		return numExt;
	}

    public void setNumExt(String numExt) {
		this.numExt = numExt;
	}

        public String getNumInt() {
		return numInt;
	}

    public void setNumInt(String numInt) {
		this.numInt = numInt;
	}

        public String getColonia() {
		return colonia;
	}

    public void setColonia(String colonia) {
		this.colonia = colonia;
	}

        public String getPoblacion() {
		return poblacion;
	}

    public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

        public Integer getCodigoPostal() {
		return codigoPostal;
	}

    public void setCodigoPostal(Integer codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

        public Integer getCveEstado() {
		return cveEstado;
	}

    public void setCveEstado(Integer cveEstado) {
		this.cveEstado = cveEstado;
	}

        public String getEstado() {
		return estado;
	}

    public void setEstado(String estado) {
		this.estado = estado;
	}

        public String getReferencia() {
		return referencia;
	}

    public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public void clear(){
		nombreContratante = null;
		tipoPersona = null;
		rfcContratante = null;
		eMail = null;
		calle = null;
		numExt = null;
		numInt = null;
		colonia = null;
		poblacion = null;
		codigoPostal = null;
		cveEstado = null;
		estado = null;
		referencia = null;
	}

	public String toString(){
		StringBuilder r = new StringBuilder() ;

		r
		.append("nombreContratante=").append( nombreContratante ).append("&")
		.append("tipoPersona=").append( tipoPersona ).append("&")
		.append("rfcContratante=").append( rfcContratante ).append("&")
		.append("eMail=").append( eMail ).append("&")
		.append("calle=").append( calle ).append("&")
		.append("numExt=").append( numExt ).append("&")
		.append("numInt=").append( numInt ).append("&")
		.append("colonia=").append( colonia ).append("&")
		.append("poblacion=").append( poblacion ).append("&")
		.append("codigoPostal=").append( codigoPostal ).append("&")
		.append("cveEstado=").append( cveEstado ).append("&")
		.append("estado=").append( estado ).append("&")
		.append("referencia=").append( referencia ).append("&")
		;
		
		return r.toString() ;
	}

	public boolean equals( Object obj ){
		boolean r = false;

		if ( obj == null )
            return false;
		if ( ! ( obj instanceof Contratante ) )
            return false;

		final Contratante other = ( Contratante ) obj ;
		final EqualsBuilder equalsBuilder = new EqualsBuilder();

		equalsBuilder.append( this.getClass().getName() , other.getClass().getName() );

		equalsBuilder.append( nombreContratante , other.nombreContratante );
		equalsBuilder.append( tipoPersona , other.tipoPersona );
		equalsBuilder.append( rfcContratante , other.rfcContratante );
		equalsBuilder.append( eMail , other.eMail );
		equalsBuilder.append( calle , other.calle );
		equalsBuilder.append( numExt , other.numExt );
		equalsBuilder.append( numInt , other.numInt );
		equalsBuilder.append( colonia , other.colonia );
		equalsBuilder.append( poblacion , other.poblacion );
		equalsBuilder.append( codigoPostal , other.codigoPostal );
		equalsBuilder.append( cveEstado , other.cveEstado );
		equalsBuilder.append( estado , other.estado );
		equalsBuilder.append( referencia , other.referencia );

		r = equalsBuilder.isEquals() ;
		return r ;
	}

	public int hashCode(){
		final HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();

		hashCodeBuilder.append( this.getClass().getName() );

		hashCodeBuilder.append( nombreContratante );
		hashCodeBuilder.append( tipoPersona );
		hashCodeBuilder.append( rfcContratante );
		hashCodeBuilder.append( eMail );
		hashCodeBuilder.append( calle );
		hashCodeBuilder.append( numExt );
		hashCodeBuilder.append( numInt );
		hashCodeBuilder.append( colonia );
		hashCodeBuilder.append( poblacion );
		hashCodeBuilder.append( codigoPostal );
		hashCodeBuilder.append( cveEstado );
		hashCodeBuilder.append( estado );
		hashCodeBuilder.append( referencia );

		return hashCodeBuilder.toHashCode() ;
	}
}
