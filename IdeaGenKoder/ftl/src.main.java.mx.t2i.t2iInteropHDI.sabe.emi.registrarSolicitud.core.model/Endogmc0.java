package mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.core.model;

import java.util.List;
import java.text.SimpleDateFormat;
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

	public Endogmc0() {
		super();
		// TODO Auto-generated constructor stub
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
            
            if ( entry.getKey().equals( "ENDOGMC0.FOLENDOSO" ) ) { setFolendoso( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "ENDOGMC0.NENDOSO" ) ) { setNendoso( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "ENDOGMC0.STENDOSO" ) ) { setStendoso( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "ENDOGMC0.FSTAT" ) ) { setFstat( (entry.getValue()) ); }
            if ( entry.getKey().equals( "ENDOGMC0.TPENDOSO" ) ) { setTpendoso( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "ENDOGMC0.TPENDOSO_I" ) ) { setTpendoso_i( (entry.getValue()) ); }
            if ( entry.getKey().equals( "ENDOGMC0.MOVENDOSO" ) ) { setMovendoso( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "ENDOGMC0.MOVENDOSO_I" ) ) { setMovendoso_i( (entry.getValue()) ); }

            if ( entry.getKey().equals( "ENDOGMC0.MENSAJES"       ) ) { setMessage ( entry.getValue() ); }
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
            
            if ( entry.getKey().startsWith( "ENDOGMC0[" ) )
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

                if ( entry.getKey().endsWith( ".FOLENDOSO" ) ) { item.setFolendoso ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NENDOSO" ) ) { item.setNendoso ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".STENDOSO" ) ) { item.setStendoso ( Integer.parseInt(entry.getValue()) ); }
                // 2021-03-05 ati+zsb+gti: Acordamos arreglar en mapeo de Java porque se ha definido tipo String en lugar de Date y ya no se puede cambiar el wsModel liberado como Dummy.
                if ( entry.getKey().endsWith( ".FSTAT" ) ) 
                {
                	Date date = UtilFechaCore.fromCoreValue(entry.getValue());
                	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                	String fechaStr = format.format(date);
                	item.setFstat ( fechaStr ); 
                } 
                if ( entry.getKey().endsWith( ".TPENDOSO" ) ) { item.setTpendoso ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".TPENDOSO_I" ) ) { item.setTpendoso_i ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".MOVENDOSO" ) ) { item.setMovendoso ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".MOVENDOSO_I" ) ) { item.setMovendoso_i ( (entry.getValue()) ); }

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
