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
public class Polgmcc0Agente extends mx.t2i.tekhne.core.model.BaseInterfaceModel
{
	private static final long serialVersionUID = 1L;

	private static final Logger log = LoggerFactory.getLogger(Polgmcc0Agente.class);

	private Integer nagente;
	private String nombagte;
	private Double porcpart;

	public Polgmcc0Agente()
    {
    	super();
    }



	public Integer getNagente() {
		return nagente;
	}



	public void setNagente(Integer nagente) {
		this.nagente = nagente;
	}



	public String getNombagte() {
		return nombagte;
	}



	public void setNombagte(String nombagte) {
		this.nombagte = nombagte;
	}



	public Double getPorcpart() {
		return porcpart;
	}



	public void setPorcpart(Double porcpart) {
		this.porcpart = porcpart;
	}



	public void clear()
    {
    }

    public String toString()
    {
        StringBuilder r = new StringBuilder() ;
       
        r.append(super.toString())
        .append("nagente=").append( nagente ).append("&")
        .append("nombagte=").append( nombagte ).append("&")
        .append("porcpart=").append( porcpart ).append("&")
        ;
        return r.toString() ;
    }

    public boolean equals( Object obj )
    {
        boolean r = false;

        if ( obj == null ) return false;
        if ( ! ( obj instanceof Polgmcc0Agente ) )  return false;

        final Polgmcc0Agente other = ( Polgmcc0Agente ) obj ;
        final EqualsBuilder equalsBuilder = new EqualsBuilder();

        equalsBuilder.append( this.getClass().getName() , other.getClass().getName() );

        equalsBuilder.append( nagente , other.nagente );
        equalsBuilder.append( nombagte , other.nombagte );
        equalsBuilder.append( porcpart , other.porcpart );

        r = equalsBuilder.isEquals() ;
        return r ;
    }

    public int hashCode()
    {
        final HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();

        hashCodeBuilder.append( this.getClass().getName() );

        hashCodeBuilder.append( nagente );
        hashCodeBuilder.append( nombagte );
        hashCodeBuilder.append( porcpart );

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
            
            if ( entry.getKey().equals( "POLGMCC0.NAGENTE" ) ) { setNagente( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.NOMBAGTE" ) ) { setNombagte( (entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.PORCPART" ) ) { setPorcpart( Double.parseDouble(entry.getValue()) ); }

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
    public static List< Polgmcc0Agente > auxGetListFromCore( Map< String, String > mappingFields ) // 2021-03-07 ati: Hacer static para simplificar llamado
    {
        List< Polgmcc0Agente > responseList = new ArrayList<Polgmcc0Agente  >();
        Object[ ] entries = mappingFields.entrySet().toArray();
        String locIndex = null;
        Polgmcc0Agente item = null;
        for ( int i = 0; i < entries.length; i++ )
        {
            @SuppressWarnings("unchecked")
			Entry< String, String > entry = (Entry< String, String >) entries[ i ];
            if ( entry.getKey().startsWith( "POLGMCC0.AGENTE[" ) )
            {
                if ( locIndex == null || !locIndex.equals( entry.getKey().substring( 0, entry.getKey().indexOf( "]" ) + 1 ) ) )
                {
                    if ( item != null )
                    {
                        responseList.add( item );
                    }
                    locIndex = entry.getKey().substring( 0, entry.getKey().indexOf( "]" ) + 1 );
                    item = new Polgmcc0Agente();
                }

                if ( entry.getKey().endsWith( ".NAGENTE" ) ) { item.setNagente ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NOMBAGTE" ) ) { item.setNombagte ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".PORCPART" ) ) { item.setPorcpart ( Double.parseDouble(entry.getValue()) ); }

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
