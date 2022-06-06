package mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.core.model;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.springframework.stereotype.Component;

import mx.t2i.t2iInteropHDI.util.UtilFechaCore;
import mx.t2i.t2iInteropHDI.util.UtilTranslateModel;

import java.util.Map;
import java.util.Map.Entry;

import javax.persistence.Transient;


/**
 * <h4>Description:</h4>
 * Model para interfaz de webservice
 *
 */
@Component
public class Catclix0 extends mx.t2i.tekhne.core.model.BaseInterfaceModel
{
    private static final long serialVersionUID = 1L;

    private static final Logger log = LoggerFactory.getLogger(Catclix0.class);

    private Integer numcliente = null;
    private Integer cvperson = null;
    private String rfcsiglas = null;
    private String rfcfecha = null;
    private String rfchomon = null;
    private String curp = null;
    private String nombre = null;
    private String appat = null;
    private String apmat = null;
    private String nomcomp1 = null;
    private Integer edocivil = null;
    private Integer cvsexo = null;
    private Integer fnac = null;
    private Integer paisnac = null;
    private Double estatura = null;
    private Integer nacionld = null;
    private Double peso = null;
    private Integer tpidentif = null;
    private String ndocident = null;
    private Integer cvcompdom = null;
    private String email = null;
    private String ocup = null;
    private String calle1 = null;
    private String numext = null;
    private String numint = null;
    private Integer codpost = null;
    private String colonia1 = null;
    private String poblacion = null;
    private Integer edo1 = null;
    private Integer cvemunpo = null;
    private String telefono1 = null;
    private String usocfdi = null;
    private Integer acteco = null;
    private Integer perspolexp = null;
    private String nombrycgo = null;
    private String apodlegal = null;
    private Integer tpregimn = null;
    private Integer giro = null;
    private Integer cargopolit = null;
    private Integer actividfui = null;
    private String actfuitext = null;
    private String actfteingr = null;

