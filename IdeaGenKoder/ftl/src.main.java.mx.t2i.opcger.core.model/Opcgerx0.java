package mx.t2i.t2iSabeOpcger.opcger.core.model;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.springframework.stereotype.Component;

import mx.t2i.t2iSabeOpcger.util.UtilFechaCore;
import mx.t2i.t2iSabeOpcger.util.UtilTranslateModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.persistence.Transient;


/**
 * <h4>Description:</h4>
 * Model para interfaz de webservice
 *
 */
@Component
public class Opcgerx0 extends mx.t2i.tekhne.core.model.BaseInterfaceModel
{
private static final long serialVersionUID = 1L;

    private static final Logger log = LoggerFactory.getLogger(Opcgerx0.class);

    private Integer ramsubramo = null;
    private Integer moneda = null;
    private Integer numnorma = null;
    private Date finivig = null;
    private String descnorm = null;


    //@Autowired
    private Opcgerx0VO opcgerx0VO = null;
    
    //@Autowired
    private List<Opcgerx0VO> opcgerx0List = null;

    public Opcgerx0()
    {
        super();
        opcgerx0VO = new Opcgerx0VO();
        opcgerx0List = new ArrayList<Opcgerx0VO>();
    }

    public Integer getRamsubramo() {
        return ramsubramo;
    }

    public void setRamsubramo(Integer ramsubramo) {
        this.ramsubramo = ramsubramo;
    }

    public Integer getMoneda() {
        return moneda;
    }

    public void setMoneda(Integer moneda) {
        this.moneda = moneda;
    }

    public Integer getNumnorma() {
        return numnorma;
    }

    public void setNumnorma(Integer numnorma) {
        this.numnorma = numnorma;
    }

    public Date getFinivig() {
        return finivig;
    }

    public void setFinivig(Date finivig) {
        this.finivig = finivig;
    }

    public String getDescnorm() {
        return descnorm;
    }

    public void setDescnorm(String descnorm) {
        this.descnorm = descnorm;
    }



    public Opcgerx0VO getOpcgerx0VO() {
        return opcgerx0VO;
    }


    public void setOpcgerx0VO(Opcgerx0VO opcgerx0vo) {
        opcgerx0VO = opcgerx0vo;
    }


    public List<Opcgerx0VO> getOpcgerx0List() {
        return opcgerx0List;
    }


    public void setOpcgerx0List(List<Opcgerx0VO> opcgerx0List) {
        this.opcgerx0List = opcgerx0List;
    }


    public void clear()
    {
        super.setMessage(null);
        ramsubramo = null;
        moneda = null;
        numnorma = null;
        finivig = null;
        descnorm = null;

        opcgerx0VO.clear();
        opcgerx0List.clear();
    }

    public String toString()
    {
        StringBuilder r = new StringBuilder() ;
       
        r.append(super.toString())
        .append("ramsubramo=").append( ramsubramo ).append("&")
        .append("moneda=").append( moneda ).append("&")
        .append("numnorma=").append( numnorma ).append("&")
        .append("finivig=").append( finivig ).append("&")
        .append("descnorm=").append( descnorm ).append("&")

        .append("opcgerx0VO=").append( opcgerx0VO ).append("&")
        .append("opcgerx0List=").append( opcgerx0List ).append("&")
        ;
        return r.toString() ;
    }

    public boolean equals( Object obj )
    {
        boolean r = false;

        if ( obj == null ) return false;
        if ( ! ( obj instanceof Opcgerx0 ) )  return false;

        final Opcgerx0 other = ( Opcgerx0 ) obj ;
        final EqualsBuilder equalsBuilder = new EqualsBuilder();

        equalsBuilder.append( this.getClass().getName() , other.getClass().getName() );

	equalsBuilder.append( ramsubramo , other.ramsubramo );
	equalsBuilder.append( moneda , other.moneda );
	equalsBuilder.append( numnorma , other.numnorma );
	equalsBuilder.append( finivig , other.finivig );
	equalsBuilder.append( descnorm , other.descnorm );

        equalsBuilder.append( opcgerx0VO , other.opcgerx0VO );
        equalsBuilder.append( opcgerx0List , other.opcgerx0List );

        r = equalsBuilder.isEquals() ;
        return r ;
    }

