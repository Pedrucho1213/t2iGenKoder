package mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.biz.model;

import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.springframework.stereotype.Component;
 
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import org.springframework.beans.factory.annotation.Autowired;
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
		"folioRecibo",
		"fechaEmisionRbo",
		"fPago",
		"idTipoRecibo",
		"idStatusRecibo",
		"fStatusRecibo",
		"descrStatusRecibo",
		"importe",
		"recargoRecibo",
		"gastoExpedicionRbo",
		"inicioVigenciaRecibo",
		"finVigenciaRecibo",
		"primaTotalRecibo",
		"comisionAgente",
		"impuestoRecibo",
})
@Component
public class Recibo extends mx.t2i.tekhne.core.model.RootObject {

	private static final long serialVersionUID = 1L;

	
	private Integer folioEndoso = null;
	
	private Integer numEndoso = null;
	
	private Integer idStatusEndoso = null;
	
	private String fStatusEndoso = null;
	
	private Integer idTipoEndoso = null;
	
	private String descrTipoEndoso = null;
	
	private Integer idCveMovimiento = null;
	
	private String descrCveMovto = null;
	
	private Integer folioRecibo = null;
	
	private Date fechaEmisionRbo = null;
	
	private Date fPago = null;
	
	private Integer idTipoRecibo = null;
	
	private Integer idStatusRecibo = null;
	
	private Date fStatusRecibo = null;
	
	private String descrStatusRecibo = null;
	
	private Double importe = null;
	
	private Double recargoRecibo = null;
	
	private Double gastoExpedicionRbo = null;
	
	private Date inicioVigenciaRecibo = null;
	
	private Date finVigenciaRecibo = null;
	
	private Double primaTotalRecibo = null;
	
	private Double comisionAgente = null;
	
	private Double impuestoRecibo = null;