    public Catclix0()
    {
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

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getNomcomp1() {
        return nomcomp1;
    }

    public void setNomcomp1(String nomcomp1) {
        this.nomcomp1 = nomcomp1;
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

    public Integer getFnac() {
        return fnac;
    }

    public void setFnac(Integer fnac) {
        this.fnac = fnac;
    }

    public Integer getPaisnac() {
        return paisnac;
    }

    public void setPaisnac(Integer paisnac) {
        this.paisnac = paisnac;
    }

    public Double getEstatura() {
        return estatura;
    }

    public void setEstatura(Double estatura) {
        this.estatura = estatura;
    }

    public Integer getNacionld() {
        return nacionld;
    }

    public void setNacionld(Integer nacionld) {
        this.nacionld = nacionld;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOcup() {
        return ocup;
    }

    public void setOcup(String ocup) {
        this.ocup = ocup;
    }

    public String getCalle1() {
        return calle1;
    }

    public void setCalle1(String calle1) {
        this.calle1 = calle1;
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

    public Integer getCodpost() {
        return codpost;
    }

    public void setCodpost(Integer codpost) {
        this.codpost = codpost;
    }

    public String getColonia1() {
        return colonia1;
    }

    public void setColonia1(String colonia1) {
        this.colonia1 = colonia1;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public Integer getEdo1() {
        return edo1;
    }

    public void setEdo1(Integer edo1) {
        this.edo1 = edo1;
    }

    public Integer getCvemunpo() {
        return cvemunpo;
    }

    public void setCvemunpo(Integer cvemunpo) {
        this.cvemunpo = cvemunpo;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getUsocfdi() {
        return usocfdi;
    }

    public void setUsocfdi(String usocfdi) {
        this.usocfdi = usocfdi;
    }

    public Integer getActeco() {
        return acteco;
    }

    public void setActeco(Integer acteco) {
        this.acteco = acteco;
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

    public String getApodlegal() {
        return apodlegal;
    }

    public void setApodlegal(String apodlegal) {
        this.apodlegal = apodlegal;
    }

    public Integer getTpregimn() {
        return tpregimn;
    }

    public void setTpregimn(Integer tpregimn) {
        this.tpregimn = tpregimn;
    }

    public Integer getGiro() {
        return giro;
    }

    public void setGiro(Integer giro) {
        this.giro = giro;
    }

    public Integer getCargopolit() {
        return cargopolit;
    }

    public void setCargopolit(Integer cargopolit) {
        this.cargopolit = cargopolit;
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

    public void clear()
    {
    }

    public String toString()
    {
        StringBuilder r = new StringBuilder() ;
       
        r.append(super.toString())

        .append("numcliente=").append( numcliente ).append("&")
        .append("cvperson=").append( cvperson ).append("&")
        .append("rfcsiglas=").append( rfcsiglas ).append("&")
        .append("rfcfecha=").append( rfcfecha ).append("&")
        .append("rfchomon=").append( rfchomon ).append("&")
        .append("curp=").append( curp ).append("&")
        .append("nombre=").append( nombre ).append("&")
        .append("appat=").append( appat ).append("&")
        .append("apmat=").append( apmat ).append("&")
        .append("nomcomp1=").append( nomcomp1 ).append("&")
        .append("edocivil=").append( edocivil ).append("&")
        .append("cvsexo=").append( cvsexo ).append("&")
        .append("fnac=").append( fnac ).append("&")
        .append("paisnac=").append( paisnac ).append("&")
        .append("estatura=").append( estatura ).append("&")
        .append("nacionld=").append( nacionld ).append("&")
        .append("peso=").append( peso ).append("&")
        .append("tpidentif=").append( tpidentif ).append("&")
        .append("ndocident=").append( ndocident ).append("&")
        .append("cvcompdom=").append( cvcompdom ).append("&")
        .append("email=").append( email ).append("&")
        .append("ocup=").append( ocup ).append("&")
        .append("calle1=").append( calle1 ).append("&")
        .append("numext=").append( numext ).append("&")
        .append("numint=").append( numint ).append("&")
        .append("codpost=").append( codpost ).append("&")
        .append("colonia1=").append( colonia1 ).append("&")
        .append("poblacion=").append( poblacion ).append("&")
        .append("edo1=").append( edo1 ).append("&")
        .append("cvemunpo=").append( cvemunpo ).append("&")
        .append("telefono1=").append( telefono1 ).append("&")
        .append("usocfdi=").append( usocfdi ).append("&")
        .append("acteco=").append( acteco ).append("&")
        .append("perspolexp=").append( perspolexp ).append("&")
        .append("nombrycgo=").append( nombrycgo ).append("&")
        .append("apodlegal=").append( apodlegal ).append("&")
        .append("tpregimn=").append( tpregimn ).append("&")
        .append("giro=").append( giro ).append("&")
        .append("cargopolit=").append( cargopolit ).append("&")
        .append("actividfui=").append( actividfui ).append("&")
        .append("actfuitext=").append( actfuitext ).append("&")
        .append("actfteingr=").append( actfteingr ).append("&")

        ;
        return r.toString() ;
    }

    public boolean equals( Object obj )
    {
        boolean r = false;

        if ( obj == null ) return false;
        if ( ! ( obj instanceof Catclix0 ) )  return false;

        final Catclix0 other = ( Catclix0 ) obj ;
        final EqualsBuilder equalsBuilder = new EqualsBuilder();

        equalsBuilder.append( this.getClass().getName() , other.getClass().getName() );

        equalsBuilder.append( numcliente , other.numcliente );
        equalsBuilder.append( cvperson , other.cvperson );
        equalsBuilder.append( rfcsiglas , other.rfcsiglas );
        equalsBuilder.append( rfcfecha , other.rfcfecha );
        equalsBuilder.append( rfchomon , other.rfchomon );
        equalsBuilder.append( curp , other.curp );
        equalsBuilder.append( nombre , other.nombre );
        equalsBuilder.append( appat , other.appat );
        equalsBuilder.append( apmat , other.apmat );
        equalsBuilder.append( nomcomp1 , other.nomcomp1 );
        equalsBuilder.append( edocivil , other.edocivil );
        equalsBuilder.append( cvsexo , other.cvsexo );
        equalsBuilder.append( fnac , other.fnac );
        equalsBuilder.append( paisnac , other.paisnac );
        equalsBuilder.append( estatura , other.estatura );
        equalsBuilder.append( nacionld , other.nacionld );
        equalsBuilder.append( peso , other.peso );
        equalsBuilder.append( tpidentif , other.tpidentif );
        equalsBuilder.append( ndocident , other.ndocident );
        equalsBuilder.append( cvcompdom , other.cvcompdom );
        equalsBuilder.append( email , other.email );
        equalsBuilder.append( ocup , other.ocup );
        equalsBuilder.append( calle1 , other.calle1 );
        equalsBuilder.append( numext , other.numext );
        equalsBuilder.append( numint , other.numint );
        equalsBuilder.append( codpost , other.codpost );
        equalsBuilder.append( colonia1 , other.colonia1 );
        equalsBuilder.append( poblacion , other.poblacion );
        equalsBuilder.append( edo1 , other.edo1 );
        equalsBuilder.append( cvemunpo , other.cvemunpo );
        equalsBuilder.append( telefono1 , other.telefono1 );
        equalsBuilder.append( usocfdi , other.usocfdi );
        equalsBuilder.append( acteco , other.acteco );
        equalsBuilder.append( perspolexp , other.perspolexp );
        equalsBuilder.append( nombrycgo , other.nombrycgo );
        equalsBuilder.append( apodlegal , other.apodlegal );
        equalsBuilder.append( tpregimn , other.tpregimn );
        equalsBuilder.append( giro , other.giro );
        equalsBuilder.append( cargopolit , other.cargopolit );
        equalsBuilder.append( actividfui , other.actividfui );
        equalsBuilder.append( actfuitext , other.actfuitext );
        equalsBuilder.append( actfteingr , other.actfteingr );

        r = equalsBuilder.isEquals() ;
        return r ;
    }

    public int hashCode()
    {
        final HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();

        hashCodeBuilder.append( this.getClass().getName() );

        hashCodeBuilder.append( numcliente );
        hashCodeBuilder.append( cvperson );
        hashCodeBuilder.append( rfcsiglas );
        hashCodeBuilder.append( rfcfecha );
        hashCodeBuilder.append( rfchomon );
        hashCodeBuilder.append( curp );
        hashCodeBuilder.append( nombre );
        hashCodeBuilder.append( appat );
        hashCodeBuilder.append( apmat );
        hashCodeBuilder.append( nomcomp1 );
        hashCodeBuilder.append( edocivil );
        hashCodeBuilder.append( cvsexo );
        hashCodeBuilder.append( fnac );
        hashCodeBuilder.append( paisnac );
        hashCodeBuilder.append( estatura );
        hashCodeBuilder.append( nacionld );
        hashCodeBuilder.append( peso );
        hashCodeBuilder.append( tpidentif );
        hashCodeBuilder.append( ndocident );
        hashCodeBuilder.append( cvcompdom );
        hashCodeBuilder.append( email );
        hashCodeBuilder.append( ocup );
        hashCodeBuilder.append( calle1 );
        hashCodeBuilder.append( numext );
        hashCodeBuilder.append( numint );
        hashCodeBuilder.append( codpost );
        hashCodeBuilder.append( colonia1 );
        hashCodeBuilder.append( poblacion );
        hashCodeBuilder.append( edo1 );
        hashCodeBuilder.append( cvemunpo );
        hashCodeBuilder.append( telefono1 );
        hashCodeBuilder.append( usocfdi );
        hashCodeBuilder.append( acteco );
        hashCodeBuilder.append( perspolexp );
        hashCodeBuilder.append( nombrycgo );
        hashCodeBuilder.append( apodlegal );
        hashCodeBuilder.append( tpregimn );
        hashCodeBuilder.append( giro );
        hashCodeBuilder.append( cargopolit );
        hashCodeBuilder.append( actividfui );
        hashCodeBuilder.append( actfuitext );
        hashCodeBuilder.append( actfteingr );

        return hashCodeBuilder.toHashCode() ;
    }

    @Transient
    public Map<String, String> auxGetSearchFields()
    {
        Map<String, String> mappingFields = new LinkedHashMap<String, String>();

        mappingFields.put( "CATCLIX0.NUMCLIENTE", UtilTranslateModel.parseValue(""+numcliente, Integer.class) );

        log.debug("mappingFields: "+mappingFields);
        return mappingFields;
    }

    public Map<String, String> auxGetTransactionFields()
    {
        Map<String, String> mappingFields = new LinkedHashMap<String, String>();

        mappingFields.put( "CATCLIX0.NUMCLIENTE", UtilTranslateModel.parseValue(""+numcliente, Integer.class) );
        mappingFields.put( "CATCLIX0.CVPERSON", UtilTranslateModel.parseValue(""+cvperson, Integer.class) );
        mappingFields.put( "CATCLIX0.RFCSIGLAS", UtilTranslateModel.parseValue(""+rfcsiglas, String.class) );
        mappingFields.put( "CATCLIX0.RFCFECHA", UtilTranslateModel.parseValue(""+rfcfecha, String.class) );
        mappingFields.put( "CATCLIX0.RFCHOMON", UtilTranslateModel.parseValue(""+rfchomon, String.class) );
        mappingFields.put( "CATCLIX0.CURP", UtilTranslateModel.parseValue(""+curp, String.class) );
        mappingFields.put( "CATCLIX0.NOMBRE", UtilTranslateModel.parseValue(""+nombre, String.class) );
        mappingFields.put( "CATCLIX0.APPAT", UtilTranslateModel.parseValue(""+appat, String.class) );
        mappingFields.put( "CATCLIX0.APMAT", UtilTranslateModel.parseValue(""+apmat, String.class) );
        mappingFields.put( "CATCLIX0.NOMCOMP1", UtilTranslateModel.parseValue(""+nomcomp1, String.class) );
        mappingFields.put( "CATCLIX0.EDOCIVIL", UtilTranslateModel.parseValue(""+edocivil, Integer.class) );
        mappingFields.put( "CATCLIX0.CVSEXO", UtilTranslateModel.parseValue(""+cvsexo, Integer.class) );
        mappingFields.put( "CATCLIX0.FNAC", UtilTranslateModel.parseValue(""+fnac, Integer.class) );
        mappingFields.put( "CATCLIX0.PAISNAC", UtilTranslateModel.parseValue(""+paisnac, Integer.class) );
        mappingFields.put( "CATCLIX0.ESTATURA", UtilTranslateModel.parseValue(""+estatura, Double.class) );
        mappingFields.put( "CATCLIX0.NACIONLD", UtilTranslateModel.parseValue(""+nacionld, Integer.class) );
        mappingFields.put( "CATCLIX0.PESO", UtilTranslateModel.parseValue(""+peso, Double.class) );
        mappingFields.put( "CATCLIX0.TPIDENTIF", UtilTranslateModel.parseValue(""+tpidentif, Integer.class) );
        mappingFields.put( "CATCLIX0.NDOCIDENT", UtilTranslateModel.parseValue(""+ndocident, String.class) );
        mappingFields.put( "CATCLIX0.CVCOMPDOM", UtilTranslateModel.parseValue(""+cvcompdom, Integer.class) );
        mappingFields.put( "CATCLIX0.EMAIL", UtilTranslateModel.parseValue(""+email, String.class) );
        mappingFields.put( "CATCLIX0.OCUP", UtilTranslateModel.parseValue(""+ocup, String.class) );
        mappingFields.put( "CATCLIX0.CALLE1", UtilTranslateModel.parseValue(""+calle1, String.class) );
        mappingFields.put( "CATCLIX0.NUMEXT", UtilTranslateModel.parseValue(""+numext, String.class) );
        mappingFields.put( "CATCLIX0.NUMINT", UtilTranslateModel.parseValue(""+numint, String.class) );
        mappingFields.put( "CATCLIX0.CODPOST", UtilTranslateModel.parseValue(""+codpost, Integer.class) );
        mappingFields.put( "CATCLIX0.COLONIA1", UtilTranslateModel.parseValue(""+colonia1, String.class) );
        mappingFields.put( "CATCLIX0.POBLACION", UtilTranslateModel.parseValue(""+poblacion, String.class) );
        mappingFields.put( "CATCLIX0.EDO1", UtilTranslateModel.parseValue(""+edo1, Integer.class) );
        mappingFields.put( "CATCLIX0.CVEMUNPO", UtilTranslateModel.parseValue(""+cvemunpo, Integer.class) );
        mappingFields.put( "CATCLIX0.TELEFONO1", UtilTranslateModel.parseValue(""+telefono1, String.class) );
        mappingFields.put( "CATCLIX0.USOCFDI", UtilTranslateModel.parseValue(""+usocfdi, String.class) );
        mappingFields.put( "CATCLIX0.ACTECO", UtilTranslateModel.parseValue(""+acteco, Integer.class) );
        mappingFields.put( "CATCLIX0.PERSPOLEXP", UtilTranslateModel.parseValue(""+perspolexp, Integer.class) );
        mappingFields.put( "CATCLIX0.NOMBRYCGO", UtilTranslateModel.parseValue(""+nombrycgo, String.class) );
        mappingFields.put( "CATCLIX0.APODLEGAL", UtilTranslateModel.parseValue(""+apodlegal, String.class) );
        mappingFields.put( "CATCLIX0.TPREGIMN", UtilTranslateModel.parseValue(""+tpregimn, Integer.class) );
        mappingFields.put( "CATCLIX0.GIRO", UtilTranslateModel.parseValue(""+giro, Integer.class) );
        mappingFields.put( "CATCLIX0.CARGOPOLIT", UtilTranslateModel.parseValue(""+cargopolit, Integer.class) );
        mappingFields.put( "CATCLIX0.ACTIVIDFUI", UtilTranslateModel.parseValue(""+actividfui, Integer.class) );
        mappingFields.put( "CATCLIX0.ACTFUITEXT", UtilTranslateModel.parseValue(""+actfuitext, String.class) );
        mappingFields.put( "CATCLIX0.ACTFTEINGR", UtilTranslateModel.parseValue(""+actfteingr, String.class) );

        log.debug("mappingFields: "+mappingFields);
        return mappingFields;
    }

    public Map<String, String> auxSetValuesFromMap( Map<String, String> mappingFields )
    {
        Object[] entries = mappingFields.entrySet().toArray();
        for ( int i = 0; i < entries.length; i++ )
        {
            @SuppressWarnings("unchecked")
            Entry< String, String > entry = (Entry< String, String >) entries[ i ];
            
            if ( entry.getKey().equals( "CATCLIX0.NUMCLIENTE" ) ) { setNumcliente( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "CATCLIX0.CVPERSON" ) ) { setCvperson( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "CATCLIX0.RFCSIGLAS" ) ) { setRfcsiglas( (entry.getValue()) ); }
            if ( entry.getKey().equals( "CATCLIX0.RFCFECHA" ) ) { setRfcfecha( (entry.getValue()) ); }
            if ( entry.getKey().equals( "CATCLIX0.RFCHOMON" ) ) { setRfchomon( (entry.getValue()) ); }
            if ( entry.getKey().equals( "CATCLIX0.CURP" ) ) { setCurp( (entry.getValue()) ); }
            if ( entry.getKey().equals( "CATCLIX0.NOMBRE" ) ) { setNombre( (entry.getValue()) ); }
            if ( entry.getKey().equals( "CATCLIX0.APPAT" ) ) { setAppat( (entry.getValue()) ); }
            if ( entry.getKey().equals( "CATCLIX0.APMAT" ) ) { setApmat( (entry.getValue()) ); }
            if ( entry.getKey().equals( "CATCLIX0.NOMCOMP1" ) ) { setNomcomp1( (entry.getValue()) ); }
            if ( entry.getKey().equals( "CATCLIX0.EDOCIVIL" ) ) { setEdocivil( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "CATCLIX0.CVSEXO" ) ) { setCvsexo( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "CATCLIX0.FNAC" ) ) { setFnac( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "CATCLIX0.PAISNAC" ) ) { setPaisnac( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "CATCLIX0.ESTATURA" ) ) { setEstatura( Double.parseDouble(entry.getValue()) ); }
            if ( entry.getKey().equals( "CATCLIX0.NACIONLD" ) ) { setNacionld( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "CATCLIX0.PESO" ) ) { setPeso( Double.parseDouble(entry.getValue()) ); }
            if ( entry.getKey().equals( "CATCLIX0.TPIDENTIF" ) ) { setTpidentif( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "CATCLIX0.NDOCIDENT" ) ) { setNdocident( (entry.getValue()) ); }
            if ( entry.getKey().equals( "CATCLIX0.CVCOMPDOM" ) ) { setCvcompdom( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "CATCLIX0.EMAIL" ) ) { setEmail( (entry.getValue()) ); }
            if ( entry.getKey().equals( "CATCLIX0.OCUP" ) ) { setOcup( (entry.getValue()) ); }
            if ( entry.getKey().equals( "CATCLIX0.CALLE1" ) ) { setCalle1( (entry.getValue()) ); }
            if ( entry.getKey().equals( "CATCLIX0.NUMEXT" ) ) { setNumext( (entry.getValue()) ); }
            if ( entry.getKey().equals( "CATCLIX0.NUMINT" ) ) { setNumint( (entry.getValue()) ); }
            if ( entry.getKey().equals( "CATCLIX0.CODPOST" ) ) { setCodpost( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "CATCLIX0.COLONIA1" ) ) { setColonia1( (entry.getValue()) ); }
            if ( entry.getKey().equals( "CATCLIX0.POBLACION" ) ) { setPoblacion( (entry.getValue()) ); }
            if ( entry.getKey().equals( "CATCLIX0.EDO1" ) ) { setEdo1( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "CATCLIX0.CVEMUNPO" ) ) { setCvemunpo( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "CATCLIX0.TELEFONO1" ) ) { setTelefono1( (entry.getValue()) ); }
            if ( entry.getKey().equals( "CATCLIX0.USOCFDI" ) ) { setUsocfdi( (entry.getValue()) ); }
            if ( entry.getKey().equals( "CATCLIX0.ACTECO" ) ) { setActeco( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "CATCLIX0.PERSPOLEXP" ) ) { setPerspolexp( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "CATCLIX0.NOMBRYCGO" ) ) { setNombrycgo( (entry.getValue()) ); }
            if ( entry.getKey().equals( "CATCLIX0.APODLEGAL" ) ) { setApodlegal( (entry.getValue()) ); }
            if ( entry.getKey().equals( "CATCLIX0.TPREGIMN" ) ) { setTpregimn( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "CATCLIX0.GIRO" ) ) { setGiro( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "CATCLIX0.CARGOPOLIT" ) ) { setCargopolit( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "CATCLIX0.ACTIVIDFUI" ) ) { setActividfui( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "CATCLIX0.ACTFUITEXT" ) ) { setActfuitext( (entry.getValue()) ); }
            if ( entry.getKey().equals( "CATCLIX0.ACTFTEINGR" ) ) { setActfteingr( (entry.getValue()) ); }
        
            if ( entry.getKey().equals( "CATCLIX0.MENSAJES"       ) ) { setMessage ( entry.getValue() ); }
        }
/* 2021-03-05 ati: No para objetos incrustados * /
        log.debug("mappingFields: "+mappingFields);
/ * 2021-03-05 ati: No para objetos incrustados */
        return mappingFields;
    }

    /**
     *
     * Armar una lista con los registros resultado de la consulta de cobol
     *
     */
    public static List< Catclix0 > auxGetListFromCore( Map< String, String > mappingFields ) // 2021-03-07 ati: Hacer static para simplificar llamado
    {
        List< Catclix0 > responseList = new ArrayList<Catclix0  >();
        Object[ ] entries = mappingFields.entrySet().toArray();
        String locIndex = null;
        Catclix0 item = null;
        for ( int i = 0; i < entries.length; i++ )
        {
            @SuppressWarnings("unchecked")
            Entry< String, String > entry = (Entry< String, String >) entries[ i ];
            //System.out.println("SYSOUT: " + (new Throwable().getStackTrace()[0].getMethodName() +" | entry.getKey(): " + entry.getKey() + "=["+entry.getValue()+"]")); 
            
            if ( entry.getKey().startsWith( "CATCLIX0[" ) )
            {
                if ( locIndex == null || !locIndex.equals( entry.getKey().substring( 0, entry.getKey().indexOf( "]" ) + 1 ) ) )
                {
                    if ( item != null )
                    {
                        responseList.add( item );
                    }
                    locIndex = entry.getKey().substring( 0, entry.getKey().indexOf( "]" ) + 1 );
                    item = new Catclix0();
                }

                if ( entry.getKey().endsWith( ".NUMCLIENTE" ) ) { item.setNumcliente ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".CVPERSON" ) ) { item.setCvperson ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".RFCSIGLAS" ) ) { item.setRfcsiglas ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".RFCFECHA" ) ) { item.setRfcfecha ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".RFCHOMON" ) ) { item.setRfchomon ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".CURP" ) ) { item.setCurp ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NOMBRE" ) ) { item.setNombre ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".APPAT" ) ) { item.setAppat ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".APMAT" ) ) { item.setApmat ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NOMCOMP1" ) ) { item.setNomcomp1 ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".EDOCIVIL" ) ) { item.setEdocivil ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".CVSEXO" ) ) { item.setCvsexo ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".FNAC" ) ) { item.setFnac ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".PAISNAC" ) ) { item.setPaisnac ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".ESTATURA" ) ) { item.setEstatura ( Double.parseDouble(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NACIONLD" ) ) { item.setNacionld ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".PESO" ) ) { item.setPeso ( Double.parseDouble(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".TPIDENTIF" ) ) { item.setTpidentif ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NDOCIDENT" ) ) { item.setNdocident ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".CVCOMPDOM" ) ) { item.setCvcompdom ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".EMAIL" ) ) { item.setEmail ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".OCUP" ) ) { item.setOcup ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".CALLE1" ) ) { item.setCalle1 ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NUMEXT" ) ) { item.setNumext ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NUMINT" ) ) { item.setNumint ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".CODPOST" ) ) { item.setCodpost ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".COLONIA1" ) ) { item.setColonia1 ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".POBLACION" ) ) { item.setPoblacion ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".EDO1" ) ) { item.setEdo1 ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".CVEMUNPO" ) ) { item.setCvemunpo ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".TELEFONO1" ) ) { item.setTelefono1 ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".USOCFDI" ) ) { item.setUsocfdi ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".ACTECO" ) ) { item.setActeco ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".PERSPOLEXP" ) ) { item.setPerspolexp ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NOMBRYCGO" ) ) { item.setNombrycgo ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".APODLEGAL" ) ) { item.setApodlegal ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".TPREGIMN" ) ) { item.setTpregimn ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".GIRO" ) ) { item.setGiro ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".CARGOPOLIT" ) ) { item.setCargopolit ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".ACTIVIDFUI" ) ) { item.setActividfui ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".ACTFUITEXT" ) ) { item.setActfuitext ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".ACTFTEINGR" ) ) { item.setActfteingr ( (entry.getValue()) ); }

                if ( entry.getKey().endsWith( ".MENSAJES") ) { item.setMessage( entry.getValue() ); }
            }
        }
        if ( item != null )
        {
            responseList.add( item );
        }
/* 2021-03-05 ati: No para objetos incrustados * /
        log.debug("mappingFields: "+mappingFields);
/ * 2021-03-05 ati: No para objetos incrustados */
        log.debug("responseList: "+responseList);
        return responseList;
    }
}

