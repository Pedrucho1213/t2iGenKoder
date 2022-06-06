package mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.core.model;

import java.util.List;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.springframework.stereotype.Component;

import mx.t2i.t2iInteropHDI.util.UtilFechaCore;

import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;


/**
 * <h4>Description:</h4>
 * Model para interfaz de webservice
 *
 */
@Component
public class Polgmcc0Poliza extends mx.t2i.tekhne.core.model.BaseInterfaceModel
{
	private static final long serialVersionUID = 1L;

	private static final Logger log = LoggerFactory.getLogger(Polgmcc0Poliza.class);

	private Integer ramsubramo;
	private Integer npoliza;
	private Integer nsubgpo;
	private String naseg;
	private Integer aavig;
	private Integer tpproducto;
	private Date femipol;
	private Date finivig;
	private Date ftervig;
	private String stpoliza_i;
	private Date fstat;
	private String causacan;
	private String moneda_i;
	private Integer nesqfpago;
	private String descfpago;
	private Double pmaisfp;
	private Double pmassfp;
	private Double prima;
	private Double recargo;
	private Double gexp;
	private Double impto;
	private Double primatot;
	private Integer npolorg;
	private Integer renovpol;
	private Integer idproducto;
	private String nombramo;
	private String ofnapol;
	private Integer lnegocio;

	public Polgmcc0Poliza()
    {
    	super();
    }


	public Integer getRamsubramo() {
		return ramsubramo;
	}


	public void setRamsubramo(Integer ramsubramo) {
		this.ramsubramo = ramsubramo;
	}


	public Integer getNpoliza() {
		return npoliza;
	}


	public void setNpoliza(Integer npoliza) {
		this.npoliza = npoliza;
	}


	public Integer getNsubgpo() {
		return nsubgpo;
	}


	public void setNsubgpo(Integer nsubgpo) {
		this.nsubgpo = nsubgpo;
	}


	public String getNaseg() {
		return naseg;
	}


	public void setNaseg(String naseg) {
		this.naseg = naseg;
	}


	public Integer getAavig() {
		return aavig;
	}


	public void setAavig(Integer aavig) {
		this.aavig = aavig;
	}


	public Integer getTpproducto() {
		return tpproducto;
	}


	public void setTpproducto(Integer tpproducto) {
		this.tpproducto = tpproducto;
	}


	public Date getFemipol() {
		return femipol;
	}


