package mx.t2i.t2iSabeOpcger.opcger.core.model;

import java.util.List;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.springframework.stereotype.Component;

import mx.t2i.t2iSabeOpcger.util.UtilFechaCore;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Date;

/**
 * <h4>Description:</h4>
 * Model para interfaz de webservice
 *
 */
@Component
public class Opcgerx0VO extends mx.t2i.tekhne.core.model.BaseInterfaceModel
{
    private static final long serialVersionUID = 1L;

    private static final Logger log = LoggerFactory.getLogger(Opcgerx0VO.class);

    private Integer ramsubramo = null;
    private Integer moneda = null;
    private Integer numnorma = null;
    private Date finivig = null;
    private String descnorm = null;
    private Double valor01 = null;
    private Double valor02 = null;
    private Double valor03 = null;
    private Double valor04 = null;
    private Double valor05 = null;
    private Double valor06 = null;
    private Double valor07 = null;
    private Double valor08 = null;
    private Double valor09 = null;
    private Double valor10 = null;
    private Double valor11 = null;
    private Double valor12 = null;
    private String descval01 = null;
    private String descval02 = null;
    private String descval03 = null;
    private String descval04 = null;
    private String descval05 = null;
    private String descval06 = null;
    private String descval07 = null;
    private String descval08 = null;
    private String descval09 = null;
    private String descval10 = null;
    private String descval11 = null;
    private String descval12 = null;
    private String nombrel = null;
    private String moneda_i = null;


    public Opcgerx0VO()
    {
        super();
    }


    public Integer getRamsubramo() {
        return ramsubramo;
    }


    public void setRamsubramo(Integer ramsubramo) {
        this.ramsubramo = ramsubramo;
    }


    public Integer getMoneda() {
        return moneda;
    }


    public void setMoneda(Integer moneda) {
        this.moneda = moneda;
    }


    public Integer getNumnorma() {
        return numnorma;
    }


    public void setNumnorma(Integer numnorma) {
        this.numnorma = numnorma;
    }


    public Date getFinivig() {
        return finivig;
    }


    public void setFinivig(Date finivig) {
        this.finivig = finivig;
    }


    public String getDescnorm() {
        return descnorm;
    }


    public void setDescnorm(String descnorm) {
        this.descnorm = descnorm;
    }



    public Double getValor01() {
        return valor01;
    }
    
    
    public void setValor01(Double valor01) {
        this.valor01 = valor01;
    }


    public Double getValor02() {
        return valor02;
    }
    
    
    public void setValor02(Double valor02) {
        this.valor02 = valor02;
    }


    public Double getValor03() {
        return valor03;
    }
    
    
    public void setValor03(Double valor03) {
        this.valor03 = valor03;
    }


    public Double getValor04() {
        return valor04;
    }
    
    
    public void setValor04(Double valor04) {
        this.valor04 = valor04;
    }


    public Double getValor05() {
        return valor05;
    }
    
    
    public void setValor05(Double valor05) {
        this.valor05 = valor05;
    }


    public Double getValor06() {
        return valor06;
    }
    
    
    public void setValor06(Double valor06) {
        this.valor06 = valor06;
    }


    public Double getValor07() {
        return valor07;
    }
    
    
    public void setValor07(Double valor07) {
        this.valor07 = valor07;
    }


    public Double getValor08() {
        return valor08;
    }
    
    
    public void setValor08(Double valor08) {
        this.valor08 = valor08;
    }


    public Double getValor09() {
        return valor09;
    }
    
    
    public void setValor09(Double valor09) {
        this.valor09 = valor09;
    }


    public Double getValor10() {
        return valor10;
    }
    
    
    public void setValor10(Double valor10) {
        this.valor10 = valor10;
    }


    public Double getValor11() {
        return valor11;
    }
    
    
    public void setValor11(Double valor11) {
        this.valor11 = valor11;
    }


    public Double getValor12() {
        return valor12;
    }
    
    
    public void setValor12(Double valor12) {
        this.valor12 = valor12;
    }


    public String getDescval01() {
        return descval01;
    }
    
    
    public void setDescval01(String descval01) {
        this.descval01 = descval01;
    }


    public String getDescval02() {
        return descval02;
    }
    
    
    public void setDescval02(String descval02) {
        this.descval02 = descval02;
    }


    public String getDescval03() {
        return descval03;
    }
    
    
    public void setDescval03(String descval03) {
        this.descval03 = descval03;
    }


    public String getDescval04() {
        return descval04;
    }
    
    
    public void setDescval04(String descval04) {
        this.descval04 = descval04;
    }


