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
public class Asegplz4 extends mx.t2i.tekhne.core.model.BaseInterfaceModel
{
    private static final long serialVersionUID = 1L;

    private static final Logger log = LoggerFactory.getLogger(Asegplz4.class);

    private Integer ramsubramo = null;
    private Integer npoliza = null;
    private String naseg = null;
    private Integer ndepend = null;
    private Integer finiseg = null;
    private Integer cvparent = null;
    private Integer fantigcia = null;
    private String nomb = null;
    private String appat = null;
    private String apmat = null;
    private Integer fnac = null;
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
    private String telefono1 = null;
    private String curp = null;
    private String email = null;
    private Integer tpubic = null;
    private Integer acteco = null;
    private String ocup = null;
    private Integer paisnac = null;
    private Integer nacionld = null;
    private Integer perspolexp = null;
    private String nombrycgo = null;
    private Integer memberid = null;

    public Asegplz4()
    {
        super();
    }

    public Integer getRamsubramo() {
        return ramsubramo;
    }

    public void setRamsubramo(Integer ramsubramo) {
        this.ramsubramo = ramsubramo;
    }

    public Integer getNpoliza() {
        return npoliza;
    }

    public void setNpoliza(Integer npoliza) {
        this.npoliza = npoliza;
    }

    public String getNaseg() {
        return naseg;
    }

    public void setNaseg(String naseg) {
        this.naseg = naseg;
    }

    public Integer getNdepend() {
        return ndepend;
    }

    public void setNdepend(Integer ndepend) {
        this.ndepend = ndepend;
    }

    public Integer getFiniseg() {
        return finiseg;
    }

    public void setFiniseg(Integer finiseg) {
        this.finiseg = finiseg;
    }

    public Integer getCvparent() {
        return cvparent;
    }

    public void setCvparent(Integer cvparent) {
        this.cvparent = cvparent;
    }

    public Integer getFantigcia() {
        return fantigcia;
    }

    public void setFantigcia(Integer fantigcia) {
        this.fantigcia = fantigcia;
    }

    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
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

    public Integer getFnac() {
        return fnac;
    }

    public void setFnac(Integer fnac) {
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

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
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

    public Integer getMemberid() {
        return memberid;
    }

    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }

    public void clear()
    {
    }

    public String toString()
    {
        StringBuilder r = new StringBuilder() ;
       
        r.append(super.toString())

        .append("ramsubramo=").append( ramsubramo ).append("&")
        .append("npoliza=").append( npoliza ).append("&")
        .append("naseg=").append( naseg ).append("&")
        .append("ndepend=").append( ndepend ).append("&")
        .append("finiseg=").append( finiseg ).append("&")
        .append("cvparent=").append( cvparent ).append("&")
        .append("fantigcia=").append( fantigcia ).append("&")
        .append("nomb=").append( nomb ).append("&")
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
        .append("telefono1=").append( telefono1 ).append("&")
        .append("curp=").append( curp ).append("&")
        .append("email=").append( email ).append("&")
        .append("tpubic=").append( tpubic ).append("&")
        .append("acteco=").append( acteco ).append("&")
        .append("ocup=").append( ocup ).append("&")
        .append("paisnac=").append( paisnac ).append("&")
        .append("nacionld=").append( nacionld ).append("&")
        .append("perspolexp=").append( perspolexp ).append("&")
        .append("nombrycgo=").append( nombrycgo ).append("&")
        .append("memberid=").append( memberid ).append("&")

        ;
        return r.toString() ;
    }

    public boolean equals( Object obj )
    {
        boolean r = false;

        if ( obj == null ) return false;
        if ( ! ( obj instanceof Asegplz4 ) )  return false;

        final Asegplz4 other = ( Asegplz4 ) obj ;
        final EqualsBuilder equalsBuilder = new EqualsBuilder();

        equalsBuilder.append( this.getClass().getName() , other.getClass().getName() );

        equalsBuilder.append( ramsubramo , other.ramsubramo );
        equalsBuilder.append( npoliza , other.npoliza );
        equalsBuilder.append( naseg , other.naseg );
        equalsBuilder.append( ndepend , other.ndepend );
        equalsBuilder.append( finiseg , other.finiseg );
        equalsBuilder.append( cvparent , other.cvparent );
        equalsBuilder.append( fantigcia , other.fantigcia );
        equalsBuilder.append( nomb , other.nomb );
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
        equalsBuilder.append( telefono1 , other.telefono1 );
        equalsBuilder.append( curp , other.curp );
        equalsBuilder.append( email , other.email );
        equalsBuilder.append( tpubic , other.tpubic );
        equalsBuilder.append( acteco , other.acteco );
        equalsBuilder.append( ocup , other.ocup );
        equalsBuilder.append( paisnac , other.paisnac );
        equalsBuilder.append( nacionld , other.nacionld );
        equalsBuilder.append( perspolexp , other.perspolexp );
        equalsBuilder.append( nombrycgo , other.nombrycgo );
        equalsBuilder.append( memberid , other.memberid );

        r = equalsBuilder.isEquals() ;
        return r ;
    }

