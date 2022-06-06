package mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.core.model;

import java.util.List;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.springframework.stereotype.Component;
import java.util.Map;
import java.util.Map.Entry;


/**
 * <h4>Description:</h4>
 * Model para interfaz de webservice
 *
 */
@Component
public class Polgmcc0ConductoCobro extends mx.t2i.tekhne.core.model.BaseInterfaceModel
{
	private static final long serialVersionUID = 1L;

	private static final Logger log = LoggerFactory.getLogger(Polgmcc0ConductoCobro.class);

	private String titcuenta;
	private String cvetarj;
	private Integer cvtdc;
	private String sucursal;
	private String tpconcob_i;
	private Integer tpcuenta;
	private String funcionari;
	private Integer aavto;
	private String mmvto; // 2021-03-05 ati+gti+zsb: Aunque es Entero, se lee como Cadena para mapear al String con que fue definido en wsModel.
	private String tpcuenta_i;
	
	public Polgmcc0ConductoCobro()
    {
    	super();
    }


	public String getTitcuenta() {
		return titcuenta;
	}


	public void setTitcuenta(String titcuenta) {
		this.titcuenta = titcuenta;
	}


	public String getCvetarj() {
		return cvetarj;
	}


	public void setCvetarj(String cvetarj) {
		this.cvetarj = cvetarj;
	}


	public Integer getCvtdc() {
		return cvtdc;
	}


	public void setCvtdc(Integer cvtdc) {
		this.cvtdc = cvtdc;
	}


