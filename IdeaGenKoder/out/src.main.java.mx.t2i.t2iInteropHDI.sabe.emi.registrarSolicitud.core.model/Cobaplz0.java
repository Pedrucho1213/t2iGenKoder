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
public class Cobaplz0 extends mx.t2i.tekhne.core.model.BaseInterfaceModel
{
    private static final long serialVersionUID = 1L;

    private static final Logger log = LoggerFactory.getLogger(Cobaplz0.class);

    private Integer ramsubramo = null;
    private Integer npoliza = null;
    private String naseg = null;
    private Integer ndepend = null;
    private Integer cvcob = null;
    private Integer tipoadic = null;
    private Integer sa = null;
    private Double deducible = null;
    private Double coaseguro = null;

    public Cobaplz0()
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

    public Integer getCvcob() {
        return cvcob;
    }

    public void setCvcob(Integer cvcob) {
        this.cvcob = cvcob;
    }

    public Integer getTipoadic() {
        return tipoadic;
    }

    public void setTipoadic(Integer tipoadic) {
        this.tipoadic = tipoadic;
    }

    public Integer getSa() {
        return sa;
    }

    public void setSa(Integer sa) {
        this.sa = sa;
    }

    public Double getDeducible() {
        return deducible;
    }

    public void setDeducible(Double deducible) {
        this.deducible = deducible;
    }

    public Double getCoaseguro() {
        return coaseguro;
    }

    public void setCoaseguro(Double coaseguro) {
        this.coaseguro = coaseguro;
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
        .append("cvcob=").append( cvcob ).append("&")
        .append("tipoadic=").append( tipoadic ).append("&")
        .append("sa=").append( sa ).append("&")
        .append("deducible=").append( deducible ).append("&")
        .append("coaseguro=").append( coaseguro ).append("&")

        ;
        return r.toString() ;
    }

    public boolean equals( Object obj )
    {
        boolean r = false;

        if ( obj == null ) return false;
        if ( ! ( obj instanceof Cobaplz0 ) )  return false;

        final Cobaplz0 other = ( Cobaplz0 ) obj ;
        final EqualsBuilder equalsBuilder = new EqualsBuilder();

        equalsBuilder.append( this.getClass().getName() , other.getClass().getName() );

        equalsBuilder.append( ramsubramo , other.ramsubramo );
        equalsBuilder.append( npoliza , other.npoliza );
        equalsBuilder.append( naseg , other.naseg );
        equalsBuilder.append( ndepend , other.ndepend );
        equalsBuilder.append( cvcob , other.cvcob );
        equalsBuilder.append( tipoadic , other.tipoadic );
        equalsBuilder.append( sa , other.sa );
        equalsBuilder.append( deducible , other.deducible );
        equalsBuilder.append( coaseguro , other.coaseguro );

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
        hashCodeBuilder.append( cvcob );
        hashCodeBuilder.append( tipoadic );
        hashCodeBuilder.append( sa );
        hashCodeBuilder.append( deducible );
        hashCodeBuilder.append( coaseguro );

        return hashCodeBuilder.toHashCode() ;
    }

    @Transient
    public Map<String, String> auxGetSearchFields()
    {
        Map<String, String> mappingFields = new LinkedHashMap<String, String>();

        mappingFields.put( "COBAPLZ0.RAMSUBRAMO", UtilTranslateModel.parseValue(""+ramsubramo, Integer.class) );
        mappingFields.put( "COBAPLZ0.NPOLIZA", UtilTranslateModel.parseValue(""+npoliza, Integer.class) );
        mappingFields.put( "COBAPLZ0.NASEG", UtilTranslateModel.parseValue(""+naseg, String.class) );
        mappingFields.put( "COBAPLZ0.NDEPEND", UtilTranslateModel.parseValue(""+ndepend, Integer.class) );
        mappingFields.put( "COBAPLZ0.CVCOB", UtilTranslateModel.parseValue(""+cvcob, Integer.class) );
        mappingFields.put( "COBAPLZ0.TIPOADIC", UtilTranslateModel.parseValue(""+tipoadic, Integer.class) );

        log.debug("mappingFields: "+mappingFields);
        return mappingFields;
    }

