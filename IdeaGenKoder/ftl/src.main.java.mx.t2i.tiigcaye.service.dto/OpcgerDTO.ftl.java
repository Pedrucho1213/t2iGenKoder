package ${FTL_package};

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
///import mx.t2i.tiigcaye.domain.Catramos; // 2021-06-04 ati: Debe relacionarse con CatramosDTO al mismo nivel
//import mx.t2i.tiigcaye.domain.Tablareq;
//import mx.t2i.tiigcaye.domain.Guiaramo;
//import mx.t2i.tiigcaye.domain.Cobambul;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link mx.t2i.catalogos.domain.Opcger} entity.
 */
@ApiModel(description = "OPCIONES GERENCIALES.                                       ")
public class ${FTL_ClassDTO} implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	///    @NotNull
    @ApiModelProperty(value = "message", required = false)
	private String message;
	
    private ${FTL_CatDTO} ${FTL_catDTO};

//  private Tablareq tablareq;

//  private Guiaramo guiaramo;

//  private Cobambul cobambul;

    /**
     * Ramo/subramo (2/3)
     */
    @NotNull
    @ApiModelProperty(value = "Ramo/subramo (2/3)", required = true)
    private Integer ramsubramo;

    /**
     * Moneda
     */
    @NotNull
    @ApiModelProperty(value = "Moneda", required = true)
    private Integer moneda;

    /**
     * Numero de norma
     */
    @NotNull
    @ApiModelProperty(value = "Numero de norma", required = true)
    private Integer numnorma;

    /**
     * Fecha de inicio de vigencia
     */
    @NotNull
    @ApiModelProperty(value = "Fecha de inicio de vigencia", required = true)
    private Instant finivig;

    /**
     * Descripcion de la norma
     */
    @NotNull
    @ApiModelProperty(value = "Descripcion de la norma", required = true)
    private String descnorm;

    /**
     * Valores [ 1 ]
     */
///    @NotNull
    @ApiModelProperty(value = "Valores [ 1 ]", required = true)
    private Double valor1;

    /**
     * Valores [ 2 ]
     */
///    @NotNull
    @ApiModelProperty(value = "Valores [ 2 ]", required = true)
    private Double valor2;

    /**
     * Valores [ 3 ]
     */
///    @NotNull
    @ApiModelProperty(value = "Valores [ 3 ]", required = true)
    private Double valor3;

    /**
     * Valores [ 4 ]
     */
///    @NotNull
    @ApiModelProperty(value = "Valores [ 4 ]", required = true)
    private Double valor4;

    /**
     * Valores [ 5 ]
     */
///    @NotNull
    @ApiModelProperty(value = "Valores [ 5 ]", required = true)
    private Double valor5;

    /**
     * Valores [ 6 ]
     */
///    @NotNull
    @ApiModelProperty(value = "Valores [ 6 ]", required = true)
    private Double valor6;

    /**
     * Valores [ 7 ]
     */
///    @NotNull
    @ApiModelProperty(value = "Valores [ 7 ]", required = true)
    private Double valor7;

    /**
     * Valores [ 8 ]
     */
///    @NotNull
    @ApiModelProperty(value = "Valores [ 8 ]", required = true)
    private Double valor8;

    /**
     * Valores [ 9 ]
     */
///    @NotNull
    @ApiModelProperty(value = "Valores [ 9 ]", required = true)
    private Double valor9;

    /**
     * Valores [ 10 ]
     */
///    @NotNull
    @ApiModelProperty(value = "Valores [ 10 ]", required = true)
    private Double valor10;

    /**
     * Valores [ 11 ]
     */
///    @NotNull
    @ApiModelProperty(value = "Valores [ 11 ]", required = true)
    private Double valor11;

    /**
     * Valores [ 12 ]
     */
///    @NotNull
    @ApiModelProperty(value = "Valores [ 12 ]", required = true)
    private Double valor12;

    /**
     * Descripcion de cada valor [ 1 ]
     */
