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
		"titularCuenta",
		"numCuenta",
		"cveBanco",
		"sucursal",
		"tipoCondCobro",
		"tipoCuenta",
		"funcionario",
		"aaVencimiento",
		"mmVencimiento",
		"tipoTarjeta",
})
@Component
public class ConductoCobro extends mx.t2i.tekhne.core.model.RootObject {

	private static final long serialVersionUID = 1L;

	
	private String titularCuenta = null;
	
	private String numCuenta = null;
	
	private Integer cveBanco = null;
	
	private String sucursal = null;
	
	private String tipoCondCobro = null;
	
	private Integer tipoCuenta = null;
	
	private String funcionario = null;
	
	private Integer aaVencimiento = null;
	
	private String mmVencimiento = null;
	
	private String tipoTarjeta = null;

	/**
	 *
	 * Default constructor
	 */
	public ConductoCobro() {
		super();
	}

        public String getTitularCuenta() {
		return titularCuenta;
	}

    public void setTitularCuenta(String titularCuenta) {
		this.titularCuenta = titularCuenta;
	}

        public String getNumCuenta() {
		return numCuenta;
	}

    public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

        public Integer getCveBanco() {
		return cveBanco;
	}

    public void setCveBanco(Integer cveBanco) {
		this.cveBanco = cveBanco;
	}

        public String getSucursal() {
		return sucursal;
	}

    public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

        public String getTipoCondCobro() {
		return tipoCondCobro;
	}

    public void setTipoCondCobro(String tipoCondCobro) {
		this.tipoCondCobro = tipoCondCobro;
	}

        public Integer getTipoCuenta() {
		return tipoCuenta;
	}

    public void setTipoCuenta(Integer tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

        public String getFuncionario() {
		return funcionario;
	}

    public void setFuncionario(String funcionario) {
		this.funcionario = funcionario;
	}

        public Integer getAaVencimiento() {
		return aaVencimiento;
	}

    public void setAaVencimiento(Integer aaVencimiento) {
		this.aaVencimiento = aaVencimiento;
	}

        public String getMmVencimiento() {
		return mmVencimiento;
	}

    public void setMmVencimiento(String mmVencimiento) {
		this.mmVencimiento = mmVencimiento;
	}

        public String getTipoTarjeta() {
		return tipoTarjeta;
	}

    public void setTipoTarjeta(String tipoTarjeta) {
		this.tipoTarjeta = tipoTarjeta;
	}

	public void clear(){
		titularCuenta = null;
		numCuenta = null;
		cveBanco = null;
		sucursal = null;
		tipoCondCobro = null;
		tipoCuenta = null;
		funcionario = null;
		aaVencimiento = null;
		mmVencimiento = null;
		tipoTarjeta = null;
	}

	public String toString(){
		StringBuilder r = new StringBuilder() ;

		r
		.append("titularCuenta=").append( titularCuenta ).append("&")
		.append("numCuenta=").append( numCuenta ).append("&")
		.append("cveBanco=").append( cveBanco ).append("&")
		.append("sucursal=").append( sucursal ).append("&")
		.append("tipoCondCobro=").append( tipoCondCobro ).append("&")
		.append("tipoCuenta=").append( tipoCuenta ).append("&")
		.append("funcionario=").append( funcionario ).append("&")
		.append("aaVencimiento=").append( aaVencimiento ).append("&")
		.append("mmVencimiento=").append( mmVencimiento ).append("&")
		.append("tipoTarjeta=").append( tipoTarjeta ).append("&")
		;
		
		return r.toString() ;
	}

	public boolean equals( Object obj ){
		boolean r = false;

		if ( obj == null )
            return false;
		if ( ! ( obj instanceof ConductoCobro ) )
            return false;

		final ConductoCobro other = ( ConductoCobro ) obj ;
		final EqualsBuilder equalsBuilder = new EqualsBuilder();

		equalsBuilder.append( this.getClass().getName() , other.getClass().getName() );

		equalsBuilder.append( titularCuenta , other.titularCuenta );
		equalsBuilder.append( numCuenta , other.numCuenta );
		equalsBuilder.append( cveBanco , other.cveBanco );
		equalsBuilder.append( sucursal , other.sucursal );
		equalsBuilder.append( tipoCondCobro , other.tipoCondCobro );
		equalsBuilder.append( tipoCuenta , other.tipoCuenta );
		equalsBuilder.append( funcionario , other.funcionario );
		equalsBuilder.append( aaVencimiento , other.aaVencimiento );
		equalsBuilder.append( mmVencimiento , other.mmVencimiento );
		equalsBuilder.append( tipoTarjeta , other.tipoTarjeta );

		r = equalsBuilder.isEquals() ;
		return r ;
	}

	public int hashCode(){
		final HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();

		hashCodeBuilder.append( this.getClass().getName() );

		hashCodeBuilder.append( titularCuenta );
		hashCodeBuilder.append( numCuenta );
		hashCodeBuilder.append( cveBanco );
		hashCodeBuilder.append( sucursal );
		hashCodeBuilder.append( tipoCondCobro );
		hashCodeBuilder.append( tipoCuenta );
		hashCodeBuilder.append( funcionario );
		hashCodeBuilder.append( aaVencimiento );
		hashCodeBuilder.append( mmVencimiento );
		hashCodeBuilder.append( tipoTarjeta );

		return hashCodeBuilder.toHashCode() ;
	}
}