	public String getSucursal() {
		return sucursal;
	}


	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}


	public String getTpconcob_i() {
		return tpconcob_i;
	}


	public void setTpconcob_i(String tpconcob_i) {
		this.tpconcob_i = tpconcob_i;
	}


	public Integer getTpcuenta() {
		return tpcuenta;
	}


	public void setTpcuenta(Integer tpcuenta) {
		this.tpcuenta = tpcuenta;
	}


	public String getFuncionari() {
		return funcionari;
	}


	public void setFuncionari(String funcionari) {
		this.funcionari = funcionari;
	}


	public Integer getAavto() {
		return aavto;
	}


	public void setAavto(Integer aavto) {
		this.aavto = aavto;
	}


	public String getMmvto() {
		return mmvto;
	}


	public void setMmvto(String mmvto) {
		this.mmvto = mmvto;
	}


	public String getTpcuenta_i() {
		return tpcuenta_i;
	}


	public void setTpcuenta_i(String tpcuenta_i) {
		this.tpcuenta_i = tpcuenta_i;
	}


	public void clear()
    {
    }

    public String toString()
    {
        StringBuilder r = new StringBuilder() ;
       
        r.append(super.toString())
        .append("titcuenta=").append( titcuenta ).append("&")
        .append("cvetarj=").append( cvetarj ).append("&")
        .append("cvtdc=").append( cvtdc ).append("&")
        .append("sucursal=").append( sucursal ).append("&")
        .append("tpconcob_i=").append( tpconcob_i ).append("&")
        .append("tpcuenta=").append( tpcuenta ).append("&")
        .append("funcionari=").append( funcionari ).append("&")
        .append("aavto=").append( aavto ).append("&")
        .append("mmvto=").append( mmvto ).append("&")
        .append("tpcuenta_i=").append( tpcuenta_i ).append("&")
        ;
        return r.toString() ;
    }

    public boolean equals( Object obj )
    {
        boolean r = false;

        if ( obj == null ) return false;
        if ( ! ( obj instanceof Polgmcc0ConductoCobro ) )  return false;

        final Polgmcc0ConductoCobro other = ( Polgmcc0ConductoCobro ) obj ;
        final EqualsBuilder equalsBuilder = new EqualsBuilder();

        equalsBuilder.append( this.getClass().getName() , other.getClass().getName() );

        equalsBuilder.append( titcuenta , other.titcuenta );
        equalsBuilder.append( cvetarj , other.cvetarj );
        equalsBuilder.append( cvtdc , other.cvtdc );
        equalsBuilder.append( sucursal , other.sucursal );
        equalsBuilder.append( tpconcob_i , other.tpconcob_i );
        equalsBuilder.append( tpcuenta , other.tpcuenta );
        equalsBuilder.append( funcionari , other.funcionari );
        equalsBuilder.append( aavto , other.aavto );
        equalsBuilder.append( mmvto , other.mmvto );
        equalsBuilder.append( tpcuenta_i , other.tpcuenta_i );

        r = equalsBuilder.isEquals() ;
        return r ;
    }

    public int hashCode()
    {
        final HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();

        hashCodeBuilder.append( this.getClass().getName() );

        hashCodeBuilder.append( titcuenta );
        hashCodeBuilder.append( cvetarj );
        hashCodeBuilder.append( cvtdc );
        hashCodeBuilder.append( sucursal );
        hashCodeBuilder.append( tpconcob_i );
        hashCodeBuilder.append( tpcuenta );
        hashCodeBuilder.append( funcionari );
        hashCodeBuilder.append( aavto );
        hashCodeBuilder.append( mmvto );
        hashCodeBuilder.append( tpcuenta_i );

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
            
            if ( entry.getKey().equals( "POLGMCC0.TITCUENTA" ) ) { setTitcuenta( (entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.CVETARJ" ) ) { setCvetarj( (entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.CVTDC" ) ) { setCvtdc( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.SUCURSAL" ) ) { setSucursal( (entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.TPCONCOB_I" ) ) { setTpconcob_i( (entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.TPCUENTA" ) ) { setTpcuenta( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.FUNCIONARI" ) ) { setFuncionari( (entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.AAVTO" ) ) { setAavto( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.MMVTO" ) ) { setMmvto( (entry.getValue()) ); } 
            if ( entry.getKey().equals( "POLGMCC0.TPCUENTA_I" ) ) { setTpcuenta_i( (entry.getValue()) ); }

            if ( entry.getKey().equals( "POLGMCC0.MENSAJES"       ) ) { setMessage ( entry.getValue() ); }
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
    public List< Polgmcc0ConductoCobro > auxGetListFromCore( Map< String, String > mappingFields )
    {
        List< Polgmcc0ConductoCobro > responseList = new ArrayList<Polgmcc0ConductoCobro  >();
        Object[ ] entries = mappingFields.entrySet().toArray();
        String locIndex = null;
        Polgmcc0ConductoCobro item = null;
        for ( int i = 0; i < entries.length; i++ )
        {
            @SuppressWarnings("unchecked")
			Entry< String, String > entry = (Entry< String, String >) entries[ i ];
            if ( entry.getKey().startsWith( "POLGMCC0[" ) )
            {
                if ( locIndex == null || !locIndex.equals( entry.getKey().substring( 0, entry.getKey().indexOf( "]" ) + 1 ) ) )
                {
                    if ( item != null )
                    {
                        responseList.add( item );
                    }
                    locIndex = entry.getKey().substring( 0, entry.getKey().indexOf( "]" ) + 1 );
                    item = new Polgmcc0ConductoCobro();
                }

                if ( entry.getKey().endsWith( ".TITCUENTA" ) ) { item.setTitcuenta ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".CVETARJ" ) ) { item.setCvetarj ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".CVTDC" ) ) { item.setCvtdc ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".SUCURSAL" ) ) { item.setSucursal ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".TPCONCOB_I" ) ) { item.setTpconcob_i ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".TPCUENTA" ) ) { item.setTpcuenta ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".FUNCIONARI" ) ) { item.setFuncionari ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".AAVTO" ) ) { item.setAavto ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".MMVTO" ) ) { item.setMmvto ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".TPCUENTA_I" ) ) { item.setTpcuenta_i( (entry.getValue()) ); }
                
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
