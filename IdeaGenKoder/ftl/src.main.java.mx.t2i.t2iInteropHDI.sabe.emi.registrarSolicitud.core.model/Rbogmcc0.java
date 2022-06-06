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
public class Rbogmcc0 extends mx.t2i.tekhne.core.model.BaseInterfaceModel
{
	private static final long serialVersionUID = 1L;

	private static final Logger log = LoggerFactory.getLogger(Rbogmcc0.class);

	private Integer foliorbo;
	private Date femirbo;
	private Date fpago;
	private Integer tprbo;
	private Integer strbo;
	private Date fstat;
	private String strbo_i;
	private Double pma;
	private Double rgo;
	private Double gexp;
	private Date finivig;
	private Date ftervig;
	private Double pmatotal;
	private Double comag;
	private Double impto;


	public Rbogmcc0()
    {
    	super();
    }


	public Integer getFoliorbo() {
		return foliorbo;
	}



	public void setFoliorbo(Integer foliorbo) {
		this.foliorbo = foliorbo;
	}



	public Date getFemirbo() {
		return femirbo;
	}



	public void setFemirbo(Date femirbo) {
		this.femirbo = femirbo;
	}



	public Date getFpago() {
		return fpago;
	}



	public void setFpago(Date fpago) {
		this.fpago = fpago;
	}



	public Integer getTprbo() {
		return tprbo;
	}



	public void setTprbo(Integer tprbo) {
		this.tprbo = tprbo;
	}



	public Integer getStrbo() {
		return strbo;
	}



	public void setStrbo(Integer strbo) {
		this.strbo = strbo;
	}



	public Date getFstat() {
		return fstat;
	}



	public void setFstat(Date fstat) {
		this.fstat = fstat;
	}



	public String getStrbo_i() {
		return strbo_i;
	}



	public void setStrbo_i(String strbo_i) {
		this.strbo_i = strbo_i;
	}



	public Double getPma() {
		return pma;
	}



	public void setPma(Double pma) {
		this.pma = pma;
	}



	public Double getRgo() {
		return rgo;
	}



	public void setRgo(Double rgo) {
		this.rgo = rgo;
	}



	public Double getGexp() {
		return gexp;
	}