    public int hashCode()
    {
        final HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();

        hashCodeBuilder.append( this.getClass().getName() );

        hashCodeBuilder.append( ramsubramo );
        hashCodeBuilder.append( moneda );
        hashCodeBuilder.append( numnorma );
        hashCodeBuilder.append( finivig );
        hashCodeBuilder.append( descnorm );

        return hashCodeBuilder.toHashCode() ;
    }

/* 2021-03-05 ati: No para objetos incrustados */
    @Transient
    public Map<String, String> auxGetSearchFields()
    {
        Map<String, String> mappingFields = new LinkedHashMap<String, String>();
        mappingFields.put( "OPCGERX0.RAMSUBRAMO", ( ramsubramo == null ? "" : UtilTranslateModel.parseValue(String.valueOf(ramsubramo), Integer.class) ) );
        mappingFields.put( "OPCGERX0.MONEDA", ( moneda == null ? "" : UtilTranslateModel.parseValue(String.valueOf(moneda), Integer.class) ) );
        mappingFields.put( "OPCGERX0.NUMNORMA", ( numnorma == null ? "" : UtilTranslateModel.parseValue(String.valueOf(numnorma), Integer.class) ) );
        mappingFields.put( "OPCGERX0.FINIVIG", ( finivig == null ? "" : String.valueOf(UtilFechaCore.toCoreValue(finivig)) ) );
        mappingFields.put( "OPCGERX0.DESCNORM", ( descnorm == null ? "" : descnorm ) );
/*** 2021-06-14 ati+czg: Enviar todos los datos ya que el OPCGERX0.COB los pide como si se tratara de Alta o Modificacion ***/
        mappingFields.put( "OPCGERX0.VALOR01", String.valueOf(opcgerx0VO.getValor01()) );
        mappingFields.put( "OPCGERX0.VALOR02", String.valueOf(opcgerx0VO.getValor02()) );
        mappingFields.put( "OPCGERX0.VALOR03", String.valueOf(opcgerx0VO.getValor03()) );
        mappingFields.put( "OPCGERX0.VALOR04", String.valueOf(opcgerx0VO.getValor04()) );
        mappingFields.put( "OPCGERX0.VALOR05", String.valueOf(opcgerx0VO.getValor05()) );
        mappingFields.put( "OPCGERX0.VALOR06", String.valueOf(opcgerx0VO.getValor06()) );
        mappingFields.put( "OPCGERX0.VALOR07", String.valueOf(opcgerx0VO.getValor07()) );
        mappingFields.put( "OPCGERX0.VALOR08", String.valueOf(opcgerx0VO.getValor08()) );
        mappingFields.put( "OPCGERX0.VALOR09", String.valueOf(opcgerx0VO.getValor09()) );
        mappingFields.put( "OPCGERX0.VALOR10", String.valueOf(opcgerx0VO.getValor10()) );
        mappingFields.put( "OPCGERX0.VALOR11", String.valueOf(opcgerx0VO.getValor11()) );
        mappingFields.put( "OPCGERX0.VALOR12", String.valueOf(opcgerx0VO.getValor12()) );
        mappingFields.put( "OPCGERX0.DESCVAL01", opcgerx0VO.getDescval01() );
        mappingFields.put( "OPCGERX0.DESCVAL02", opcgerx0VO.getDescval02() );
        mappingFields.put( "OPCGERX0.DESCVAL03", opcgerx0VO.getDescval03() );
        mappingFields.put( "OPCGERX0.DESCVAL04", opcgerx0VO.getDescval04() );
        mappingFields.put( "OPCGERX0.DESCVAL05", opcgerx0VO.getDescval05() );
        mappingFields.put( "OPCGERX0.DESCVAL06", opcgerx0VO.getDescval06() );
        mappingFields.put( "OPCGERX0.DESCVAL07", opcgerx0VO.getDescval07() );
        mappingFields.put( "OPCGERX0.DESCVAL08", opcgerx0VO.getDescval08() );
        mappingFields.put( "OPCGERX0.DESCVAL09", opcgerx0VO.getDescval09() );
        mappingFields.put( "OPCGERX0.DESCVAL10", opcgerx0VO.getDescval10() );
        mappingFields.put( "OPCGERX0.DESCVAL11", opcgerx0VO.getDescval11() );
        mappingFields.put( "OPCGERX0.DESCVAL12", opcgerx0VO.getDescval12() );
        mappingFields.put( "OPCGERX0.NOMBREL", opcgerx0VO.getNombrel() );
        mappingFields.put( "OPCGERX0.MONEDA_I", opcgerx0VO.getMoneda_i() );

        log.debug("mappingFields: "+mappingFields);
        return mappingFields;
    }

