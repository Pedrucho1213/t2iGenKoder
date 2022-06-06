package mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.biz.model;

import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.springframework.stereotype.Component;
 
import java.util.Date;

/**
 * <h4>Description:</h4> Model para interfaz de webservice de Cobertura
 *
 *
 */
@XmlType(propOrder = {
        "cvcob",
        "tipoadic",
        "sa",
        "deducible",
        "coaseguro",
                   })
@Component
public class Cobertura extends /*mx.t2i.tekhne.core.model.Root*/Object {

    
    private Integer cvcob = null;
    
    private Integer tipoadic = null;
    
    private Integer sa = null;
    
    private Double deducible = null;
    
    private Double coaseguro = null;

    public Cobertura() 
    {
        super();
    }

    public Integer getCvcob() {
        return cvcob;
    }

    public void setCvcob(Integer cvcob) {
        this.cvcob = cvcob;
    }

    public Integer getTipoadic() {
        return tipoadic;
    }

    public void setTipoadic(Integer tipoadic) {
        this.tipoadic = tipoadic;
    }

    public Integer getSa() {
        return sa;
    }

    public void setSa(Integer sa) {
        this.sa = sa;
    }

    public Double getDeducible() {
        return deducible;
    }

    public void setDeducible(Double deducible) {
        this.deducible = deducible;
    }

    public Double getCoaseguro() {
        return coaseguro;
    }

    public void setCoaseguro(Double coaseguro) {
        this.coaseguro = coaseguro;
    }

    public void clear()
    {
        cvcob = null;
        tipoadic = null;
        sa = null;
        deducible = null;
        coaseguro = null;
    }

    public String toString()
    {
        StringBuilder r = new StringBuilder() ;

        r
        .append( super.toString()).append( "&" )
        .append("cvcob=").append( cvcob ).append("&")
        .append("tipoadic=").append( tipoadic ).append("&")
        .append("sa=").append( sa ).append("&")
        .append("deducible=").append( deducible ).append("&")
        .append("coaseguro=").append( coaseguro ).append("&")
        ;
        return r.toString() ;
    }

    public boolean equals( Object obj )
    {
        boolean r = false;

        if ( obj == null ) return false;
        if ( ! ( obj instanceof Cobertura ) )  return false;

        final Cobertura other = ( Cobertura ) obj ;
        final EqualsBuilder equalsBuilder = new EqualsBuilder();

        equalsBuilder.append( this.getClass().getName() , other.getClass().getName() );

        equalsBuilder.append( cvcob , other.cvcob );
        equalsBuilder.append( tipoadic , other.tipoadic );
        equalsBuilder.append( sa , other.sa );
        equalsBuilder.append( deducible , other.deducible );
        equalsBuilder.append( coaseguro , other.coaseguro );

        r = equalsBuilder.isEquals() ;
        return r ;
    }

    public int hashCode()
    {
        final HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();

        hashCodeBuilder.append( this.getClass().getName() );

        hashCodeBuilder.append( cvcob );
        hashCodeBuilder.append( tipoadic );
        hashCodeBuilder.append( sa );
        hashCodeBuilder.append( deducible );
        hashCodeBuilder.append( coaseguro );

        return hashCodeBuilder.toHashCode() ;
    }
}