    public Map<String, String> auxGetTransactionFields()
    {
        Map<String, String> mappingFields = new LinkedHashMap<String, String>();

        mappingFields.put( "COBAPLZ0.RAMSUBRAMO", UtilTranslateModel.parseValue(""+ramsubramo, Integer.class) );
        mappingFields.put( "COBAPLZ0.NPOLIZA", UtilTranslateModel.parseValue(""+npoliza, Integer.class) );
        mappingFields.put( "COBAPLZ0.NASEG", UtilTranslateModel.parseValue(""+naseg, String.class) );
        mappingFields.put( "COBAPLZ0.NDEPEND", UtilTranslateModel.parseValue(""+ndepend, Integer.class) );
        mappingFields.put( "COBAPLZ0.CVCOB", UtilTranslateModel.parseValue(""+cvcob, Integer.class) );
        mappingFields.put( "COBAPLZ0.TIPOADIC", UtilTranslateModel.parseValue(""+tipoadic, Integer.class) );
        mappingFields.put( "COBAPLZ0.SA", UtilTranslateModel.parseValue(""+sa, Integer.class) );
        mappingFields.put( "COBAPLZ0.DEDUCIBLE", UtilTranslateModel.parseValue(""+deducible, Double.class) );
        mappingFields.put( "COBAPLZ0.COASEGURO", UtilTranslateModel.parseValue(""+coaseguro, Double.class) );

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
            
            if ( entry.getKey().equals( "COBAPLZ0.RAMSUBRAMO" ) ) { setRamsubramo( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "COBAPLZ0.NPOLIZA" ) ) { setNpoliza( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "COBAPLZ0.NASEG" ) ) { setNaseg( (entry.getValue()) ); }
            if ( entry.getKey().equals( "COBAPLZ0.NDEPEND" ) ) { setNdepend( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "COBAPLZ0.CVCOB" ) ) { setCvcob( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "COBAPLZ0.TIPOADIC" ) ) { setTipoadic( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "COBAPLZ0.SA" ) ) { setSa( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "COBAPLZ0.DEDUCIBLE" ) ) { setDeducible( Double.parseDouble(entry.getValue()) ); }
            if ( entry.getKey().equals( "COBAPLZ0.COASEGURO" ) ) { setCoaseguro( Double.parseDouble(entry.getValue()) ); }
        
            if ( entry.getKey().equals( "COBAPLZ0.MENSAJES"       ) ) { setMessage ( entry.getValue() ); }
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
    public static List< Cobaplz0 > auxGetListFromCore( Map< String, String > mappingFields ) // 2021-03-07 ati: Hacer static para simplificar llamado
    {
        List< Cobaplz0 > responseList = new ArrayList<Cobaplz0  >();
        Object[ ] entries = mappingFields.entrySet().toArray();
        String locIndex = null;
        Cobaplz0 item = null;
        for ( int i = 0; i < entries.length; i++ )
        {
            @SuppressWarnings("unchecked")
            Entry< String, String > entry = (Entry< String, String >) entries[ i ];
            //System.out.println("SYSOUT: " + (new Throwable().getStackTrace()[0].getMethodName() +" | entry.getKey(): " + entry.getKey() + "=["+entry.getValue()+"]")); 
            
            if ( entry.getKey().startsWith( "COBAPLZ0[" ) )
            {
                if ( locIndex == null || !locIndex.equals( entry.getKey().substring( 0, entry.getKey().indexOf( "]" ) + 1 ) ) )
                {
                    if ( item != null )
                    {
                        responseList.add( item );
                    }
                    locIndex = entry.getKey().substring( 0, entry.getKey().indexOf( "]" ) + 1 );
                    item = new Cobaplz0();
                }

                if ( entry.getKey().endsWith( ".RAMSUBRAMO" ) ) { item.setRamsubramo ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NPOLIZA" ) ) { item.setNpoliza ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NASEG" ) ) { item.setNaseg ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NDEPEND" ) ) { item.setNdepend ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".CVCOB" ) ) { item.setCvcob ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".TIPOADIC" ) ) { item.setTipoadic ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".SA" ) ) { item.setSa ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".DEDUCIBLE" ) ) { item.setDeducible ( Double.parseDouble(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".COASEGURO" ) ) { item.setCoaseguro ( Double.parseDouble(entry.getValue()) ); }

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

