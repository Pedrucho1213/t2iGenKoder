package ${FTL_package};

import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.springframework.stereotype.Component;
 
<#list FTL_imports as FTL_import>
${FTL_import}
</#list>

/**
 * <h4>Description:</h4>
 * Model para interfaz de webservice de ${FTL_Model}
 *
 */
 
@XmlType(propOrder={
	<#list FTL_fieldAttributes as FTL_fieldAttribute>
		"${FTL_fieldAttribute.javaName}",
	</#list>
					})
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Component
public class ${FTL_Model} extends mx.t2i.tekhne.core.model.BaseInterfaceModel 
{
	<#list FTL_fieldAttributes as FTL_fieldAttribute>
	<#if  FTL_fieldAttribute.javaType?contains("List")>@Autowired</#if>
	private ${FTL_fieldAttribute.javaType} ${FTL_fieldAttribute.javaName} = ${FTL_fieldAttribute.javaInit};
	</#list>


	public ${FTL_Model}() {
		super();
	}

	<#list FTL_fieldAttributes as FTL_fieldAttribute>
	<#if  FTL_fieldAttribute.javaType?contains("List")>@XmlElement(name="${FTL_fieldAttribute.javaName}") // Este nombre aparece en el response por cada item
    </#if>
	public ${FTL_fieldAttribute.javaType} get${FTL_fieldAttribute.javaNameCapitalizingFirstLetter}() {
		return ${FTL_fieldAttribute.javaName};
	}

	public void set${FTL_fieldAttribute.javaNameCapitalizingFirstLetter}(${FTL_fieldAttribute.javaType} ${FTL_fieldAttribute.javaName}) {
		this.${FTL_fieldAttribute.javaName} = ${FTL_fieldAttribute.javaName};
	}

	</#list>
	public void clear()
    {
	<#list FTL_fieldAttributes as FTL_fieldAttribute>
		${FTL_fieldAttribute.javaName} = ${FTL_fieldAttribute.javaInit};
	</#list>	
    }
    
	public String toString()
    {
        StringBuilder r = new StringBuilder() ;

        r
        .append( super.toString()).append( "&" )
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

}
