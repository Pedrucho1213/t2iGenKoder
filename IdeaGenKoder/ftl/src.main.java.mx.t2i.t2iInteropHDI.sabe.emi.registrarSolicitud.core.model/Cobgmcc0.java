package mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.core.model;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.springframework.stereotype.Component;

import mx.t2i.t2iInteropHDI.util.UtilFechaCore;

import java.util.Map;
import java.util.Map.Entry;


/**
 * <h4>Description:</h4>
 * Model para interfaz de webservice
 *
 */
@Component
public class Cobgmcc0 extends mx.t2i.tekhne.core.model.BaseInterfaceModel
{
	private static final long serialVersionUID = 1L;

	private static final Logger log = LoggerFactory.getLogger(Cobgmcc0.class);

	private Integer ndepend; // 2021-03-08 ATI: Como COBGMCC0 muestra una lista de todas las coberturas, se cargarán una vez a una lista TEMPORAL y cada Asegurado cargará las propias al mapear por NDEPEND
	private Integer cvcob;
	private Integer cvcobadi;
	private String nombrecob;
	private Integer limitemax;
	private Double deducible;
	private Double pmaanual;
	private Double epmaanual;
	private Integer edadcalc;
	private Integer pzoseg;
	private Integer pzopago;
	private Double sa;
	private Double coaseguro;
	private Date finivig;
	private Date ftervig;
	private Integer nivelhosp;
	private String nivelhosp_i;
	private Integer zonahosp;
	private String zonahosp_i;
	private Integer tpdeduc;
	private String tpdeduc_i;