///    @NotNull
    @ApiModelProperty(value = "Descripcion de cada valor [ 1 ]", required = true)
    private String descval1;

    /**
     * Descripcion de cada valor [ 2 ]
     */
///    @NotNull
    @ApiModelProperty(value = "Descripcion de cada valor [ 2 ]", required = true)
    private String descval2;

    /**
     * Descripcion de cada valor [ 3 ]
     */
///    @NotNull
    @ApiModelProperty(value = "Descripcion de cada valor [ 3 ]", required = true)
    private String descval3;

    /**
     * Descripcion de cada valor [ 4 ]
     */
///    @NotNull
    @ApiModelProperty(value = "Descripcion de cada valor [ 4 ]", required = true)
    private String descval4;

    /**
     * Descripcion de cada valor [ 5 ]
     */
///    @NotNull
    @ApiModelProperty(value = "Descripcion de cada valor [ 5 ]", required = true)
    private String descval5;

    /**
     * Descripcion de cada valor [ 6 ]
     */
///    @NotNull
    @ApiModelProperty(value = "Descripcion de cada valor [ 6 ]", required = true)
    private String descval6;

    /**
     * Descripcion de cada valor [ 7 ]
     */
///    @NotNull
    @ApiModelProperty(value = "Descripcion de cada valor [ 7 ]", required = true)
    private String descval7;

    /**
     * Descripcion de cada valor [ 8 ]
     */
///    @NotNull
    @ApiModelProperty(value = "Descripcion de cada valor [ 8 ]", required = true)
    private String descval8;

    /**
     * Descripcion de cada valor [ 9 ]
     */
///    @NotNull
    @ApiModelProperty(value = "Descripcion de cada valor [ 9 ]", required = true)
    private String descval9;

    /**
     * Descripcion de cada valor [ 10 ]
     */
///    @NotNull
    @ApiModelProperty(value = "Descripcion de cada valor [ 10 ]", required = true)
    private String descval10;

    /**
     * Descripcion de cada valor [ 11 ]
     */
///    @NotNull
    @ApiModelProperty(value = "Descripcion de cada valor [ 11 ]", required = true)
    private String descval11;

    /**
     * Descripcion de cada valor [ 12 ]
     */
///    @NotNull
    @ApiModelProperty(value = "Descripcion de cada valor [ 12 ]", required = true)
    private String descval12;

///    @NotNull
    @ApiModelProperty(value = "nombrel", required = true)
    private String nombrel;

///    @NotNull
    @ApiModelProperty(value = "moneda_i", required = true)
    private String moneda_i;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ${FTL_CatDTO} get${FTL_Cat}() {
        return ${FTL_catDTO};
    }

    public void set${FTL_Cat}(${FTL_CatDTO} ${FTL_cat}) {
        this.${FTL_catDTO} = ${FTL_cat};
    }

//  public Tablareq getTablareq() {
//      return tablareq;
//  }

//  public void setTablareq(Tablareq tablareq) {
//      this.tablareq = tablareq;
//  }

//  public Guiaramo getGuiaramo() {
//      return guiaramo;
//  }

//  public void setGuiaramo(Guiaramo guiaramo) {
//      this.guiaramo = guiaramo;
//  }

//  public Cobambul getCobambul() {
//      return cobambul;
//  }