    public int hashCode()
    {
        final HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();

        hashCodeBuilder.append( this.getClass().getName() );

        hashCodeBuilder.append( ramsubramo );
        hashCodeBuilder.append( npoliza );
        hashCodeBuilder.append( naseg );
        hashCodeBuilder.append( ndepend );
        hashCodeBuilder.append( finiseg );
        hashCodeBuilder.append( cvparent );
        hashCodeBuilder.append( fantigcia );
        hashCodeBuilder.append( nomb );
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
        hashCodeBuilder.append( telefono1 );
        hashCodeBuilder.append( curp );
        hashCodeBuilder.append( email );
        hashCodeBuilder.append( tpubic );
        hashCodeBuilder.append( acteco );
        hashCodeBuilder.append( ocup );
        hashCodeBuilder.append( paisnac );
        hashCodeBuilder.append( nacionld );
        hashCodeBuilder.append( perspolexp );
        hashCodeBuilder.append( nombrycgo );
        hashCodeBuilder.append( memberid );

        return hashCodeBuilder.toHashCode() ;
    }

    @Transient
    public Map<String, String> auxGetSearchFields()
    {
        Map<String, String> mappingFields = new LinkedHashMap<String, String>();

        mappingFields.put( "ASEGPLZ4.RAMSUBRAMO", UtilTranslateModel.parseValue(""+ramsubramo, Integer.class) );
        mappingFields.put( "ASEGPLZ4.NPOLIZA", UtilTranslateModel.parseValue(""+npoliza, Integer.class) );
        mappingFields.put( "ASEGPLZ4.NASEG", UtilTranslateModel.parseValue(""+naseg, String.class) );
        mappingFields.put( "ASEGPLZ4.NDEPEND", UtilTranslateModel.parseValue(""+ndepend, Integer.class) );

        log.debug("mappingFields: "+mappingFields);
        return mappingFields;
    }