	public void setFemipol(Date femipol) {
		this.femipol = femipol;
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


	public String getStpoliza_i() {
		return stpoliza_i;
	}


	public void setStpoliza_i(String stpoliza_i) {
		this.stpoliza_i = stpoliza_i;
	}


	public Date getFstat() {
		return fstat;
	}


	public void setFstat(Date fstat) {
		this.fstat = fstat;
	}


	public String getCausacan() {
		return causacan;
	}


	public void setCausacan(String causacan) {
		this.causacan = causacan;
	}


	public String getMoneda_i() {
		return moneda_i;
	}


	public void setMoneda_i(String moneda_i) {
		this.moneda_i = moneda_i;
	}


	public Integer getNesqfpago() {
		return nesqfpago;
	}


	public void setNesqfpago(Integer nesqfpago) {
		this.nesqfpago = nesqfpago;
	}


	public String getDescfpago() {
		return descfpago;
	}


	public void setDescfpago(String descfpago) {
		this.descfpago = descfpago;
	}


	public Double getPmaisfp() {
		return pmaisfp;
	}


	public void setPmaisfp(Double pmaisfp) {
		this.pmaisfp = pmaisfp;
	}


	public Double getPmassfp() {
		return pmassfp;
	}


	public void setPmassfp(Double pmassfp) {
		this.pmassfp = pmassfp;
	}


	public Double getPrima() {
		return prima;
	}


	public void setPrima(Double prima) {
		this.prima = prima;
	}


	public Double getRecargo() {
		return recargo;
	}


	public void setRecargo(Double recargo) {
		this.recargo = recargo;
	}


	public Double getGexp() {
		return gexp;
	}


	public void setGexp(Double gexp) {
		this.gexp = gexp;
	}


	public Double getImpto() {
		return impto;
	}


	public void setImpto(Double impto) {
		this.impto = impto;
	}


	public Double getPrimatot() {
		return primatot;
	}


	public void setPrimatot(Double primatot) {
		this.primatot = primatot;
	}


	public Integer getNpolorg() {
		return npolorg;
	}


	public void setNpolorg(Integer npolorg) {
		this.npolorg = npolorg;
	}


	public Integer getRenovpol() {
		return renovpol;
	}


	public void setRenovpol(Integer renovpol) {
		this.renovpol = renovpol;
	}


	public Integer getIdproducto() {
		return idproducto;
	}


	public void setIdproducto(Integer idproducto) {
		this.idproducto = idproducto;
	}


	public String getNombramo() {
		return nombramo;
	}


	public void setNombramo(String nombramo) {
		this.nombramo = nombramo;
	}


	public String getOfnapol() {
		return ofnapol;
	}


	public void setOfnapol(String ofnapol) {
		this.ofnapol = ofnapol;
	}


	public Integer getLnegocio() {
		return lnegocio;
	}


	public void setLnegocio(Integer lnegocio) {
		this.lnegocio = lnegocio;
	}


	public void clear()
    {
    }

    public String toString()
    {
        StringBuilder r = new StringBuilder() ;
       
        r.append(super.toString())
        .append("ramsubramo=").append( ramsubramo ).append("&")
        .append("npoliza=").append( npoliza ).append("&")
        .append("nsubgpo=").append( nsubgpo ).append("&")
        .append("naseg=").append( naseg ).append("&")
        .append("aavig=").append( aavig ).append("&")
        .append("tpproducto=").append( tpproducto ).append("&")
        .append("femipol=").append( femipol ).append("&")
        .append("finivig=").append( finivig ).append("&")
        .append("ftervig=").append( ftervig ).append("&")
        .append("stpoliza_i=").append( stpoliza_i ).append("&")
        .append("fstat=").append( fstat ).append("&")
        .append("causacan=").append( causacan ).append("&")
        .append("moneda_i=").append( moneda_i ).append("&")
        .append("nesqfpago=").append( nesqfpago ).append("&")
        .append("descfpago=").append( descfpago ).append("&")
        .append("pmaisfp=").append( pmaisfp ).append("&")
        .append("pmassfp=").append( pmassfp ).append("&")
        .append("prima=").append( prima ).append("&")
        .append("recargo=").append( recargo ).append("&")
        .append("gexp=").append( gexp ).append("&")
        .append("impto=").append( impto ).append("&")
        .append("primatot=").append( primatot ).append("&")
        .append("npolorg=").append( npolorg ).append("&")
        .append("renovpol=").append( renovpol ).append("&")
        .append("idproducto=").append( idproducto ).append("&")
        .append("nombramo=").append( nombramo ).append("&")
        .append("ofnapol=").append( ofnapol ).append("&")
        .append("lnegocio=").append( lnegocio ).append("&")
        ;
        return r.toString() ;
    }

    public boolean equals( Object obj )
    {
        boolean r = false;

        if ( obj == null ) return false;
        if ( ! ( obj instanceof Polgmcc0Poliza ) )  return false;

        final Polgmcc0Poliza other = ( Polgmcc0Poliza ) obj ;
        final EqualsBuilder equalsBuilder = new EqualsBuilder();

        equalsBuilder.append( this.getClass().getName() , other.getClass().getName() );

        equalsBuilder.append( ramsubramo , other.ramsubramo );
        equalsBuilder.append( npoliza , other.npoliza );
        equalsBuilder.append( nsubgpo , other.nsubgpo );
        equalsBuilder.append( naseg , other.naseg );
        equalsBuilder.append( aavig , other.aavig );
        equalsBuilder.append( tpproducto , other.tpproducto );
        equalsBuilder.append( femipol , other.femipol );
        equalsBuilder.append( finivig , other.finivig );
        equalsBuilder.append( ftervig , other.ftervig );
        equalsBuilder.append( stpoliza_i , other.stpoliza_i );
        equalsBuilder.append( fstat , other.fstat );
        equalsBuilder.append( causacan , other.causacan );
        equalsBuilder.append( moneda_i , other.moneda_i );
        equalsBuilder.append( nesqfpago , other.nesqfpago );
        equalsBuilder.append( descfpago , other.descfpago );
        equalsBuilder.append( pmaisfp , other.pmaisfp );
        equalsBuilder.append( pmassfp , other.pmassfp );
        equalsBuilder.append( prima , other.prima );
        equalsBuilder.append( recargo , other.recargo );
        equalsBuilder.append( gexp , other.gexp );
        equalsBuilder.append( impto , other.impto );
        equalsBuilder.append( primatot , other.primatot );
        equalsBuilder.append( npolorg , other.npolorg );
        equalsBuilder.append( renovpol , other.renovpol );
        equalsBuilder.append( idproducto , other.idproducto );
        equalsBuilder.append( nombramo , other.nombramo );
        equalsBuilder.append( ofnapol , other.ofnapol );
        equalsBuilder.append( lnegocio , other.lnegocio );

        r = equalsBuilder.isEquals() ;
        return r ;
    }

    public int hashCode()
    {
        final HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();

        hashCodeBuilder.append( this.getClass().getName() );

        hashCodeBuilder.append( ramsubramo );
        hashCodeBuilder.append( npoliza );
        hashCodeBuilder.append( nsubgpo );
        hashCodeBuilder.append( naseg );
        hashCodeBuilder.append( aavig );
        hashCodeBuilder.append( tpproducto );
        hashCodeBuilder.append( femipol );
        hashCodeBuilder.append( finivig );
        hashCodeBuilder.append( ftervig );
        hashCodeBuilder.append( stpoliza_i );
        hashCodeBuilder.append( fstat );
        hashCodeBuilder.append( causacan );
        hashCodeBuilder.append( moneda_i );
        hashCodeBuilder.append( nesqfpago );
        hashCodeBuilder.append( descfpago );
        hashCodeBuilder.append( pmaisfp );
        hashCodeBuilder.append( pmassfp );
        hashCodeBuilder.append( prima );
        hashCodeBuilder.append( recargo );
        hashCodeBuilder.append( gexp );
        hashCodeBuilder.append( impto );
        hashCodeBuilder.append( primatot );
        hashCodeBuilder.append( npolorg );
        hashCodeBuilder.append( renovpol );
        hashCodeBuilder.append( idproducto );
        hashCodeBuilder.append( nombramo );
        hashCodeBuilder.append( ofnapol );
        hashCodeBuilder.append( lnegocio );

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

    @SuppressWarnings("unused") // 2021-03-12 Para evitar Dead Code dentro de: if (errorInMappingFields != null)
	public Map<String, String> auxSetValuesFromMap( Map<String, String> mappingFields ) throws Exception
    {
        Object[] entries = mappingFields.entrySet().toArray();
        String errorInMappingFields = null;
        for ( int i = 0; i < entries.length; i++ )
        {
            @SuppressWarnings("unchecked")
			Entry< String, String > entry = (Entry< String, String >) entries[ i ];
            if ( entry.getValue().contains("ERROR")) { errorInMappingFields = entry.getValue(); }
            
            if ( entry.getKey().equals( "POLGMCC0.RAMSUBRAMO" ) ) { setRamsubramo( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.NPOLIZA" ) ) { setNpoliza( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.NSUBGPO" ) ) { setNsubgpo( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.NASEG" ) ) { setNaseg( (entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.AAVIG" ) ) { setAavig( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.TPPRODUCTO" ) ) { setTpproducto( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.FEMIPOL" ) ) { setFemipol( UtilFechaCore.fromCoreValue(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.FINIVIG" ) ) { setFinivig( UtilFechaCore.fromCoreValue(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.FTERVIG" ) ) { setFtervig( UtilFechaCore.fromCoreValue(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.STPOLIZA_I" ) ) { setStpoliza_i( (entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.FSTAT" ) ) { setFstat( UtilFechaCore.fromCoreValue(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.CAUSACAN" ) ) { setCausacan( (entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.MONEDA_I" ) ) { setMoneda_i( (entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.NESQFPAGO" ) ) { setNesqfpago( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.DESCFPAGO" ) ) { setDescfpago( (entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.PMAISFP" ) ) { setPmaisfp( Double.parseDouble(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.PMASSFP" ) ) { setPmassfp( Double.parseDouble(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.PRIMA" ) ) { setPrima( Double.parseDouble(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.RECARGO" ) ) { setRecargo( Double.parseDouble(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.GEXP" ) ) { setGexp( Double.parseDouble(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.IMPTO" ) ) { setImpto( Double.parseDouble(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.PRIMATOT" ) ) { setPrimatot( Double.parseDouble(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.NPOLORG" ) ) { setNpolorg( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.RENOVPOL" ) ) { setRenovpol( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.IDPRODUCTO" ) ) { setIdproducto( Integer.parseInt(entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.NOMBRAMO" ) ) { setNombramo( (entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.OFNAPOL" ) ) { setOfnapol( (entry.getValue()) ); }
            if ( entry.getKey().equals( "POLGMCC0.LNEGOCIO" ) ) { setLnegocio( Integer.parseInt(entry.getValue()) ); }

            if ( entry.getKey().equals( "POLGMCC0.MENSAJES"       ) ) { setMessage ( entry.getValue() ); }
        }
/* 2021-03-05 ati: No para objetos incrustados * /
        log.debug("mappingFields: "+mappingFields);
/ * 2021-03-05 ati: No para objetos incrustados */

        // 2021-03-10 ati+czg+gti+lra: Acordamos dejar los detalles técnicos al log 
        if (errorInMappingFields != null)
        {
        	String msg = errorInMappingFields;
        	log.error(msg);
        	throw new Exception(msg);
        }
        return mappingFields;
    }

    /**
     *
     * Armar una lista con los registros resultado de la consulta de cobol
     *
     */
    public List< Polgmcc0Poliza > auxGetListFromCore( Map< String, String > mappingFields )
    {
        List< Polgmcc0Poliza > responseList = new ArrayList<Polgmcc0Poliza  >();
        Object[ ] entries = mappingFields.entrySet().toArray();
        String locIndex = null;
        Polgmcc0Poliza item = null;
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
                    item = new Polgmcc0Poliza();
                }

                if ( entry.getKey().endsWith( ".RAMSUBRAMO" ) ) { item.setRamsubramo ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NPOLIZA" ) ) { item.setNpoliza ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NSUBGPO" ) ) { item.setNsubgpo ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NASEG" ) ) { item.setNaseg ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".AAVIG" ) ) { item.setAavig ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".TPPRODUCTO" ) ) { item.setTpproducto ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".FEMIPOL" ) ) { item.setFemipol ( UtilFechaCore.fromCoreValue(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".FINIVIG" ) ) { item.setFinivig ( UtilFechaCore.fromCoreValue(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".FTERVIG" ) ) { item.setFtervig ( UtilFechaCore.fromCoreValue(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".STPOLIZA_I" ) ) { item.setStpoliza_i ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".FSTAT" ) ) { item.setFstat ( UtilFechaCore.fromCoreValue(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".CAUSACAN" ) ) { item.setCausacan ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".MONEDA_I" ) ) { item.setMoneda_i ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NESQFPAGO" ) ) { item.setNesqfpago ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".DESCFPAGO" ) ) { item.setDescfpago ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".PMAISFP" ) ) { item.setPmaisfp ( Double.parseDouble(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".PMASSFP" ) ) { item.setPmassfp ( Double.parseDouble(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".PRIMA" ) ) { item.setPrima ( Double.parseDouble(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".RECARGO" ) ) { item.setRecargo ( Double.parseDouble(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".GEXP" ) ) { item.setGexp ( Double.parseDouble(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".IMPTO" ) ) { item.setImpto ( Double.parseDouble(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".PRIMATOT" ) ) { item.setPrimatot ( Double.parseDouble(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NPOLORG" ) ) { item.setNpolorg ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".RENOVPOL" ) ) { item.setRenovpol ( Integer.parseInt(entry.getValue()) ); }
	            if ( entry.getKey().endsWith( ".IDPRODUCTO" ) ) { item.setIdproducto ( Integer.parseInt(entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".NOMBRAMO" ) ) { item.setNombramo ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".OFNAPOL" ) ) { item.setOfnapol ( (entry.getValue()) ); }
                if ( entry.getKey().endsWith( ".LNEGOCIO" ) ) { item.setLnegocio ( Integer.parseInt(entry.getValue()) ); }

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
