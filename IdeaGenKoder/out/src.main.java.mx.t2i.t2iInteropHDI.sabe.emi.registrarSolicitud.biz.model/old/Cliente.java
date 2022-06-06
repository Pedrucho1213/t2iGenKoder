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
		"numcliente",
		"cvperson",
		"contrat",
		"appat",
		"apmat",
		"nombre",
		"edocivil",
		"cvsexo",
		"fnac",
		"calle",
		"numext",
		"numint",
		"colonia",
		"cvemunpo",
		"poblacion",
		"edo",
		"codpost",
		"telefono",
		"email",
		"curp",
		"rfcsiglas",
		"rfcfecha",
		"rfchomon",
		"tpidentif",
		"ndocident",
		"cvcompdom",
		"paisnac",
		"nacionld",
		"ocup",
		"actividfui",
		"actfuitext",
		"actfteingr",
		"cargopolit",
		"perspolexp",
		"nombrycgo",
		"acteco",
		"apodlegal",
		"cvegiro",
		"tpregimn",
		"estatura",
		"peso",
		"usoCfdi",
})
@Component
public class Cliente extends mx.t2i.tekhne.core.model.RootObject {

	private static final long serialVersionUID = 1L;

	
	private Integer numcliente = null;
	
	private Integer cvperson = null;
	
	private String contrat = null;
	
	private String appat = null;
	
	private String apmat = null;
	
	private String nombre = null;
	
	private Integer edocivil = null;
	
	private Integer cvsexo = null;
	
	private Date fnac = null;
	
	private String calle = null;
	
	private String numext = null;
	
	private String numint = null;
	
	private String colonia = null;
	
	private Integer cvemunpo = null;
	
	private String poblacion = null;
	
	private Integer edo = null;
	
	private Integer codpost = null;
	
	private String telefono = null;
	
	private String email = null;
	
	private String curp = null;
	
	private String rfcsiglas = null;
	
	private String rfcfecha = null;
	
	private String rfchomon = null;
	
	private Integer tpidentif = null;
	
	private String ndocident = null;
	
	private Integer cvcompdom = null;
	
	private Integer paisnac = null;
	
	private Integer nacionld = null;
	
	private String ocup = null;
	
	private Integer actividfui = null;
	
	private String actfuitext = null;
	
	private String actfteingr = null;
	
	private Integer cargopolit = null;
	
	private Integer perspolexp = null;
	
	private String nombrycgo = null;
	
	private Integer acteco = null;
	
	private String apodlegal = null;
	
	private Integer cvegiro = null;
	
	private Integer tpregimn = null;
	
	private Double estatura = null;
	
	private Double peso = null;
	
	private String usoCfdi = null;

	/**
	 *
	 * Default constructor
	 */
	public Cliente() {
		super();
	}

        public Integer getNumcliente() {
		return numcliente;
	}

    public void setNumcliente(Integer numcliente) {
		this.numcliente = numcliente;
	}

        public Integer getCvperson() {
		return cvperson;
	}

    public void setCvperson(Integer cvperson) {
		this.cvperson = cvperson;
	}

        public String getContrat() {
		return contrat;
	}

    public void setContrat(String contrat) {
		this.contrat = contrat;
	}

        public String getAppat() {
		return appat;
	}

    public void setAppat(String appat) {
		this.appat = appat;
	}

        public String getApmat() {
		return apmat;
	}

    public void setApmat(String apmat) {
		this.apmat = apmat;
	}

        public String getNombre() {
		return nombre;
	}

    public void setNombre(String nombre) {
		this.nombre = nombre;
	}

        public Integer getEdocivil() {
		return edocivil;
	}

    public void setEdocivil(Integer edocivil) {
		this.edocivil = edocivil;
	}

        public Integer getCvsexo() {
		return cvsexo;
	}

    public void setCvsexo(Integer cvsexo) {
		this.cvsexo = cvsexo;
	}

        public Date getFnac() {
		return fnac;
	}

    public void setFnac(Date fnac) {
		this.fnac = fnac;
	}

        public String getCalle() {
		return calle;
	}

    public void setCalle(String calle) {
		this.calle = calle;
	}

        public String getNumext() {
		return numext;
	}

    public void setNumext(String numext) {
		this.numext = numext;
	}

        public String getNumint() {
		return numint;
	}

    public void setNumint(String numint) {
		this.numint = numint;
	}