    public String getDescval05() {
        return descval05;
    }
    
    
    public void setDescval05(String descval05) {
        this.descval05 = descval05;
    }


    public String getDescval06() {
        return descval06;
    }
    
    
    public void setDescval06(String descval06) {
        this.descval06 = descval06;
    }


    public String getDescval07() {
        return descval07;
    }
    
    
    public void setDescval07(String descval07) {
        this.descval07 = descval07;
    }


    public String getDescval08() {
        return descval08;
    }
    
    
    public void setDescval08(String descval08) {
        this.descval08 = descval08;
    }


    public String getDescval09() {
        return descval09;
    }
    
    
    public void setDescval09(String descval09) {
        this.descval09 = descval09;
    }


    public String getDescval10() {
        return descval10;
    }
    
    
    public void setDescval10(String descval10) {
        this.descval10 = descval10;
    }


    public String getDescval11() {
        return descval11;
    }
    
    
    public void setDescval11(String descval11) {
        this.descval11 = descval11;
    }


    public String getDescval12() {
        return descval12;
    }
    
    
    public void setDescval12(String descval12) {
        this.descval12 = descval12;
    }


    public String getNombrel() {
        return nombrel;
    }
    
    
    public void setNombrel(String nombrel) {
        this.nombrel = nombrel;
    }


    public String getMoneda_i() {
        return moneda_i;
    }
    
    
    public void setMoneda_i(String moneda_i) {
        this.moneda_i = moneda_i;
    }




    public void clear()
    {
        ramsubramo = null;
        moneda = null;
        numnorma = null;
        finivig = null;
        descnorm = null;
        valor01 = null;
        valor02 = null;
        valor03 = null;
        valor04 = null;
        valor05 = null;
        valor06 = null;
        valor07 = null;
        valor08 = null;
        valor09 = null;
        valor10 = null;
        valor11 = null;
        valor12 = null;
        descval01 = null;
        descval02 = null;
        descval03 = null;
        descval04 = null;
        descval05 = null;
        descval06 = null;
        descval07 = null;
        descval08 = null;
        descval09 = null;
        descval10 = null;
        descval11 = null;
        descval12 = null;
        nombrel = null;
        moneda_i = null;

    }

    public String toString()
    {
        StringBuilder r = new StringBuilder() ;
       
        r.append(super.toString())
        .append("ramsubramo=").append( ramsubramo ).append("&")
        .append("moneda=").append( moneda ).append("&")
        .append("numnorma=").append( numnorma ).append("&")
        .append("finivig=").append( finivig ).append("&")
        .append("descnorm=").append( descnorm ).append("&")
        .append("valor01=").append( valor01 ).append("&")
        .append("valor02=").append( valor02 ).append("&")
        .append("valor03=").append( valor03 ).append("&")
        .append("valor04=").append( valor04 ).append("&")
        .append("valor05=").append( valor05 ).append("&")
        .append("valor06=").append( valor06 ).append("&")
        .append("valor07=").append( valor07 ).append("&")
        .append("valor08=").append( valor08 ).append("&")
        .append("valor09=").append( valor09 ).append("&")
        .append("valor10=").append( valor10 ).append("&")
        .append("valor11=").append( valor11 ).append("&")
        .append("valor12=").append( valor12 ).append("&")
        .append("descval01=").append( descval01 ).append("&")
        .append("descval02=").append( descval02 ).append("&")
        .append("descval03=").append( descval03 ).append("&")
        .append("descval04=").append( descval04 ).append("&")
        .append("descval05=").append( descval05 ).append("&")
        .append("descval06=").append( descval06 ).append("&")
        .append("descval07=").append( descval07 ).append("&")
        .append("descval08=").append( descval08 ).append("&")
        .append("descval09=").append( descval09 ).append("&")
        .append("descval10=").append( descval10 ).append("&")
        .append("descval11=").append( descval11 ).append("&")
        .append("descval12=").append( descval12 ).append("&")
        .append("nombrel=").append( nombrel ).append("&")
        .append("moneda_i=").append( moneda_i ).append("&")


        ;
        return r.toString() ;
    }