	public Cobgmcc0()
    {
    	super();
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

	public Integer getCvcobadi() {
		return cvcobadi;
	}

	public void setCvcobadi(Integer cvcobadi) {
		this.cvcobadi = cvcobadi;
	}

	public String getNombrecob() {
		return nombrecob;
	}

	public void setNombrecob(String nombrecob) {
		this.nombrecob = nombrecob;
	}

	public Integer getLimitemax() {
		return limitemax;
	}

	public void setLimitemax(Integer limitemax) {
		this.limitemax = limitemax;
	}

	public Double getDeducible() {
		return deducible;
	}

	public void setDeducible(Double deducible) {
		this.deducible = deducible;
	}

	public Double getPmaanual() {
		return pmaanual;
	}

	public void setPmaanual(Double pmaanual) {
		this.pmaanual = pmaanual;
	}

	public Double getEpmaanual() {
		return epmaanual;
	}

	public void setEpmaanual(Double epmaanual) {
		this.epmaanual = epmaanual;
	}

	public Integer getEdadcalc() {
		return edadcalc;
	}

	public void setEdadcalc(Integer edadcalc) {
		this.edadcalc = edadcalc;
	}

	public Integer getPzoseg() {
		return pzoseg;
	}

	public void setPzoseg(Integer pzoseg) {
		this.pzoseg = pzoseg;
	}

	public Integer getPzopago() {
		return pzopago;
	}

	public void setPzopago(Integer pzopago) {
		this.pzopago = pzopago;
	}

	public Double getSa() {
		return sa;
	}

	public void setSa(Double sa) {
		this.sa = sa;
	}

	public Double getCoaseguro() {
		return coaseguro;
	}

	public void setCoaseguro(Double coaseguro) {
		this.coaseguro = coaseguro;
	}

	public Date getFinivig() {
		return finivig;
	}

	public void setFinivig(Date finivig) {
		this.finivig = finivig;
	}

	public Date getFtervig() {
		return ftervig;
	}

	public void setFtervig(Date ftervig) {
		this.ftervig = ftervig;
	}

	public Integer getNivelhosp() {
		return nivelhosp;
	}

	public void setNivelhosp(Integer nivelhosp) {
		this.nivelhosp = nivelhosp;
	}

	public String getNivelhosp_i() {
		return nivelhosp_i;
	}

	public void setNivelhosp_i(String nivelhosp_i) {
		this.nivelhosp_i = nivelhosp_i;
	}

	public Integer getZonahosp() {
		return zonahosp;
	}

	public void setZonahosp(Integer zonahosp) {
		this.zonahosp = zonahosp;
	}

	public String getZonahosp_i() {
		return zonahosp_i;
	}

	public void setZonahosp_i(String zonahosp_i) {
		this.zonahosp_i = zonahosp_i;
	}

	public Integer getTpdeduc() {
		return tpdeduc;
	}

	public void setTpdeduc(Integer tpdeduc) {
		this.tpdeduc = tpdeduc;
	}

	public String getTpdeduc_i() {
		return tpdeduc_i;
	}

	public void setTpdeduc_i(String tpdeduc_i) {
		this.tpdeduc_i = tpdeduc_i;
	}

	public void clear()
    {
    }

    public String toString()
    {
        StringBuilder r = new StringBuilder() ;
       
        r.append(super.toString())
        .append("ndepend=").append( ndepend ).append("&")
        .append("cvcob=").append( cvcob ).append("&")
        .append("cvcobadi=").append( cvcobadi ).append("&")
        .append("nombrecob=").append( nombrecob ).append("&")
        .append("limitemax=").append( limitemax ).append("&")
        .append("deducible=").append( deducible ).append("&")
        .append("pmaanual=").append( pmaanual ).append("&")
        .append("epmaanual=").append( epmaanual ).append("&")
        .append("edadcalc=").append( edadcalc ).append("&")
        .append("pzoseg=").append( pzoseg ).append("&")
        .append("pzopago=").append( pzopago ).append("&")
        .append("sa=").append( sa ).append("&")
        .append("coaseguro=").append( coaseguro ).append("&")
        .append("finivig=").append( finivig ).append("&")
        .append("ftervig=").append( ftervig ).append("&")
        .append("nivelhosp=").append( nivelhosp ).append("&")
        .append("nivelhosp_i=").append( nivelhosp_i ).append("&")
        .append("zonahosp=").append( zonahosp ).append("&")
        .append("zonahosp_i=").append( zonahosp_i ).append("&")
        .append("tpdeduc=").append( tpdeduc ).append("&")
        .append("tpdeduc_i=").append( tpdeduc_i ).append("&")
        ;
        return r.toString() ;
    }

    public boolean equals( Object obj )
    {
        boolean r = false;

        if ( obj == null ) return false;
        if ( ! ( obj instanceof Cobgmcc0 ) )  return false;

        final Cobgmcc0 other = ( Cobgmcc0 ) obj ;
        final EqualsBuilder equalsBuilder = new EqualsBuilder();

        equalsBuilder.append( this.getClass().getName() , other.getClass().getName() );

        equalsBuilder.append( ndepend , other.ndepend );
        equalsBuilder.append( cvcob , other.cvcob );
        equalsBuilder.append( cvcobadi , other.cvcobadi );
        equalsBuilder.append( nombrecob , other.nombrecob );
        equalsBuilder.append( limitemax , other.limitemax );
        equalsBuilder.append( deducible , other.deducible );
        equalsBuilder.append( pmaanual , other.pmaanual );
        equalsBuilder.append( epmaanual , other.epmaanual );
        equalsBuilder.append( edadcalc , other.edadcalc );
        equalsBuilder.append( pzoseg , other.pzoseg );
        equalsBuilder.append( pzopago , other.pzopago );
        equalsBuilder.append( sa , other.sa );
        equalsBuilder.append( coaseguro , other.coaseguro );
        equalsBuilder.append( finivig , other.finivig );
        equalsBuilder.append( ftervig , other.ftervig );
        equalsBuilder.append( nivelhosp , other.nivelhosp );
        equalsBuilder.append( nivelhosp_i , other.nivelhosp_i );
        equalsBuilder.append( zonahosp , other.zonahosp );
        equalsBuilder.append( zonahosp_i , other.zonahosp_i );
        equalsBuilder.append( tpdeduc , other.tpdeduc );
        equalsBuilder.append( tpdeduc_i , other.tpdeduc_i );

        r = equalsBuilder.isEquals() ;
        return r ;
    }

    public int hashCode()
    {
        final HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();

        hashCodeBuilder.append( this.getClass().getName() );

        hashCodeBuilder.append( ndepend );
        hashCodeBuilder.append( cvcob );
        hashCodeBuilder.append( cvcobadi );
        hashCodeBuilder.append( nombrecob );
        hashCodeBuilder.append( limitemax );
        hashCodeBuilder.append( deducible );
        hashCodeBuilder.append( pmaanual );
        hashCodeBuilder.append( epmaanual );
        hashCodeBuilder.append( edadcalc );
        hashCodeBuilder.append( pzoseg );
        hashCodeBuilder.append( pzopago );
        hashCodeBuilder.append( sa );
        hashCodeBuilder.append( coaseguro );
        hashCodeBuilder.append( finivig );
        hashCodeBuilder.append( ftervig );
        hashCodeBuilder.append( nivelhosp );
        hashCodeBuilder.append( nivelhosp_i );
        hashCodeBuilder.append( zonahosp );
        hashCodeBuilder.append( zonahosp_i );
        hashCodeBuilder.append( tpdeduc );
        hashCodeBuilder.append( tpdeduc_i );

        return hashCodeBuilder.toHashCode() ;
    }

    /* 2021-03-05 ati: No para objetos incrustados * /
    @Transient
    public Map<String, String> auxGetSearchFields()
    {
        Map<String, String> mappingFields = new LinkedHashMap<String, String>();
        mappingFields.put( "POLGMCC0.RAMSUBRAMO" , UtilTranslateModel.parseValue(""+ramsubramo, Integer.class) );
        log.debug("mappingFields: "+mappingFields);
        return mappingFields;
    }

    public Map<String, String> auxGetTransactionFields()
    {
        Map<String, String> mappingFields = new LinkedHashMap<String, String>();
        mappingFields.put( "POLGMCC0.RAMSUBRAMO" , UtilTranslateModel.parseValue(""+ramsubramo, Integer.class) );
        log.debug("mappingFields: "+mappingFields);
        return mappingFields;
    }
/ * 2021-03-05 ati: No para objetos incrustados */

    public Map<String, String> auxSetValuesFromMap( Map<String, String> mappingFields )
    {
        Object[] entries = mappingFields.entrySet().toArray();
        for ( int i = 0; i < entries.length; i++ )
        {
            @SuppressWarnings("unchecked")
			Entry< String, String > entry = (Entry< String, String >) entries[ i ];
            
            if ( entry.getKey().equals( "COBGMCC0.NDEPEND" ) ) { setNdepend( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "COBGMCC0.CVCOB" ) ) { setCvcob( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "COBGMCC0.CVCOBADI" ) ) { setCvcobadi( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "COBGMCC0.NOMBRECOB" ) ) { setNombrecob( (entry.getValue()) ); }
            if ( entry.getKey().equals( "COBGMCC0.LIMITEMAX" ) ) { setLimitemax( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "COBGMCC0.DEDUCIBLE" ) ) { setDeducible( Double.parseDouble(entry.getValue()) ); }
            if ( entry.getKey().equals( "COBGMCC0.PMAANUAL" ) ) { setPmaanual( Double.parseDouble(entry.getValue()) ); }
            if ( entry.getKey().equals( "COBGMCC0.EPMAANUAL" ) ) { setEpmaanual( Double.parseDouble(entry.getValue()) ); }
            if ( entry.getKey().equals( "COBGMCC0.EDADCALC" ) ) { setEdadcalc( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "COBGMCC0.PZOSEG" ) ) { setPzoseg( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "COBGMCC0.PZOPAGO" ) ) { setPzopago( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "COBGMCC0.SA" ) ) { setSa( Double.parseDouble(entry.getValue()) ); }
            if ( entry.getKey().equals( "COBGMCC0.COASEGURO" ) ) { setCoaseguro( Double.parseDouble(entry.getValue()) ); }
            if ( entry.getKey().equals( "COBGMCC0.FINIVIG" ) ) { setFinivig( UtilFechaCore.fromCoreValue(entry.getValue()) ); }
            if ( entry.getKey().equals( "COBGMCC0.FTERVIG" ) ) { setFtervig( UtilFechaCore.fromCoreValue(entry.getValue()) ); }
            if ( entry.getKey().equals( "COBGMCC0.NIVELHOSP" ) ) { setNivelhosp( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "COBGMCC0.NIVELHOSP_I" ) ) { setNivelhosp_i( (entry.getValue()) ); }
            if ( entry.getKey().equals( "COBGMCC0.ZONAHOSP" ) ) { setZonahosp( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "COBGMCC0.ZONAHOSP_I" ) ) { setZonahosp_i( (entry.getValue()) ); }
            if ( entry.getKey().equals( "COBGMCC0.TPDEDUC" ) ) { setTpdeduc( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "COBGMCC0.TPDEDUC_I" ) ) { setTpdeduc_i( (entry.getValue()) ); }

            if ( entry.getKey().equals( "COBGMCC0.MENSAJES"       ) ) { setMessage ( entry.getValue() ); }
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
    public static List< Cobgmcc0 > auxGetListFromCore( Map< String, String > mappingFields ) // 2021-03-07 ati: Hacer static para simplificar llamado
    {
        List< Cobgmcc0 > responseList = new ArrayList<Cobgmcc0  >();
        Object[ ] entries = mappingFields.entrySet().toArray();
        String locIndex = null;
        Cobgmcc0 item = null;
        for ( int i = 0; i < entries.length; i++ )
        {
            @SuppressWarnings("unchecked")
			Entry< String, String > entry = (Entry< String, String >) entries[ i ];
            //System.out.println("SYSOUT: " + (new Throwable().getStackTrace()[0].getMethodName() +" | entry.getKey(): " + entry.getKey() + "=["+entry.getValue()+"]")); 
            
            if ( entry.getKey().startsWith( "COBGMCC0[" ) )
            {
                if ( locIndex == null || !locIndex.equals( entry.getKey().substring( 0, entry.getKey().indexOf( "]" ) + 1 ) ) )
                {
                    if ( item != null )
                    {
                        responseList.add( item );
                    }
                    locIndex = entry.getKey().substring( 0, entry.getKey().indexOf( "]" ) + 1 );
                    item = new Cobgmcc0();
                }

                if ( entry.getKey().endsWith( ".NDEPEND" ) ) { item.setNdepend ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".CVCOB" ) ) { item.setCvcob ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".CVCOBADI" ) ) { item.setCvcobadi ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NOMBRECOB" ) ) { item.setNombrecob ( (entry.getValue()) ); }
//                if ( entry.getKey().endsWith( ".LIMITEMAX" ) ) { item.setLimitemax ( Integer.parseInt(entry.getValue()) ); }
                // 2021-03-08 ati: Si llega "" asuma 0
                if ( entry.getKey().endsWith( ".LIMITEMAX" ) ) {
                	if (entry.getValue().contentEquals(""))
                	{
                		item.setLimitemax ( Integer.parseInt("0") ); 
                	}
                	else
                	{
                		item.setLimitemax ( Integer.parseInt(entry.getValue()) ); 
                	}
                }
                if ( entry.getKey().endsWith( ".DEDUCIBLE" ) ) { item.setDeducible ( Double.parseDouble(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".PMAANUAL" ) ) { item.setPmaanual ( Double.parseDouble(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".EPMAANUAL" ) ) { item.setEpmaanual ( Double.parseDouble(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".EDADCALC" ) ) { item.setEdadcalc ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".PZOSEG" ) ) { item.setPzoseg ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".PZOPAGO" ) ) { item.setPzopago ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".SA" ) ) { item.setSa ( Double.parseDouble(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".COASEGURO" ) ) { item.setCoaseguro ( Double.parseDouble(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".FINIVIG" ) ) { item.setFinivig ( UtilFechaCore.fromCoreValue(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".FTERVIG" ) ) { item.setFtervig ( UtilFechaCore.fromCoreValue(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NIVELHOSP" ) ) { item.setNivelhosp ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NIVELHOSP_I" ) ) { item.setNivelhosp_i ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".ZONAHOSP" ) ) { item.setZonahosp ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".ZONAHOSP_I" ) ) { item.setZonahosp_i ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".TPDEDUC" ) ) { item.setTpdeduc ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".TPDEDUC_I" ) ) { item.setTpdeduc_i ( (entry.getValue()) ); }

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
