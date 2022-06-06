package mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.core.model;

import javax.persistence.*;

import java.util.List;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mx.t2i.t2iInteropHDI.util.UtilTranslateModel;

import java.util.Map;
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

	@Autowired
	private Polgmcc0Poliza polgmcc0Poliza;
	
	@Autowired
	private List<Polgmcc0Agente> polgmcc0Agentes;

	@Autowired
	private Polgmcc0Contratante polgmcc0Contratante;
	
	@Autowired
	private Polgmcc0ConductoCobro polgmcc0ConductoCobro;

	@Autowired
	private List<Asggmcc0> asggmcc0List;

	@Autowired
	private List<Rbogmcc0> rbogmcc0List;

	@Autowired
	private List<Endogmc0> endogmc0List;

	@Autowired
	private List<Cobgmcc0> cobgmcc0List; // 2021-03-08 ATI: Como COBGMCC0 muestra una lista de todas las coberturas, se cargarán una vez a una lista dentro de la póliza y cada Asegurado cargará las propias al mapear

	public Polgmcc0()
    {
    	super();

    	//2021-03-04 ati: No funciona @Autowired
    	polgmcc0Poliza = new Polgmcc0Poliza(); 
    	polgmcc0Agentes = new ArrayList<Polgmcc0Agente>();
    	polgmcc0Contratante = new Polgmcc0Contratante();
    	polgmcc0ConductoCobro = new Polgmcc0ConductoCobro();
    	asggmcc0List = new ArrayList<Asggmcc0>();
    	rbogmcc0List = new ArrayList<Rbogmcc0>();
    	endogmc0List = new ArrayList<Endogmc0>();
    	cobgmcc0List = new ArrayList<Cobgmcc0>();

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

    @Transient
    public Map<String, String> auxGetSearchFields()
    {
        Map<String, String> mappingFields = new LinkedHashMap<String, String>();
        mappingFields.put( "POLGMCC0.RAMSUBRAMO" , UtilTranslateModel.parseValue(""+polgmcc0Poliza.getRamsubramo(), Integer.class) );
        mappingFields.put( "POLGMCC0.NPOLIZA" , UtilTranslateModel.parseValue(""+polgmcc0Poliza.getNpoliza(), Integer.class) );
        mappingFields.put( "POLGMCC0.NSUBGPO" , UtilTranslateModel.parseValue(""+polgmcc0Poliza.getNsubgpo(), Integer.class) );
        mappingFields.put( "POLGMCC0.NASEG" , UtilTranslateModel.parseValue(""+polgmcc0Poliza.getNaseg(), String.class) );

        log.debug("mappingFields: "+mappingFields);
        return mappingFields;
    }

    public Map<String, String> auxGetTransactionFields()
    {
        Map<String, String> mappingFields = new LinkedHashMap<String, String>();
        mappingFields.put( "POLGMCC0.RAMSUBRAMO" , UtilTranslateModel.parseValue(""+polgmcc0Poliza.getRamsubramo(), Integer.class) );
        mappingFields.put( "POLGMCC0.NPOLIZA" , UtilTranslateModel.parseValue(""+polgmcc0Poliza.getNpoliza(), Integer.class) );
        mappingFields.put( "POLGMCC0.NSUBGPO" , UtilTranslateModel.parseValue(""+polgmcc0Poliza.getNsubgpo(), Integer.class) );
        mappingFields.put( "POLGMCC0.NASEG" , UtilTranslateModel.parseValue(""+polgmcc0Poliza.getNaseg(), String.class) );
        log.debug("mappingFields: "+mappingFields);
        return mappingFields;
    }

    public Map<String, String> auxSetValuesFromMap( Map<String, String> mappingFields ) throws Exception
    {
    	polgmcc0Poliza.auxSetValuesFromMap(mappingFields);
    	polgmcc0Agentes = Polgmcc0Agente.auxGetListFromCore(mappingFields);
    	polgmcc0Contratante.auxSetValuesFromMap(mappingFields);
    	polgmcc0ConductoCobro.auxSetValuesFromMap(mappingFields);
    	asggmcc0List = Asggmcc0.auxGetListFromCore(mappingFields);
    	rbogmcc0List = Rbogmcc0.auxGetListFromCore(mappingFields);
    	endogmc0List = Endogmc0.auxGetListFromCore(mappingFields);
    	cobgmcc0List = Cobgmcc0.auxGetListFromCore(mappingFields);

//    	log.debug("mappingFields: "+mappingFields); // 2021-03-05 ati: Se duplica con CoreDao.executeWorkerThread.TRACE ( 222)
        return mappingFields;
    }

    /**
     *
     * Armar una lista con los registros resultado de la consulta de cobol
     *
     */
    public List< Polgmcc0 > auxGetListFromCore( Map< String, String > mappingFields )
    {
    	List< Polgmcc0 > responseList = null;

    	//List< Polgmcc0Poliza > corePolizaList = polgmcc0Poliza.auxGetListFromCore(mappingFields);
    	
    	//2021-03-05 ati: ToDo: Completar Lista de Objetos Compuestos: No se trata de obtener listas de incrustados //
    	
        log.debug("mappingFields: "+mappingFields);
        log.debug("responseList: "+responseList);
        return responseList;
    }
}
