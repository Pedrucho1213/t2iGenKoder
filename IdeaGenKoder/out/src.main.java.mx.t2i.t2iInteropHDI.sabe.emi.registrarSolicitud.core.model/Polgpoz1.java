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
public class Polgpoz1 extends mx.t2i.tekhne.core.model.BaseInterfaceModel
{
    private static final long serialVersionUID = 1L;

    private static final Logger log = LoggerFactory.getLogger(Polgpoz1.class);

    private Integer ramsubramo = null;
    private Integer npoliza = null;
    private Integer stpoliza = null;
    private Integer npolorg = null;
    private String npolcoas = null;
    private Integer ncotiza = null;
    private Integer numcliente = null;
    private Integer finivig = null;
    private Integer ftervig = null;
    private Integer nesqfpago = null;
    private Integer nesqgexp = null;
    private Integer tpiva = null;
    private Integer tpdocum = null;
    private Double topecoas = null;
    private Integer tpconcod = null;
    private String idconcob = null;
    private Integer tpcomis = null;
    private Integer nagente1 = null;
    private Double porcpart1 = null;
    private Integer nagente2 = null;
    private Double porcpart2 = null;
    private Integer nagente3 = null;
    private Double porcpart3 = null;
    private Double porcredag = null;
    private Double porcredsu = null;
    private Double descpma02 = null;

    public Polgpoz1()
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

    public Integer getStpoliza() {
        return stpoliza;
    }

    public void setStpoliza(Integer stpoliza) {
        this.stpoliza = stpoliza;
    }

    public Integer getNpolorg() {
        return npolorg;
    }

    public void setNpolorg(Integer npolorg) {
        this.npolorg = npolorg;
    }

    public String getNpolcoas() {
        return npolcoas;
    }

    public void setNpolcoas(String npolcoas) {
        this.npolcoas = npolcoas;
    }

    public Integer getNcotiza() {
        return ncotiza;
    }

    public void setNcotiza(Integer ncotiza) {
        this.ncotiza = ncotiza;
    }

    public Integer getNumcliente() {
        return numcliente;
    }

    public void setNumcliente(Integer numcliente) {
        this.numcliente = numcliente;
    }

    public Integer getFinivig() {
        return finivig;
    }

    public void setFinivig(Integer finivig) {
        this.finivig = finivig;
    }

    public Integer getFtervig() {
        return ftervig;
    }

    public void setFtervig(Integer ftervig) {
        this.ftervig = ftervig;
    }

    public Integer getNesqfpago() {
        return nesqfpago;
    }

    public void setNesqfpago(Integer nesqfpago) {
        this.nesqfpago = nesqfpago;
    }

    public Integer getNesqgexp() {
        return nesqgexp;
    }

    public void setNesqgexp(Integer nesqgexp) {
        this.nesqgexp = nesqgexp;
    }

    public Integer getTpiva() {
        return tpiva;
    }

    public void setTpiva(Integer tpiva) {
        this.tpiva = tpiva;
    }

    public Integer getTpdocum() {
        return tpdocum;
    }

    public void setTpdocum(Integer tpdocum) {
        this.tpdocum = tpdocum;
    }

    public Double getTopecoas() {
        return topecoas;
    }

    public void setTopecoas(Double topecoas) {
        this.topecoas = topecoas;
    }

    public Integer getTpconcod() {
        return tpconcod;
    }

    public void setTpconcod(Integer tpconcod) {
        this.tpconcod = tpconcod;
    }

    public String getIdconcob() {
        return idconcob;
    }

    public void setIdconcob(String idconcob) {
        this.idconcob = idconcob;
    }

    public Integer getTpcomis() {
        return tpcomis;
    }

    public void setTpcomis(Integer tpcomis) {
        this.tpcomis = tpcomis;
    }

    public Integer getNagente1() {
        return nagente1;
    }

    public void setNagente1(Integer nagente1) {
        this.nagente1 = nagente1;
    }

    public Double getPorcpart1() {
        return porcpart1;
    }