        public String getColonia() {
		return colonia;
	}

    public void setColonia(String colonia) {
		this.colonia = colonia;
	}

        public Integer getCvemunpo() {
		return cvemunpo;
	}

    public void setCvemunpo(Integer cvemunpo) {
		this.cvemunpo = cvemunpo;
	}

        public String getPoblacion() {
		return poblacion;
	}

    public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

        public Integer getEdo() {
		return edo;
	}

    public void setEdo(Integer edo) {
		this.edo = edo;
	}

        public Integer getCodpost() {
		return codpost;
	}

    public void setCodpost(Integer codpost) {
		this.codpost = codpost;
	}

        public String getTelefono() {
		return telefono;
	}

    public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

        public String getEmail() {
		return email;
	}

    public void setEmail(String email) {
		this.email = email;
	}

        public String getCurp() {
		return curp;
	}

    public void setCurp(String curp) {
		this.curp = curp;
	}

        public String getRfcsiglas() {
		return rfcsiglas;
	}

    public void setRfcsiglas(String rfcsiglas) {
		this.rfcsiglas = rfcsiglas;
	}

        public String getRfcfecha() {
		return rfcfecha;
	}

    public void setRfcfecha(String rfcfecha) {
		this.rfcfecha = rfcfecha;
	}

        public String getRfchomon() {
		return rfchomon;
	}

    public void setRfchomon(String rfchomon) {
		this.rfchomon = rfchomon;
	}

        public Integer getTpidentif() {
		return tpidentif;
	}

    public void setTpidentif(Integer tpidentif) {
		this.tpidentif = tpidentif;
	}

        public String getNdocident() {
		return ndocident;
	}

    public void setNdocident(String ndocident) {
		this.ndocident = ndocident;
	}

        public Integer getCvcompdom() {
		return cvcompdom;
	}

    public void setCvcompdom(Integer cvcompdom) {
		this.cvcompdom = cvcompdom;
	}

        public Integer getPaisnac() {
		return paisnac;
	}

    public void setPaisnac(Integer paisnac) {
		this.paisnac = paisnac;
	}

        public Integer getNacionld() {
		return nacionld;
	}

    public void setNacionld(Integer nacionld) {
		this.nacionld = nacionld;
	}

        public String getOcup() {
		return ocup;
	}

    public void setOcup(String ocup) {
		this.ocup = ocup;
	}

        public Integer getActividfui() {
		return actividfui;
	}

    public void setActividfui(Integer actividfui) {
		this.actividfui = actividfui;
	}

        public String getActfuitext() {
		return actfuitext;
	}

    public void setActfuitext(String actfuitext) {
		this.actfuitext = actfuitext;
	}

        public String getActfteingr() {
		return actfteingr;
	}

    public void setActfteingr(String actfteingr) {
		this.actfteingr = actfteingr;
	}

        public Integer getCargopolit() {
		return cargopolit;
	}

    public void setCargopolit(Integer cargopolit) {
		this.cargopolit = cargopolit;
	}

        public Integer getPerspolexp() {
		return perspolexp;
	}

    public void setPerspolexp(Integer perspolexp) {
		this.perspolexp = perspolexp;
	}

        public String getNombrycgo() {
		return nombrycgo;
	}

    public void setNombrycgo(String nombrycgo) {
		this.nombrycgo = nombrycgo;
	}

        public Integer getActeco() {
		return acteco;
	}

    public void setActeco(Integer acteco) {
		this.acteco = acteco;
	}

        public String getApodlegal() {
		return apodlegal;
	}

    public void setApodlegal(String apodlegal) {
		this.apodlegal = apodlegal;
	}

        public Integer getCvegiro() {
		return cvegiro;
	}

    public void setCvegiro(Integer cvegiro) {
		this.cvegiro = cvegiro;
	}

        public Integer getTpregimn() {
		return tpregimn;
	}

    public void setTpregimn(Integer tpregimn) {
		this.tpregimn = tpregimn;
	}

        public Double getEstatura() {
		return estatura;
	}

    public void setEstatura(Double estatura) {
		this.estatura = estatura;
	}

        public Double getPeso() {
		return peso;
	}

    public void setPeso(Double peso) {
		this.peso = peso;
	}

        public String getUsoCfdi() {
		return usoCfdi;
	}

