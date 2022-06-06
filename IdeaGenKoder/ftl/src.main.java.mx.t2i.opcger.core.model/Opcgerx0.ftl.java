package ${FTL_package};

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
public class ${FTL_Model} extends mx.t2i.tekhne.core.model.BaseInterfaceModel
{
private static final long serialVersionUID = 1L;

    private static final Logger log = LoggerFactory.getLogger(${FTL_Model}.class);

<#list FTL_searchAttributes as FTL_searchAttribute>
    private ${FTL_searchAttribute.javaType} ${FTL_searchAttribute.javaName} = ${FTL_searchAttribute.javaInit};
</#list>

<#-- Comentar para omitir las declaraciones en duro: ----------------
    private Integer ramsubramo = null;
    private Integer moneda = null;
    private Integer numnorma = null;
    private Date finivig = null;
    private String descnorm = null;
-------------------------------------------------------------------->

    //@Autowired
    private ${FTL_Model}VO ${FTL_model}VO = null;
    
    //@Autowired
    private List<${FTL_Model}VO> ${FTL_model}List = null;

    public ${FTL_Model}()
    {
        super();
        ${FTL_model}VO = new ${FTL_Model}VO();
        ${FTL_model}List = new ArrayList<${FTL_Model}VO>();
    }

<#list FTL_searchAttributes as FTL_searchAttribute>
    public ${FTL_searchAttribute.javaType} get${FTL_searchAttribute.javaNameCapitalizingFirstLetter}() {
        return ${FTL_searchAttribute.javaName};
    }

    public void set${FTL_searchAttribute.javaNameCapitalizingFirstLetter}(${FTL_searchAttribute.javaType} ${FTL_searchAttribute.javaName}) {
        this.${FTL_searchAttribute.javaName} = ${FTL_searchAttribute.javaName};
    }

</#list>

<#-- Comentar para omitir las declaraciones en duro: ----------------
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
-------------------------------------------------------------------->

    public ${FTL_Model}VO get${FTL_Model}VO() {
        return ${FTL_model}VO;
    }


    public void set${FTL_Model}VO(${FTL_Model}VO ${FTL_model}vo) {
        ${FTL_model}VO = ${FTL_model}vo;
    }


    public List<${FTL_Model}VO> get${FTL_Model}List() {
        return ${FTL_model}List;
    }


    public void set${FTL_Model}List(List<${FTL_Model}VO> ${FTL_model}List) {
        this.${FTL_model}List = ${FTL_model}List;
    }


    public void clear()
    {
        super.setMessage(null);
<#list FTL_searchAttributes as FTL_searchAttribute>
        ${FTL_searchAttribute.javaName} = ${FTL_searchAttribute.javaInit};
</#list>

<#-- Comentar para omitir las declaraciones en duro: ----------------
        ramsubramo = null;
        moneda = null;
        numnorma = null;
        finivig = null;
        descnorm = null;
-------------------------------------------------------------------->
        ${FTL_model}VO.clear();
        ${FTL_model}List.clear();
    }

    public String toString()
    {
        StringBuilder r = new StringBuilder() ;
       
        r.append(super.toString())
<#list FTL_searchAttributes as FTL_searchAttribute>
        .append("${FTL_searchAttribute.javaName}=").append( ${FTL_searchAttribute.javaName} ).append("&")
</#list>

<#-- Comentar para omitir las declaraciones en duro: ----------------
        .append("ramsubramo=").append( ramsubramo ).append("&")
        .append("moneda=").append( moneda ).append("&")
        .append("numnorma=").append( numnorma ).append("&")
        .append("finivig=").append( finivig ).append("&")
        .append("descnorm=").append( descnorm ).append("&")
-------------------------------------------------------------------->
        .append("${FTL_model}VO=").append( ${FTL_model}VO ).append("&")
        .append("${FTL_model}List=").append( ${FTL_model}List ).append("&")
        ;
        return r.toString() ;
    }

