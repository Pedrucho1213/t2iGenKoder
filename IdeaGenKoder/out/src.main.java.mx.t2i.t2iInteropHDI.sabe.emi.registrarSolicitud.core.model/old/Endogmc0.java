package mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.core.model;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mx.t2i.t2iInteropHDI.util.UtilFechaCore;

import java.util.Map;
import java.util.Map.Entry;

import java.text.SimpleDateFormat;

/**
 * <h4>Description:</h4>
 * Model para interfaz de webservice
 *
 */
@Component
public class Endogmc0 extends mx.t2i.tekhne.core.model.BaseInterfaceModel
{
	private static final long serialVersionUID = 1L;

	private static final Logger log = LoggerFactory.getLogger(Endogmc0.class);

	private Integer folendoso;
	private Integer nendoso;
	private Integer stendoso;
	private String fstat;
	private Integer tpendoso;
	private String tpendoso_i;
	private Integer movendoso;
	private String movendoso_i;

	@Autowired
	private List<Cobgmcc0> cobgmcc0List;

	public Endogmc0()
    {
    	super();
    }

	public Integer getFolendoso() {
		return folendoso;
	}

	public void setFolendoso(Integer folendoso) {
		this.folendoso = folendoso;
	}

	public Integer getNendoso() {
		return nendoso;
	}

	public void setNendoso(Integer nendoso) {
		this.nendoso = nendoso;
	}

	public Integer getStendoso() {
		return stendoso;
	}

	public void setStendoso(Integer stendoso) {
		this.stendoso = stendoso;
	}

	public String getFstat() {
		return fstat;
	}

	public void setFstat(String fstat) {
		this.fstat = fstat;
	}

	public Integer getTpendoso() {
		return tpendoso;
	}

	public void setTpendoso(Integer tpendoso) {
		this.tpendoso = tpendoso;
	}

	public String getTpendoso_i() {
		return tpendoso_i;
	}

	public void setTpendoso_i(String tpendoso_i) {
		this.tpendoso_i = tpendoso_i;
	}

	public Integer getMovendoso() {
		return movendoso;
	}

	public void setMovendoso(Integer movendoso) {
		this.movendoso = movendoso;
	}

	public String getMovendoso_i() {
		return movendoso_i;
	}

	public void setMovendoso_i(String movendoso_i) {
		this.movendoso_i = movendoso_i;
	}

	public Date getFnac() {
		return fnac;
	}

	public void setFnac(Date fnac) {
		this.fnac = fnac;
	}

	public String getCvsexo_i() {
		return cvsexo_i;
	}

	public void setCvsexo_i(String cvsexo_i) {
		this.cvsexo_i = cvsexo_i;
	}

	public String getCvparent_i() {
		return cvparent_i;
	}

	public void setCvparent_i(String cvparent_i) {
		this.cvparent_i = cvparent_i;
	}

	public Integer getAntigseg() {
		return antigseg;
	}

	public void setAntigseg(Integer antigseg) {
		this.antigseg = antigseg;
	}

	public Integer getEdadreal() {
		return edadreal;
	}

	public void setEdadreal(Integer edadreal) {
		this.edadreal = edadreal;
	}

	public Integer getEdadcalc() {
		return edadcalc;
	}

	public void setEdadcalc(Integer edadcalc) {
		this.edadcalc = edadcalc;
	}

	public List<Cobgmcc0> getCobgmcc0List() {
		return cobgmcc0List;
	}

	public void setCobgmcc0List(List<Cobgmcc0> cobgmcc0List) {
		this.cobgmcc0List = cobgmcc0List;
	}

	public void clear()
    {
    }

    public String toString()
    {
        StringBuilder r = new StringBuilder() ;
       
        r.append(super.toString())
        .append("folendoso=").append( folendoso ).append("&")
        .append("nendoso=").append( nendoso ).append("&")
        .append("stendoso=").append( stendoso ).append("&")
        .append("fstat=").append( fstat ).append("&")
        .append("tpendoso=").append( tpendoso ).append("&")
        .append("tpendoso_i=").append( tpendoso_i ).append("&")
        .append("movendoso=").append( movendoso ).append("&")
        .append("movendoso_i=").append( movendoso_i ).append("&")

        ;
        return r.toString() ;
    }