    public void setUsoCfdi(String usoCfdi) {
		this.usoCfdi = usoCfdi;
	}

	public void clear(){
		numcliente = null;
		cvperson = null;
		contrat = null;
		appat = null;
		apmat = null;
		nombre = null;
		edocivil = null;
		cvsexo = null;
		fnac = null;
		calle = null;
		numext = null;
		numint = null;
		colonia = null;
		cvemunpo = null;
		poblacion = null;
		edo = null;
		codpost = null;
		telefono = null;
		email = null;
		curp = null;
		rfcsiglas = null;
		rfcfecha = null;
		rfchomon = null;
		tpidentif = null;
		ndocident = null;
		cvcompdom = null;
		paisnac = null;
		nacionld = null;
		ocup = null;
		actividfui = null;
		actfuitext = null;
		actfteingr = null;
		cargopolit = null;
		perspolexp = null;
		nombrycgo = null;
		acteco = null;
		apodlegal = null;
		cvegiro = null;
		tpregimn = null;
		estatura = null;
		peso = null;
		usoCfdi = null;
	}

	public String toString(){
		StringBuilder r = new StringBuilder() ;

		r
		.append("numcliente=").append( numcliente ).append("&")
		.append("cvperson=").append( cvperson ).append("&")
		.append("contrat=").append( contrat ).append("&")
		.append("appat=").append( appat ).append("&")
		.append("apmat=").append( apmat ).append("&")
		.append("nombre=").append( nombre ).append("&")
		.append("edocivil=").append( edocivil ).append("&")
		.append("cvsexo=").append( cvsexo ).append("&")
		.append("fnac=").append( fnac ).append("&")
		.append("calle=").append( calle ).append("&")
		.append("numext=").append( numext ).append("&")
		.append("numint=").append( numint ).append("&")
		.append("colonia=").append( colonia ).append("&")
		.append("cvemunpo=").append( cvemunpo ).append("&")
		.append("poblacion=").append( poblacion ).append("&")
		.append("edo=").append( edo ).append("&")
		.append("codpost=").append( codpost ).append("&")
		.append("telefono=").append( telefono ).append("&")
		.append("email=").append( email ).append("&")
		.append("curp=").append( curp ).append("&")
		.append("rfcsiglas=").append( rfcsiglas ).append("&")
		.append("rfcfecha=").append( rfcfecha ).append("&")
		.append("rfchomon=").append( rfchomon ).append("&")
		.append("tpidentif=").append( tpidentif ).append("&")
		.append("ndocident=").append( ndocident ).append("&")
		.append("cvcompdom=").append( cvcompdom ).append("&")
		.append("paisnac=").append( paisnac ).append("&")
		.append("nacionld=").append( nacionld ).append("&")
		.append("ocup=").append( ocup ).append("&")
		.append("actividfui=").append( actividfui ).append("&")
		.append("actfuitext=").append( actfuitext ).append("&")
		.append("actfteingr=").append( actfteingr ).append("&")
		.append("cargopolit=").append( cargopolit ).append("&")
		.append("perspolexp=").append( perspolexp ).append("&")
		.append("nombrycgo=").append( nombrycgo ).append("&")
		.append("acteco=").append( acteco ).append("&")
		.append("apodlegal=").append( apodlegal ).append("&")
		.append("cvegiro=").append( cvegiro ).append("&")
		.append("tpregimn=").append( tpregimn ).append("&")
		.append("estatura=").append( estatura ).append("&")
		.append("peso=").append( peso ).append("&")
		.append("usoCfdi=").append( usoCfdi ).append("&")
		;
		
		return r.toString() ;
	}