    public boolean equals( Object obj )
    {
        boolean r = false;

        if ( obj == null ) return false;
        if ( ! ( obj instanceof Opcgerx0VO ) )  return false;

        final Opcgerx0VO other = ( Opcgerx0VO ) obj ;
        final EqualsBuilder equalsBuilder = new EqualsBuilder();

        equalsBuilder.append( this.getClass().getName() , other.getClass().getName() );

        equalsBuilder.append( ramsubramo , other.ramsubramo );
        equalsBuilder.append( moneda , other.moneda );
        equalsBuilder.append( numnorma , other.numnorma );
        equalsBuilder.append( finivig , other.finivig );
        equalsBuilder.append( descnorm , other.descnorm );

        equalsBuilder.append( valor01 , other.valor01 );
        equalsBuilder.append( valor02 , other.valor02 );
        equalsBuilder.append( valor03 , other.valor03 );
        equalsBuilder.append( valor04 , other.valor04 );
        equalsBuilder.append( valor05 , other.valor05 );
        equalsBuilder.append( valor06 , other.valor06 );
        equalsBuilder.append( valor07 , other.valor07 );
        equalsBuilder.append( valor08 , other.valor08 );
        equalsBuilder.append( valor09 , other.valor09 );
        equalsBuilder.append( valor10 , other.valor10 );
        equalsBuilder.append( valor11 , other.valor11 );
        equalsBuilder.append( valor12 , other.valor12 );
        equalsBuilder.append( descval01 , other.descval01 );
        equalsBuilder.append( descval02 , other.descval02 );
        equalsBuilder.append( descval03 , other.descval03 );
        equalsBuilder.append( descval04 , other.descval04 );
        equalsBuilder.append( descval05 , other.descval05 );
        equalsBuilder.append( descval06 , other.descval06 );
        equalsBuilder.append( descval07 , other.descval07 );
        equalsBuilder.append( descval08 , other.descval08 );
        equalsBuilder.append( descval09 , other.descval09 );
        equalsBuilder.append( descval10 , other.descval10 );
        equalsBuilder.append( descval11 , other.descval11 );
        equalsBuilder.append( descval12 , other.descval12 );
        equalsBuilder.append( nombrel , other.nombrel );
        equalsBuilder.append( moneda_i , other.moneda_i );


        r = equalsBuilder.isEquals() ;
        return r ;
    }

    public int hashCode()
    {
        final HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();

        hashCodeBuilder.append( this.getClass().getName() );

        hashCodeBuilder.append( ramsubramo );
        hashCodeBuilder.append( moneda );
        hashCodeBuilder.append( numnorma );
        hashCodeBuilder.append( finivig );
        hashCodeBuilder.append( descnorm );

        hashCodeBuilder.append( valor01 );
        hashCodeBuilder.append( valor02 );
        hashCodeBuilder.append( valor03 );
        hashCodeBuilder.append( valor04 );
        hashCodeBuilder.append( valor05 );
        hashCodeBuilder.append( valor06 );
        hashCodeBuilder.append( valor07 );
        hashCodeBuilder.append( valor08 );
        hashCodeBuilder.append( valor09 );
        hashCodeBuilder.append( valor10 );
        hashCodeBuilder.append( valor11 );
        hashCodeBuilder.append( valor12 );
        hashCodeBuilder.append( descval01 );
        hashCodeBuilder.append( descval02 );
        hashCodeBuilder.append( descval03 );
        hashCodeBuilder.append( descval04 );
        hashCodeBuilder.append( descval05 );
        hashCodeBuilder.append( descval06 );
        hashCodeBuilder.append( descval07 );
        hashCodeBuilder.append( descval08 );
        hashCodeBuilder.append( descval09 );
        hashCodeBuilder.append( descval10 );
        hashCodeBuilder.append( descval11 );
        hashCodeBuilder.append( descval12 );
        hashCodeBuilder.append( nombrel );
        hashCodeBuilder.append( moneda_i );


        return hashCodeBuilder.toHashCode() ;
    }

/* 2021-03-05 ati: No para objetos incrustados * /
    @Transient
    public Map<String, String> auxGetSearchFields()
    {
        Map<String, String> mappingFields = new LinkedHashMap<String, String>();
        mappingFields.put( "OPCGERX0.RAMSUBRAMO" , UtilTranslateModel.parseValue(""+ramsubramo, Integer.class) );
...
        log.debug("mappingFields: "+mappingFields);
        return mappingFields;
    }

    public Map<String, String> auxGetTransactionFields()
    {
        Map<String, String> mappingFields = new LinkedHashMap<String, String>();
        mappingFields.put( "OPCGERX0.RAMSUBRAMO" , UtilTranslateModel.parseValue(""+ramsubramo, Integer.class) );
...
        log.debug("mappingFields: "+mappingFields);
        return mappingFields;
    }
/* 2021-03-05 ati: No para objetos incrustados */