//  public void setCobambul(Cobambul cobambul) {
//      this.cobambul = cobambul;
//  }

    public Integer getRamsubramo() { return ramsubramo; }
    public void   setRamsubramo(Integer ramsubramo) { this.ramsubramo = ramsubramo; }

    public Integer getMoneda() { return moneda; }
    public void   setMoneda(Integer moneda) { this.moneda = moneda; }

    public Integer getNumnorma() { return numnorma; }
    public void   setNumnorma(Integer numnorma) { this.numnorma = numnorma; }

    public Instant getFinivig() { return finivig; }
    public void   setFinivig(Instant finivig) { this.finivig = finivig; }

    public String getDescnorm() { return descnorm; }
    public void   setDescnorm(String descnorm) { this.descnorm = descnorm; }

    public Double getValor1() { return valor1; }
    public void   setValor1(Double valor1) { this.valor1 = valor1; }

    public Double getValor2() { return valor2; }
    public void   setValor2(Double valor2) { this.valor2 = valor2; }

    public Double getValor3() { return valor3; }
    public void   setValor3(Double valor3) { this.valor3 = valor3; }

    public Double getValor4() { return valor4; }
    public void   setValor4(Double valor4) { this.valor4 = valor4; }

    public Double getValor5() { return valor5; }
    public void   setValor5(Double valor5) { this.valor5 = valor5; }

    public Double getValor6() { return valor6; }
    public void   setValor6(Double valor6) { this.valor6 = valor6; }

    public Double getValor7() { return valor7; }
    public void   setValor7(Double valor7) { this.valor7 = valor7; }

    public Double getValor8() { return valor8; }
    public void   setValor8(Double valor8) { this.valor8 = valor8; }

    public Double getValor9() { return valor9; }
    public void   setValor9(Double valor9) { this.valor9 = valor9; }

    public Double getValor10() { return valor10; }
    public void   setValor10(Double valor10) { this.valor10 = valor10; }

    public Double getValor11() { return valor11; }
    public void   setValor11(Double valor11) { this.valor11 = valor11; }

    public Double getValor12() { return valor12; }
    public void   setValor12(Double valor12) { this.valor12 = valor12; }

    public String getDescval1() { return descval1; }
    public void   setDescval1(String descval1) { this.descval1 = descval1; }

    public String getDescval2() { return descval2; }
    public void   setDescval2(String descval2) { this.descval2 = descval2; }

    public String getDescval3() { return descval3; }
    public void   setDescval3(String descval3) { this.descval3 = descval3; }

    public String getDescval4() { return descval4; }
    public void   setDescval4(String descval4) { this.descval4 = descval4; }

    public String getDescval5() { return descval5; }
    public void   setDescval5(String descval5) { this.descval5 = descval5; }

    public String getDescval6() { return descval6; }
    public void   setDescval6(String descval6) { this.descval6 = descval6; }

    public String getDescval7() { return descval7; }
    public void   setDescval7(String descval7) { this.descval7 = descval7; }

    public String getDescval8() { return descval8; }
    public void   setDescval8(String descval8) { this.descval8 = descval8; }

    public String getDescval9() { return descval9; }
    public void   setDescval9(String descval9) { this.descval9 = descval9; }

    public String getDescval10() { return descval10; }
    public void   setDescval10(String descval10) { this.descval10 = descval10; }

    public String getDescval11() { return descval11; }
    public void   setDescval11(String descval11) { this.descval11 = descval11; }

    public String getDescval12() { return descval12; }
    public void   setDescval12(String descval12) { this.descval12 = descval12; }

    public String getNombrel() { return nombrel; }
	public void setNombrel(String nombrel) { this.nombrel = nombrel; }

	public String getMoneda_i() { return moneda_i; }
	public void setMoneda_i(String moneda_i) { this.moneda_i = moneda_i; }

	// prettier-ignore
    @Override
    public String toString() {
        return "${FTL_ClassDTO}{" +
            "id=" + getId() +
            ", ramsubramo='" + getRamsubramo() + "'" +
            ", moneda='" + getMoneda() + "'" +
            ", numnorma='" + getNumnorma() + "'" +
            ", finivig='" + getFinivig() + "'" +
            ", descnorm='" + getDescnorm() + "'" +
            ", valor1='" + getValor1() + "'" +
            ", valor2='" + getValor2() + "'" +
            ", valor3='" + getValor3() + "'" +
            ", valor4='" + getValor4() + "'" +
            ", valor5='" + getValor5() + "'" +
            ", valor6='" + getValor6() + "'" +
            ", valor7='" + getValor7() + "'" +
            ", valor8='" + getValor8() + "'" +
            ", valor9='" + getValor9() + "'" +
            ", valor10='" + getValor10() + "'" +
            ", valor11='" + getValor11() + "'" +
            ", valor12='" + getValor12() + "'" +
            ", descval1='" + getDescval1() + "'" +
            ", descval2='" + getDescval2() + "'" +
            ", descval3='" + getDescval3() + "'" +
            ", descval4='" + getDescval4() + "'" +
            ", descval5='" + getDescval5() + "'" +
            ", descval6='" + getDescval6() + "'" +
            ", descval7='" + getDescval7() + "'" +
            ", descval8='" + getDescval8() + "'" +
            ", descval9='" + getDescval9() + "'" +
            ", descval10='" + getDescval10() + "'" +
            ", descval11='" + getDescval11() + "'" +
            ", descval12='" + getDescval12() + "'" +
            ", nombrel='" + getNombrel() + "'" +
            ", moneda_i='" + getMoneda_i() + "'" +
            "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((descnorm == null) ? 0 : descnorm.hashCode());
        result = prime * result + ((descval1 == null) ? 0 : descval1.hashCode());
        result = prime * result + ((descval2 == null) ? 0 : descval2.hashCode());
        result = prime * result + ((descval3 == null) ? 0 : descval3.hashCode());
        result = prime * result + ((descval4 == null) ? 0 : descval4.hashCode());
        result = prime * result + ((descval5 == null) ? 0 : descval5.hashCode());
        result = prime * result + ((descval6 == null) ? 0 : descval6.hashCode());
        result = prime * result + ((descval7 == null) ? 0 : descval7.hashCode());
        result = prime * result + ((descval8 == null) ? 0 : descval8.hashCode());
        result = prime * result + ((descval9 == null) ? 0 : descval9.hashCode());
        result = prime * result + ((descval10 == null) ? 0 : descval10.hashCode());
        result = prime * result + ((descval11 == null) ? 0 : descval11.hashCode());
        result = prime * result + ((descval12 == null) ? 0 : descval12.hashCode());
        result = prime * result + ((ramsubramo == null) ? 0 : ramsubramo.hashCode());
        result = prime * result + ((moneda == null) ? 0 : moneda.hashCode());
        result = prime * result + ((numnorma == null) ? 0 : numnorma.hashCode());
        result = prime * result + ((finivig == null) ? 0 : finivig.hashCode());
        result = prime * result + ((valor1 == null) ? 0 : valor1.hashCode());
        result = prime * result + ((valor2 == null) ? 0 : valor2.hashCode());
        result = prime * result + ((valor3 == null) ? 0 : valor3.hashCode());
        result = prime * result + ((valor4 == null) ? 0 : valor4.hashCode());
        result = prime * result + ((valor5 == null) ? 0 : valor5.hashCode());
        result = prime * result + ((valor6 == null) ? 0 : valor6.hashCode());
        result = prime * result + ((valor7 == null) ? 0 : valor7.hashCode());
        result = prime * result + ((valor8 == null) ? 0 : valor8.hashCode());
        result = prime * result + ((valor9 == null) ? 0 : valor9.hashCode());
        result = prime * result + ((valor10 == null) ? 0 : valor10.hashCode());
        result = prime * result + ((valor11 == null) ? 0 : valor11.hashCode());
        result = prime * result + ((valor12 == null) ? 0 : valor12.hashCode());
        result = prime * result + ((nombrel == null) ? 0 : nombrel.hashCode());
        result = prime * result + ((moneda_i == null) ? 0 : moneda_i.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass () != obj.getClass ())
            return false;
        OpcgerDTO other = (OpcgerDTO) obj;
        if (descnorm == null) {
            if (other.descnorm != null)
                return false;
        } else if (!descnorm.equals(other.descnorm))
            return false;
        if (descval1 == null) {
            if (other.descval1 != null)
                return false;
        } else if (!descval1  .equals(other.descval1))
            return false;
        if (descval2 == null) {
            if (other.descval2 != null)
                return false;
        } else if (!descval2  .equals(other.descval2))
            return false;
        if (descval3 == null) {
            if (other.descval3 != null)
                return false;
        } else if (!descval3  .equals(other.descval3))
            return false;
        if (descval4 == null) {
            if (other.descval4 != null)
                return false;
        } else if (!descval4  .equals(other.descval4))
            return false;
        if (descval5 == null) {
            if (other.descval5 != null)
                return false;
        } else if (!descval5  .equals(other.descval5))
            return false;
        if (descval6 == null) {
            if (other.descval6 != null)
                return false;
        } else if (!descval6  .equals(other.descval6))
            return false;
        if (descval7 == null) {
            if (other.descval7 != null)
                return false;
        } else if (!descval7  .equals(other.descval7))
            return false;
        if (descval8 == null) {
            if (other.descval8 != null)
                return false;
        } else if (!descval8  .equals(other.descval8))
            return false;
        if (descval9 == null) {
            if (other.descval9 != null)
                return false;
        } else if (!descval9  .equals(other.descval9))
            return false;
        if (descval10 == null) {
            if (other.descval10 != null)
                return false;
        } else if (!descval10 .equals(other.descval10))
            return false;
        if (descval11 == null) {
            if (other.descval11 != null)
                return false;
        } else if (!descval11 .equals(other.descval11))
            return false;
        if (descval12 == null) {
            if (other.descval12 != null)
                return false;
        } else if (!descval12 .equals(other.descval12))
            return false;
        if (ramsubramo == null) {
            if (other.ramsubramo != null)
                return false;
        } else if (!ramsubramo.equals(other.ramsubramo))
            return false;
        if (moneda == null) {
            if (other.moneda != null)
                return false;
        } else if (!moneda.equals(other.moneda))
            return false;
        if (numnorma == null) {
            if (other.numnorma != null)
                return false;
        } else if (!numnorma.equals(other.numnorma))
            return false;
        if (finivig == null) {
            if (other.finivig != null)
                return false;
        } else if (!finivig.equals(other.finivig))
            return false;
        if (valor1 == null) {
            if (other.valor1 != null)
                return false;
        } else if (!valor1.equals(other.valor1))
            return false;
        if (valor2 == null) {
            if (other.valor2 != null)
                return false;
        } else if (!valor2.equals(other.valor2))
            return false;
        if (valor3 == null) {
            if (other.valor3 != null)
                return false;
        } else if (!valor3.equals(other.valor3))
            return false;
        if (valor4 == null) {
            if (other.valor4 != null)
                return false;
        } else if (!valor4.equals(other.valor4))
            return false;
        if (valor5 == null) {
            if (other.valor5 != null)
                return false;
        } else if (!valor5.equals(other.valor5))
            return false;
        if (valor6 == null) {
            if (other.valor6 != null)
                return false;
        } else if (!valor6.equals(other.valor6))
            return false;
        if (valor7 == null) {
            if (other.valor7 != null)
                return false;
        } else if (!valor7.equals(other.valor7))
            return false;
        if (valor8 == null) {
            if (other.valor8 != null)
                return false;
        } else if (!valor8.equals(other.valor8))
            return false;
        if (valor9 == null) {
            if (other.valor9 != null)
                return false;
        } else if (!valor9.equals(other.valor9))
            return false;
        if (valor10 == null) {
            if (other.valor10 != null)
                return false;
        } else if (!valor10.equals(other.valor10))
            return false;
        if (valor11 == null) {
            if (other.valor11 != null)
                return false;
        } else if (!valor11.equals(other.valor11))
            return false;
        if (valor12 == null) {
            if (other.valor12 != null)
                return false;
        } else if (!valor12.equals(other.valor12))
            return false;
        if (nombrel == null) {
            if (other.nombrel != null)
                return false;
        } else if (!nombrel.equals(other.nombrel))
            return false;
        return true;
    }

}

