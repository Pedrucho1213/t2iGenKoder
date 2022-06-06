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


/**
 * <h4>Description:</h4>
 * Model para interfaz de webservice
 *
 */
@Component
public class Asggmcc0 extends mx.t2i.tekhne.core.model.BaseInterfaceModel
{
	private static final long serialVersionUID = 1L;

	private static final Logger log = LoggerFactory.getLogger(Asggmcc0.class);

	private String naseg;
	private Integer ndepend;
	private String nombre;
	private Date fnac;
	private String cvsexo_i;
	private String cvparent_i;
	private Integer antigseg;
	private Integer edadreal;
	private Integer edadcalc;

	@Autowired
	private List<Cobgmcc0> cobgmcc0List;

	public Asggmcc0()
    {
    	super();
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
        .append("naseg=").append( naseg ).append("&")
        .append("ndepend=").append( ndepend ).append("&")
        .append("nombre=").append( nombre ).append("&")
        .append("fnac=").append( fnac ).append("&")
        .append("cvsexo_i=").append( cvsexo_i ).append("&")
        .append("cvparent_i=").append( cvparent_i ).append("&")
        .append("antigseg=").append( antigseg ).append("&")
        .append("edadreal=").append( edadreal ).append("&")
        .append("edadcalc=").append( edadcalc ).append("&")

        ;
        return r.toString() ;
    }

    public boolean equals( Object obj )
    {
        boolean r = false;

        if ( obj == null ) return false;
        if ( ! ( obj instanceof Asggmcc0 ) )  return false;

        final Asggmcc0 other = ( Asggmcc0 ) obj ;
        final EqualsBuilder equalsBuilder = new EqualsBuilder();

        equalsBuilder.append( this.getClass().getName() , other.getClass().getName() );

        equalsBuilder.append( naseg , other.naseg );
        equalsBuilder.append( ndepend , other.ndepend );
        equalsBuilder.append( nombre , other.nombre );
        equalsBuilder.append( fnac , other.fnac );
        equalsBuilder.append( cvsexo_i , other.cvsexo_i );
        equalsBuilder.append( cvparent_i , other.cvparent_i );
        equalsBuilder.append( antigseg , other.antigseg );
        equalsBuilder.append( edadreal , other.edadreal );
        equalsBuilder.append( edadcalc , other.edadcalc );

        r = equalsBuilder.isEquals() ;
        return r ;
    }

    public int hashCode()
    {
        final HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();

        hashCodeBuilder.append( this.getClass().getName() );

        hashCodeBuilder.append( naseg );
        hashCodeBuilder.append( ndepend );
        hashCodeBuilder.append( nombre );
        hashCodeBuilder.append( fnac );
        hashCodeBuilder.append( cvsexo_i );
        hashCodeBuilder.append( cvparent_i );
        hashCodeBuilder.append( antigseg );
        hashCodeBuilder.append( edadreal );
        hashCodeBuilder.append( edadcalc );
        
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
    public static List< Asggmcc0 > auxGetListFromCore( Map< String, String > mappingFields ) // 2021-03-07 ati: Hacer static para simplificar llamado
    {
        List< Asggmcc0 > responseList = new ArrayList<Asggmcc0  >();
        Object[ ] entries = mappingFields.entrySet().toArray();
        String locIndex = null;
        Asggmcc0 item = null;
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
                    item = new Asggmcc0();
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