    @SuppressWarnings("unused") // 2021-03-12 Para evitar Dead Code dentro de: if (errorInMappingFields != null)
    public Map<String, String> auxSetValuesFromMap( Map<String, String> mappingFields ) throws Exception
    {
        Object[] entries = mappingFields.entrySet().toArray();
        String errorInMappingFields = null;
        for ( int i = 0; i < entries.length; i++ )
        {
            @SuppressWarnings("unchecked")
            Entry< String, String > entry = (Entry< String, String >) entries[ i ];
            if ( entry.getValue().contains("ERROR")) { errorInMappingFields = entry.getValue(); }

            if ( entry.getKey().equals( "OPCGERX0.RAMSUBRAMO" ) ) { setRamsubramo( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "OPCGERX0.MONEDA" ) ) { setMoneda( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "OPCGERX0.NUMNORMA" ) ) { setNumnorma( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "OPCGERX0.FINIVIG" ) ) { setFinivig( UtilFechaCore.fromCoreValue(entry.getValue()) ); }
            if ( entry.getKey().equals( "OPCGERX0.DESCNORM" ) ) { setDescnorm( (entry.getValue()) ); }
            if ( entry.getKey().equals( "OPCGERX0.VALOR[01]" ) ) { setValor01( Double.parseDouble(entry.getValue()) ); }
            if ( entry.getKey().equals( "OPCGERX0.VALOR[02]" ) ) { setValor02( Double.parseDouble(entry.getValue()) ); }
            if ( entry.getKey().equals( "OPCGERX0.VALOR[03]" ) ) { setValor03( Double.parseDouble(entry.getValue()) ); }
            if ( entry.getKey().equals( "OPCGERX0.VALOR[04]" ) ) { setValor04( Double.parseDouble(entry.getValue()) ); }
            if ( entry.getKey().equals( "OPCGERX0.VALOR[05]" ) ) { setValor05( Double.parseDouble(entry.getValue()) ); }
            if ( entry.getKey().equals( "OPCGERX0.VALOR[06]" ) ) { setValor06( Double.parseDouble(entry.getValue()) ); }
            if ( entry.getKey().equals( "OPCGERX0.VALOR[07]" ) ) { setValor07( Double.parseDouble(entry.getValue()) ); }
            if ( entry.getKey().equals( "OPCGERX0.VALOR[08]" ) ) { setValor08( Double.parseDouble(entry.getValue()) ); }
            if ( entry.getKey().equals( "OPCGERX0.VALOR[09]" ) ) { setValor09( Double.parseDouble(entry.getValue()) ); }
            if ( entry.getKey().equals( "OPCGERX0.VALOR[10]" ) ) { setValor10( Double.parseDouble(entry.getValue()) ); }
            if ( entry.getKey().equals( "OPCGERX0.VALOR[11]" ) ) { setValor11( Double.parseDouble(entry.getValue()) ); }
            if ( entry.getKey().equals( "OPCGERX0.VALOR[12]" ) ) { setValor12( Double.parseDouble(entry.getValue()) ); }
            if ( entry.getKey().equals( "OPCGERX0.DESCVAL[01]" ) ) { setDescval01( (entry.getValue()) ); }
            if ( entry.getKey().equals( "OPCGERX0.DESCVAL[02]" ) ) { setDescval02( (entry.getValue()) ); }
            if ( entry.getKey().equals( "OPCGERX0.DESCVAL[03]" ) ) { setDescval03( (entry.getValue()) ); }
            if ( entry.getKey().equals( "OPCGERX0.DESCVAL[04]" ) ) { setDescval04( (entry.getValue()) ); }
            if ( entry.getKey().equals( "OPCGERX0.DESCVAL[05]" ) ) { setDescval05( (entry.getValue()) ); }
            if ( entry.getKey().equals( "OPCGERX0.DESCVAL[06]" ) ) { setDescval06( (entry.getValue()) ); }
            if ( entry.getKey().equals( "OPCGERX0.DESCVAL[07]" ) ) { setDescval07( (entry.getValue()) ); }
            if ( entry.getKey().equals( "OPCGERX0.DESCVAL[08]" ) ) { setDescval08( (entry.getValue()) ); }
            if ( entry.getKey().equals( "OPCGERX0.DESCVAL[09]" ) ) { setDescval09( (entry.getValue()) ); }
            if ( entry.getKey().equals( "OPCGERX0.DESCVAL[10]" ) ) { setDescval10( (entry.getValue()) ); }
            if ( entry.getKey().equals( "OPCGERX0.DESCVAL[11]" ) ) { setDescval11( (entry.getValue()) ); }
            if ( entry.getKey().equals( "OPCGERX0.DESCVAL[12]" ) ) { setDescval12( (entry.getValue()) ); }
            if ( entry.getKey().equals( "OPCGERX0.NOMBREL" ) ) { setNombrel( (entry.getValue()) ); }
            if ( entry.getKey().equals( "OPCGERX0.MONEDA_I" ) ) { setMoneda_i( (entry.getValue()) ); }


            if ( entry.getKey().equals( "OPCGERX0.MENSAJES"       ) ) { setMessage ( entry.getValue() ); }
        }
/* 2021-03-05 ati: No para objetos incrustados * /
        log.debug("mappingFields: "+mappingFields);
/ * 2021-03-05 ati: No para objetos incrustados */

        // 2021-03-10 ati+czg+gti+lra: Acordamos dejar los detalles técnicos al log 
        if (errorInMappingFields != null)
        {
            String msg = errorInMappingFields;
            log.error(msg);
            throw new Exception(msg);
        }
        return mappingFields;
    }