	public boolean equals( Object obj ){
		boolean r = false;

		if ( obj == null )
            return false;
		if ( ! ( obj instanceof Cliente ) )
            return false;

		final Cliente other = ( Cliente ) obj ;
		final EqualsBuilder equalsBuilder = new EqualsBuilder();

		equalsBuilder.append( this.getClass().getName() , other.getClass().getName() );

		equalsBuilder.append( numcliente , other.numcliente );
		equalsBuilder.append( cvperson , other.cvperson );
		equalsBuilder.append( contrat , other.contrat );
		equalsBuilder.append( appat , other.appat );
		equalsBuilder.append( apmat , other.apmat );
		equalsBuilder.append( nombre , other.nombre );
		equalsBuilder.append( edocivil , other.edocivil );
		equalsBuilder.append( cvsexo , other.cvsexo );
		equalsBuilder.append( fnac , other.fnac );
		equalsBuilder.append( calle , other.calle );
		equalsBuilder.append( numext , other.numext );
		equalsBuilder.append( numint , other.numint );
		equalsBuilder.append( colonia , other.colonia );
		equalsBuilder.append( cvemunpo , other.cvemunpo );
		equalsBuilder.append( poblacion , other.poblacion );
		equalsBuilder.append( edo , other.edo );
		equalsBuilder.append( codpost , other.codpost );
		equalsBuilder.append( telefono , other.telefono );
		equalsBuilder.append( email , other.email );
		equalsBuilder.append( curp , other.curp );
		equalsBuilder.append( rfcsiglas , other.rfcsiglas );
		equalsBuilder.append( rfcfecha , other.rfcfecha );
		equalsBuilder.append( rfchomon , other.rfchomon );
		equalsBuilder.append( tpidentif , other.tpidentif );
		equalsBuilder.append( ndocident , other.ndocident );
		equalsBuilder.append( cvcompdom , other.cvcompdom );
		equalsBuilder.append( paisnac , other.paisnac );
		equalsBuilder.append( nacionld , other.nacionld );
		equalsBuilder.append( ocup , other.ocup );
		equalsBuilder.append( actividfui , other.actividfui );
		equalsBuilder.append( actfuitext , other.actfuitext );
		equalsBuilder.append( actfteingr , other.actfteingr );
		equalsBuilder.append( cargopolit , other.cargopolit );
		equalsBuilder.append( perspolexp , other.perspolexp );
		equalsBuilder.append( nombrycgo , other.nombrycgo );
		equalsBuilder.append( acteco , other.acteco );
		equalsBuilder.append( apodlegal , other.apodlegal );
		equalsBuilder.append( cvegiro , other.cvegiro );
		equalsBuilder.append( tpregimn , other.tpregimn );
		equalsBuilder.append( estatura , other.estatura );
		equalsBuilder.append( peso , other.peso );
		equalsBuilder.append( usoCfdi , other.usoCfdi );

		r = equalsBuilder.isEquals() ;
		return r ;
	}

	public int hashCode(){
		final HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();

		hashCodeBuilder.append( this.getClass().getName() );

		hashCodeBuilder.append( numcliente );
		hashCodeBuilder.append( cvperson );
		hashCodeBuilder.append( contrat );
		hashCodeBuilder.append( appat );
		hashCodeBuilder.append( apmat );
		hashCodeBuilder.append( nombre );
		hashCodeBuilder.append( edocivil );
		hashCodeBuilder.append( cvsexo );
		hashCodeBuilder.append( fnac );
		hashCodeBuilder.append( calle );
		hashCodeBuilder.append( numext );
		hashCodeBuilder.append( numint );
		hashCodeBuilder.append( colonia );
		hashCodeBuilder.append( cvemunpo );
		hashCodeBuilder.append( poblacion );
		hashCodeBuilder.append( edo );
		hashCodeBuilder.append( codpost );
		hashCodeBuilder.append( telefono );
		hashCodeBuilder.append( email );
		hashCodeBuilder.append( curp );
		hashCodeBuilder.append( rfcsiglas );
		hashCodeBuilder.append( rfcfecha );
		hashCodeBuilder.append( rfchomon );
		hashCodeBuilder.append( tpidentif );
		hashCodeBuilder.append( ndocident );
		hashCodeBuilder.append( cvcompdom );
		hashCodeBuilder.append( paisnac );
		hashCodeBuilder.append( nacionld );
		hashCodeBuilder.append( ocup );
		hashCodeBuilder.append( actividfui );
		hashCodeBuilder.append( actfuitext );
		hashCodeBuilder.append( actfteingr );
		hashCodeBuilder.append( cargopolit );
		hashCodeBuilder.append( perspolexp );
		hashCodeBuilder.append( nombrycgo );
		hashCodeBuilder.append( acteco );
		hashCodeBuilder.append( apodlegal );
		hashCodeBuilder.append( cvegiro );
		hashCodeBuilder.append( tpregimn );
		hashCodeBuilder.append( estatura );
		hashCodeBuilder.append( peso );
		hashCodeBuilder.append( usoCfdi );

		return hashCodeBuilder.toHashCode() ;
	}
}
