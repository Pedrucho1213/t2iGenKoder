package mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.biz.model;

import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.springframework.stereotype.Component;
 
import java.util.ArrayList;;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <h4>Description:</h4> Model para interfaz de webservice de Asegurado
 *
 *
 */
@XmlType(propOrder = {
        "ramsubramo",
        "naseg",
        "finiseg",
        "cvparent",
        "fantigcia",
        "nomb",
        "memberid",
        "appat",
        "apmat",
        "fnac",
        "rfcsiglas",
        "rfcfecha",
        "rfchomon",
        "cvsexo",
        "calle",
        "colonia",
        "municipio",
        "poblacion",
        "edo",
        "codpost",
        "telefono",
        "curp",
        "email",
        "tpubic",
        "acteco",
        "ocup",
        "paisnac",
        "nacionld",
        "perspolexp",
        "nombrycgo",
                   })
@Component
public class Asegurado extends /*mx.t2i.tekhne.core.model.Root*/Object {

    
    private String ramsubramo = null;
    
    private String naseg = null;
    
    private Date finiseg = null;
    
    private Integer cvparent = null;
    
    private Date fantigcia = null;
    
    private String nomb = null;
    
    private Integer memberid = null;
    
    private String appat = null;
    
    private String apmat = null;
    
    private Date fnac = null;
    
    private String rfcsiglas = null;
    
    private String rfcfecha = null;
    
    private String rfchomon = null;
    
    private Integer cvsexo = null;
    
    private String calle = null;
    
    private String colonia = null;
    
    private String municipio = null;
    
    private String poblacion = null;
    
    private Integer edo = null;
    
    private Integer codpost = null;
    
    private String telefono = null;
    
    private String curp = null;
    
    private String email = null;
    
    private Integer tpubic = null;
    
    private Integer acteco = null;
    
    private String ocup = null;
    
    private Integer paisnac = null;
    
    private Integer nacionld = null;
    
    private Integer perspolexp = null;
    
    private String nombrycgo = null;

    public Asegurado() 
    {
        super();
    }

    public String getRamsubramo() {
        return ramsubramo;
    }

    public void setRamsubramo(String ramsubramo) {
        this.ramsubramo = ramsubramo;
    }

    public String getNaseg() {
        return naseg;
    }

    public void setNaseg(String naseg) {
        this.naseg = naseg;
    }

    public Date getFiniseg() {
        return finiseg;
    }

    public void setFiniseg(Date finiseg) {
        this.finiseg = finiseg;
    }

    public Integer getCvparent() {
        return cvparent;
    }

    public void setCvparent(Integer cvparent) {
        this.cvparent = cvparent;
    }

    public Date getFantigcia() {
        return fantigcia;
    }

    public void setFantigcia(Date fantigcia) {
        this.fantigcia = fantigcia;
    }

    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    public Integer getMemberid() {
        return memberid;
    }

    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
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

    public Date getFnac() {
        return fnac;
    }

