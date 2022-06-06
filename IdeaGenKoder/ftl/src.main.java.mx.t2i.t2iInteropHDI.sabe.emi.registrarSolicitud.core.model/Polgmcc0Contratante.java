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
public class Polgmcc0Contratante extends mx.t2i.tekhne.core.model.BaseInterfaceModel
{
	private static final long serialVersionUID = 1L;

	private static final Logger log = LoggerFactory.getLogger(Polgmcc0Contratante.class);

	private String contrat;
	private String cvcontrat_i;
	private String rfc;
	private String email;
	private String calle;
	private String numext;
	private String numint;
	private String colonia;
	private String poblacion;
	private Integer codpost;
	private Integer edo;
	private String edo_i;
	private String referencia;

	public Polgmcc0Contratante()
    {
    	super();
    }

	public String getContrat() {
		return contrat;
	}

	public void setContrat(String contrat) {
		this.contrat = contrat;
	}

	public String getCvcontrat_i() {
		return cvcontrat_i;
	}

	public void setCvcontrat_i(String cvcontrat_i) {
		this.cvcontrat_i = cvcontrat_i;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumext() {
		return numext;
	}

	public void setNumext(String numext) {
		this.numext = numext;
	}

	public String getNumint() {
		return numint;
	}

	public void setNumint(String numint) {
		this.numint = numint;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public Integer getCodpost() {
		return codpost;
	}

	public void setCodpost(Integer codpost) {
		this.codpost = codpost;
	}

	public Integer getEdo() {
		return edo;
	}

	public void setEdo(Integer edo) {
		this.edo = edo;
	}

	public String getEdo_i() {
		return edo_i;
	}

	public void setEdo_i(String edo_i) {
		this.edo_i = edo_i;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public void clear()
    {
    }

    public String toString()
    {
        StringBuilder r = new StringBuilder() ;
       
        r.append(super.toString())
        .append("contrat=").append( contrat ).append("&")
        .append("cvcontrat_i=").append( cvcontrat_i ).append("&")
        .append("rfc=").append( rfc ).append("&")
        .append("email=").append( email ).append("&")
        .append("calle=").append( calle ).append("&")
        .append("numext=").append( numext ).append("&")
        .append("numint=").append( numint ).append("&")
        .append("colonia=").append( colonia ).append("&")
        .append("poblacion=").append( poblacion ).append("&")
        .append("codpost=").append( codpost ).append("&")
        .append("edo=").append( edo ).append("&")
        .append("edo_i=").append( edo_i ).append("&")
        .append("referencia=").append( referencia ).append("&")
        ;
        return r.toString() ;
    }

    public boolean equals( Object obj )
    {
        boolean r = false;

        if ( obj == null ) return false;
        if ( ! ( obj instanceof Polgmcc0Contratante ) )  return false;

        final Polgmcc0Contratante other = ( Polgmcc0Contratante ) obj ;
        final EqualsBuilder equalsBuilder = new EqualsBuilder();

        equalsBuilder.append( this.getClass().getName() , other.getClass().getName() );

        equalsBuilder.append( contrat , other.contrat );
        equalsBuilder.append( cvcontrat_i , other.cvcontrat_i );
        equalsBuilder.append( rfc , other.rfc );
        equalsBuilder.append( email , other.email );
        equalsBuilder.append( calle , other.calle );
        equalsBuilder.append( numext , other.numext );
        equalsBuilder.append( numint , other.numint );
        equalsBuilder.append( colonia , other.colonia );
        equalsBuilder.append( poblacion , other.poblacion );
        equalsBuilder.append( codpost , other.codpost );
        equalsBuilder.append( edo , other.edo );
        equalsBuilder.append( edo_i , other.edo_i );
        equalsBuilder.append( referencia , other.referencia );

        r = equalsBuilder.isEquals() ;
        return r ;
    }

    public int hashCode()
    {
        final HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();

        hashCodeBuilder.append( this.getClass().getName() );

        hashCodeBuilder.append( contrat );
        hashCodeBuilder.append( cvcontrat_i );
        hashCodeBuilder.append( rfc );
        hashCodeBuilder.append( email );
        hashCodeBuilder.append( calle );
        hashCodeBuilder.append( numext );
        hashCodeBuilder.append( numint );
        hashCodeBuilder.append( colonia );
        hashCodeBuilder.append( poblacion );
        hashCodeBuilder.append( codpost );
        hashCodeBuilder.append( edo );
        hashCodeBuilder.append( edo_i );
        hashCodeBuilder.append( referencia );

        return hashCodeBuilder.toHashCode() ;
    }

/* 2021-03-05 ati: No para objetos incrustados * /
    @Transient
    public Map<String, String> auxGetSearchFields()
    {
        Map<String, String> mappingFields = new LinkedHashMap<String, String>();
        mappingFields.put( "POLGMCC0.RAMSUBRAMO" , UtilTranslateModel.parseValue(""+ramsubramo, Integer.class) );
        mappingFields.put( "POLGMCC0.NPOLIZA" , UtilTranslateModel.parseValue(""+npoliza, Integer.class) );
        mappingFields.put( "POLGMCC0.NSUBGPO" , UtilTranslateModel.parseValue(""+nsubgpo, Integer.class) );
        mappingFields.put( "POLGMCC0.NASEG" , UtilTranslateModel.parseValue(""+naseg, String.class) );
        log.debug("mappingFields: "+mappingFields);
        return mappingFields;
    }

    public Map<String, String> auxGetTransactionFields()
    {
        Map<String, String> mappingFields = new LinkedHashMap<String, String>();
        mappingFields.put( "POLGMCC0.RAMSUBRAMO" , UtilTranslateModel.parseValue(""+ramsubramo, Integer.class) );
        mappingFields.put( "POLGMCC0.NPOLIZA" , UtilTranslateModel.parseValue(""+npoliza, Integer.class) );
        mappingFields.put( "POLGMCC0.NSUBGPO" , UtilTranslateModel.parseValue(""+nsubgpo, Integer.class) );
        mappingFields.put( "POLGMCC0.NASEG" , UtilTranslateModel.parseValue(""+naseg, String.class) );
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
            
            if ( entry.getKey().equals( "POLGMCC0.CONTRAT" ) ) { setContrat( (entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.CVCONTRAT_I" ) ) { setCvcontrat_i( (entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.RFC" ) ) { setRfc( (entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.EMAIL" ) ) { setEmail( (entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.CALLE" ) ) { setCalle( (entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.NUMEXT" ) ) { setNumext( (entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.NUMINT" ) ) { setNumint( (entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.COLONIA" ) ) { setColonia( (entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.POBLACION" ) ) { setPoblacion( (entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.CODPOST" ) ) { setCodpost( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.EDO" ) ) { setEdo( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.EDO_I" ) ) { setEdo_i( (entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.REFERENCIA" ) ) { setReferencia( (entry.getValue()) ); }

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
    public List< Polgmcc0Contratante > auxGetListFromCore( Map< String, String > mappingFields )
    {
        List< Polgmcc0Contratante > responseList = new ArrayList<Polgmcc0Contratante  >();
        Object[ ] entries = mappingFields.entrySet().toArray();
        String locIndex = null;
        Polgmcc0Contratante item = null;
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
                    item = new Polgmcc0Contratante();
                }

                if ( entry.getKey().endsWith( ".CONTRAT" ) ) { item.setContrat ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".CVCONTRAT_I" ) ) { item.setCvcontrat_i ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".RFC" ) ) { item.setRfc ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".EMAIL" ) ) { item.setEmail ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".CALLE" ) ) { item.setCalle ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NUMEXT" ) ) { item.setNumext ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NUMINT" ) ) { item.setNumint ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".COLONIA" ) ) { item.setColonia ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".POBLACION" ) ) { item.setPoblacion ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".CODPOST" ) ) { item.setCodpost ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".EDO" ) ) { item.setEdo ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".EDO_I" ) ) { item.setEdo_i ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".REFERENCIA" ) ) { item.setReferencia ( (entry.getValue()) ); }

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