    public void setPorcpart1(Double porcpart1) {
        this.porcpart1 = porcpart1;
    }

    public Integer getNagente2() {
        return nagente2;
    }

    public void setNagente2(Integer nagente2) {
        this.nagente2 = nagente2;
    }

    public Double getPorcpart2() {
        return porcpart2;
    }

    public void setPorcpart2(Double porcpart2) {
        this.porcpart2 = porcpart2;
    }

    public Integer getNagente3() {
        return nagente3;
    }

    public void setNagente3(Integer nagente3) {
        this.nagente3 = nagente3;
    }

    public Double getPorcpart3() {
        return porcpart3;
    }

    public void setPorcpart3(Double porcpart3) {
        this.porcpart3 = porcpart3;
    }

    public Double getPorcredag() {
        return porcredag;
    }

    public void setPorcredag(Double porcredag) {
        this.porcredag = porcredag;
    }

    public Double getPorcredsu() {
        return porcredsu;
    }

    public void setPorcredsu(Double porcredsu) {
        this.porcredsu = porcredsu;
    }

    public Double getDescpma02() {
        return descpma02;
    }

    public void setDescpma02(Double descpma02) {
        this.descpma02 = descpma02;
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
        .append("stpoliza=").append( stpoliza ).append("&")
        .append("npolorg=").append( npolorg ).append("&")
        .append("npolcoas=").append( npolcoas ).append("&")
        .append("ncotiza=").append( ncotiza ).append("&")
        .append("numcliente=").append( numcliente ).append("&")
        .append("finivig=").append( finivig ).append("&")
        .append("ftervig=").append( ftervig ).append("&")
        .append("nesqfpago=").append( nesqfpago ).append("&")
        .append("nesqgexp=").append( nesqgexp ).append("&")
        .append("tpiva=").append( tpiva ).append("&")
        .append("tpdocum=").append( tpdocum ).append("&")
        .append("topecoas=").append( topecoas ).append("&")
        .append("tpconcod=").append( tpconcod ).append("&")
        .append("idconcob=").append( idconcob ).append("&")
        .append("tpcomis=").append( tpcomis ).append("&")
        .append("nagente1=").append( nagente1 ).append("&")
        .append("porcpart1=").append( porcpart1 ).append("&")
        .append("nagente2=").append( nagente2 ).append("&")
        .append("porcpart2=").append( porcpart2 ).append("&")
        .append("nagente3=").append( nagente3 ).append("&")
        .append("porcpart3=").append( porcpart3 ).append("&")
        .append("porcredag=").append( porcredag ).append("&")
        .append("porcredsu=").append( porcredsu ).append("&")
        .append("descpma02=").append( descpma02 ).append("&")

        ;
        return r.toString() ;
    }

    public boolean equals( Object obj )
    {
        boolean r = false;

        if ( obj == null ) return false;
        if ( ! ( obj instanceof Polgpoz1 ) )  return false;

        final Polgpoz1 other = ( Polgpoz1 ) obj ;
        final EqualsBuilder equalsBuilder = new EqualsBuilder();

        equalsBuilder.append( this.getClass().getName() , other.getClass().getName() );

        equalsBuilder.append( ramsubramo , other.ramsubramo );
        equalsBuilder.append( npoliza , other.npoliza );
        equalsBuilder.append( stpoliza , other.stpoliza );
        equalsBuilder.append( npolorg , other.npolorg );
        equalsBuilder.append( npolcoas , other.npolcoas );
        equalsBuilder.append( ncotiza , other.ncotiza );
        equalsBuilder.append( numcliente , other.numcliente );
        equalsBuilder.append( finivig , other.finivig );
        equalsBuilder.append( ftervig , other.ftervig );
        equalsBuilder.append( nesqfpago , other.nesqfpago );
        equalsBuilder.append( nesqgexp , other.nesqgexp );
        equalsBuilder.append( tpiva , other.tpiva );
        equalsBuilder.append( tpdocum , other.tpdocum );
        equalsBuilder.append( topecoas , other.topecoas );
        equalsBuilder.append( tpconcod , other.tpconcod );
        equalsBuilder.append( idconcob , other.idconcob );
        equalsBuilder.append( tpcomis , other.tpcomis );
        equalsBuilder.append( nagente1 , other.nagente1 );
        equalsBuilder.append( porcpart1 , other.porcpart1 );
        equalsBuilder.append( nagente2 , other.nagente2 );
        equalsBuilder.append( porcpart2 , other.porcpart2 );
        equalsBuilder.append( nagente3 , other.nagente3 );
        equalsBuilder.append( porcpart3 , other.porcpart3 );
        equalsBuilder.append( porcredag , other.porcredag );
        equalsBuilder.append( porcredsu , other.porcredsu );
        equalsBuilder.append( descpma02 , other.descpma02 );

        r = equalsBuilder.isEquals() ;
        return r ;
    }