    public void setFnac(Date fnac) {
        this.fnac = fnac;
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

    public Integer getCvsexo() {
        return cvsexo;
    }

    public void setCvsexo(Integer cvsexo) {
        this.cvsexo = cvsexo;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
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

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTpubic() {
        return tpubic;
    }

    public void setTpubic(Integer tpubic) {
        this.tpubic = tpubic;
    }

    public Integer getActeco() {
        return acteco;
    }

    public void setActeco(Integer acteco) {
        this.acteco = acteco;
    }

    public String getOcup() {
        return ocup;
    }

    public void setOcup(String ocup) {
        this.ocup = ocup;
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

    public void clear()
    {
        ramsubramo = null;
        naseg = null;
        finiseg = null;
        cvparent = null;
        fantigcia = null;
        nomb = null;
        memberid = null;
        appat = null;
        apmat = null;
        fnac = null;
        rfcsiglas = null;
        rfcfecha = null;
        rfchomon = null;
        cvsexo = null;
        calle = null;
        colonia = null;
        municipio = null;
        poblacion = null;
        edo = null;
        codpost = null;
        telefono = null;
        curp = null;
        email = null;
        tpubic = null;
        acteco = null;
        ocup = null;
        paisnac = null;
        nacionld = null;
        perspolexp = null;
        nombrycgo = null;
    }

    public String toString()
    {
        StringBuilder r = new StringBuilder() ;

        r
        .append( super.toString()).append( "&" )
        .append("ramsubramo=").append( ramsubramo ).append("&")
        .append("naseg=").append( naseg ).append("&")
        .append("finiseg=").append( finiseg ).append("&")
        .append("cvparent=").append( cvparent ).append("&")
        .append("fantigcia=").append( fantigcia ).append("&")
        .append("nomb=").append( nomb ).append("&")
        .append("memberid=").append( memberid ).append("&")
        .append("appat=").append( appat ).append("&")
        .append("apmat=").append( apmat ).append("&")
        .append("fnac=").append( fnac ).append("&")
        .append("rfcsiglas=").append( rfcsiglas ).append("&")
        .append("rfcfecha=").append( rfcfecha ).append("&")
        .append("rfchomon=").append( rfchomon ).append("&")
        .append("cvsexo=").append( cvsexo ).append("&")
        .append("calle=").append( calle ).append("&")
        .append("colonia=").append( colonia ).append("&")
        .append("municipio=").append( municipio ).append("&")
        .append("poblacion=").append( poblacion ).append("&")
        .append("edo=").append( edo ).append("&")
        .append("codpost=").append( codpost ).append("&")
        .append("telefono=").append( telefono ).append("&")
        .append("curp=").append( curp ).append("&")
        .append("email=").append( email ).append("&")
        .append("tpubic=").append( tpubic ).append("&")
        .append("acteco=").append( acteco ).append("&")
        .append("ocup=").append( ocup ).append("&")
        .append("paisnac=").append( paisnac ).append("&")
        .append("nacionld=").append( nacionld ).append("&")
        .append("perspolexp=").append( perspolexp ).append("&")
        .append("nombrycgo=").append( nombrycgo ).append("&")
        ;
        return r.toString() ;
    }

    public boolean equals( Object obj )
    {
        boolean r = false;

        if ( obj == null ) return false;
        if ( ! ( obj instanceof Asegurado ) )  return false;

        final Asegurado other = ( Asegurado ) obj ;
        final EqualsBuilder equalsBuilder = new EqualsBuilder();

        equalsBuilder.append( this.getClass().getName() , other.getClass().getName() );

        equalsBuilder.append( ramsubramo , other.ramsubramo );
        equalsBuilder.append( naseg , other.naseg );
        equalsBuilder.append( finiseg , other.finiseg );
        equalsBuilder.append( cvparent , other.cvparent );
        equalsBuilder.append( fantigcia , other.fantigcia );
        equalsBuilder.append( nomb , other.nomb );
        equalsBuilder.append( memberid , other.memberid );
        equalsBuilder.append( appat , other.appat );
        equalsBuilder.append( apmat , other.apmat );
        equalsBuilder.append( fnac , other.fnac );
        equalsBuilder.append( rfcsiglas , other.rfcsiglas );
        equalsBuilder.append( rfcfecha , other.rfcfecha );
        equalsBuilder.append( rfchomon , other.rfchomon );
        equalsBuilder.append( cvsexo , other.cvsexo );
        equalsBuilder.append( calle , other.calle );
        equalsBuilder.append( colonia , other.colonia );
        equalsBuilder.append( municipio , other.municipio );
        equalsBuilder.append( poblacion , other.poblacion );
        equalsBuilder.append( edo , other.edo );
        equalsBuilder.append( codpost , other.codpost );
        equalsBuilder.append( telefono , other.telefono );
        equalsBuilder.append( curp , other.curp );
        equalsBuilder.append( email , other.email );
        equalsBuilder.append( tpubic , other.tpubic );
        equalsBuilder.append( acteco , other.acteco );
        equalsBuilder.append( ocup , other.ocup );
        equalsBuilder.append( paisnac , other.paisnac );
        equalsBuilder.append( nacionld , other.nacionld );
        equalsBuilder.append( perspolexp , other.perspolexp );
        equalsBuilder.append( nombrycgo , other.nombrycgo );

        r = equalsBuilder.isEquals() ;
        return r ;
    }

    public int hashCode()
    {
        final HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();

        hashCodeBuilder.append( this.getClass().getName() );

        hashCodeBuilder.append( ramsubramo );
        hashCodeBuilder.append( naseg );
        hashCodeBuilder.append( finiseg );
        hashCodeBuilder.append( cvparent );
        hashCodeBuilder.append( fantigcia );
        hashCodeBuilder.append( nomb );
        hashCodeBuilder.append( memberid );
        hashCodeBuilder.append( appat );
        hashCodeBuilder.append( apmat );
        hashCodeBuilder.append( fnac );
        hashCodeBuilder.append( rfcsiglas );
        hashCodeBuilder.append( rfcfecha );
        hashCodeBuilder.append( rfchomon );
        hashCodeBuilder.append( cvsexo );
        hashCodeBuilder.append( calle );
        hashCodeBuilder.append( colonia );
        hashCodeBuilder.append( municipio );
        hashCodeBuilder.append( poblacion );
        hashCodeBuilder.append( edo );
        hashCodeBuilder.append( codpost );
        hashCodeBuilder.append( telefono );
        hashCodeBuilder.append( curp );
        hashCodeBuilder.append( email );
        hashCodeBuilder.append( tpubic );
        hashCodeBuilder.append( acteco );
        hashCodeBuilder.append( ocup );
        hashCodeBuilder.append( paisnac );
        hashCodeBuilder.append( nacionld );
        hashCodeBuilder.append( perspolexp );
        hashCodeBuilder.append( nombrycgo );

        return hashCodeBuilder.toHashCode() ;
    }
}