    public boolean equals( Object obj )
    {
        boolean r = false;

        if ( obj == null ) return false;
        if ( ! ( obj instanceof Endogmc0 ) )  return false;

        final Endogmc0 other = ( Endogmc0 ) obj ;
        final EqualsBuilder equalsBuilder = new EqualsBuilder();

        equalsBuilder.append( this.getClass().getName() , other.getClass().getName() );

        equalsBuilder.append( folendoso , other.folendoso );
        equalsBuilder.append( nendoso , other.nendoso );
        equalsBuilder.append( stendoso , other.stendoso );
        equalsBuilder.append( fstat , other.fstat );
        equalsBuilder.append( tpendoso , other.tpendoso );
        equalsBuilder.append( tpendoso_i , other.tpendoso_i );
        equalsBuilder.append( movendoso , other.movendoso );
        equalsBuilder.append( movendoso_i , other.movendoso_i );

        r = equalsBuilder.isEquals() ;
        return r ;
    }

    public int hashCode()
    {
        final HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();

        hashCodeBuilder.append( this.getClass().getName() );

        hashCodeBuilder.append( folendoso );
        hashCodeBuilder.append( nendoso );
        hashCodeBuilder.append( stendoso );
        hashCodeBuilder.append( fstat );
        hashCodeBuilder.append( tpendoso );
        hashCodeBuilder.append( tpendoso_i );
        hashCodeBuilder.append( movendoso );
        hashCodeBuilder.append( movendoso_i );

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
            
            if ( entry.getKey().equals( "ASGGMCC0.NASEG" ) ) { setNaseg( (entry.getValue()) ); }
            if ( entry.getKey().equals( "ASGGMCC0.NDEPEND" ) ) { setNdepend( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "ASGGMCC0.NOMBRE" ) ) { setNombre( (entry.getValue()) ); }
            if ( entry.getKey().equals( "ASGGMCC0.FNAC" ) ) { setFnac( UtilFechaCore.fromCoreValue(entry.getValue()) ); }
            if ( entry.getKey().equals( "ASGGMCC0.CVSEXO_I" ) ) { setCvsexo_i( (entry.getValue()) ); }
            if ( entry.getKey().equals( "ASGGMCC0.CVPARENT_I" ) ) { setCvparent_i( (entry.getValue()) ); }
            if ( entry.getKey().equals( "ASGGMCC0.ANTIGSEG" ) ) { setAntigseg( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "ASGGMCC0.EDADREAL" ) ) { setEdadreal( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "ASGGMCC0.EDADCALC" ) ) { setEdadcalc( Integer.parseInt(entry.getValue()) ); }

            if ( entry.getKey().equals( "ASGGMCC0.MENSAJES"       ) ) { setMessage ( entry.getValue() ); }
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
    public static List< Endogmc0 > auxGetListFromCore( Map< String, String > mappingFields ) // 2021-03-07 ati: Hacer static para simplificar llamado
    {
        List< Endogmc0 > responseList = new ArrayList<Endogmc0  >();
        Object[ ] entries = mappingFields.entrySet().toArray();
        String locIndex = null;
        Endogmc0 item = null;
        for ( int i = 0; i < entries.length; i++ )
        {
            @SuppressWarnings("unchecked")
			Entry< String, String > entry = (Entry< String, String >) entries[ i ];
            //System.out.println("SYSOUT: " + (new Throwable().getStackTrace()[0].getMethodName() +" | entry.getKey(): " + entry.getKey() + "=["+entry.getValue()+"]")); 
            
            if ( entry.getKey().startsWith( "ASGGMCC0[" ) )
            {
                if ( locIndex == null || !locIndex.equals( entry.getKey().substring( 0, entry.getKey().indexOf( "]" ) + 1 ) ) )
                {
                    if ( item != null )
                    {
                        responseList.add( item );
                    }
                    locIndex = entry.getKey().substring( 0, entry.getKey().indexOf( "]" ) + 1 );
                    item = new Endogmc0();
                }

                if ( entry.getKey().endsWith( ".NASEG" ) ) { item.setNaseg ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NDEPEND" ) ) { item.setNdepend ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NOMBRE" ) ) { item.setNombre ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".FNAC" ) ) { item.setFnac ( UtilFechaCore.fromCoreValue(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".CVSEXO_I" ) ) { item.setCvsexo_i ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".CVPARENT_I" ) ) { item.setCvparent_i ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".ANTIGSEG" ) ) { item.setAntigseg ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".EDADREAL" ) ) { item.setEdadreal ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".EDADCALC" ) ) { item.setEdadcalc ( Integer.parseInt(entry.getValue()) ); }

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