    /**
     *
     * Armar una lista con los registros resultado de la consulta de cobol
     *
     */
    public static List< Opcgerx0VO > auxGetListFromCore( Map< String, String > mappingFields )
    {
        List< Opcgerx0VO > responseList = new ArrayList<Opcgerx0VO>();
        Object[ ] entries = mappingFields.entrySet().toArray();
        String locIndex = null;
        Opcgerx0VO item = null;
        for ( int i = 0; i < entries.length; i++ )
        {
            @SuppressWarnings("unchecked")
            Entry< String, String > entry = (Entry< String, String >) entries[ i ];
            if ( entry.getKey().startsWith( "OPCGERX0[" ) )
            {
                if ( locIndex == null || !locIndex.equals( entry.getKey().substring( 0, entry.getKey().indexOf( "]" ) + 1 ) ) )
                {
                    if ( item != null )
                    {
                        responseList.add( item );
                    }
                    locIndex = entry.getKey().substring( 0, entry.getKey().indexOf( "]" ) + 1 );
                    item = new Opcgerx0VO();
                }

                if ( entry.getKey().endsWith( ".RAMSUBRAMO" ) ) { item.setRamsubramo( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".MONEDA" ) ) { item.setMoneda( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NUMNORMA" ) ) { item.setNumnorma( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".FINIVIG" ) ) { item.setFinivig( UtilFechaCore.fromCoreValue(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".DESCNORM" ) ) { item.setDescnorm( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".VALOR[01]" ) ) { item.setValor01( Double.parseDouble(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".VALOR[02]" ) ) { item.setValor02( Double.parseDouble(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".VALOR[03]" ) ) { item.setValor03( Double.parseDouble(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".VALOR[04]" ) ) { item.setValor04( Double.parseDouble(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".VALOR[05]" ) ) { item.setValor05( Double.parseDouble(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".VALOR[06]" ) ) { item.setValor06( Double.parseDouble(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".VALOR[07]" ) ) { item.setValor07( Double.parseDouble(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".VALOR[08]" ) ) { item.setValor08( Double.parseDouble(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".VALOR[09]" ) ) { item.setValor09( Double.parseDouble(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".VALOR[10]" ) ) { item.setValor10( Double.parseDouble(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".VALOR[11]" ) ) { item.setValor11( Double.parseDouble(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".VALOR[12]" ) ) { item.setValor12( Double.parseDouble(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".DESCVAL[01]" ) ) { item.setDescval01( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".DESCVAL[02]" ) ) { item.setDescval02( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".DESCVAL[03]" ) ) { item.setDescval03( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".DESCVAL[04]" ) ) { item.setDescval04( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".DESCVAL[05]" ) ) { item.setDescval05( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".DESCVAL[06]" ) ) { item.setDescval06( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".DESCVAL[07]" ) ) { item.setDescval07( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".DESCVAL[08]" ) ) { item.setDescval08( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".DESCVAL[09]" ) ) { item.setDescval09( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".DESCVAL[10]" ) ) { item.setDescval10( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".DESCVAL[11]" ) ) { item.setDescval11( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".DESCVAL[12]" ) ) { item.setDescval12( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NOMBREL" ) ) { item.setNombrel( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".MONEDA_I" ) ) { item.setMoneda_i( (entry.getValue()) ); }

                
                
                if ( entry.getKey().endsWith( ".MENSAJES") ) { item.setMessage( entry.getValue() ); } 
            }
        }
        if ( item != null )
        {
            responseList.add( item );
        }
        log.trace("responseList: "+responseList);
        return responseList;
    }
}