	public void setGexp(Double gexp) {
		this.gexp = gexp;
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



	public Double getPmatotal() {
		return pmatotal;
	}



	public void setPmatotal(Double pmatotal) {
		this.pmatotal = pmatotal;
	}



	public Double getComag() {
		return comag;
	}



	public void setComag(Double comag) {
		this.comag = comag;
	}



	public Double getImpto() {
		return impto;
	}



	public void setImpto(Double impto) {
		this.impto = impto;
	}


	public void clear()
    {
    }

    public String toString()
    {
        StringBuilder r = new StringBuilder() ;
       
        r.append(super.toString())
        .append("foliorbo=").append( foliorbo ).append("&")
        .append("femirbo=").append( femirbo ).append("&")
        .append("fpago=").append( fpago ).append("&")
        .append("tprbo=").append( tprbo ).append("&")
        .append("strbo=").append( strbo ).append("&")
        .append("fstat=").append( fstat ).append("&")
        .append("strbo_i=").append( strbo_i ).append("&")
        .append("pma=").append( pma ).append("&")
        .append("rgo=").append( rgo ).append("&")
        .append("gexp=").append( gexp ).append("&")
        .append("finivig=").append( finivig ).append("&")
        .append("ftervig=").append( ftervig ).append("&")
        .append("pmatotal=").append( pmatotal ).append("&")
        .append("comag=").append( comag ).append("&")
        .append("impto=").append( impto ).append("&")
        ;
        return r.toString() ;
    }

    public boolean equals( Object obj )
    {
        boolean r = false;

        if ( obj == null ) return false;
        if ( ! ( obj instanceof Rbogmcc0 ) )  return false;

        final Rbogmcc0 other = ( Rbogmcc0 ) obj ;
        final EqualsBuilder equalsBuilder = new EqualsBuilder();

        equalsBuilder.append( this.getClass().getName() , other.getClass().getName() );

        equalsBuilder.append( foliorbo , other.foliorbo );
        equalsBuilder.append( femirbo , other.femirbo );
        equalsBuilder.append( fpago , other.fpago );
        equalsBuilder.append( tprbo , other.tprbo );
        equalsBuilder.append( strbo , other.strbo );
        equalsBuilder.append( fstat , other.fstat );
        equalsBuilder.append( strbo_i , other.strbo_i );
        equalsBuilder.append( pma , other.pma );
        equalsBuilder.append( rgo , other.rgo );
        equalsBuilder.append( gexp , other.gexp );
        equalsBuilder.append( finivig , other.finivig );
        equalsBuilder.append( ftervig , other.ftervig );
        equalsBuilder.append( pmatotal , other.pmatotal );
        equalsBuilder.append( comag , other.comag );
        equalsBuilder.append( impto , other.impto );

        r = equalsBuilder.isEquals() ;
        return r ;
    }

    public int hashCode()
    {
        final HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();

        hashCodeBuilder.append( this.getClass().getName() );

        hashCodeBuilder.append( foliorbo );
        hashCodeBuilder.append( femirbo );
        hashCodeBuilder.append( fpago );
        hashCodeBuilder.append( tprbo );
        hashCodeBuilder.append( strbo );
        hashCodeBuilder.append( fstat );
        hashCodeBuilder.append( strbo_i );
        hashCodeBuilder.append( pma );
        hashCodeBuilder.append( rgo );
        hashCodeBuilder.append( gexp );
        hashCodeBuilder.append( finivig );
        hashCodeBuilder.append( ftervig );
        hashCodeBuilder.append( pmatotal );
        hashCodeBuilder.append( comag );
        hashCodeBuilder.append( impto );

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
            
            if ( entry.getKey().equals( "RBOGMCC0.FOLIORBO" ) ) { setFoliorbo( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "RBOGMCC0.FEMIRBO" ) ) { setFemirbo( UtilFechaCore.fromCoreValue(entry.getValue()) ); }
            if ( entry.getKey().equals( "RBOGMCC0.FPAGO" ) ) { setFpago( UtilFechaCore.fromCoreValue(entry.getValue()) ); }
            if ( entry.getKey().equals( "RBOGMCC0.TPRBO" ) ) { setTprbo( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "RBOGMCC0.STRBO" ) ) { setStrbo( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "RBOGMCC0.FSTAT" ) ) { setFstat( UtilFechaCore.fromCoreValue(entry.getValue()) ); }
            if ( entry.getKey().equals( "RBOGMCC0.STRBO_I" ) ) { setStrbo_i( (entry.getValue()) ); }
            if ( entry.getKey().equals( "RBOGMCC0.PMA" ) ) { setPma( Double.parseDouble(entry.getValue()) ); }
            if ( entry.getKey().equals( "RBOGMCC0.RGO" ) ) { setRgo( Double.parseDouble(entry.getValue()) ); }
            if ( entry.getKey().equals( "RBOGMCC0.GEXP" ) ) { setGexp( Double.parseDouble(entry.getValue()) ); }
            if ( entry.getKey().equals( "RBOGMCC0.FINIVIG" ) ) { setFinivig( UtilFechaCore.fromCoreValue(entry.getValue()) ); }
            if ( entry.getKey().equals( "RBOGMCC0.FTERVIG" ) ) { setFtervig( UtilFechaCore.fromCoreValue(entry.getValue()) ); }
            if ( entry.getKey().equals( "RBOGMCC0.PMATOTAL" ) ) { setPmatotal( Double.parseDouble(entry.getValue()) ); }
            if ( entry.getKey().equals( "RBOGMCC0.COMAG" ) ) { setComag( Double.parseDouble(entry.getValue()) ); }
            if ( entry.getKey().equals( "RBOGMCC0.IMPTO" ) ) { setImpto( Double.parseDouble(entry.getValue()) ); }

            if ( entry.getKey().equals( "RBOGMCC0.MENSAJES"       ) ) { setMessage ( entry.getValue() ); }
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
    public static List< Rbogmcc0 > auxGetListFromCore( Map< String, String > mappingFields ) // 2021-03-07 ati: Hacer static para simplificar llamado
    {
        List< Rbogmcc0 > responseList = new ArrayList<Rbogmcc0  >();
        Object[ ] entries = mappingFields.entrySet().toArray();
        String locIndex = null;
        Rbogmcc0 item = null;
        for ( int i = 0; i < entries.length; i++ )
        {
            @SuppressWarnings("unchecked")
			Entry< String, String > entry = (Entry< String, String >) entries[ i ];
            //System.out.println("SYSOUT: " + (new Throwable().getStackTrace()[0].getMethodName() +" | entry.getKey(): " + entry.getKey() + "=["+entry.getValue()+"]")); 
            
            if ( entry.getKey().startsWith( "RBOGMCC0[" ) )
            {
                if ( locIndex == null || !locIndex.equals( entry.getKey().substring( 0, entry.getKey().indexOf( "]" ) + 1 ) ) )
                {
                    if ( item != null )
                    {
                        responseList.add( item );
                    }
                    locIndex = entry.getKey().substring( 0, entry.getKey().indexOf( "]" ) + 1 );
                    item = new Rbogmcc0();
                }

                if ( entry.getKey().endsWith( ".FOLIORBO" ) ) { item.setFoliorbo ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".FEMIRBO" ) ) { item.setFemirbo ( UtilFechaCore.fromCoreValue(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".FPAGO" ) ) { item.setFpago ( UtilFechaCore.fromCoreValue(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".TPRBO" ) ) { item.setTprbo ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".STRBO" ) ) { item.setStrbo ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".FSTAT" ) ) { item.setFstat ( UtilFechaCore.fromCoreValue(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".STRBO_I" ) ) { item.setStrbo_i ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".PMA" ) ) { item.setPma ( Double.parseDouble(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".RGO" ) ) { item.setRgo ( Double.parseDouble(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".GEXP" ) ) { item.setGexp ( Double.parseDouble(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".FINIVIG" ) ) { item.setFinivig ( UtilFechaCore.fromCoreValue(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".FTERVIG" ) ) { item.setFtervig ( UtilFechaCore.fromCoreValue(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".PMATOTAL" ) ) { item.setPmatotal ( Double.parseDouble(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".COMAG" ) ) { item.setComag ( Double.parseDouble(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".IMPTO" ) ) { item.setImpto ( Double.parseDouble(entry.getValue()) ); }

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
