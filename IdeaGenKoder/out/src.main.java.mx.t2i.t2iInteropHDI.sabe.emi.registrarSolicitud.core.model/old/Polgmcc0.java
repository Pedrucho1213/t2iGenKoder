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

import javax.persistence.*;
import mx.t2i.t2iInteropHDI.util.UtilTranslateModel;
import java.util.LinkedHashMap;

/**
 * <h4>Description:</h4>
 * Model para interfaz de webservice
 *
 */
@Component
public class Polgmcc0 extends mx.t2i.tekhne.core.model.BaseInterfaceModel
{
	private static final long serialVersionUID = 1L;

	private static final Logger log = LoggerFactory.getLogger(Polgmcc0.class);

	private Polgmcc0Poliza polgmcc0Poliza;
	private List<Polgmcc0Agente> polgmcc0Agentes;
	private Polgmcc0Contratante polgmcc0Contratante;
	private Polgmcc0ConductoCobro polgmcc0ConductoCobro;
	private List<Asggmcc0> asggmcc0List;
	private List<Rbogmcc0> rbogmcc0List;
	private List<Endogmc0> endogmc0List;
	private List<Cobgmcc0> cobgmcc0List;

	@Autowired
	private List<Cobgmcc0> cobgmcc0List;

	public Polgmcc0()
    {
    	super();
    }

	public Polgmcc0Poliza getPolgmcc0Poliza() {
		return polgmcc0Poliza;
	}

	public void setPolgmcc0Poliza(Polgmcc0Poliza polgmcc0Poliza) {
		this.polgmcc0Poliza = polgmcc0Poliza;
	}

	public List<Polgmcc0Agente> getPolgmcc0Agentes() {
		return polgmcc0Agentes;
	}

	public void setPolgmcc0Agentes(List<Polgmcc0Agente> polgmcc0Agentes) {
		this.polgmcc0Agentes = polgmcc0Agentes;
	}

	public Polgmcc0Contratante getPolgmcc0Contratante() {
		return polgmcc0Contratante;
	}

	public void setPolgmcc0Contratante(Polgmcc0Contratante polgmcc0Contratante) {
		this.polgmcc0Contratante = polgmcc0Contratante;
	}

	public Polgmcc0ConductoCobro getPolgmcc0ConductoCobro() {
		return polgmcc0ConductoCobro;
	}

	public void setPolgmcc0ConductoCobro(Polgmcc0ConductoCobro polgmcc0ConductoCobro) {
		this.polgmcc0ConductoCobro = polgmcc0ConductoCobro;
	}

	public List<Asggmcc0> getAsggmcc0List() {
		return asggmcc0List;
	}

	public void setAsggmcc0List(List<Asggmcc0> asggmcc0List) {
		this.asggmcc0List = asggmcc0List;
	}

	public List<Rbogmcc0> getRbogmcc0List() {
		return rbogmcc0List;
	}

	public void setRbogmcc0List(List<Rbogmcc0> rbogmcc0List) {
		this.rbogmcc0List = rbogmcc0List;
	}

	public List<Endogmc0> getEndogmc0List() {
		return endogmc0List;
	}

	public void setEndogmc0List(List<Endogmc0> endogmc0List) {
		this.endogmc0List = endogmc0List;
	}

	public List<Cobgmcc0> getCobgmcc0List() {
		return cobgmcc0List;
	}

	public void setCobgmcc0List(List<Cobgmcc0> cobgmcc0List) {
		this.cobgmcc0List = cobgmcc0List;
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
        .append("polgmcc0Poliza=").append( polgmcc0Poliza ).append("&")
        .append("polgmcc0Agentes=").append( polgmcc0Agentes ).append("&")
        .append("polgmcc0Contratante=").append( polgmcc0Contratante ).append("&")
        .append("polgmcc0ConductoCobro=").append( polgmcc0ConductoCobro ).append("&")
        .append("asggmcc0List=").append( asggmcc0List ).append("&")
        .append("rbogmcc0List=").append( rbogmcc0List ).append("&")
        .append("endogmc0List=").append( endogmc0List ).append("&")
        .append("cobgmcc0List=").append( cobgmcc0List ).append("&")

        ;
        return r.toString() ;
    }

    public boolean equals( Object obj )
    {
        boolean r = false;

        if ( obj == null ) return false;
        if ( ! ( obj instanceof Polgmcc0 ) )  return false;

        final Polgmcc0 other = ( Polgmcc0 ) obj ;
        final EqualsBuilder equalsBuilder = new EqualsBuilder();

        equalsBuilder.append( this.getClass().getName() , other.getClass().getName() );

        equalsBuilder.append( polgmcc0Poliza , other.polgmcc0Poliza );
        equalsBuilder.append( polgmcc0Agentes , other.polgmcc0Agentes );
        equalsBuilder.append( polgmcc0Contratante , other.polgmcc0Contratante );
        equalsBuilder.append( polgmcc0ConductoCobro , other.polgmcc0ConductoCobro );
        equalsBuilder.append( asggmcc0List , other.asggmcc0List );
        equalsBuilder.append( rbogmcc0List , other.rbogmcc0List );
        equalsBuilder.append( endogmc0List , other.endogmc0List );
        equalsBuilder.append( cobgmcc0List , other.cobgmcc0List );

        r = equalsBuilder.isEquals() ;
        return r ;
    }

    public int hashCode()
    {
        final HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();

        hashCodeBuilder.append( this.getClass().getName() );

        hashCodeBuilder.append( polgmcc0Poliza );
        hashCodeBuilder.append( polgmcc0Agentes );
        hashCodeBuilder.append( polgmcc0Contratante );
        hashCodeBuilder.append( polgmcc0ConductoCobro );
        hashCodeBuilder.append( asggmcc0List );
        hashCodeBuilder.append( rbogmcc0List );
        hashCodeBuilder.append( endogmc0List );
        hashCodeBuilder.append( cobgmcc0List );

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
    public static List< Polgmcc0 > auxGetListFromCore( Map< String, String > mappingFields ) // 2021-03-07 ati: Hacer static para simplificar llamado
    {
        List< Polgmcc0 > responseList = new ArrayList<Polgmcc0  >();
        Object[ ] entries = mappingFields.entrySet().toArray();
        String locIndex = null;
        Polgmcc0 item = null;
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
                    item = new Polgmcc0();
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