    public boolean equals( Object obj )
    {
        boolean r = false;

        if ( obj == null ) return false;
        if ( ! ( obj instanceof ${FTL_Model} ) )  return false;

        final ${FTL_Model} other = ( ${FTL_Model} ) obj ;
        final EqualsBuilder equalsBuilder = new EqualsBuilder();

        equalsBuilder.append( this.getClass().getName() , other.getClass().getName() );

<#list FTL_searchAttributes as FTL_searchAttribute>
	equalsBuilder.append( ${FTL_searchAttribute.javaName} , other.${FTL_searchAttribute.javaName} );
</#list>

<#-- Comentar para omitir las declaraciones en duro: ----------------
        equalsBuilder.append( ramsubramo , other.ramsubramo );
        equalsBuilder.append( moneda , other.moneda );
        equalsBuilder.append( numnorma , other.numnorma );
        equalsBuilder.append( finivig , other.finivig );
        equalsBuilder.append( descnorm , other.descnorm );
-------------------------------------------------------------------->
        equalsBuilder.append( ${FTL_model}VO , other.${FTL_model}VO );
        equalsBuilder.append( ${FTL_model}List , other.${FTL_model}List );

        r = equalsBuilder.isEquals() ;
        return r ;
    }

    public int hashCode()
    {
        final HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();

        hashCodeBuilder.append( this.getClass().getName() );

<#list FTL_searchAttributes as FTL_searchAttribute>
        hashCodeBuilder.append( ${FTL_searchAttribute.javaName} );
</#list>

<#-- Comentar para omitir las declaraciones en duro: ----------------
        hashCodeBuilder.append( ramsubramo );
        hashCodeBuilder.append( moneda );
        hashCodeBuilder.append( numnorma );
        hashCodeBuilder.append( finivig );
        hashCodeBuilder.append( descnorm );
-------------------------------------------------------------------->
        return hashCodeBuilder.toHashCode() ;
    }

/* 2021-03-05 ati: No para objetos incrustados */
    @Transient
    public Map<String, String> auxGetSearchFields()
    {
        Map<String, String> mappingFields = new LinkedHashMap<String, String>();
<#list FTL_searchAttributes as FTL_searchAttribute>
        mappingFields.put( "${FTL_MODEL}.${FTL_searchAttribute.javaNameFullyCapitalized}", ( ${FTL_searchAttribute.javaName} == null ? "" : ${FTL_searchAttribute.coreValueAsString} ) );
</#list>
/*** 2021-06-14 ati+czg: Enviar todos los datos ya que el ${FTL_MODEL}.COB los pide como si se tratara de Alta o Modificacion ***/
<#list FTL_fieldAttributes as FTL_fieldAttribute>
        mappingFields.put( "${FTL_MODEL}.${FTL_fieldAttribute.javaNameFullyCapitalized}", ${FTL_fieldAttribute.convertCoreValueToString("${FTL_model}VO.get${FTL_fieldAttribute.javaNameCapitalizingFirstLetter}()")} );
</#list>

<#-- Comentar para omitir las declaraciones en duro: ----------------
        mappingFields.put( "${FTL_MODEL}.RAMSUBRAMO"    , (ramsubramo == null? "" : UtilTranslateModel.parseValue(String.valueOf(ramsubramo    ), Integer.class)) );
        mappingFields.put( "${FTL_MODEL}.MONEDA"        , (moneda     == null? "" : UtilTranslateModel.parseValue(String.valueOf(moneda        ), Integer.class)) );
        mappingFields.put( "${FTL_MODEL}.NUMNORMA"      , (numnorma   == null? "" : UtilTranslateModel.parseValue(String.valueOf(numnorma      ), Integer.class)) );
        mappingFields.put( "${FTL_MODEL}.FINIVIG"       , (finivig    == null? "" : String.valueOf(UtilFechaCore.toCoreValue(finivig))) );
        mappingFields.put( "${FTL_MODEL}.DESCNORM"      , (descnorm   == null? "" : descnorm) );
/*** 2021-06-14 ati+czg: Enviar todos los datos ya que el ${FTL_MODEL}.COB los pide como si se tratara de Alta o Modificacion ***/
        mappingFields.put( "${FTL_MODEL}.VALOR01"       , String.valueOf(${FTL_model}VO.getValor01()));
        mappingFields.put( "${FTL_MODEL}.VALOR02"       , String.valueOf(${FTL_model}VO.getValor02()));
        mappingFields.put( "${FTL_MODEL}.VALOR03"       , String.valueOf(${FTL_model}VO.getValor03()));
        mappingFields.put( "${FTL_MODEL}.VALOR04"       , String.valueOf(${FTL_model}VO.getValor04()));
        mappingFields.put( "${FTL_MODEL}.VALOR05"       , String.valueOf(${FTL_model}VO.getValor05()));
        mappingFields.put( "${FTL_MODEL}.VALOR06"       , String.valueOf(${FTL_model}VO.getValor06()));
        mappingFields.put( "${FTL_MODEL}.VALOR07"       , String.valueOf(${FTL_model}VO.getValor07()));
        mappingFields.put( "${FTL_MODEL}.VALOR08"       , String.valueOf(${FTL_model}VO.getValor08()));
        mappingFields.put( "${FTL_MODEL}.VALOR09"       , String.valueOf(${FTL_model}VO.getValor09()));
        mappingFields.put( "${FTL_MODEL}.VALOR10"       , String.valueOf(${FTL_model}VO.getValor10()));
        mappingFields.put( "${FTL_MODEL}.VALOR11"       , String.valueOf(${FTL_model}VO.getValor11()));
        mappingFields.put( "${FTL_MODEL}.VALOR12"       , String.valueOf(${FTL_model}VO.getValor12()));
        mappingFields.put( "${FTL_MODEL}.DESCVAL01"     , ${FTL_model}VO.getDescval01());
        mappingFields.put( "${FTL_MODEL}.DESCVAL02"     , ${FTL_model}VO.getDescval02());
        mappingFields.put( "${FTL_MODEL}.DESCVAL03"     , ${FTL_model}VO.getDescval03());
        mappingFields.put( "${FTL_MODEL}.DESCVAL04"     , ${FTL_model}VO.getDescval04());
        mappingFields.put( "${FTL_MODEL}.DESCVAL05"     , ${FTL_model}VO.getDescval05());
        mappingFields.put( "${FTL_MODEL}.DESCVAL06"     , ${FTL_model}VO.getDescval06());
        mappingFields.put( "${FTL_MODEL}.DESCVAL07"     , ${FTL_model}VO.getDescval07());
        mappingFields.put( "${FTL_MODEL}.DESCVAL08"     , ${FTL_model}VO.getDescval08());
        mappingFields.put( "${FTL_MODEL}.DESCVAL09"     , ${FTL_model}VO.getDescval09());
        mappingFields.put( "${FTL_MODEL}.DESCVAL10"     , ${FTL_model}VO.getDescval10());
        mappingFields.put( "${FTL_MODEL}.DESCVAL11"     , ${FTL_model}VO.getDescval11());
        mappingFields.put( "${FTL_MODEL}.DESCVAL12"     , ${FTL_model}VO.getDescval12());
-------------------------------------------------------------------->
        log.debug("mappingFields: "+mappingFields);
        return mappingFields;
    }