	/**
	 *
	 * Default constructor
	 */
	public Recibo() {
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

        public Integer getFolioRecibo() {
		return folioRecibo;
	}

    public void setFolioRecibo(Integer folioRecibo) {
		this.folioRecibo = folioRecibo;
	}

        public Date getFechaEmisionRbo() {
		return fechaEmisionRbo;
	}

    public void setFechaEmisionRbo(Date fechaEmisionRbo) {
		this.fechaEmisionRbo = fechaEmisionRbo;
	}

        public Date getFPago() {
		return fPago;
	}

    public void setFPago(Date fPago) {
		this.fPago = fPago;
	}

        public Integer getIdTipoRecibo() {
		return idTipoRecibo;
	}

    public void setIdTipoRecibo(Integer idTipoRecibo) {
		this.idTipoRecibo = idTipoRecibo;
	}

        public Integer getIdStatusRecibo() {
		return idStatusRecibo;
	}

    public void setIdStatusRecibo(Integer idStatusRecibo) {
		this.idStatusRecibo = idStatusRecibo;
	}

        public Date getFStatusRecibo() {
		return fStatusRecibo;
	}

    public void setFStatusRecibo(Date fStatusRecibo) {
		this.fStatusRecibo = fStatusRecibo;
	}

        public String getDescrStatusRecibo() {
		return descrStatusRecibo;
	}

    public void setDescrStatusRecibo(String descrStatusRecibo) {
		this.descrStatusRecibo = descrStatusRecibo;
	}

        public Double getImporte() {
		return importe;
	}

    public void setImporte(Double importe) {
		this.importe = importe;
	}

        public Double getRecargoRecibo() {
		return recargoRecibo;
	}

    public void setRecargoRecibo(Double recargoRecibo) {
		this.recargoRecibo = recargoRecibo;
	}

        public Double getGastoExpedicionRbo() {
		return gastoExpedicionRbo;
	}

    public void setGastoExpedicionRbo(Double gastoExpedicionRbo) {
		this.gastoExpedicionRbo = gastoExpedicionRbo;
	}

        public Date getInicioVigenciaRecibo() {
		return inicioVigenciaRecibo;
	}

    public void setInicioVigenciaRecibo(Date inicioVigenciaRecibo) {
		this.inicioVigenciaRecibo = inicioVigenciaRecibo;
	}

        public Date getFinVigenciaRecibo() {
		return finVigenciaRecibo;
	}

    public void setFinVigenciaRecibo(Date finVigenciaRecibo) {
		this.finVigenciaRecibo = finVigenciaRecibo;
	}

        public Double getPrimaTotalRecibo() {
		return primaTotalRecibo;
	}

    public void setPrimaTotalRecibo(Double primaTotalRecibo) {
		this.primaTotalRecibo = primaTotalRecibo;
	}

        public Double getComisionAgente() {
		return comisionAgente;
	}

    public void setComisionAgente(Double comisionAgente) {
		this.comisionAgente = comisionAgente;
	}

        public Double getImpuestoRecibo() {
		return impuestoRecibo;
	}

    public void setImpuestoRecibo(Double impuestoRecibo) {
		this.impuestoRecibo = impuestoRecibo;
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
		folioRecibo = null;
		fechaEmisionRbo = null;
		fPago = null;
		idTipoRecibo = null;
		idStatusRecibo = null;
		fStatusRecibo = null;
		descrStatusRecibo = null;
		importe = null;
		recargoRecibo = null;
		gastoExpedicionRbo = null;
		inicioVigenciaRecibo = null;
		finVigenciaRecibo = null;
		primaTotalRecibo = null;
		comisionAgente = null;
		impuestoRecibo = null;
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
		.append("folioRecibo=").append( folioRecibo ).append("&")
		.append("fechaEmisionRbo=").append( fechaEmisionRbo ).append("&")
		.append("fPago=").append( fPago ).append("&")
		.append("idTipoRecibo=").append( idTipoRecibo ).append("&")
		.append("idStatusRecibo=").append( idStatusRecibo ).append("&")
		.append("fStatusRecibo=").append( fStatusRecibo ).append("&")
		.append("descrStatusRecibo=").append( descrStatusRecibo ).append("&")
		.append("importe=").append( importe ).append("&")
		.append("recargoRecibo=").append( recargoRecibo ).append("&")
		.append("gastoExpedicionRbo=").append( gastoExpedicionRbo ).append("&")
		.append("inicioVigenciaRecibo=").append( inicioVigenciaRecibo ).append("&")
		.append("finVigenciaRecibo=").append( finVigenciaRecibo ).append("&")
		.append("primaTotalRecibo=").append( primaTotalRecibo ).append("&")
		.append("comisionAgente=").append( comisionAgente ).append("&")
		.append("impuestoRecibo=").append( impuestoRecibo ).append("&")
		;
		
		return r.toString() ;
	}

	public boolean equals( Object obj ){
		boolean r = false;

		if ( obj == null )
            return false;
		if ( ! ( obj instanceof Recibo ) )
            return false;

		final Recibo other = ( Recibo ) obj ;
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
		equalsBuilder.append( folioRecibo , other.folioRecibo );
		equalsBuilder.append( fechaEmisionRbo , other.fechaEmisionRbo );
		equalsBuilder.append( fPago , other.fPago );
		equalsBuilder.append( idTipoRecibo , other.idTipoRecibo );
		equalsBuilder.append( idStatusRecibo , other.idStatusRecibo );
		equalsBuilder.append( fStatusRecibo , other.fStatusRecibo );
		equalsBuilder.append( descrStatusRecibo , other.descrStatusRecibo );
		equalsBuilder.append( importe , other.importe );
		equalsBuilder.append( recargoRecibo , other.recargoRecibo );
		equalsBuilder.append( gastoExpedicionRbo , other.gastoExpedicionRbo );
		equalsBuilder.append( inicioVigenciaRecibo , other.inicioVigenciaRecibo );
		equalsBuilder.append( finVigenciaRecibo , other.finVigenciaRecibo );
		equalsBuilder.append( primaTotalRecibo , other.primaTotalRecibo );
		equalsBuilder.append( comisionAgente , other.comisionAgente );
		equalsBuilder.append( impuestoRecibo , other.impuestoRecibo );

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
		hashCodeBuilder.append( folioRecibo );
		hashCodeBuilder.append( fechaEmisionRbo );
		hashCodeBuilder.append( fPago );
		hashCodeBuilder.append( idTipoRecibo );
		hashCodeBuilder.append( idStatusRecibo );
		hashCodeBuilder.append( fStatusRecibo );
		hashCodeBuilder.append( descrStatusRecibo );
		hashCodeBuilder.append( importe );
		hashCodeBuilder.append( recargoRecibo );
		hashCodeBuilder.append( gastoExpedicionRbo );
		hashCodeBuilder.append( inicioVigenciaRecibo );
		hashCodeBuilder.append( finVigenciaRecibo );
		hashCodeBuilder.append( primaTotalRecibo );
		hashCodeBuilder.append( comisionAgente );
		hashCodeBuilder.append( impuestoRecibo );

		return hashCodeBuilder.toHashCode() ;
	}
}