    public int hashCode()
    {
        final HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();

        hashCodeBuilder.append( this.getClass().getName() );

        hashCodeBuilder.append( ramsubramo );
        hashCodeBuilder.append( npoliza );
        hashCodeBuilder.append( stpoliza );
        hashCodeBuilder.append( npolorg );
        hashCodeBuilder.append( npolcoas );
        hashCodeBuilder.append( ncotiza );
        hashCodeBuilder.append( numcliente );
        hashCodeBuilder.append( finivig );
        hashCodeBuilder.append( ftervig );
        hashCodeBuilder.append( nesqfpago );
        hashCodeBuilder.append( nesqgexp );
        hashCodeBuilder.append( tpiva );
        hashCodeBuilder.append( tpdocum );
        hashCodeBuilder.append( topecoas );
        hashCodeBuilder.append( tpconcod );
        hashCodeBuilder.append( idconcob );
        hashCodeBuilder.append( tpcomis );
        hashCodeBuilder.append( nagente1 );
        hashCodeBuilder.append( porcpart1 );
        hashCodeBuilder.append( nagente2 );
        hashCodeBuilder.append( porcpart2 );
        hashCodeBuilder.append( nagente3 );
        hashCodeBuilder.append( porcpart3 );
        hashCodeBuilder.append( porcredag );
        hashCodeBuilder.append( porcredsu );
        hashCodeBuilder.append( descpma02 );

        return hashCodeBuilder.toHashCode() ;
    }

    @Transient
    public Map<String, String> auxGetSearchFields()
    {
        Map<String, String> mappingFields = new LinkedHashMap<String, String>();

        mappingFields.put( "POLGPOX1.RAMSUBRAMO", UtilTranslateModel.parseValue(""+ramsubramo, Integer.class) );
        mappingFields.put( "POLGPOX1.NPOLIZA", UtilTranslateModel.parseValue(""+npoliza, Integer.class) );

        log.debug("mappingFields: "+mappingFields);
        return mappingFields;
    }