    public Map<String, String> auxGetTransactionFields()
    {
        Map<String, String> mappingFields = new LinkedHashMap<String, String>();

        mappingFields.put( "ASEGPLZ4.RAMSUBRAMO", UtilTranslateModel.parseValue(""+ramsubramo, Integer.class) );
        mappingFields.put( "ASEGPLZ4.NPOLIZA", UtilTranslateModel.parseValue(""+npoliza, Integer.class) );
        mappingFields.put( "ASEGPLZ4.NASEG", UtilTranslateModel.parseValue(""+naseg, String.class) );
        mappingFields.put( "ASEGPLZ4.NDEPEND", UtilTranslateModel.parseValue(""+ndepend, Integer.class) );
        mappingFields.put( "ASEGPLZ4.FINISEG", UtilTranslateModel.parseValue(""+finiseg, Integer.class) );
        mappingFields.put( "ASEGPLZ4.CVPARENT", UtilTranslateModel.parseValue(""+cvparent, Integer.class) );
        mappingFields.put( "ASEGPLZ4.FANTIGCIA", UtilTranslateModel.parseValue(""+fantigcia, Integer.class) );
        mappingFields.put( "ASEGPLZ4.NOMB", UtilTranslateModel.parseValue(""+nomb, String.class) );
        mappingFields.put( "ASEGPLZ4.APPAT", UtilTranslateModel.parseValue(""+appat, String.class) );
        mappingFields.put( "ASEGPLZ4.APMAT", UtilTranslateModel.parseValue(""+apmat, String.class) );
        mappingFields.put( "ASEGPLZ4.FNAC", UtilTranslateModel.parseValue(""+fnac, Integer.class) );
        mappingFields.put( "ASEGPLZ4.RFCSIGLAS", UtilTranslateModel.parseValue(""+rfcsiglas, String.class) );
        mappingFields.put( "ASEGPLZ4.RFCFECHA", UtilTranslateModel.parseValue(""+rfcfecha, String.class) );
        mappingFields.put( "ASEGPLZ4.RFCHOMON", UtilTranslateModel.parseValue(""+rfchomon, String.class) );
        mappingFields.put( "ASEGPLZ4.CVSEXO", UtilTranslateModel.parseValue(""+cvsexo, Integer.class) );
        mappingFields.put( "ASEGPLZ4.CALLE", UtilTranslateModel.parseValue(""+calle, String.class) );
        mappingFields.put( "ASEGPLZ4.COLONIA", UtilTranslateModel.parseValue(""+colonia, String.class) );
        mappingFields.put( "ASEGPLZ4.MUNICIPIO", UtilTranslateModel.parseValue(""+municipio, String.class) );
        mappingFields.put( "ASEGPLZ4.POBLACION", UtilTranslateModel.parseValue(""+poblacion, String.class) );
        mappingFields.put( "ASEGPLZ4.EDO", UtilTranslateModel.parseValue(""+edo, Integer.class) );
        mappingFields.put( "ASEGPLZ4.CODPOST", UtilTranslateModel.parseValue(""+codpost, Integer.class) );
        mappingFields.put( "ASEGPLZ4.TELEFONO1", UtilTranslateModel.parseValue(""+telefono1, String.class) );
        mappingFields.put( "ASEGPLZ4.CURP", UtilTranslateModel.parseValue(""+curp, String.class) );
        mappingFields.put( "ASEGPLZ4.EMAIL", UtilTranslateModel.parseValue(""+email, String.class) );
        mappingFields.put( "ASEGPLZ4.TPUBIC", UtilTranslateModel.parseValue(""+tpubic, Integer.class) );
        mappingFields.put( "ASEGPLZ4.ACTECO", UtilTranslateModel.parseValue(""+acteco, Integer.class) );
        mappingFields.put( "ASEGPLZ4.OCUP", UtilTranslateModel.parseValue(""+ocup, String.class) );
        mappingFields.put( "ASEGPLZ4.PAISNAC", UtilTranslateModel.parseValue(""+paisnac, Integer.class) );
        mappingFields.put( "ASEGPLZ4.NACIONLD", UtilTranslateModel.parseValue(""+nacionld, Integer.class) );
        mappingFields.put( "ASEGPLZ4.PERSPOLEXP", UtilTranslateModel.parseValue(""+perspolexp, Integer.class) );
        mappingFields.put( "ASEGPLZ4.NOMBRYCGO", UtilTranslateModel.parseValue(""+nombrycgo, String.class) );
        mappingFields.put( "ASEGPLZ4.MEMBERID", UtilTranslateModel.parseValue(""+memberid, Integer.class) );

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
            
            if ( entry.getKey().equals( "ASEGPLZ4.RAMSUBRAMO" ) ) { setRamsubramo( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "ASEGPLZ4.NPOLIZA" ) ) { setNpoliza( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "ASEGPLZ4.NASEG" ) ) { setNaseg( (entry.getValue()) ); }
            if ( entry.getKey().equals( "ASEGPLZ4.NDEPEND" ) ) { setNdepend( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "ASEGPLZ4.FINISEG" ) ) { setFiniseg( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "ASEGPLZ4.CVPARENT" ) ) { setCvparent( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "ASEGPLZ4.FANTIGCIA" ) ) { setFantigcia( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "ASEGPLZ4.NOMB" ) ) { setNomb( (entry.getValue()) ); }
            if ( entry.getKey().equals( "ASEGPLZ4.APPAT" ) ) { setAppat( (entry.getValue()) ); }
            if ( entry.getKey().equals( "ASEGPLZ4.APMAT" ) ) { setApmat( (entry.getValue()) ); }
            if ( entry.getKey().equals( "ASEGPLZ4.FNAC" ) ) { setFnac( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "ASEGPLZ4.RFCSIGLAS" ) ) { setRfcsiglas( (entry.getValue()) ); }
            if ( entry.getKey().equals( "ASEGPLZ4.RFCFECHA" ) ) { setRfcfecha( (entry.getValue()) ); }
            if ( entry.getKey().equals( "ASEGPLZ4.RFCHOMON" ) ) { setRfchomon( (entry.getValue()) ); }
            if ( entry.getKey().equals( "ASEGPLZ4.CVSEXO" ) ) { setCvsexo( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "ASEGPLZ4.CALLE" ) ) { setCalle( (entry.getValue()) ); }
            if ( entry.getKey().equals( "ASEGPLZ4.COLONIA" ) ) { setColonia( (entry.getValue()) ); }
            if ( entry.getKey().equals( "ASEGPLZ4.MUNICIPIO" ) ) { setMunicipio( (entry.getValue()) ); }
            if ( entry.getKey().equals( "ASEGPLZ4.POBLACION" ) ) { setPoblacion( (entry.getValue()) ); }
            if ( entry.getKey().equals( "ASEGPLZ4.EDO" ) ) { setEdo( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "ASEGPLZ4.CODPOST" ) ) { setCodpost( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "ASEGPLZ4.TELEFONO1" ) ) { setTelefono1( (entry.getValue()) ); }
            if ( entry.getKey().equals( "ASEGPLZ4.CURP" ) ) { setCurp( (entry.getValue()) ); }
            if ( entry.getKey().equals( "ASEGPLZ4.EMAIL" ) ) { setEmail( (entry.getValue()) ); }
            if ( entry.getKey().equals( "ASEGPLZ4.TPUBIC" ) ) { setTpubic( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "ASEGPLZ4.ACTECO" ) ) { setActeco( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "ASEGPLZ4.OCUP" ) ) { setOcup( (entry.getValue()) ); }
            if ( entry.getKey().equals( "ASEGPLZ4.PAISNAC" ) ) { setPaisnac( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "ASEGPLZ4.NACIONLD" ) ) { setNacionld( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "ASEGPLZ4.PERSPOLEXP" ) ) { setPerspolexp( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "ASEGPLZ4.NOMBRYCGO" ) ) { setNombrycgo( (entry.getValue()) ); }
            if ( entry.getKey().equals( "ASEGPLZ4.MEMBERID" ) ) { setMemberid( Integer.parseInt(entry.getValue()) ); }
        
            if ( entry.getKey().equals( "ASEGPLZ4.MENSAJES"       ) ) { setMessage ( entry.getValue() ); }
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
    public static List< Asegplz4 > auxGetListFromCore( Map< String, String > mappingFields ) // 2021-03-07 ati: Hacer static para simplificar llamado
    {
        List< Asegplz4 > responseList = new ArrayList<Asegplz4  >();
        Object[ ] entries = mappingFields.entrySet().toArray();
        String locIndex = null;
        Asegplz4 item = null;
        for ( int i = 0; i < entries.length; i++ )
        {
            @SuppressWarnings("unchecked")
            Entry< String, String > entry = (Entry< String, String >) entries[ i ];
            //System.out.println("SYSOUT: " + (new Throwable().getStackTrace()[0].getMethodName() +" | entry.getKey(): " + entry.getKey() + "=["+entry.getValue()+"]")); 
            
            if ( entry.getKey().startsWith( "ASEGPLZ4[" ) )
            {
                if ( locIndex == null || !locIndex.equals( entry.getKey().substring( 0, entry.getKey().indexOf( "]" ) + 1 ) ) )
                {
                    if ( item != null )
                    {
                        responseList.add( item );
                    }
                    locIndex = entry.getKey().substring( 0, entry.getKey().indexOf( "]" ) + 1 );
                    item = new Asegplz4();
                }

                if ( entry.getKey().endsWith( ".RAMSUBRAMO" ) ) { item.setRamsubramo ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NPOLIZA" ) ) { item.setNpoliza ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NASEG" ) ) { item.setNaseg ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NDEPEND" ) ) { item.setNdepend ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".FINISEG" ) ) { item.setFiniseg ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".CVPARENT" ) ) { item.setCvparent ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".FANTIGCIA" ) ) { item.setFantigcia ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NOMB" ) ) { item.setNomb ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".APPAT" ) ) { item.setAppat ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".APMAT" ) ) { item.setApmat ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".FNAC" ) ) { item.setFnac ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".RFCSIGLAS" ) ) { item.setRfcsiglas ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".RFCFECHA" ) ) { item.setRfcfecha ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".RFCHOMON" ) ) { item.setRfchomon ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".CVSEXO" ) ) { item.setCvsexo ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".CALLE" ) ) { item.setCalle ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".COLONIA" ) ) { item.setColonia ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".MUNICIPIO" ) ) { item.setMunicipio ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".POBLACION" ) ) { item.setPoblacion ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".EDO" ) ) { item.setEdo ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".CODPOST" ) ) { item.setCodpost ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".TELEFONO1" ) ) { item.setTelefono1 ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".CURP" ) ) { item.setCurp ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".EMAIL" ) ) { item.setEmail ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".TPUBIC" ) ) { item.setTpubic ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".ACTECO" ) ) { item.setActeco ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".OCUP" ) ) { item.setOcup ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".PAISNAC" ) ) { item.setPaisnac ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NACIONLD" ) ) { item.setNacionld ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".PERSPOLEXP" ) ) { item.setPerspolexp ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NOMBRYCGO" ) ) { item.setNombrycgo ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".MEMBERID" ) ) { item.setMemberid ( Integer.parseInt(entry.getValue()) ); }

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