    public Map<String, String> auxGetTransactionFields()
    {
        Map<String, String> mappingFields = new LinkedHashMap<String, String>();
<#list FTL_searchAttributes as FTL_searchAttribute>
        mappingFields.put( "${FTL_MODEL}.${FTL_searchAttribute.javaNameFullyCapitalized}", ( ${FTL_searchAttribute.javaName} == null ? "" : ${FTL_searchAttribute.coreValueAsString} ) );
</#list>
/*** 2021-06-14 ati+czg: Enviar todos los datos ya que el ${FTL_MODEL}.COB los pide como si se tratara de Alta o Modificacion ***/
<#list FTL_fieldAttributes as FTL_fieldAttribute>
        mappingFields.put( "${FTL_MODEL}.${FTL_fieldAttribute.javaNameFullyCapitalized}", ${FTL_fieldAttribute.convertCoreValueToString("${FTL_model}VO.get${FTL_fieldAttribute.javaNameCapitalizingFirstLetter}()")} );
</#list>

<#-- Comentar para omitir las declaraciones en duro: ----------------
        mappingFields.put( "${FTL_MODEL}.RAMSUBRAMO"     , (ramsubramo     == null? "" : UtilTranslateModel.parseValue(String.valueOf(ramsubramo    ), Integer.class)) );
        mappingFields.put( "${FTL_MODEL}.MONEDA"         , (moneda         == null? "" : UtilTranslateModel.parseValue(String.valueOf(moneda        ), Integer.class)) );
        mappingFields.put( "${FTL_MODEL}.NUMNORMA"         , (numnorma     == null? "" : UtilTranslateModel.parseValue(String.valueOf(numnorma        ), Integer.class)) );
        mappingFields.put( "${FTL_MODEL}.FINIVIG"         , (finivig         == null? "" : String.valueOf(UtilFechaCore.toCoreValue(finivig))) );
        mappingFields.put( "${FTL_MODEL}.DESCNORM"         , (descnorm        == null? "" : descnorm) );
/*** 2021-06-14 ati+czg: Enviar todos los datos ya que el ${FTL_MODEL}.COB los pide como si se tratara de Alta o Modificacion ***/
        mappingFields.put( "${FTL_MODEL}.VALOR01"         , String.valueOf(${FTL_model}VO.getValor01()));
        mappingFields.put( "${FTL_MODEL}.VALOR02"         , String.valueOf(${FTL_model}VO.getValor02()));
        mappingFields.put( "${FTL_MODEL}.VALOR03"         , String.valueOf(${FTL_model}VO.getValor03()));
        mappingFields.put( "${FTL_MODEL}.VALOR04"         , String.valueOf(${FTL_model}VO.getValor04()));
        mappingFields.put( "${FTL_MODEL}.VALOR05"         , String.valueOf(${FTL_model}VO.getValor05()));
        mappingFields.put( "${FTL_MODEL}.VALOR06"         , String.valueOf(${FTL_model}VO.getValor06()));
        mappingFields.put( "${FTL_MODEL}.VALOR07"         , String.valueOf(${FTL_model}VO.getValor07()));
        mappingFields.put( "${FTL_MODEL}.VALOR08"         , String.valueOf(${FTL_model}VO.getValor08()));
        mappingFields.put( "${FTL_MODEL}.VALOR09"         , String.valueOf(${FTL_model}VO.getValor09()));
        mappingFields.put( "${FTL_MODEL}.VALOR10"         , String.valueOf(${FTL_model}VO.getValor10()));
        mappingFields.put( "${FTL_MODEL}.VALOR11"         , String.valueOf(${FTL_model}VO.getValor11()));
        mappingFields.put( "${FTL_MODEL}.VALOR12"         , String.valueOf(${FTL_model}VO.getValor12()));
        mappingFields.put( "${FTL_MODEL}.DESCVAL01"     , ${FTL_model}VO.getDescval01());
        mappingFields.put( "${FTL_MODEL}.DESCVAL02"     , ${FTL_model}VO.getDescval02());
        mappingFields.put( "${FTL_MODEL}.DESCVAL03"     , ${FTL_model}VO.getDescval03());
        mappingFields.put( "${FTL_MODEL}.DESCVAL04"     , ${FTL_model}VO.getDescval04());
        mappingFields.put( "${FTL_MODEL}.DESCVAL05"     , ${FTL_model}VO.getDescval05());
        mappingFields.put( "${FTL_MODEL}.DESCVAL06"     , ${FTL_model}VO.getDescval06());
        mappingFields.put( "${FTL_MODEL}.DESCVAL07"     , ${FTL_model}VO.getDescval07());
        mappingFields.put( "${FTL_MODEL}.DESCVAL08"     , ${FTL_model}VO.getDescval08());
        mappingFields.put( "${FTL_MODEL}.DESCVAL09"     , ${FTL_model}VO.getDescval09());
        mappingFields.put( "${FTL_MODEL}.DESCVAL10"     , ${FTL_model}VO.getDescval10());
        mappingFields.put( "${FTL_MODEL}.DESCVAL11"     , ${FTL_model}VO.getDescval11());
        mappingFields.put( "${FTL_MODEL}.DESCVAL12"     , ${FTL_model}VO.getDescval12());
-------------------------------------------------------------------->
        log.debug("mappingFields: "+mappingFields);
        return mappingFields;
    }
/* 2021-03-05 ati: No para objetos incrustados */

    @SuppressWarnings("unused") // 2021-03-12 Para evitar Dead Code dentro de: if (errorInMappingFields != null)
    public Map<String, String> auxSetValuesFromMap( Map<String, String> mappingFields ) throws Exception
    {
        this.${FTL_model}VO.auxSetValuesFromMap(mappingFields);
        this.${FTL_model}List.addAll( ${FTL_Model}VO.auxGetListFromCore(mappingFields) );

        this.setMessage(${FTL_model}VO.getMessage());
        return mappingFields;
    }

    /**
     *
     * Armar una lista con los registros resultado de la consulta de cobol
     *
     */
    public List< ${FTL_Model}VO > auxGetListFromCore( Map< String, String > mappingFields )
    {
        return ${FTL_Model}VO.auxGetListFromCore(mappingFields);
    }
}
