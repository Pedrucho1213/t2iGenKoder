package mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.biz.model;

import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.springframework.stereotype.Component;
 
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <h4>Description:</h4> Model para interfaz de webservice de Poliza
 *
 *
 */
@XmlType(propOrder = {
        "ramsubramo",
        "stpoliza",
        "npolorg",
        "npolcoas",
        "ncotiza",
        "numcliente",
        "finivig",
        "ftervig",
        "nesqfpago",
        "nesqgexp",
        "tpiva",
        "tpdocum",
        "topecoas",
        "tpconcod",
        "idconcob",
        "tpcomis",
        "nagente1",
        "porcpart1",
        "nagente2",
        "porcpart2",
        "nagente3",
        "porcpart3",
        "porcredag",
        "porcredsu",
        "asegurados",
                   })
@Component
public class Poliza extends /*mx.t2i.tekhne.core.model.Root*/Object {

    
    private String ramsubramo = null;
    
    private Integer stpoliza = null;
    
    private Integer npolorg = null;
    
    private String npolcoas = null;
    
    private Integer ncotiza = null;
    
    private Integer numcliente = null;
    
    private Date finivig = null;
    
    private Date ftervig = null;
    
    private Integer nesqfpago = null;
    
    private Integer nesqgexp = null;
    
    private Integer tpiva = null;
    
    private Integer tpdocum = null;
    
    private Double topecoas = null;
    
    private Integer tpconcod = null;
    
    private String idconcob = null;
    
    private Integer tpcomis = null;
    
    private Integer nagente1 = null;
    
    private Double porcpart1 = null;
    
    private Integer nagente2 = null;
    
    private Double porcpart2 = null;
    
    private Integer nagente3 = null;
    
    private Double porcpart3 = null;
    
    private Double porcredag = null;
    
    private Double porcredsu = null;
    @Autowired
    private List<Asegurado> asegurados = null;

    public Poliza() 
    {
        super();
    }

    public String getRamsubramo() {
        return ramsubramo;
    }

    public void setRamsubramo(String ramsubramo) {
        this.ramsubramo = ramsubramo;
    }

    public Integer getStpoliza() {
        return stpoliza;
    }

    public void setStpoliza(Integer stpoliza) {
        this.stpoliza = stpoliza;
    }

    public Integer getNpolorg() {
        return npolorg;
    }

    public void setNpolorg(Integer npolorg) {
        this.npolorg = npolorg;
    }

    public String getNpolcoas() {
        return npolcoas;
    }

    public void setNpolcoas(String npolcoas) {
        this.npolcoas = npolcoas;
    }

    public Integer getNcotiza() {
        return ncotiza;
    }

    public void setNcotiza(Integer ncotiza) {
        this.ncotiza = ncotiza;
    }

    public Integer getNumcliente() {
        return numcliente;
    }