    public Map<String, String> auxGetTransactionFields()
    {
        Map<String, String> mappingFields = new LinkedHashMap<String, String>();

        mappingFields.put( "POLGPOX1.RAMSUBRAMO", UtilTranslateModel.parseValue(""+ramsubramo, Integer.class) );
        mappingFields.put( "POLGPOX1.NPOLIZA", UtilTranslateModel.parseValue(""+npoliza, Integer.class) );
        mappingFields.put( "POLGPOX1.STPOLIZA", UtilTranslateModel.parseValue(""+stpoliza, Integer.class) );
        mappingFields.put( "POLGPOX1.NPOLORG", UtilTranslateModel.parseValue(""+npolorg, Integer.class) );
        mappingFields.put( "POLGPOX1.NPOLCOAS", UtilTranslateModel.parseValue(""+npolcoas, String.class) );
        mappingFields.put( "POLGPOX1.NCOTIZA", UtilTranslateModel.parseValue(""+ncotiza, Integer.class) );
        mappingFields.put( "POLGPOX1.NUMCLIENTE", UtilTranslateModel.parseValue(""+numcliente, Integer.class) );
        mappingFields.put( "POLGPOX1.FINIVIG", UtilTranslateModel.parseValue(""+finivig, Integer.class) );
        mappingFields.put( "POLGPOX1.FTERVIG", UtilTranslateModel.parseValue(""+ftervig, Integer.class) );
        mappingFields.put( "POLGPOX1.NESQFPAGO", UtilTranslateModel.parseValue(""+nesqfpago, Integer.class) );
        mappingFields.put( "POLGPOX1.NESQGEXP", UtilTranslateModel.parseValue(""+nesqgexp, Integer.class) );
        mappingFields.put( "POLGPOX1.TPIVA", UtilTranslateModel.parseValue(""+tpiva, Integer.class) );
        mappingFields.put( "POLGPOX1.TPDOCUM", UtilTranslateModel.parseValue(""+tpdocum, Integer.class) );
        mappingFields.put( "POLGPOX1.TOPECOAS", UtilTranslateModel.parseValue(""+topecoas, Double.class) );
        mappingFields.put( "POLGPOX1.TPCONCOD", UtilTranslateModel.parseValue(""+tpconcod, Integer.class) );
        mappingFields.put( "POLGPOX1.IDCONCOB", UtilTranslateModel.parseValue(""+idconcob, String.class) );
        mappingFields.put( "POLGPOX1.TPCOMIS", UtilTranslateModel.parseValue(""+tpcomis, Integer.class) );
        mappingFields.put( "POLGPOX1.NAGENTE1", UtilTranslateModel.parseValue(""+nagente1, Integer.class) );
        mappingFields.put( "POLGPOX1.PORCPART1", UtilTranslateModel.parseValue(""+porcpart1, Double.class) );
        mappingFields.put( "POLGPOX1.NAGENTE2", UtilTranslateModel.parseValue(""+nagente2, Integer.class) );
        mappingFields.put( "POLGPOX1.PORCPART2", UtilTranslateModel.parseValue(""+porcpart2, Double.class) );
        mappingFields.put( "POLGPOX1.NAGENTE3", UtilTranslateModel.parseValue(""+nagente3, Integer.class) );
        mappingFields.put( "POLGPOX1.PORCPART3", UtilTranslateModel.parseValue(""+porcpart3, Double.class) );
        mappingFields.put( "POLGPOX1.PORCREDAG", UtilTranslateModel.parseValue(""+porcredag, Double.class) );
        mappingFields.put( "POLGPOX1.PORCREDSU", UtilTranslateModel.parseValue(""+porcredsu, Double.class) );
        mappingFields.put( "POLGPOX1.DESCPMA02", UtilTranslateModel.parseValue(""+descpma02, Double.class) );

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
            
            if ( entry.getKey().equals( "POLGPOX1.RAMSUBRAMO" ) ) { setRamsubramo( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGPOX1.NPOLIZA" ) ) { setNpoliza( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGPOX1.STPOLIZA" ) ) { setStpoliza( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGPOX1.NPOLORG" ) ) { setNpolorg( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGPOX1.NPOLCOAS" ) ) { setNpolcoas( (entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGPOX1.NCOTIZA" ) ) { setNcotiza( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGPOX1.NUMCLIENTE" ) ) { setNumcliente( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGPOX1.FINIVIG" ) ) { setFinivig( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGPOX1.FTERVIG" ) ) { setFtervig( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGPOX1.NESQFPAGO" ) ) { setNesqfpago( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGPOX1.NESQGEXP" ) ) { setNesqgexp( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGPOX1.TPIVA" ) ) { setTpiva( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGPOX1.TPDOCUM" ) ) { setTpdocum( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGPOX1.TOPECOAS" ) ) { setTopecoas( Double.parseDouble(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGPOX1.TPCONCOD" ) ) { setTpconcod( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGPOX1.IDCONCOB" ) ) { setIdconcob( (entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGPOX1.TPCOMIS" ) ) { setTpcomis( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGPOX1.NAGENTE1" ) ) { setNagente1( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGPOX1.PORCPART1" ) ) { setPorcpart1( Double.parseDouble(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGPOX1.NAGENTE2" ) ) { setNagente2( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGPOX1.PORCPART2" ) ) { setPorcpart2( Double.parseDouble(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGPOX1.NAGENTE3" ) ) { setNagente3( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGPOX1.PORCPART3" ) ) { setPorcpart3( Double.parseDouble(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGPOX1.PORCREDAG" ) ) { setPorcredag( Double.parseDouble(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGPOX1.PORCREDSU" ) ) { setPorcredsu( Double.parseDouble(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGPOX1.DESCPMA02" ) ) { setDescpma02( Double.parseDouble(entry.getValue()) ); }
        
            if ( entry.getKey().equals( "POLGPOX1.MENSAJES"       ) ) { setMessage ( entry.getValue() ); }
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
    public static List< Polgpoz1 > auxGetListFromCore( Map< String, String > mappingFields ) // 2021-03-07 ati: Hacer static para simplificar llamado
    {
        List< Polgpoz1 > responseList = new ArrayList<Polgpoz1  >();
        Object[ ] entries = mappingFields.entrySet().toArray();
        String locIndex = null;
        Polgpoz1 item = null;
        for ( int i = 0; i < entries.length; i++ )
        {
            @SuppressWarnings("unchecked")
            Entry< String, String > entry = (Entry< String, String >) entries[ i ];
            //System.out.println("SYSOUT: " + (new Throwable().getStackTrace()[0].getMethodName() +" | entry.getKey(): " + entry.getKey() + "=["+entry.getValue()+"]")); 
            
            if ( entry.getKey().startsWith( "POLGPOX1[" ) )
            {
                if ( locIndex == null || !locIndex.equals( entry.getKey().substring( 0, entry.getKey().indexOf( "]" ) + 1 ) ) )
                {
                    if ( item != null )
                    {
                        responseList.add( item );
                    }
                    locIndex = entry.getKey().substring( 0, entry.getKey().indexOf( "]" ) + 1 );
                    item = new Polgpoz1();
                }

                if ( entry.getKey().endsWith( ".RAMSUBRAMO" ) ) { item.setRamsubramo ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NPOLIZA" ) ) { item.setNpoliza ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".STPOLIZA" ) ) { item.setStpoliza ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NPOLORG" ) ) { item.setNpolorg ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NPOLCOAS" ) ) { item.setNpolcoas ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NCOTIZA" ) ) { item.setNcotiza ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NUMCLIENTE" ) ) { item.setNumcliente ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".FINIVIG" ) ) { item.setFinivig ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".FTERVIG" ) ) { item.setFtervig ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NESQFPAGO" ) ) { item.setNesqfpago ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NESQGEXP" ) ) { item.setNesqgexp ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".TPIVA" ) ) { item.setTpiva ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".TPDOCUM" ) ) { item.setTpdocum ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".TOPECOAS" ) ) { item.setTopecoas ( Double.parseDouble(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".TPCONCOD" ) ) { item.setTpconcod ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".IDCONCOB" ) ) { item.setIdconcob ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".TPCOMIS" ) ) { item.setTpcomis ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NAGENTE1" ) ) { item.setNagente1 ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".PORCPART1" ) ) { item.setPorcpart1 ( Double.parseDouble(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NAGENTE2" ) ) { item.setNagente2 ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".PORCPART2" ) ) { item.setPorcpart2 ( Double.parseDouble(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NAGENTE3" ) ) { item.setNagente3 ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".PORCPART3" ) ) { item.setPorcpart3 ( Double.parseDouble(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".PORCREDAG" ) ) { item.setPorcredag ( Double.parseDouble(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".PORCREDSU" ) ) { item.setPorcredsu ( Double.parseDouble(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".DESCPMA02" ) ) { item.setDescpma02 ( Double.parseDouble(entry.getValue()) ); }

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

