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
		"folioEndoso",
		"numEndoso",
		"idStatusEndoso",
		"fStatusEndoso",
		"idTipoEndoso",
		"descrTipoEndoso",
		"idCveMovimiento",
		"descrCveMovto",
})
@Component
public class Endozo extends mx.t2i.tekhne.core.model.RootObject {

	private static final long serialVersionUID = 1L;

	
	private Integer folioEndoso = null;
	
	private Integer numEndoso = null;
	
	private Integer idStatusEndoso = null;
	
	private String fStatusEndoso = null;
	
	private Integer idTipoEndoso = null;
	
	private String descrTipoEndoso = null;
	
	private Integer idCveMovimiento = null;
	
	private String descrCveMovto = null;

	/**
	 *
	 * Default constructor
	 */
	public Endozo() {
		super();
	}

        public Integer getFolioEndoso() {
		return folioEndoso;
	}

    public void setFolioEndoso(Integer folioEndoso) {
		this.folioEndoso = folioEndoso;
	}

        public Integer getNumEndoso() {
		return numEndoso;
	}

    public void setNumEndoso(Integer numEndoso) {
		this.numEndoso = numEndoso;
	}

        public Integer getIdStatusEndoso() {
		return idStatusEndoso;
	}

    public void setIdStatusEndoso(Integer idStatusEndoso) {
		this.idStatusEndoso = idStatusEndoso;
	}

        public String getFStatusEndoso() {
		return fStatusEndoso;
	}

    public void setFStatusEndoso(String fStatusEndoso) {
		this.fStatusEndoso = fStatusEndoso;
	}

        public Integer getIdTipoEndoso() {
		return idTipoEndoso;
	}

    public void setIdTipoEndoso(Integer idTipoEndoso) {
		this.idTipoEndoso = idTipoEndoso;
	}

        public String getDescrTipoEndoso() {
		return descrTipoEndoso;
	}

    public void setDescrTipoEndoso(String descrTipoEndoso) {
		this.descrTipoEndoso = descrTipoEndoso;
	}

        public Integer getIdCveMovimiento() {
		return idCveMovimiento;
	}

    public void setIdCveMovimiento(Integer idCveMovimiento) {
		this.idCveMovimiento = idCveMovimiento;
	}

        public String getDescrCveMovto() {
		return descrCveMovto;
	}

    public void setDescrCveMovto(String descrCveMovto) {
		this.descrCveMovto = descrCveMovto;
	}

	public void clear(){
		folioEndoso = null;
		numEndoso = null;
		idStatusEndoso = null;
		fStatusEndoso = null;
		idTipoEndoso = null;
		descrTipoEndoso = null;
		idCveMovimiento = null;
		descrCveMovto = null;
	}

	public String toString(){
		StringBuilder r = new StringBuilder() ;

		r
		.append("folioEndoso=").append( folioEndoso ).append("&")
		.append("numEndoso=").append( numEndoso ).append("&")
		.append("idStatusEndoso=").append( idStatusEndoso ).append("&")
		.append("fStatusEndoso=").append( fStatusEndoso ).append("&")
		.append("idTipoEndoso=").append( idTipoEndoso ).append("&")
		.append("descrTipoEndoso=").append( descrTipoEndoso ).append("&")
		.append("idCveMovimiento=").append( idCveMovimiento ).append("&")
		.append("descrCveMovto=").append( descrCveMovto ).append("&")
		;
		
		return r.toString() ;
	}

	public boolean equals( Object obj ){
		boolean r = false;

		if ( obj == null )
            return false;
		if ( ! ( obj instanceof Endozo ) )
            return false;

		final Endozo other = ( Endozo ) obj ;
		final EqualsBuilder equalsBuilder = new EqualsBuilder();

		equalsBuilder.append( this.getClass().getName() , other.getClass().getName() );

		equalsBuilder.append( folioEndoso , other.folioEndoso );
		equalsBuilder.append( numEndoso , other.numEndoso );
		equalsBuilder.append( idStatusEndoso , other.idStatusEndoso );
		equalsBuilder.append( fStatusEndoso , other.fStatusEndoso );
		equalsBuilder.append( idTipoEndoso , other.idTipoEndoso );
		equalsBuilder.append( descrTipoEndoso , other.descrTipoEndoso );
		equalsBuilder.append( idCveMovimiento , other.idCveMovimiento );
		equalsBuilder.append( descrCveMovto , other.descrCveMovto );

		r = equalsBuilder.isEquals() ;
		return r ;
	}

	public int hashCode(){
		final HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();

		hashCodeBuilder.append( this.getClass().getName() );

		hashCodeBuilder.append( folioEndoso );
		hashCodeBuilder.append( numEndoso );
		hashCodeBuilder.append( idStatusEndoso );
		hashCodeBuilder.append( fStatusEndoso );
		hashCodeBuilder.append( idTipoEndoso );
		hashCodeBuilder.append( descrTipoEndoso );
		hashCodeBuilder.append( idCveMovimiento );
		hashCodeBuilder.append( descrCveMovto );

		return hashCodeBuilder.toHashCode() ;
	}
}
