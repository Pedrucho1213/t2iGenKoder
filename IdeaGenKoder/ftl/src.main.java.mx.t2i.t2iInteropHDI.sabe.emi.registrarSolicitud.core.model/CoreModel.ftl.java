package ${FTL_package};

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.springframework.stereotype.Component;

import mx.t2i.t2iInteropHDI.util.UtilFechaCore;
import mx.t2i.t2iInteropHDI.util.UtilTranslateModel;

import java.util.Map;
import java.util.Map.Entry;

import javax.persistence.Transient;

<#list FTL_imports as FTL_import>
${FTL_import}
</#list>

/**
 * <h4>Description:</h4>
 * Model para interfaz de webservice
 *
 */
@Component
public class ${FTL_Model} extends ${FTL_extends}
{
    private static final long serialVersionUID = 1L;

    private static final Logger log = LoggerFactory.getLogger(${FTL_Model}.class);

<#list FTL_fieldAttributes as FTL_fieldAttribute>
    private ${FTL_fieldAttribute.javaType} ${FTL_fieldAttribute.javaName} = ${FTL_fieldAttribute.javaInit};
</#list>

    public ${FTL_Model}()
    {
        super();
    }

<#list FTL_fieldAttributes as FTL_fieldAttribute>
    public ${FTL_fieldAttribute.javaType} get${FTL_fieldAttribute.javaNameCapitalizingFirstLetter}() {
        return ${FTL_fieldAttribute.javaName};
    }

    public void set${FTL_fieldAttribute.javaNameCapitalizingFirstLetter}(${FTL_fieldAttribute.javaType} ${FTL_fieldAttribute.javaName}) {
        this.${FTL_fieldAttribute.javaName} = ${FTL_fieldAttribute.javaName};
    }

</#list>
    public void clear()
    {
    }

    public String toString()
    {
        StringBuilder r = new StringBuilder() ;
       
        r.append(super.toString())

<#list FTL_fieldAttributes as FTL_fieldAttribute>
        .append("${FTL_fieldAttribute.javaName}=").append( ${FTL_fieldAttribute.javaName} ).append("&")
</#list>

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

<#list FTL_fieldAttributes as FTL_fieldAttribute>
        equalsBuilder.append( ${FTL_fieldAttribute.javaName} , other.${FTL_fieldAttribute.javaName} );
</#list>

        r = equalsBuilder.isEquals() ;
        return r ;
    }

    public int hashCode()
    {
        final HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();

        hashCodeBuilder.append( this.getClass().getName() );

<#list FTL_fieldAttributes as FTL_fieldAttribute>
        hashCodeBuilder.append( ${FTL_fieldAttribute.javaName} );
</#list>

        return hashCodeBuilder.toHashCode() ;
    }

    @Transient
    public Map<String, String> auxGetSearchFields()
    {
        Map<String, String> mappingFields = new LinkedHashMap<String, String>();

<#list FTL_searchAttributes as FTL_fieldAttribute>
        mappingFields.put( "${FTL_CORE_PROGRAM}.${FTL_fieldAttribute.javaName?upper_case}", UtilTranslateModel.parseValue(""+${FTL_fieldAttribute.javaName}, ${FTL_fieldAttribute.javaType}.class) );
</#list>

        log.debug("mappingFields: "+mappingFields);
        return mappingFields;
    }

    public Map<String, String> auxGetTransactionFields()
    {
        Map<String, String> mappingFields = new LinkedHashMap<String, String>();

<#list FTL_fieldAttributes as FTL_fieldAttribute>
        mappingFields.put( "${FTL_CORE_PROGRAM}.${FTL_fieldAttribute.javaName?upper_case}", UtilTranslateModel.parseValue(""+${FTL_fieldAttribute.javaName}, ${FTL_fieldAttribute.javaType}.class) );
</#list>

        log.debug("mappingFields: "+mappingFields);
        return mappingFields;
    }

    public Map<String, String> auxSetValuesFromMap( Map<String, String> mappingFields )
    {
        Object[] entries = mappingFields.entrySet().toArray();
        for ( int i = 0; i < entries.length; i++ )
        {
            @SuppressWarnings("unchecked")
            Entry< String, String > entry = (Entry< String, String >) entries[ i ];
            
<#list FTL_fieldAttributes as FTL_fieldAttribute>
            if ( entry.getKey().equals( "${FTL_CORE_PROGRAM}.${FTL_fieldAttribute.javaName?upper_case}" ) ) { set${FTL_fieldAttribute.javaName?cap_first}(<#if FTL_fieldAttribute.javaType?contains("Integer")> Integer.parseInt<#elseif FTL_fieldAttribute.javaType?contains("Date")> UtilFechaCore.fromCoreValue<#elseif FTL_fieldAttribute.javaType?contains("Double")> Double.parseDouble<#else> </#if>(entry.getValue()) ); }
</#list>
        
            if ( entry.getKey().equals( "${FTL_CORE_PROGRAM}.MENSAJES"       ) ) { setMessage ( entry.getValue() ); }
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
    public static List< ${FTL_Model} > auxGetListFromCore( Map< String, String > mappingFields ) // 2021-03-07 ati: Hacer static para simplificar llamado
    {
        List< ${FTL_Model} > responseList = new ArrayList<${FTL_Model}  >();
        Object[ ] entries = mappingFields.entrySet().toArray();
        String locIndex = null;
        ${FTL_Model} item = null;
        for ( int i = 0; i < entries.length; i++ )
        {
            @SuppressWarnings("unchecked")
            Entry< String, String > entry = (Entry< String, String >) entries[ i ];
            //System.out.println("SYSOUT: " + (new Throwable().getStackTrace()[0].getMethodName() +" | entry.getKey(): " + entry.getKey() + "=["+entry.getValue()+"]")); 
            
            if ( entry.getKey().startsWith( "${FTL_CORE_PROGRAM}[" ) )
            {
                if ( locIndex == null || !locIndex.equals( entry.getKey().substring( 0, entry.getKey().indexOf( "]" ) + 1 ) ) )
                {
                    if ( item != null )
                    {
                        responseList.add( item );
                    }
                    locIndex = entry.getKey().substring( 0, entry.getKey().indexOf( "]" ) + 1 );
                    item = new ${FTL_Model}();
                }

<#list FTL_fieldAttributes as FTL_fieldAttribute>
                if ( entry.getKey().endsWith( ".${FTL_fieldAttribute.javaName?upper_case}" ) ) { item.set${FTL_fieldAttribute.javaName?cap_first} (<#if FTL_fieldAttribute.javaType?contains("Integer")> Integer.parseInt<#elseif FTL_fieldAttribute.javaType?contains("Date")> UtilFechaCore.fromCoreValue<#elseif FTL_fieldAttribute.javaType?contains("Double")> Double.parseDouble<#else> </#if>(entry.getValue()) ); }
</#list>

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