    public Map<String, String> auxGetTransactionFields()
    {
        Map<String, String> mappingFields = new LinkedHashMap<String, String>();
        mappingFields.put( "OPCGERX0.RAMSUBRAMO", ( ramsubramo == null ? "" : UtilTranslateModel.parseValue(String.valueOf(ramsubramo), Integer.class) ) );
        mappingFields.put( "OPCGERX0.MONEDA", ( moneda == null ? "" : UtilTranslateModel.parseValue(String.valueOf(moneda), Integer.class) ) );
        mappingFields.put( "OPCGERX0.NUMNORMA", ( numnorma == null ? "" : UtilTranslateModel.parseValue(String.valueOf(numnorma), Integer.class) ) );
        mappingFields.put( "OPCGERX0.FINIVIG", ( finivig == null ? "" : String.valueOf(UtilFechaCore.toCoreValue(finivig)) ) );
        mappingFields.put( "OPCGERX0.DESCNORM", ( descnorm == null ? "" : descnorm ) );
/*** 2021-06-14 ati+czg: Enviar todos los datos ya que el OPCGERX0.COB los pide como si se tratara de Alta o Modificacion ***/
        mappingFields.put( "OPCGERX0.VALOR01", String.valueOf(opcgerx0VO.getValor01()) );
        mappingFields.put( "OPCGERX0.VALOR02", String.valueOf(opcgerx0VO.getValor02()) );
        mappingFields.put( "OPCGERX0.VALOR03", String.valueOf(opcgerx0VO.getValor03()) );
        mappingFields.put( "OPCGERX0.VALOR04", String.valueOf(opcgerx0VO.getValor04()) );
        mappingFields.put( "OPCGERX0.VALOR05", String.valueOf(opcgerx0VO.getValor05()) );
        mappingFields.put( "OPCGERX0.VALOR06", String.valueOf(opcgerx0VO.getValor06()) );
        mappingFields.put( "OPCGERX0.VALOR07", String.valueOf(opcgerx0VO.getValor07()) );
        mappingFields.put( "OPCGERX0.VALOR08", String.valueOf(opcgerx0VO.getValor08()) );
        mappingFields.put( "OPCGERX0.VALOR09", String.valueOf(opcgerx0VO.getValor09()) );
        mappingFields.put( "OPCGERX0.VALOR10", String.valueOf(opcgerx0VO.getValor10()) );
        mappingFields.put( "OPCGERX0.VALOR11", String.valueOf(opcgerx0VO.getValor11()) );
        mappingFields.put( "OPCGERX0.VALOR12", String.valueOf(opcgerx0VO.getValor12()) );
        mappingFields.put( "OPCGERX0.DESCVAL01", opcgerx0VO.getDescval01() );
        mappingFields.put( "OPCGERX0.DESCVAL02", opcgerx0VO.getDescval02() );
        mappingFields.put( "OPCGERX0.DESCVAL03", opcgerx0VO.getDescval03() );
        mappingFields.put( "OPCGERX0.DESCVAL04", opcgerx0VO.getDescval04() );
        mappingFields.put( "OPCGERX0.DESCVAL05", opcgerx0VO.getDescval05() );
        mappingFields.put( "OPCGERX0.DESCVAL06", opcgerx0VO.getDescval06() );
        mappingFields.put( "OPCGERX0.DESCVAL07", opcgerx0VO.getDescval07() );
        mappingFields.put( "OPCGERX0.DESCVAL08", opcgerx0VO.getDescval08() );
        mappingFields.put( "OPCGERX0.DESCVAL09", opcgerx0VO.getDescval09() );
        mappingFields.put( "OPCGERX0.DESCVAL10", opcgerx0VO.getDescval10() );
        mappingFields.put( "OPCGERX0.DESCVAL11", opcgerx0VO.getDescval11() );
        mappingFields.put( "OPCGERX0.DESCVAL12", opcgerx0VO.getDescval12() );
        mappingFields.put( "OPCGERX0.NOMBREL", opcgerx0VO.getNombrel() );
        mappingFields.put( "OPCGERX0.MONEDA_I", opcgerx0VO.getMoneda_i() );

        log.debug("mappingFields: "+mappingFields);
        return mappingFields;
    }
/* 2021-03-05 ati: No para objetos incrustados */

    @SuppressWarnings("unused") // 2021-03-12 Para evitar Dead Code dentro de: if (errorInMappingFields != null)
    public Map<String, String> auxSetValuesFromMap( Map<String, String> mappingFields ) throws Exception
    {
        this.opcgerx0VO.auxSetValuesFromMap(mappingFields);
        this.opcgerx0List.addAll( Opcgerx0VO.auxGetListFromCore(mappingFields) );

        this.setMessage(opcgerx0VO.getMessage());
        return mappingFields;
    }

    /**
     *
     * Armar una lista con los registros resultado de la consulta de cobol
     *
     */
    public List< Opcgerx0VO > auxGetListFromCore( Map< String, String > mappingFields )
    {
        return Opcgerx0VO.auxGetListFromCore(mappingFields);
    }
}