    public void setNumcliente(Integer numcliente) {
        this.numcliente = numcliente;
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

    public Integer getNesqfpago() {
        return nesqfpago;
    }

    public void setNesqfpago(Integer nesqfpago) {
        this.nesqfpago = nesqfpago;
    }

    public Integer getNesqgexp() {
        return nesqgexp;
    }

    public void setNesqgexp(Integer nesqgexp) {
        this.nesqgexp = nesqgexp;
    }

    public Integer getTpiva() {
        return tpiva;
    }

    public void setTpiva(Integer tpiva) {
        this.tpiva = tpiva;
    }

    public Integer getTpdocum() {
        return tpdocum;
    }

    public void setTpdocum(Integer tpdocum) {
        this.tpdocum = tpdocum;
    }

    public Double getTopecoas() {
        return topecoas;
    }

    public void setTopecoas(Double topecoas) {
        this.topecoas = topecoas;
    }

    public Integer getTpconcod() {
        return tpconcod;
    }

    public void setTpconcod(Integer tpconcod) {
        this.tpconcod = tpconcod;
    }

    public String getIdconcob() {
        return idconcob;
    }

    public void setIdconcob(String idconcob) {
        this.idconcob = idconcob;
    }

    public Integer getTpcomis() {
        return tpcomis;
    }

    public void setTpcomis(Integer tpcomis) {
        this.tpcomis = tpcomis;
    }

    public Integer getNagente1() {
        return nagente1;
    }

    public void setNagente1(Integer nagente1) {
        this.nagente1 = nagente1;
    }

    public Double getPorcpart1() {
        return porcpart1;
    }

    public void setPorcpart1(Double porcpart1) {
        this.porcpart1 = porcpart1;
    }

    public Integer getNagente2() {
        return nagente2;
    }

    public void setNagente2(Integer nagente2) {
        this.nagente2 = nagente2;
    }

    public Double getPorcpart2() {
        return porcpart2;
    }

    public void setPorcpart2(Double porcpart2) {
        this.porcpart2 = porcpart2;
    }

    public Integer getNagente3() {
        return nagente3;
    }

    public void setNagente3(Integer nagente3) {
        this.nagente3 = nagente3;
    }

    public Double getPorcpart3() {
        return porcpart3;
    }

    public void setPorcpart3(Double porcpart3) {
        this.porcpart3 = porcpart3;
    }

    public Double getPorcredag() {
        return porcredag;
    }

    public void setPorcredag(Double porcredag) {
        this.porcredag = porcredag;
    }

    public Double getPorcredsu() {
        return porcredsu;
    }

    public void setPorcredsu(Double porcredsu) {
        this.porcredsu = porcredsu;
    }

    @XmlElement(name="asegurados") // Este nombre aparece en el request por cada item y dice <!--Zero or more repetitions:--> 
public List<Asegurado> getAsegurados() {
        return asegurados;
    }

    public void setAsegurados(List<Asegurado> asegurados) {
        this.asegurados = asegurados;
    }

    public void clear()
    {
        ramsubramo = null;
        stpoliza = null;
        npolorg = null;
        npolcoas = null;
        ncotiza = null;
        numcliente = null;
        finivig = null;
        ftervig = null;
        nesqfpago = null;
        nesqgexp = null;
        tpiva = null;
        tpdocum = null;
        topecoas = null;
        tpconcod = null;
        idconcob = null;
        tpcomis = null;
        nagente1 = null;
        porcpart1 = null;
        nagente2 = null;
        porcpart2 = null;
        nagente3 = null;
        porcpart3 = null;
        porcredag = null;
        porcredsu = null;
        asegurados = null;
    }

    public String toString()
    {
        StringBuilder r = new StringBuilder() ;

        r
        .append( super.toString()).append( "&" )
        .append("ramsubramo=").append( ramsubramo ).append("&")
        .append("stpoliza=").append( stpoliza ).append("&")
        .append("npolorg=").append( npolorg ).append("&")
        .append("npolcoas=").append( npolcoas ).append("&")
        .append("ncotiza=").append( ncotiza ).append("&")
        .append("numcliente=").append( numcliente ).append("&")
        .append("finivig=").append( finivig ).append("&")
        .append("ftervig=").append( ftervig ).append("&")
        .append("nesqfpago=").append( nesqfpago ).append("&")
        .append("nesqgexp=").append( nesqgexp ).append("&")
        .append("tpiva=").append( tpiva ).append("&")
        .append("tpdocum=").append( tpdocum ).append("&")
        .append("topecoas=").append( topecoas ).append("&")
        .append("tpconcod=").append( tpconcod ).append("&")
        .append("idconcob=").append( idconcob ).append("&")
        .append("tpcomis=").append( tpcomis ).append("&")
        .append("nagente1=").append( nagente1 ).append("&")
        .append("porcpart1=").append( porcpart1 ).append("&")
        .append("nagente2=").append( nagente2 ).append("&")
        .append("porcpart2=").append( porcpart2 ).append("&")
        .append("nagente3=").append( nagente3 ).append("&")
        .append("porcpart3=").append( porcpart3 ).append("&")
        .append("porcredag=").append( porcredag ).append("&")
        .append("porcredsu=").append( porcredsu ).append("&")
        .append("asegurados=").append( asegurados ).append("&")
        ;
        return r.toString() ;
    }

    public boolean equals( Object obj )
    {
        boolean r = false;

        if ( obj == null ) return false;
        if ( ! ( obj instanceof Poliza ) )  return false;

        final Poliza other = ( Poliza ) obj ;
        final EqualsBuilder equalsBuilder = new EqualsBuilder();

        equalsBuilder.append( this.getClass().getName() , other.getClass().getName() );

        equalsBuilder.append( ramsubramo , other.ramsubramo );
        equalsBuilder.append( stpoliza , other.stpoliza );
        equalsBuilder.append( npolorg , other.npolorg );
        equalsBuilder.append( npolcoas , other.npolcoas );
        equalsBuilder.append( ncotiza , other.ncotiza );
        equalsBuilder.append( numcliente , other.numcliente );
        equalsBuilder.append( finivig , other.finivig );
        equalsBuilder.append( ftervig , other.ftervig );
        equalsBuilder.append( nesqfpago , other.nesqfpago );
        equalsBuilder.append( nesqgexp , other.nesqgexp );
        equalsBuilder.append( tpiva , other.tpiva );
        equalsBuilder.append( tpdocum , other.tpdocum );
        equalsBuilder.append( topecoas , other.topecoas );
        equalsBuilder.append( tpconcod , other.tpconcod );
        equalsBuilder.append( idconcob , other.idconcob );
        equalsBuilder.append( tpcomis , other.tpcomis );
        equalsBuilder.append( nagente1 , other.nagente1 );
        equalsBuilder.append( porcpart1 , other.porcpart1 );
        equalsBuilder.append( nagente2 , other.nagente2 );
        equalsBuilder.append( porcpart2 , other.porcpart2 );
        equalsBuilder.append( nagente3 , other.nagente3 );
        equalsBuilder.append( porcpart3 , other.porcpart3 );
        equalsBuilder.append( porcredag , other.porcredag );
        equalsBuilder.append( porcredsu , other.porcredsu );
        equalsBuilder.append( asegurados , other.asegurados );

        r = equalsBuilder.isEquals() ;
        return r ;
    }

    public int hashCode()
    {
        final HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();

        hashCodeBuilder.append( this.getClass().getName() );

        hashCodeBuilder.append( ramsubramo );
        hashCodeBuilder.append( stpoliza );
        hashCodeBuilder.append( npolorg );
        hashCodeBuilder.append( npolcoas );
        hashCodeBuilder.append( ncotiza );
        hashCodeBuilder.append( numcliente );
        hashCodeBuilder.append( finivig );
        hashCodeBuilder.append( ftervig );
        hashCodeBuilder.append( nesqfpago );
        hashCodeBuilder.append( nesqgexp );
        hashCodeBuilder.append( tpiva );
        hashCodeBuilder.append( tpdocum );
        hashCodeBuilder.append( topecoas );
        hashCodeBuilder.append( tpconcod );
        hashCodeBuilder.append( idconcob );
        hashCodeBuilder.append( tpcomis );
        hashCodeBuilder.append( nagente1 );
        hashCodeBuilder.append( porcpart1 );
        hashCodeBuilder.append( nagente2 );
        hashCodeBuilder.append( porcpart2 );
        hashCodeBuilder.append( nagente3 );
        hashCodeBuilder.append( porcpart3 );
        hashCodeBuilder.append( porcredag );
        hashCodeBuilder.append( porcredsu );
        hashCodeBuilder.append( asegurados );

        return hashCodeBuilder.toHashCode() ;
    }
}
