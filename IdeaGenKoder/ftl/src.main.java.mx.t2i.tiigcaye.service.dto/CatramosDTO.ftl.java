package ${FTL_package};

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
//import mx.t2i.tiigcaye.domain.Guiaramo;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.List;

/**
 * A DTO for the {@link mx.t2i.catalogos.domain.Catramos} entity.
 */
@ApiModel(description = "CATALOGO DE RAMOS/SUBRAMOS.                                 ")
public class ${FTL_CatDTO} implements Serializable {

    private Long id;

//  private Guiaramo guiaramo;

    /**
     * Ramo/subramo (2/3)
     */
    @NotNull
    @ApiModelProperty(value = "Ramo/subramo (2/3)", required = true)
    private Integer ramsubramo;

    /**
     * Nombre largo
     */
    @NotNull
    @ApiModelProperty(value = "Nombre largo", required = true)
    private String nombrel;

    /**
     * Nombre corto
     */
    @NotNull
    @ApiModelProperty(value = "Nombre corto", required = true)
    private String nombrec;

    /**
     * Nombre minimo
     */
    @NotNull
    @ApiModelProperty(value = "Nombre minimo", required = true)
    private String nombrem;

    /**
     * Criterio de contabilizacion
     */
    @NotNull
    @ApiModelProperty(value = "Criterio de contabilizacion", required = true)
    private Integer contab;

    /**
     * Criterio para numeracion de polizas iniciales
     */
    @NotNull
    @ApiModelProperty(value = "Criterio para numeracion de polizas iniciales", required = true)
    private Integer cvnpolini;

    /**
     * Ultimo numero de poliza asignado
     */
    @NotNull
    @ApiModelProperty(value = "Ultimo numero de poliza asignado", required = true)
    private Integer ultnpoliza;

    /**
     * Criterio para numeracion de polizas en la renovaci
     */
    @NotNull
    @ApiModelProperty(value = "Criterio para numeracion de polizas en la renovaci", required = true)
    private Integer cvnpolren;

    /**
     * Criterio para numeracion de endosos a,d,b
     */
    @NotNull
    @ApiModelProperty(value = "Criterio para numeracion de endosos a,d,b", required = true)
    private Integer cvnendoso;

    /**
     * Ultimo numero de endoso asignado para el ramo/subr [ 1 ]
     */
    @NotNull
    @ApiModelProperty(value = "Ultimo numero de endoso asignado para el ramo/subr [ 1 ]", required = true)
    private Integer ultnendoso1;

    /**
     * Ultimo numero de endoso asignado para el ramo/subr [ 2 ]
     */
    @NotNull
    @ApiModelProperty(value = "Ultimo numero de endoso asignado para el ramo/subr [ 2 ]", required = true)
    private Integer ultnendoso2;

    /**
     * Ultimo numero de endoso asignado para el ramo/subr [ 3 ]
     */
    @NotNull
    @ApiModelProperty(value = "Ultimo numero de endoso asignado para el ramo/subr [ 3 ]", required = true)
    private Integer ultnendoso3;

    /**
     * Tipo de polizas
     */
    @NotNull
    @ApiModelProperty(value = "Tipo de polizas", required = true)
    private Integer tiporamo;

    /**
     * Clave inidica si o no emitir cobertura provisional
     */
    @NotNull
    @ApiModelProperty(value = "Clave inidica si o no emitir cobertura provisional", required = true)
    private Integer cvcobp;

    /**
     * Plazo maximo de cada cubierta provisional (meses)
     */
    @NotNull
    @ApiModelProperty(value = "Plazo maximo de cada cubierta provisional (meses)", required = true)
    private Integer pzmaxcp;

    /**
     * Plazo maximo absoluto de cobertura provisional
     */
    @NotNull
    @ApiModelProperty(value = "Plazo maximo absoluto de cobertura provisional", required = true)
    private Integer pzmabcp;

    /**
     * Criterio para aplicar gastos de espedicion de poli
     */
    @NotNull
    @ApiModelProperty(value = "Criterio para aplicar gastos de espedicion de poli", required = true)
    private Integer critgexp;

    /**
     * Esquema de gastos de expedicion
     */
    @NotNull
    @ApiModelProperty(value = "Esquema de gastos de expedicion", required = true)
    private Integer nesqgexp;

    /**
     * Criterio para contabilizar coberturas
     */
    @NotNull
    @ApiModelProperty(value = "Criterio para contabilizar coberturas", required = true)
    private Integer cvcontcob;

    /**
     * Criterio para aplicar el esquema de descuento
     */
    @NotNull
    @ApiModelProperty(value = "Criterio para aplicar el esquema de descuento", required = true)
    private Integer critdesc;

    /**
     * Esquema de descuento
     */
    @NotNull
    @ApiModelProperty(value = "Esquema de descuento", required = true)
    private Integer nesqdesc;

    /**
     * Criterio para aplicar el esquema de compensacion
     */
    @NotNull
    @ApiModelProperty(value = "Criterio para aplicar el esquema de compensacion", required = true)
    private Integer critcomp;

    /**
     * Esquema de compensacion
     */
    @NotNull
    @ApiModelProperty(value = "Esquema de compensacion", required = true)
    private Integer nesqcomp;

    /**
     * Tipo de renovacion
     */
    @NotNull
    @ApiModelProperty(value = "Tipo de renovacion", required = true)
    private Integer tiporenov;

    /**
     * Rango de dias para corto plazo [ 1 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 1 ]", required = true)
    private Integer diascpzo1;

    /**
     * Rango de dias para corto plazo [ 2 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 2 ]", required = true)
    private Integer diascpzo2;

    /**
     * Rango de dias para corto plazo [ 3 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 3 ]", required = true)
    private Integer diascpzo3;

    /**
     * Rango de dias para corto plazo [ 4 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 4 ]", required = true)
    private Integer diascpzo4;

    /**
     * Rango de dias para corto plazo [ 5 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 5 ]", required = true)
    private Integer diascpzo5;

    /**
     * Rango de dias para corto plazo [ 6 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 6 ]", required = true)
    private Integer diascpzo6;

    /**
     * Rango de dias para corto plazo [ 7 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 7 ]", required = true)
    private Integer diascpzo7;

    /**
     * Rango de dias para corto plazo [ 8 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 8 ]", required = true)
    private Integer diascpzo8;

    /**
     * Rango de dias para corto plazo [ 9 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 9 ]", required = true)
    private Integer diascpzo9;

    /**
     * Rango de dias para corto plazo [ 10 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 10 ]", required = true)
    private Integer diascpzo10;

    /**
     * Rango de dias para corto plazo [ 11 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 11 ]", required = true)
    private Integer diascpzo11;

    /**
     * Rango de dias para corto plazo [ 12 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 12 ]", required = true)
    private Integer diascpzo12;

    /**
     * Rango de dias para corto plazo [ 13 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 13 ]", required = true)
    private Integer diascpzo13;

    /**
     * Rango de dias para corto plazo [ 14 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 14 ]", required = true)
    private Integer diascpzo14;

    /**
     * Rango de dias para corto plazo [ 15 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 15 ]", required = true)
    private Integer diascpzo15;

    /**
     * Rango de dias para corto plazo [ 16 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 16 ]", required = true)
    private Integer diascpzo16;

    /**
     * Rango de dias para corto plazo [ 17 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 17 ]", required = true)
    private Integer diascpzo17;

    /**
     * Rango de dias para corto plazo [ 18 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 18 ]", required = true)
    private Integer diascpzo18;

    /**
     * Rango de dias para corto plazo [ 19 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 19 ]", required = true)
    private Integer diascpzo19;

    /**
     * Rango de dias para corto plazo [ 20 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 20 ]", required = true)
    private Integer diascpzo20;

    /**
     * Rango de dias para corto plazo [ 21 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 21 ]", required = true)
    private Integer diascpzo21;

    /**
     * Rango de dias para corto plazo [ 22 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 22 ]", required = true)
    private Integer diascpzo22;

    /**
     * Rango de dias para corto plazo [ 23 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 23 ]", required = true)
    private Integer diascpzo23;

    /**
     * Rango de dias para corto plazo [ 24 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 24 ]", required = true)
    private Integer diascpzo24;

    /**
     * Rango de dias para corto plazo [ 25 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 25 ]", required = true)
    private Integer diascpzo25;

    /**
     * Rango de dias para corto plazo [ 26 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 26 ]", required = true)
    private Integer diascpzo26;

    /**
     * Rango de dias para corto plazo [ 27 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 27 ]", required = true)
    private Integer diascpzo27;

    /**
     * Rango de dias para corto plazo [ 28 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 28 ]", required = true)
    private Integer diascpzo28;

    /**
     * Rango de dias para corto plazo [ 29 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 29 ]", required = true)
    private Integer diascpzo29;

    /**
     * Rango de dias para corto plazo [ 30 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 30 ]", required = true)
    private Integer diascpzo30;

    /**
     * Rango de dias para corto plazo [ 31 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 31 ]", required = true)
    private Integer diascpzo31;

    /**
     * Rango de dias para corto plazo [ 32 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 32 ]", required = true)
    private Integer diascpzo32;

    /**
     * Rango de dias para corto plazo [ 33 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 33 ]", required = true)
    private Integer diascpzo33;

    /**
     * Rango de dias para corto plazo [ 34 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 34 ]", required = true)
    private Integer diascpzo34;

    /**
     * Rango de dias para corto plazo [ 35 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 35 ]", required = true)
    private Integer diascpzo35;

    /**
     * Rango de dias para corto plazo [ 36 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 36 ]", required = true)
    private Integer diascpzo36;

    /**
     * Rango de dias para corto plazo [ 37 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 37 ]", required = true)
    private Integer diascpzo37;

    /**
     * Rango de dias para corto plazo [ 38 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 38 ]", required = true)
    private Integer diascpzo38;

    /**
     * Rango de dias para corto plazo [ 39 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 39 ]", required = true)
    private Integer diascpzo39;

    /**
     * Rango de dias para corto plazo [ 40 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 40 ]", required = true)
    private Integer diascpzo40;

    /**
     * Rango de dias para corto plazo [ 41 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 41 ]", required = true)
    private Integer diascpzo41;

    /**
     * Rango de dias para corto plazo [ 42 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 42 ]", required = true)
    private Integer diascpzo42;

    /**
     * Rango de dias para corto plazo [ 43 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 43 ]", required = true)
    private Integer diascpzo43;

    /**
     * Rango de dias para corto plazo [ 44 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 44 ]", required = true)
    private Integer diascpzo44;

    /**
     * Rango de dias para corto plazo [ 45 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 45 ]", required = true)
    private Integer diascpzo45;

    /**
     * Rango de dias para corto plazo [ 46 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 46 ]", required = true)
    private Integer diascpzo46;

    /**
     * Rango de dias para corto plazo [ 47 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 47 ]", required = true)
    private Integer diascpzo47;

    /**
     * Rango de dias para corto plazo [ 48 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 48 ]", required = true)
    private Integer diascpzo48;

    /**
     * Rango de dias para corto plazo [ 49 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 49 ]", required = true)
    private Integer diascpzo49;

    /**
     * Rango de dias para corto plazo [ 50 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango de dias para corto plazo [ 50 ]", required = true)
    private Integer diascpzo50;

    /**
     * Porcentaje de prima anual para corto plazo [ 1 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 1 ]", required = true)
    private Double porccpzo1;

    /**
     * Porcentaje de prima anual para corto plazo [ 2 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 2 ]", required = true)
    private Double porccpzo2;

    /**
     * Porcentaje de prima anual para corto plazo [ 3 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 3 ]", required = true)
    private Double porccpzo3;

    /**
     * Porcentaje de prima anual para corto plazo [ 4 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 4 ]", required = true)
    private Double porccpzo4;

    /**
     * Porcentaje de prima anual para corto plazo [ 5 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 5 ]", required = true)
    private Double porccpzo5;

    /**
     * Porcentaje de prima anual para corto plazo [ 6 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 6 ]", required = true)
    private Double porccpzo6;

    /**
     * Porcentaje de prima anual para corto plazo [ 7 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 7 ]", required = true)
    private Double porccpzo7;

    /**
     * Porcentaje de prima anual para corto plazo [ 8 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 8 ]", required = true)
    private Double porccpzo8;

    /**
     * Porcentaje de prima anual para corto plazo [ 9 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 9 ]", required = true)
    private Double porccpzo9;

    /**
     * Porcentaje de prima anual para corto plazo [ 10 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 10 ]", required = true)
    private Double porccpzo10;

    /**
     * Porcentaje de prima anual para corto plazo [ 11 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 11 ]", required = true)
    private Double porccpzo11;

    /**
     * Porcentaje de prima anual para corto plazo [ 12 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 12 ]", required = true)
    private Double porccpzo12;

    /**
     * Porcentaje de prima anual para corto plazo [ 13 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 13 ]", required = true)
    private Double porccpzo13;

    /**
     * Porcentaje de prima anual para corto plazo [ 14 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 14 ]", required = true)
    private Double porccpzo14;

    /**
     * Porcentaje de prima anual para corto plazo [ 15 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 15 ]", required = true)
    private Double porccpzo15;

    /**
     * Porcentaje de prima anual para corto plazo [ 16 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 16 ]", required = true)
    private Double porccpzo16;

    /**
     * Porcentaje de prima anual para corto plazo [ 17 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 17 ]", required = true)
    private Double porccpzo17;

    /**
     * Porcentaje de prima anual para corto plazo [ 18 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 18 ]", required = true)
    private Double porccpzo18;

    /**
     * Porcentaje de prima anual para corto plazo [ 19 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 19 ]", required = true)
    private Double porccpzo19;

    /**
     * Porcentaje de prima anual para corto plazo [ 20 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 20 ]", required = true)
    private Double porccpzo20;

    /**
     * Porcentaje de prima anual para corto plazo [ 21 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 21 ]", required = true)
    private Double porccpzo21;

    /**
     * Porcentaje de prima anual para corto plazo [ 22 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 22 ]", required = true)
    private Double porccpzo22;

    /**
     * Porcentaje de prima anual para corto plazo [ 23 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 23 ]", required = true)
    private Double porccpzo23;

    /**
     * Porcentaje de prima anual para corto plazo [ 24 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 24 ]", required = true)
    private Double porccpzo24;

    /**
     * Porcentaje de prima anual para corto plazo [ 25 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 25 ]", required = true)
    private Double porccpzo25;

    /**
     * Porcentaje de prima anual para corto plazo [ 26 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 26 ]", required = true)
    private Double porccpzo26;

    /**
     * Porcentaje de prima anual para corto plazo [ 27 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 27 ]", required = true)
    private Double porccpzo27;

    /**
     * Porcentaje de prima anual para corto plazo [ 28 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 28 ]", required = true)
    private Double porccpzo28;

    /**
     * Porcentaje de prima anual para corto plazo [ 29 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 29 ]", required = true)
    private Double porccpzo29;

    /**
     * Porcentaje de prima anual para corto plazo [ 30 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 30 ]", required = true)
    private Double porccpzo30;

    /**
     * Porcentaje de prima anual para corto plazo [ 31 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 31 ]", required = true)
    private Double porccpzo31;

    /**
     * Porcentaje de prima anual para corto plazo [ 32 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 32 ]", required = true)
    private Double porccpzo32;

    /**
     * Porcentaje de prima anual para corto plazo [ 33 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 33 ]", required = true)
    private Double porccpzo33;

    /**
     * Porcentaje de prima anual para corto plazo [ 34 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 34 ]", required = true)
    private Double porccpzo34;

    /**
     * Porcentaje de prima anual para corto plazo [ 35 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 35 ]", required = true)
    private Double porccpzo35;

    /**
     * Porcentaje de prima anual para corto plazo [ 36 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 36 ]", required = true)
    private Double porccpzo36;

    /**
     * Porcentaje de prima anual para corto plazo [ 37 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 37 ]", required = true)
    private Double porccpzo37;

    /**
     * Porcentaje de prima anual para corto plazo [ 38 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 38 ]", required = true)
    private Double porccpzo38;

    /**
     * Porcentaje de prima anual para corto plazo [ 39 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 39 ]", required = true)
    private Double porccpzo39;

    /**
     * Porcentaje de prima anual para corto plazo [ 40 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 40 ]", required = true)
    private Double porccpzo40;

    /**
     * Porcentaje de prima anual para corto plazo [ 41 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 41 ]", required = true)
    private Double porccpzo41;

    /**
     * Porcentaje de prima anual para corto plazo [ 42 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 42 ]", required = true)
    private Double porccpzo42;

    /**
     * Porcentaje de prima anual para corto plazo [ 43 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 43 ]", required = true)
    private Double porccpzo43;

    /**
     * Porcentaje de prima anual para corto plazo [ 44 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 44 ]", required = true)
    private Double porccpzo44;

    /**
     * Porcentaje de prima anual para corto plazo [ 45 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 45 ]", required = true)
    private Double porccpzo45;

    /**
     * Porcentaje de prima anual para corto plazo [ 46 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 46 ]", required = true)
    private Double porccpzo46;

    /**
     * Porcentaje de prima anual para corto plazo [ 47 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 47 ]", required = true)
    private Double porccpzo47;

    /**
     * Porcentaje de prima anual para corto plazo [ 48 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 48 ]", required = true)
    private Double porccpzo48;

    /**
     * Porcentaje de prima anual para corto plazo [ 49 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 49 ]", required = true)
    private Double porccpzo49;

    /**
     * Porcentaje de prima anual para corto plazo [ 50 ]
     */
    @NotNull
    @ApiModelProperty(value = "Porcentaje de prima anual para corto plazo [ 50 ]", required = true)
    private Double porccpzo50;

    /**
     * Ramos/subramos que pueden combinar sus coberturas [ 1 ]
     */
    @NotNull
    @ApiModelProperty(value = "Ramos/subramos que pueden combinar sus coberturas [ 1 ]", required = true)
    private Integer rsrcomb1;

    /**
     * Ramos/subramos que pueden combinar sus coberturas [ 2 ]
     */
    @NotNull
    @ApiModelProperty(value = "Ramos/subramos que pueden combinar sus coberturas [ 2 ]", required = true)
    private Integer rsrcomb2;

    /**
     * Ramos/subramos que pueden combinar sus coberturas [ 3 ]
     */
    @NotNull
    @ApiModelProperty(value = "Ramos/subramos que pueden combinar sus coberturas [ 3 ]", required = true)
    private Integer rsrcomb3;

    /**
     * Ramos/subramos que pueden combinar sus coberturas [ 4 ]
     */
    @NotNull
    @ApiModelProperty(value = "Ramos/subramos que pueden combinar sus coberturas [ 4 ]", required = true)
    private Integer rsrcomb4;

    /**
     * Ramos/subramos que pueden combinar sus coberturas [ 5 ]
     */
    @NotNull
    @ApiModelProperty(value = "Ramos/subramos que pueden combinar sus coberturas [ 5 ]", required = true)
    private Integer rsrcomb5;

    /**
     * Ramos/subramos que pueden combinar sus coberturas [ 6 ]
     */
    @NotNull
    @ApiModelProperty(value = "Ramos/subramos que pueden combinar sus coberturas [ 6 ]", required = true)
    private Integer rsrcomb6;

    /**
     * Ramos/subramos que pueden combinar sus coberturas [ 7 ]
     */
    @NotNull
    @ApiModelProperty(value = "Ramos/subramos que pueden combinar sus coberturas [ 7 ]", required = true)
    private Integer rsrcomb7;

    /**
     * Ramos/subramos que pueden combinar sus coberturas [ 8 ]
     */
    @NotNull
    @ApiModelProperty(value = "Ramos/subramos que pueden combinar sus coberturas [ 8 ]", required = true)
    private Integer rsrcomb8;

    /**
     * Ramos/subramos que pueden combinar sus coberturas [ 9 ]
     */
    @NotNull
    @ApiModelProperty(value = "Ramos/subramos que pueden combinar sus coberturas [ 9 ]", required = true)
    private Integer rsrcomb9;

    /**
     * Ramos/subramos que pueden combinar sus coberturas [ 10 ]
     */
    @NotNull
    @ApiModelProperty(value = "Ramos/subramos que pueden combinar sus coberturas [ 10 ]", required = true)
    private Integer rsrcomb10;

    /**
     * Ramos/subramos que pueden combinar sus coberturas [ 11 ]
     */
    @NotNull
    @ApiModelProperty(value = "Ramos/subramos que pueden combinar sus coberturas [ 11 ]", required = true)
    private Integer rsrcomb11;

    /**
     * Ramos/subramos que pueden combinar sus coberturas [ 12 ]
     */
    @NotNull
    @ApiModelProperty(value = "Ramos/subramos que pueden combinar sus coberturas [ 12 ]", required = true)
    private Integer rsrcomb12;

    /**
     * Ultimo numero de estudio asignado
     */
    @NotNull
    @ApiModelProperty(value = "Ultimo numero de estudio asignado", required = true)
    private Integer ultnestudi;

    /**
     * Rango del numero de asegurados [ 1 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango del numero de asegurados [ 1 ]", required = true)
    private Integer limnaseg1;

    /**
     * Rango del numero de asegurados [ 2 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango del numero de asegurados [ 2 ]", required = true)
    private Integer limnaseg2;

    /**
     * Rango del numero de asegurados [ 3 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango del numero de asegurados [ 3 ]", required = true)
    private Integer limnaseg3;

    /**
     * Rango del numero de asegurados [ 4 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango del numero de asegurados [ 4 ]", required = true)
    private Integer limnaseg4;

    /**
     * Rango del numero de asegurados [ 5 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango del numero de asegurados [ 5 ]", required = true)
    private Integer limnaseg5;

    /**
     * Rango del numero de asegurados [ 6 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango del numero de asegurados [ 6 ]", required = true)
    private Integer limnaseg6;

    /**
     * Rango del numero de asegurados [ 7 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango del numero de asegurados [ 7 ]", required = true)
    private Integer limnaseg7;

    /**
     * Rango del numero de asegurados [ 8 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango del numero de asegurados [ 8 ]", required = true)
    private Integer limnaseg8;

    /**
     * Rango del numero de asegurados [ 9 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango del numero de asegurados [ 9 ]", required = true)
    private Integer limnaseg9;

    /**
     * Rango del numero de asegurados [ 10 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango del numero de asegurados [ 10 ]", required = true)
    private Integer limnaseg10;

    /**
     * Rango del numero de asegurados [ 11 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango del numero de asegurados [ 11 ]", required = true)
    private Integer limnaseg11;

    /**
     * Rango del numero de asegurados [ 12 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango del numero de asegurados [ 12 ]", required = true)
    private Integer limnaseg12;

    /**
     * Rango del numero de asegurados [ 13 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango del numero de asegurados [ 13 ]", required = true)
    private Integer limnaseg13;

    /**
     * Rango del numero de asegurados [ 14 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango del numero de asegurados [ 14 ]", required = true)
    private Integer limnaseg14;

    /**
     * Rango del numero de asegurados [ 15 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango del numero de asegurados [ 15 ]", required = true)
    private Integer limnaseg15;

    /**
     * Rango del numero de asegurados [ 16 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango del numero de asegurados [ 16 ]", required = true)
    private Integer limnaseg16;

    /**
     * Rango del numero de asegurados [ 17 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango del numero de asegurados [ 17 ]", required = true)
    private Integer limnaseg17;

    /**
     * Rango del numero de asegurados [ 18 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango del numero de asegurados [ 18 ]", required = true)
    private Integer limnaseg18;

    /**
     * Rango del numero de asegurados [ 19 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango del numero de asegurados [ 19 ]", required = true)
    private Integer limnaseg19;

    /**
     * Rango del numero de asegurados [ 20 ]
     */
    @NotNull
    @ApiModelProperty(value = "Rango del numero de asegurados [ 20 ]", required = true)
    private Integer limnaseg20;

    /**
     * Factor aplicable  a la suma asegurada promedio sin [ 1 ]
     */
    @NotNull
    @ApiModelProperty(value = "Factor aplicable  a la suma asegurada promedio sin [ 1 ]", required = true)
    private Integer factsa1;

    /**
     * Factor aplicable  a la suma asegurada promedio sin [ 2 ]
     */
    @NotNull
    @ApiModelProperty(value = "Factor aplicable  a la suma asegurada promedio sin [ 2 ]", required = true)
    private Integer factsa2;

    /**
     * Factor aplicable  a la suma asegurada promedio sin [ 3 ]
     */
    @NotNull
    @ApiModelProperty(value = "Factor aplicable  a la suma asegurada promedio sin [ 3 ]", required = true)
    private Integer factsa3;

    /**
     * Factor aplicable  a la suma asegurada promedio sin [ 4 ]
     */
    @NotNull
    @ApiModelProperty(value = "Factor aplicable  a la suma asegurada promedio sin [ 4 ]", required = true)
    private Integer factsa4;

    /**
     * Factor aplicable  a la suma asegurada promedio sin [ 5 ]
     */
    @NotNull
    @ApiModelProperty(value = "Factor aplicable  a la suma asegurada promedio sin [ 5 ]", required = true)
    private Integer factsa5;

    /**
     * Factor aplicable  a la suma asegurada promedio sin [ 6 ]
     */
    @NotNull
    @ApiModelProperty(value = "Factor aplicable  a la suma asegurada promedio sin [ 6 ]", required = true)
    private Integer factsa6;

    /**
     * Factor aplicable  a la suma asegurada promedio sin [ 7 ]
     */
    @NotNull
    @ApiModelProperty(value = "Factor aplicable  a la suma asegurada promedio sin [ 7 ]", required = true)
    private Integer factsa7;

    /**
     * Factor aplicable  a la suma asegurada promedio sin [ 8 ]
     */
    @NotNull
    @ApiModelProperty(value = "Factor aplicable  a la suma asegurada promedio sin [ 8 ]", required = true)
    private Integer factsa8;

    /**
     * Factor aplicable  a la suma asegurada promedio sin [ 9 ]
     */
    @NotNull
    @ApiModelProperty(value = "Factor aplicable  a la suma asegurada promedio sin [ 9 ]", required = true)
    private Integer factsa9;

    /**
     * Factor aplicable  a la suma asegurada promedio sin [ 10 ]
     */
    @NotNull
    @ApiModelProperty(value = "Factor aplicable  a la suma asegurada promedio sin [ 10 ]", required = true)
    private Integer factsa10;

    /**
     * Factor aplicable  a la suma asegurada promedio sin [ 11 ]
     */
    @NotNull
    @ApiModelProperty(value = "Factor aplicable  a la suma asegurada promedio sin [ 11 ]", required = true)
    private Integer factsa11;

    /**
     * Factor aplicable  a la suma asegurada promedio sin [ 12 ]
     */
    @NotNull
    @ApiModelProperty(value = "Factor aplicable  a la suma asegurada promedio sin [ 12 ]", required = true)
    private Integer factsa12;

    /**
     * Factor aplicable  a la suma asegurada promedio sin [ 13 ]
     */
    @NotNull
    @ApiModelProperty(value = "Factor aplicable  a la suma asegurada promedio sin [ 13 ]", required = true)
    private Integer factsa13;

    /**
     * Factor aplicable  a la suma asegurada promedio sin [ 14 ]
     */
    @NotNull
    @ApiModelProperty(value = "Factor aplicable  a la suma asegurada promedio sin [ 14 ]", required = true)
    private Integer factsa14;

    /**
     * Factor aplicable  a la suma asegurada promedio sin [ 15 ]
     */
    @NotNull
    @ApiModelProperty(value = "Factor aplicable  a la suma asegurada promedio sin [ 15 ]", required = true)
    private Integer factsa15;

    /**
     * Factor aplicable  a la suma asegurada promedio sin [ 16 ]
     */
    @NotNull
    @ApiModelProperty(value = "Factor aplicable  a la suma asegurada promedio sin [ 16 ]", required = true)
    private Integer factsa16;

    /**
     * Factor aplicable  a la suma asegurada promedio sin [ 17 ]
     */
    @NotNull
    @ApiModelProperty(value = "Factor aplicable  a la suma asegurada promedio sin [ 17 ]", required = true)
    private Integer factsa17;

    /**
     * Factor aplicable  a la suma asegurada promedio sin [ 18 ]
     */
    @NotNull
    @ApiModelProperty(value = "Factor aplicable  a la suma asegurada promedio sin [ 18 ]", required = true)
    private Integer factsa18;

    /**
     * Factor aplicable  a la suma asegurada promedio sin [ 19 ]
     */
    @NotNull
    @ApiModelProperty(value = "Factor aplicable  a la suma asegurada promedio sin [ 19 ]", required = true)
    private Integer factsa19;

    /**
     * Factor aplicable  a la suma asegurada promedio sin [ 20 ]
     */
    @NotNull
    @ApiModelProperty(value = "Factor aplicable  a la suma asegurada promedio sin [ 20 ]", required = true)
    private Integer factsa20;

    /**
     * Tope maximo absoluto de suma asegurada sin examen [ 1 ]
     */
    @NotNull
    @ApiModelProperty(value = "Tope maximo absoluto de suma asegurada sin examen [ 1 ]", required = true)
    private Integer tmaxsa1;

    /**
     * Tope maximo absoluto de suma asegurada sin examen [ 2 ]
     */
    @NotNull
    @ApiModelProperty(value = "Tope maximo absoluto de suma asegurada sin examen [ 2 ]", required = true)
    private Integer tmaxsa2;

    /**
     * Tope maximo absoluto de suma asegurada sin examen [ 3 ]
     */
    @NotNull
    @ApiModelProperty(value = "Tope maximo absoluto de suma asegurada sin examen [ 3 ]", required = true)
    private Integer tmaxsa3;

    /**
     * Tope maximo absoluto de suma asegurada sin examen [ 4 ]
     */
    @NotNull
    @ApiModelProperty(value = "Tope maximo absoluto de suma asegurada sin examen [ 4 ]", required = true)
    private Integer tmaxsa4;

    /**
     * Tope maximo absoluto de suma asegurada sin examen [ 5 ]
     */
    @NotNull
    @ApiModelProperty(value = "Tope maximo absoluto de suma asegurada sin examen [ 5 ]", required = true)
    private Integer tmaxsa5;

    /**
     * Tope maximo absoluto de suma asegurada sin examen [ 6 ]
     */
    @NotNull
    @ApiModelProperty(value = "Tope maximo absoluto de suma asegurada sin examen [ 6 ]", required = true)
    private Integer tmaxsa6;

    /**
     * Tope maximo absoluto de suma asegurada sin examen [ 7 ]
     */
    @NotNull
    @ApiModelProperty(value = "Tope maximo absoluto de suma asegurada sin examen [ 7 ]", required = true)
    private Integer tmaxsa7;

    /**
     * Tope maximo absoluto de suma asegurada sin examen [ 8 ]
     */
    @NotNull
    @ApiModelProperty(value = "Tope maximo absoluto de suma asegurada sin examen [ 8 ]", required = true)
    private Integer tmaxsa8;

    /**
     * Tope maximo absoluto de suma asegurada sin examen [ 9 ]
     */
    @NotNull
    @ApiModelProperty(value = "Tope maximo absoluto de suma asegurada sin examen [ 9 ]", required = true)
    private Integer tmaxsa9;

    /**
     * Tope maximo absoluto de suma asegurada sin examen [ 10 ]
     */
    @NotNull
    @ApiModelProperty(value = "Tope maximo absoluto de suma asegurada sin examen [ 10 ]", required = true)
    private Integer tmaxsa10;

    /**
     * Tope maximo absoluto de suma asegurada sin examen [ 11 ]
     */
    @NotNull
    @ApiModelProperty(value = "Tope maximo absoluto de suma asegurada sin examen [ 11 ]", required = true)
    private Integer tmaxsa11;

    /**
     * Tope maximo absoluto de suma asegurada sin examen [ 12 ]
     */
    @NotNull
    @ApiModelProperty(value = "Tope maximo absoluto de suma asegurada sin examen [ 12 ]", required = true)
    private Integer tmaxsa12;

    /**
     * Tope maximo absoluto de suma asegurada sin examen [ 13 ]
     */
    @NotNull
    @ApiModelProperty(value = "Tope maximo absoluto de suma asegurada sin examen [ 13 ]", required = true)
    private Integer tmaxsa13;

    /**
     * Tope maximo absoluto de suma asegurada sin examen [ 14 ]
     */
    @NotNull
    @ApiModelProperty(value = "Tope maximo absoluto de suma asegurada sin examen [ 14 ]", required = true)
    private Integer tmaxsa14;

    /**
     * Tope maximo absoluto de suma asegurada sin examen [ 15 ]
     */
    @NotNull
    @ApiModelProperty(value = "Tope maximo absoluto de suma asegurada sin examen [ 15 ]", required = true)
    private Integer tmaxsa15;

    /**
     * Tope maximo absoluto de suma asegurada sin examen [ 16 ]
     */
    @NotNull
    @ApiModelProperty(value = "Tope maximo absoluto de suma asegurada sin examen [ 16 ]", required = true)
    private Integer tmaxsa16;

    /**
     * Tope maximo absoluto de suma asegurada sin examen [ 17 ]
     */
    @NotNull
    @ApiModelProperty(value = "Tope maximo absoluto de suma asegurada sin examen [ 17 ]", required = true)
    private Integer tmaxsa17;

    /**
     * Tope maximo absoluto de suma asegurada sin examen [ 18 ]
     */
    @NotNull
    @ApiModelProperty(value = "Tope maximo absoluto de suma asegurada sin examen [ 18 ]", required = true)
    private Integer tmaxsa18;

    /**
     * Tope maximo absoluto de suma asegurada sin examen [ 19 ]
     */
    @NotNull
    @ApiModelProperty(value = "Tope maximo absoluto de suma asegurada sin examen [ 19 ]", required = true)
    private Integer tmaxsa19;

    /**
     * Tope maximo absoluto de suma asegurada sin examen [ 20 ]
     */
    @NotNull
    @ApiModelProperty(value = "Tope maximo absoluto de suma asegurada sin examen [ 20 ]", required = true)
    private Integer tmaxsa20;

    /**
     * Variacion en s a  sin ex med permitida (1=aumento, [ 1 ]
     */
    @NotNull
    @ApiModelProperty(value = "Variacion en s a  sin ex med permitida (1=aumento, [ 1 ]", required = true)
    private Double varsasem1;

    /**
     * Variacion en s a  sin ex med permitida (1=aumento, [ 2 ]
     */
    @NotNull
    @ApiModelProperty(value = "Variacion en s a  sin ex med permitida (1=aumento, [ 2 ]", required = true)
    private Double varsasem2;

    /**
     * Unidad del tope maximo de s a
     */
    @NotNull
    @ApiModelProperty(value = "Unidad del tope maximo de s a", required = true)
    private Integer cvtmaxsa;

    /**
     * Requisitos de asegurabilidad para seleccion [ 1 ]
     */
    @NotNull
    @ApiModelProperty(value = "Requisitos de asegurabilidad para seleccion [ 1 ]", required = true)
    private Integer reqaseg1;

    /**
     * Requisitos de asegurabilidad para seleccion [ 2 ]
     */
    @NotNull
    @ApiModelProperty(value = "Requisitos de asegurabilidad para seleccion [ 2 ]", required = true)
    private Integer reqaseg2;

    /**
     * Requisitos de asegurabilidad para seleccion [ 3 ]
     */
    @NotNull
    @ApiModelProperty(value = "Requisitos de asegurabilidad para seleccion [ 3 ]", required = true)
    private Integer reqaseg3;

    /**
     * Requisitos de asegurabilidad para seleccion [ 4 ]
     */
    @NotNull
    @ApiModelProperty(value = "Requisitos de asegurabilidad para seleccion [ 4 ]", required = true)
    private Integer reqaseg4;

    /**
     * Requisitos de asegurabilidad para seleccion [ 5 ]
     */
    @NotNull
    @ApiModelProperty(value = "Requisitos de asegurabilidad para seleccion [ 5 ]", required = true)
    private Integer reqaseg5;

    /**
     * Requisitos de asegurabilidad para seleccion [ 6 ]
     */
    @NotNull
    @ApiModelProperty(value = "Requisitos de asegurabilidad para seleccion [ 6 ]", required = true)
    private Integer reqaseg6;

    /**
     * Requisitos de asegurabilidad para seleccion [ 7 ]
     */
    @NotNull
    @ApiModelProperty(value = "Requisitos de asegurabilidad para seleccion [ 7 ]", required = true)
    private Integer reqaseg7;

    /**
     * Requisitos de asegurabilidad para seleccion [ 8 ]
     */
    @NotNull
    @ApiModelProperty(value = "Requisitos de asegurabilidad para seleccion [ 8 ]", required = true)
    private Integer reqaseg8;

    /**
     * Requisitos de asegurabilidad para seleccion [ 9 ]
     */
    @NotNull
    @ApiModelProperty(value = "Requisitos de asegurabilidad para seleccion [ 9 ]", required = true)
    private Integer reqaseg9;

    /**
     * Requisitos de asegurabilidad para seleccion [ 10 ]
     */
    @NotNull
    @ApiModelProperty(value = "Requisitos de asegurabilidad para seleccion [ 10 ]", required = true)
    private Integer reqaseg10;

    /**
     * Requisitos de asegurabilidad para seleccion [ 11 ]
     */
    @NotNull
    @ApiModelProperty(value = "Requisitos de asegurabilidad para seleccion [ 11 ]", required = true)
    private Integer reqaseg11;

    /**
     * Requisitos de asegurabilidad para seleccion [ 12 ]
     */
    @NotNull
    @ApiModelProperty(value = "Requisitos de asegurabilidad para seleccion [ 12 ]", required = true)
    private Integer reqaseg12;

    /**
     * Requisitos de asegurabilidad para seleccion [ 13 ]
     */
    @NotNull
    @ApiModelProperty(value = "Requisitos de asegurabilidad para seleccion [ 13 ]", required = true)
    private Integer reqaseg13;

    /**
     * Requisitos de asegurabilidad para seleccion [ 14 ]
     */
    @NotNull
    @ApiModelProperty(value = "Requisitos de asegurabilidad para seleccion [ 14 ]", required = true)
    private Integer reqaseg14;

    /**
     * Requisitos de asegurabilidad para seleccion [ 15 ]
     */
    @NotNull
    @ApiModelProperty(value = "Requisitos de asegurabilidad para seleccion [ 15 ]", required = true)
    private Integer reqaseg15;

    /**
     * Status del ramo/subramo
     */
    @NotNull
    @ApiModelProperty(value = "Status del ramo/subramo", required = true)
    private Integer stramsram;

    /**
     * Fecha en que adquirio el status el ramo/subramo
     */
    @NotNull
    @ApiModelProperty(value = "Fecha en que adquirio el status el ramo/subramo", required = true)
    private Instant fstat;

    @ManyToOne(fetch = FetchType.LAZY)
    private List<OpcgerDTO> opcgerDTOList; 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//  public Guiaramo getGuiaramo() {
//      return guiaramo;
//  }

//  public void setGuiaramo(Guiaramo guiaramo) {
//      this.guiaramo = guiaramo;
//  }

    public Integer getRamsubramo() { return ramsubramo; }
    public void   setRamsubramo(Integer ramsubramo) { this.ramsubramo = ramsubramo; }

    public String getNombrel() { return nombrel; }
    public void   setNombrel(String nombrel) { this.nombrel = nombrel; }

    public String getNombrec() { return nombrec; }
    public void   setNombrec(String nombrec) { this.nombrec = nombrec; }

    public String getNombrem() { return nombrem; }
    public void   setNombrem(String nombrem) { this.nombrem = nombrem; }

    public Integer getContab() { return contab; }
    public void   setContab(Integer contab) { this.contab = contab; }

    public Integer getCvnpolini() { return cvnpolini; }
    public void   setCvnpolini(Integer cvnpolini) { this.cvnpolini = cvnpolini; }

    public Integer getUltnpoliza() { return ultnpoliza; }
    public void   setUltnpoliza(Integer ultnpoliza) { this.ultnpoliza = ultnpoliza; }

    public Integer getCvnpolren() { return cvnpolren; }
    public void   setCvnpolren(Integer cvnpolren) { this.cvnpolren = cvnpolren; }

    public Integer getCvnendoso() { return cvnendoso; }
    public void   setCvnendoso(Integer cvnendoso) { this.cvnendoso = cvnendoso; }

    public Integer getUltnendoso1() { return ultnendoso1; }
    public void   setUltnendoso1(Integer ultnendoso1) { this.ultnendoso1 = ultnendoso1; }

    public Integer getUltnendoso2() { return ultnendoso2; }
    public void   setUltnendoso2(Integer ultnendoso2) { this.ultnendoso2 = ultnendoso2; }

    public Integer getUltnendoso3() { return ultnendoso3; }
    public void   setUltnendoso3(Integer ultnendoso3) { this.ultnendoso3 = ultnendoso3; }

    public Integer getTiporamo() { return tiporamo; }
    public void   setTiporamo(Integer tiporamo) { this.tiporamo = tiporamo; }

    public Integer getCvcobp() { return cvcobp; }
    public void   setCvcobp(Integer cvcobp) { this.cvcobp = cvcobp; }

    public Integer getPzmaxcp() { return pzmaxcp; }
    public void   setPzmaxcp(Integer pzmaxcp) { this.pzmaxcp = pzmaxcp; }

    public Integer getPzmabcp() { return pzmabcp; }
    public void   setPzmabcp(Integer pzmabcp) { this.pzmabcp = pzmabcp; }

    public Integer getCritgexp() { return critgexp; }
    public void   setCritgexp(Integer critgexp) { this.critgexp = critgexp; }

    public Integer getNesqgexp() { return nesqgexp; }
    public void   setNesqgexp(Integer nesqgexp) { this.nesqgexp = nesqgexp; }

    public Integer getCvcontcob() { return cvcontcob; }
    public void   setCvcontcob(Integer cvcontcob) { this.cvcontcob = cvcontcob; }

    public Integer getCritdesc() { return critdesc; }
    public void   setCritdesc(Integer critdesc) { this.critdesc = critdesc; }

    public Integer getNesqdesc() { return nesqdesc; }
    public void   setNesqdesc(Integer nesqdesc) { this.nesqdesc = nesqdesc; }

    public Integer getCritcomp() { return critcomp; }
    public void   setCritcomp(Integer critcomp) { this.critcomp = critcomp; }

    public Integer getNesqcomp() { return nesqcomp; }
    public void   setNesqcomp(Integer nesqcomp) { this.nesqcomp = nesqcomp; }

    public Integer getTiporenov() { return tiporenov; }
    public void   setTiporenov(Integer tiporenov) { this.tiporenov = tiporenov; }

    public Integer getDiascpzo1() { return diascpzo1; }
    public void   setDiascpzo1(Integer diascpzo1) { this.diascpzo1 = diascpzo1; }

    public Integer getDiascpzo2() { return diascpzo2; }
    public void   setDiascpzo2(Integer diascpzo2) { this.diascpzo2 = diascpzo2; }

    public Integer getDiascpzo3() { return diascpzo3; }
    public void   setDiascpzo3(Integer diascpzo3) { this.diascpzo3 = diascpzo3; }

    public Integer getDiascpzo4() { return diascpzo4; }
    public void   setDiascpzo4(Integer diascpzo4) { this.diascpzo4 = diascpzo4; }

    public Integer getDiascpzo5() { return diascpzo5; }
    public void   setDiascpzo5(Integer diascpzo5) { this.diascpzo5 = diascpzo5; }

    public Integer getDiascpzo6() { return diascpzo6; }
    public void   setDiascpzo6(Integer diascpzo6) { this.diascpzo6 = diascpzo6; }

    public Integer getDiascpzo7() { return diascpzo7; }
    public void   setDiascpzo7(Integer diascpzo7) { this.diascpzo7 = diascpzo7; }

    public Integer getDiascpzo8() { return diascpzo8; }
    public void   setDiascpzo8(Integer diascpzo8) { this.diascpzo8 = diascpzo8; }

    public Integer getDiascpzo9() { return diascpzo9; }
    public void   setDiascpzo9(Integer diascpzo9) { this.diascpzo9 = diascpzo9; }

    public Integer getDiascpzo10() { return diascpzo10; }
    public void   setDiascpzo10(Integer diascpzo10) { this.diascpzo10 = diascpzo10; }

    public Integer getDiascpzo11() { return diascpzo11; }
    public void   setDiascpzo11(Integer diascpzo11) { this.diascpzo11 = diascpzo11; }

    public Integer getDiascpzo12() { return diascpzo12; }
    public void   setDiascpzo12(Integer diascpzo12) { this.diascpzo12 = diascpzo12; }

    public Integer getDiascpzo13() { return diascpzo13; }
    public void   setDiascpzo13(Integer diascpzo13) { this.diascpzo13 = diascpzo13; }

    public Integer getDiascpzo14() { return diascpzo14; }
    public void   setDiascpzo14(Integer diascpzo14) { this.diascpzo14 = diascpzo14; }

    public Integer getDiascpzo15() { return diascpzo15; }
    public void   setDiascpzo15(Integer diascpzo15) { this.diascpzo15 = diascpzo15; }

    public Integer getDiascpzo16() { return diascpzo16; }
    public void   setDiascpzo16(Integer diascpzo16) { this.diascpzo16 = diascpzo16; }

    public Integer getDiascpzo17() { return diascpzo17; }
    public void   setDiascpzo17(Integer diascpzo17) { this.diascpzo17 = diascpzo17; }

    public Integer getDiascpzo18() { return diascpzo18; }
    public void   setDiascpzo18(Integer diascpzo18) { this.diascpzo18 = diascpzo18; }

    public Integer getDiascpzo19() { return diascpzo19; }
    public void   setDiascpzo19(Integer diascpzo19) { this.diascpzo19 = diascpzo19; }

    public Integer getDiascpzo20() { return diascpzo20; }
    public void   setDiascpzo20(Integer diascpzo20) { this.diascpzo20 = diascpzo20; }

    public Integer getDiascpzo21() { return diascpzo21; }
    public void   setDiascpzo21(Integer diascpzo21) { this.diascpzo21 = diascpzo21; }

    public Integer getDiascpzo22() { return diascpzo22; }
    public void   setDiascpzo22(Integer diascpzo22) { this.diascpzo22 = diascpzo22; }

    public Integer getDiascpzo23() { return diascpzo23; }
    public void   setDiascpzo23(Integer diascpzo23) { this.diascpzo23 = diascpzo23; }

    public Integer getDiascpzo24() { return diascpzo24; }
    public void   setDiascpzo24(Integer diascpzo24) { this.diascpzo24 = diascpzo24; }

    public Integer getDiascpzo25() { return diascpzo25; }
    public void   setDiascpzo25(Integer diascpzo25) { this.diascpzo25 = diascpzo25; }

    public Integer getDiascpzo26() { return diascpzo26; }
    public void   setDiascpzo26(Integer diascpzo26) { this.diascpzo26 = diascpzo26; }

    public Integer getDiascpzo27() { return diascpzo27; }
    public void   setDiascpzo27(Integer diascpzo27) { this.diascpzo27 = diascpzo27; }

    public Integer getDiascpzo28() { return diascpzo28; }
    public void   setDiascpzo28(Integer diascpzo28) { this.diascpzo28 = diascpzo28; }

    public Integer getDiascpzo29() { return diascpzo29; }
    public void   setDiascpzo29(Integer diascpzo29) { this.diascpzo29 = diascpzo29; }

    public Integer getDiascpzo30() { return diascpzo30; }
    public void   setDiascpzo30(Integer diascpzo30) { this.diascpzo30 = diascpzo30; }

    public Integer getDiascpzo31() { return diascpzo31; }
    public void   setDiascpzo31(Integer diascpzo31) { this.diascpzo31 = diascpzo31; }

    public Integer getDiascpzo32() { return diascpzo32; }
    public void   setDiascpzo32(Integer diascpzo32) { this.diascpzo32 = diascpzo32; }

    public Integer getDiascpzo33() { return diascpzo33; }
    public void   setDiascpzo33(Integer diascpzo33) { this.diascpzo33 = diascpzo33; }

    public Integer getDiascpzo34() { return diascpzo34; }
    public void   setDiascpzo34(Integer diascpzo34) { this.diascpzo34 = diascpzo34; }

    public Integer getDiascpzo35() { return diascpzo35; }
    public void   setDiascpzo35(Integer diascpzo35) { this.diascpzo35 = diascpzo35; }

    public Integer getDiascpzo36() { return diascpzo36; }
    public void   setDiascpzo36(Integer diascpzo36) { this.diascpzo36 = diascpzo36; }

    public Integer getDiascpzo37() { return diascpzo37; }
    public void   setDiascpzo37(Integer diascpzo37) { this.diascpzo37 = diascpzo37; }

    public Integer getDiascpzo38() { return diascpzo38; }
    public void   setDiascpzo38(Integer diascpzo38) { this.diascpzo38 = diascpzo38; }

    public Integer getDiascpzo39() { return diascpzo39; }
    public void   setDiascpzo39(Integer diascpzo39) { this.diascpzo39 = diascpzo39; }

    public Integer getDiascpzo40() { return diascpzo40; }
    public void   setDiascpzo40(Integer diascpzo40) { this.diascpzo40 = diascpzo40; }

    public Integer getDiascpzo41() { return diascpzo41; }
    public void   setDiascpzo41(Integer diascpzo41) { this.diascpzo41 = diascpzo41; }

    public Integer getDiascpzo42() { return diascpzo42; }
    public void   setDiascpzo42(Integer diascpzo42) { this.diascpzo42 = diascpzo42; }

    public Integer getDiascpzo43() { return diascpzo43; }
    public void   setDiascpzo43(Integer diascpzo43) { this.diascpzo43 = diascpzo43; }

    public Integer getDiascpzo44() { return diascpzo44; }
    public void   setDiascpzo44(Integer diascpzo44) { this.diascpzo44 = diascpzo44; }

    public Integer getDiascpzo45() { return diascpzo45; }
    public void   setDiascpzo45(Integer diascpzo45) { this.diascpzo45 = diascpzo45; }

    public Integer getDiascpzo46() { return diascpzo46; }
    public void   setDiascpzo46(Integer diascpzo46) { this.diascpzo46 = diascpzo46; }

    public Integer getDiascpzo47() { return diascpzo47; }
    public void   setDiascpzo47(Integer diascpzo47) { this.diascpzo47 = diascpzo47; }

    public Integer getDiascpzo48() { return diascpzo48; }
    public void   setDiascpzo48(Integer diascpzo48) { this.diascpzo48 = diascpzo48; }

    public Integer getDiascpzo49() { return diascpzo49; }
    public void   setDiascpzo49(Integer diascpzo49) { this.diascpzo49 = diascpzo49; }

    public Integer getDiascpzo50() { return diascpzo50; }
    public void   setDiascpzo50(Integer diascpzo50) { this.diascpzo50 = diascpzo50; }

    public Double getPorccpzo1() { return porccpzo1; }
    public void   setPorccpzo1(Double porccpzo1) { this.porccpzo1 = porccpzo1; }

    public Double getPorccpzo2() { return porccpzo2; }
    public void   setPorccpzo2(Double porccpzo2) { this.porccpzo2 = porccpzo2; }

    public Double getPorccpzo3() { return porccpzo3; }
    public void   setPorccpzo3(Double porccpzo3) { this.porccpzo3 = porccpzo3; }

    public Double getPorccpzo4() { return porccpzo4; }
    public void   setPorccpzo4(Double porccpzo4) { this.porccpzo4 = porccpzo4; }

    public Double getPorccpzo5() { return porccpzo5; }
    public void   setPorccpzo5(Double porccpzo5) { this.porccpzo5 = porccpzo5; }

    public Double getPorccpzo6() { return porccpzo6; }
    public void   setPorccpzo6(Double porccpzo6) { this.porccpzo6 = porccpzo6; }

    public Double getPorccpzo7() { return porccpzo7; }
    public void   setPorccpzo7(Double porccpzo7) { this.porccpzo7 = porccpzo7; }

    public Double getPorccpzo8() { return porccpzo8; }
    public void   setPorccpzo8(Double porccpzo8) { this.porccpzo8 = porccpzo8; }

    public Double getPorccpzo9() { return porccpzo9; }
    public void   setPorccpzo9(Double porccpzo9) { this.porccpzo9 = porccpzo9; }

    public Double getPorccpzo10() { return porccpzo10; }
    public void   setPorccpzo10(Double porccpzo10) { this.porccpzo10 = porccpzo10; }

    public Double getPorccpzo11() { return porccpzo11; }
    public void   setPorccpzo11(Double porccpzo11) { this.porccpzo11 = porccpzo11; }

    public Double getPorccpzo12() { return porccpzo12; }
    public void   setPorccpzo12(Double porccpzo12) { this.porccpzo12 = porccpzo12; }

    public Double getPorccpzo13() { return porccpzo13; }
    public void   setPorccpzo13(Double porccpzo13) { this.porccpzo13 = porccpzo13; }

    public Double getPorccpzo14() { return porccpzo14; }
    public void   setPorccpzo14(Double porccpzo14) { this.porccpzo14 = porccpzo14; }

    public Double getPorccpzo15() { return porccpzo15; }
    public void   setPorccpzo15(Double porccpzo15) { this.porccpzo15 = porccpzo15; }

    public Double getPorccpzo16() { return porccpzo16; }
    public void   setPorccpzo16(Double porccpzo16) { this.porccpzo16 = porccpzo16; }

    public Double getPorccpzo17() { return porccpzo17; }
    public void   setPorccpzo17(Double porccpzo17) { this.porccpzo17 = porccpzo17; }

    public Double getPorccpzo18() { return porccpzo18; }
    public void   setPorccpzo18(Double porccpzo18) { this.porccpzo18 = porccpzo18; }

    public Double getPorccpzo19() { return porccpzo19; }
    public void   setPorccpzo19(Double porccpzo19) { this.porccpzo19 = porccpzo19; }

    public Double getPorccpzo20() { return porccpzo20; }
    public void   setPorccpzo20(Double porccpzo20) { this.porccpzo20 = porccpzo20; }

    public Double getPorccpzo21() { return porccpzo21; }
    public void   setPorccpzo21(Double porccpzo21) { this.porccpzo21 = porccpzo21; }

    public Double getPorccpzo22() { return porccpzo22; }
    public void   setPorccpzo22(Double porccpzo22) { this.porccpzo22 = porccpzo22; }

    public Double getPorccpzo23() { return porccpzo23; }
    public void   setPorccpzo23(Double porccpzo23) { this.porccpzo23 = porccpzo23; }

    public Double getPorccpzo24() { return porccpzo24; }
    public void   setPorccpzo24(Double porccpzo24) { this.porccpzo24 = porccpzo24; }

    public Double getPorccpzo25() { return porccpzo25; }
    public void   setPorccpzo25(Double porccpzo25) { this.porccpzo25 = porccpzo25; }

    public Double getPorccpzo26() { return porccpzo26; }
    public void   setPorccpzo26(Double porccpzo26) { this.porccpzo26 = porccpzo26; }

    public Double getPorccpzo27() { return porccpzo27; }
    public void   setPorccpzo27(Double porccpzo27) { this.porccpzo27 = porccpzo27; }

    public Double getPorccpzo28() { return porccpzo28; }
    public void   setPorccpzo28(Double porccpzo28) { this.porccpzo28 = porccpzo28; }

    public Double getPorccpzo29() { return porccpzo29; }
    public void   setPorccpzo29(Double porccpzo29) { this.porccpzo29 = porccpzo29; }

    public Double getPorccpzo30() { return porccpzo30; }
    public void   setPorccpzo30(Double porccpzo30) { this.porccpzo30 = porccpzo30; }

    public Double getPorccpzo31() { return porccpzo31; }
    public void   setPorccpzo31(Double porccpzo31) { this.porccpzo31 = porccpzo31; }

    public Double getPorccpzo32() { return porccpzo32; }
    public void   setPorccpzo32(Double porccpzo32) { this.porccpzo32 = porccpzo32; }

    public Double getPorccpzo33() { return porccpzo33; }
    public void   setPorccpzo33(Double porccpzo33) { this.porccpzo33 = porccpzo33; }

    public Double getPorccpzo34() { return porccpzo34; }
    public void   setPorccpzo34(Double porccpzo34) { this.porccpzo34 = porccpzo34; }

    public Double getPorccpzo35() { return porccpzo35; }
    public void   setPorccpzo35(Double porccpzo35) { this.porccpzo35 = porccpzo35; }

    public Double getPorccpzo36() { return porccpzo36; }
    public void   setPorccpzo36(Double porccpzo36) { this.porccpzo36 = porccpzo36; }

    public Double getPorccpzo37() { return porccpzo37; }
    public void   setPorccpzo37(Double porccpzo37) { this.porccpzo37 = porccpzo37; }

    public Double getPorccpzo38() { return porccpzo38; }
    public void   setPorccpzo38(Double porccpzo38) { this.porccpzo38 = porccpzo38; }

    public Double getPorccpzo39() { return porccpzo39; }
    public void   setPorccpzo39(Double porccpzo39) { this.porccpzo39 = porccpzo39; }

    public Double getPorccpzo40() { return porccpzo40; }
    public void   setPorccpzo40(Double porccpzo40) { this.porccpzo40 = porccpzo40; }

    public Double getPorccpzo41() { return porccpzo41; }
    public void   setPorccpzo41(Double porccpzo41) { this.porccpzo41 = porccpzo41; }

    public Double getPorccpzo42() { return porccpzo42; }
    public void   setPorccpzo42(Double porccpzo42) { this.porccpzo42 = porccpzo42; }

    public Double getPorccpzo43() { return porccpzo43; }
    public void   setPorccpzo43(Double porccpzo43) { this.porccpzo43 = porccpzo43; }

    public Double getPorccpzo44() { return porccpzo44; }
    public void   setPorccpzo44(Double porccpzo44) { this.porccpzo44 = porccpzo44; }

    public Double getPorccpzo45() { return porccpzo45; }
    public void   setPorccpzo45(Double porccpzo45) { this.porccpzo45 = porccpzo45; }

    public Double getPorccpzo46() { return porccpzo46; }
    public void   setPorccpzo46(Double porccpzo46) { this.porccpzo46 = porccpzo46; }

    public Double getPorccpzo47() { return porccpzo47; }
    public void   setPorccpzo47(Double porccpzo47) { this.porccpzo47 = porccpzo47; }

    public Double getPorccpzo48() { return porccpzo48; }
    public void   setPorccpzo48(Double porccpzo48) { this.porccpzo48 = porccpzo48; }

    public Double getPorccpzo49() { return porccpzo49; }
    public void   setPorccpzo49(Double porccpzo49) { this.porccpzo49 = porccpzo49; }

    public Double getPorccpzo50() { return porccpzo50; }
    public void   setPorccpzo50(Double porccpzo50) { this.porccpzo50 = porccpzo50; }

    public Integer getRsrcomb1() { return rsrcomb1; }
    public void   setRsrcomb1(Integer rsrcomb1) { this.rsrcomb1 = rsrcomb1; }

    public Integer getRsrcomb2() { return rsrcomb2; }
    public void   setRsrcomb2(Integer rsrcomb2) { this.rsrcomb2 = rsrcomb2; }

    public Integer getRsrcomb3() { return rsrcomb3; }
    public void   setRsrcomb3(Integer rsrcomb3) { this.rsrcomb3 = rsrcomb3; }

    public Integer getRsrcomb4() { return rsrcomb4; }
    public void   setRsrcomb4(Integer rsrcomb4) { this.rsrcomb4 = rsrcomb4; }

    public Integer getRsrcomb5() { return rsrcomb5; }
    public void   setRsrcomb5(Integer rsrcomb5) { this.rsrcomb5 = rsrcomb5; }

    public Integer getRsrcomb6() { return rsrcomb6; }
    public void   setRsrcomb6(Integer rsrcomb6) { this.rsrcomb6 = rsrcomb6; }

    public Integer getRsrcomb7() { return rsrcomb7; }
    public void   setRsrcomb7(Integer rsrcomb7) { this.rsrcomb7 = rsrcomb7; }

    public Integer getRsrcomb8() { return rsrcomb8; }
    public void   setRsrcomb8(Integer rsrcomb8) { this.rsrcomb8 = rsrcomb8; }

    public Integer getRsrcomb9() { return rsrcomb9; }
    public void   setRsrcomb9(Integer rsrcomb9) { this.rsrcomb9 = rsrcomb9; }

    public Integer getRsrcomb10() { return rsrcomb10; }
    public void   setRsrcomb10(Integer rsrcomb10) { this.rsrcomb10 = rsrcomb10; }

    public Integer getRsrcomb11() { return rsrcomb11; }
    public void   setRsrcomb11(Integer rsrcomb11) { this.rsrcomb11 = rsrcomb11; }

    public Integer getRsrcomb12() { return rsrcomb12; }
    public void   setRsrcomb12(Integer rsrcomb12) { this.rsrcomb12 = rsrcomb12; }

    public Integer getUltnestudi() { return ultnestudi; }
    public void   setUltnestudi(Integer ultnestudi) { this.ultnestudi = ultnestudi; }

    public Integer getLimnaseg1() { return limnaseg1; }
    public void   setLimnaseg1(Integer limnaseg1) { this.limnaseg1 = limnaseg1; }

    public Integer getLimnaseg2() { return limnaseg2; }
    public void   setLimnaseg2(Integer limnaseg2) { this.limnaseg2 = limnaseg2; }

    public Integer getLimnaseg3() { return limnaseg3; }
    public void   setLimnaseg3(Integer limnaseg3) { this.limnaseg3 = limnaseg3; }

    public Integer getLimnaseg4() { return limnaseg4; }
    public void   setLimnaseg4(Integer limnaseg4) { this.limnaseg4 = limnaseg4; }

    public Integer getLimnaseg5() { return limnaseg5; }
    public void   setLimnaseg5(Integer limnaseg5) { this.limnaseg5 = limnaseg5; }

    public Integer getLimnaseg6() { return limnaseg6; }
    public void   setLimnaseg6(Integer limnaseg6) { this.limnaseg6 = limnaseg6; }

    public Integer getLimnaseg7() { return limnaseg7; }
    public void   setLimnaseg7(Integer limnaseg7) { this.limnaseg7 = limnaseg7; }

    public Integer getLimnaseg8() { return limnaseg8; }
    public void   setLimnaseg8(Integer limnaseg8) { this.limnaseg8 = limnaseg8; }

    public Integer getLimnaseg9() { return limnaseg9; }
    public void   setLimnaseg9(Integer limnaseg9) { this.limnaseg9 = limnaseg9; }

    public Integer getLimnaseg10() { return limnaseg10; }
    public void   setLimnaseg10(Integer limnaseg10) { this.limnaseg10 = limnaseg10; }

    public Integer getLimnaseg11() { return limnaseg11; }
    public void   setLimnaseg11(Integer limnaseg11) { this.limnaseg11 = limnaseg11; }

    public Integer getLimnaseg12() { return limnaseg12; }
    public void   setLimnaseg12(Integer limnaseg12) { this.limnaseg12 = limnaseg12; }

    public Integer getLimnaseg13() { return limnaseg13; }
    public void   setLimnaseg13(Integer limnaseg13) { this.limnaseg13 = limnaseg13; }

    public Integer getLimnaseg14() { return limnaseg14; }
    public void   setLimnaseg14(Integer limnaseg14) { this.limnaseg14 = limnaseg14; }

    public Integer getLimnaseg15() { return limnaseg15; }
    public void   setLimnaseg15(Integer limnaseg15) { this.limnaseg15 = limnaseg15; }

    public Integer getLimnaseg16() { return limnaseg16; }
    public void   setLimnaseg16(Integer limnaseg16) { this.limnaseg16 = limnaseg16; }

    public Integer getLimnaseg17() { return limnaseg17; }
    public void   setLimnaseg17(Integer limnaseg17) { this.limnaseg17 = limnaseg17; }

    public Integer getLimnaseg18() { return limnaseg18; }
    public void   setLimnaseg18(Integer limnaseg18) { this.limnaseg18 = limnaseg18; }

    public Integer getLimnaseg19() { return limnaseg19; }
    public void   setLimnaseg19(Integer limnaseg19) { this.limnaseg19 = limnaseg19; }

    public Integer getLimnaseg20() { return limnaseg20; }
    public void   setLimnaseg20(Integer limnaseg20) { this.limnaseg20 = limnaseg20; }

    public Integer getFactsa1() { return factsa1; }
    public void   setFactsa1(Integer factsa1) { this.factsa1 = factsa1; }

    public Integer getFactsa2() { return factsa2; }
    public void   setFactsa2(Integer factsa2) { this.factsa2 = factsa2; }

    public Integer getFactsa3() { return factsa3; }
    public void   setFactsa3(Integer factsa3) { this.factsa3 = factsa3; }

    public Integer getFactsa4() { return factsa4; }
    public void   setFactsa4(Integer factsa4) { this.factsa4 = factsa4; }

    public Integer getFactsa5() { return factsa5; }
    public void   setFactsa5(Integer factsa5) { this.factsa5 = factsa5; }

    public Integer getFactsa6() { return factsa6; }
    public void   setFactsa6(Integer factsa6) { this.factsa6 = factsa6; }

    public Integer getFactsa7() { return factsa7; }
    public void   setFactsa7(Integer factsa7) { this.factsa7 = factsa7; }

    public Integer getFactsa8() { return factsa8; }
    public void   setFactsa8(Integer factsa8) { this.factsa8 = factsa8; }

    public Integer getFactsa9() { return factsa9; }
    public void   setFactsa9(Integer factsa9) { this.factsa9 = factsa9; }

    public Integer getFactsa10() { return factsa10; }
    public void   setFactsa10(Integer factsa10) { this.factsa10 = factsa10; }

    public Integer getFactsa11() { return factsa11; }
    public void   setFactsa11(Integer factsa11) { this.factsa11 = factsa11; }

    public Integer getFactsa12() { return factsa12; }
    public void   setFactsa12(Integer factsa12) { this.factsa12 = factsa12; }

    public Integer getFactsa13() { return factsa13; }
    public void   setFactsa13(Integer factsa13) { this.factsa13 = factsa13; }

    public Integer getFactsa14() { return factsa14; }
    public void   setFactsa14(Integer factsa14) { this.factsa14 = factsa14; }

    public Integer getFactsa15() { return factsa15; }
    public void   setFactsa15(Integer factsa15) { this.factsa15 = factsa15; }

    public Integer getFactsa16() { return factsa16; }
    public void   setFactsa16(Integer factsa16) { this.factsa16 = factsa16; }

    public Integer getFactsa17() { return factsa17; }
    public void   setFactsa17(Integer factsa17) { this.factsa17 = factsa17; }

    public Integer getFactsa18() { return factsa18; }
    public void   setFactsa18(Integer factsa18) { this.factsa18 = factsa18; }

    public Integer getFactsa19() { return factsa19; }
    public void   setFactsa19(Integer factsa19) { this.factsa19 = factsa19; }

    public Integer getFactsa20() { return factsa20; }
    public void   setFactsa20(Integer factsa20) { this.factsa20 = factsa20; }

    public Integer getTmaxsa1() { return tmaxsa1; }
    public void   setTmaxsa1(Integer tmaxsa1) { this.tmaxsa1 = tmaxsa1; }

    public Integer getTmaxsa2() { return tmaxsa2; }
    public void   setTmaxsa2(Integer tmaxsa2) { this.tmaxsa2 = tmaxsa2; }

    public Integer getTmaxsa3() { return tmaxsa3; }
    public void   setTmaxsa3(Integer tmaxsa3) { this.tmaxsa3 = tmaxsa3; }

    public Integer getTmaxsa4() { return tmaxsa4; }
    public void   setTmaxsa4(Integer tmaxsa4) { this.tmaxsa4 = tmaxsa4; }

    public Integer getTmaxsa5() { return tmaxsa5; }
    public void   setTmaxsa5(Integer tmaxsa5) { this.tmaxsa5 = tmaxsa5; }

    public Integer getTmaxsa6() { return tmaxsa6; }
    public void   setTmaxsa6(Integer tmaxsa6) { this.tmaxsa6 = tmaxsa6; }

    public Integer getTmaxsa7() { return tmaxsa7; }
    public void   setTmaxsa7(Integer tmaxsa7) { this.tmaxsa7 = tmaxsa7; }

    public Integer getTmaxsa8() { return tmaxsa8; }
    public void   setTmaxsa8(Integer tmaxsa8) { this.tmaxsa8 = tmaxsa8; }

    public Integer getTmaxsa9() { return tmaxsa9; }
    public void   setTmaxsa9(Integer tmaxsa9) { this.tmaxsa9 = tmaxsa9; }

    public Integer getTmaxsa10() { return tmaxsa10; }
    public void   setTmaxsa10(Integer tmaxsa10) { this.tmaxsa10 = tmaxsa10; }

    public Integer getTmaxsa11() { return tmaxsa11; }
    public void   setTmaxsa11(Integer tmaxsa11) { this.tmaxsa11 = tmaxsa11; }

    public Integer getTmaxsa12() { return tmaxsa12; }
    public void   setTmaxsa12(Integer tmaxsa12) { this.tmaxsa12 = tmaxsa12; }

    public Integer getTmaxsa13() { return tmaxsa13; }
    public void   setTmaxsa13(Integer tmaxsa13) { this.tmaxsa13 = tmaxsa13; }

    public Integer getTmaxsa14() { return tmaxsa14; }
    public void   setTmaxsa14(Integer tmaxsa14) { this.tmaxsa14 = tmaxsa14; }

    public Integer getTmaxsa15() { return tmaxsa15; }
    public void   setTmaxsa15(Integer tmaxsa15) { this.tmaxsa15 = tmaxsa15; }

    public Integer getTmaxsa16() { return tmaxsa16; }
    public void   setTmaxsa16(Integer tmaxsa16) { this.tmaxsa16 = tmaxsa16; }

    public Integer getTmaxsa17() { return tmaxsa17; }
    public void   setTmaxsa17(Integer tmaxsa17) { this.tmaxsa17 = tmaxsa17; }

    public Integer getTmaxsa18() { return tmaxsa18; }
    public void   setTmaxsa18(Integer tmaxsa18) { this.tmaxsa18 = tmaxsa18; }

    public Integer getTmaxsa19() { return tmaxsa19; }
    public void   setTmaxsa19(Integer tmaxsa19) { this.tmaxsa19 = tmaxsa19; }

    public Integer getTmaxsa20() { return tmaxsa20; }
    public void   setTmaxsa20(Integer tmaxsa20) { this.tmaxsa20 = tmaxsa20; }

    public Double getVarsasem1() { return varsasem1; }
    public void   setVarsasem1(Double varsasem1) { this.varsasem1 = varsasem1; }

    public Double getVarsasem2() { return varsasem2; }
    public void   setVarsasem2(Double varsasem2) { this.varsasem2 = varsasem2; }

    public Integer getCvtmaxsa() { return cvtmaxsa; }
    public void   setCvtmaxsa(Integer cvtmaxsa) { this.cvtmaxsa = cvtmaxsa; }

    public Integer getReqaseg1() { return reqaseg1; }
    public void   setReqaseg1(Integer reqaseg1) { this.reqaseg1 = reqaseg1; }

    public Integer getReqaseg2() { return reqaseg2; }
    public void   setReqaseg2(Integer reqaseg2) { this.reqaseg2 = reqaseg2; }

    public Integer getReqaseg3() { return reqaseg3; }
    public void   setReqaseg3(Integer reqaseg3) { this.reqaseg3 = reqaseg3; }

    public Integer getReqaseg4() { return reqaseg4; }
    public void   setReqaseg4(Integer reqaseg4) { this.reqaseg4 = reqaseg4; }

    public Integer getReqaseg5() { return reqaseg5; }
    public void   setReqaseg5(Integer reqaseg5) { this.reqaseg5 = reqaseg5; }

    public Integer getReqaseg6() { return reqaseg6; }
    public void   setReqaseg6(Integer reqaseg6) { this.reqaseg6 = reqaseg6; }

    public Integer getReqaseg7() { return reqaseg7; }
    public void   setReqaseg7(Integer reqaseg7) { this.reqaseg7 = reqaseg7; }

    public Integer getReqaseg8() { return reqaseg8; }
    public void   setReqaseg8(Integer reqaseg8) { this.reqaseg8 = reqaseg8; }

    public Integer getReqaseg9() { return reqaseg9; }
    public void   setReqaseg9(Integer reqaseg9) { this.reqaseg9 = reqaseg9; }

    public Integer getReqaseg10() { return reqaseg10; }
    public void   setReqaseg10(Integer reqaseg10) { this.reqaseg10 = reqaseg10; }

    public Integer getReqaseg11() { return reqaseg11; }
    public void   setReqaseg11(Integer reqaseg11) { this.reqaseg11 = reqaseg11; }

    public Integer getReqaseg12() { return reqaseg12; }
    public void   setReqaseg12(Integer reqaseg12) { this.reqaseg12 = reqaseg12; }

    public Integer getReqaseg13() { return reqaseg13; }
    public void   setReqaseg13(Integer reqaseg13) { this.reqaseg13 = reqaseg13; }

    public Integer getReqaseg14() { return reqaseg14; }
    public void   setReqaseg14(Integer reqaseg14) { this.reqaseg14 = reqaseg14; }

    public Integer getReqaseg15() { return reqaseg15; }
    public void   setReqaseg15(Integer reqaseg15) { this.reqaseg15 = reqaseg15; }

    public Integer getStramsram() { return stramsram; }
    public void   setStramsram(Integer stramsram) { this.stramsram = stramsram; }

    public Instant getFstat() { return fstat; }
    public void   setFstat(Instant fstat) { this.fstat = fstat; }

    public List<OpcgerDTO> getOpcgerDTOList() {
		return opcgerDTOList;
	}

	public void setOpcgerDTOList(List<OpcgerDTO> opcgerDTOList) {
		this.opcgerDTOList = opcgerDTOList;
	}

	// prettier-ignore
    @Override
    public String toString() {
        return "${FTL_CatDTO}{" +
            "id=" + getId() +
            ", ramsubramo='" + getRamsubramo() + "'" +
            ", nombrel='" + getNombrel() + "'" +
            ", nombrec='" + getNombrec() + "'" +
            ", nombrem='" + getNombrem() + "'" +
            ", contab='" + getContab() + "'" +
            ", cvnpolini='" + getCvnpolini() + "'" +
            ", ultnpoliza='" + getUltnpoliza() + "'" +
            ", cvnpolren='" + getCvnpolren() + "'" +
            ", cvnendoso='" + getCvnendoso() + "'" +
            ", ultnendoso1='" + getUltnendoso1() + "'" +
            ", ultnendoso2='" + getUltnendoso2() + "'" +
            ", ultnendoso3='" + getUltnendoso3() + "'" +
            ", tiporamo='" + getTiporamo() + "'" +
            ", cvcobp='" + getCvcobp() + "'" +
            ", pzmaxcp='" + getPzmaxcp() + "'" +
            ", pzmabcp='" + getPzmabcp() + "'" +
            ", critgexp='" + getCritgexp() + "'" +
            ", nesqgexp='" + getNesqgexp() + "'" +
            ", cvcontcob='" + getCvcontcob() + "'" +
            ", critdesc='" + getCritdesc() + "'" +
            ", nesqdesc='" + getNesqdesc() + "'" +
            ", critcomp='" + getCritcomp() + "'" +
            ", nesqcomp='" + getNesqcomp() + "'" +
            ", tiporenov='" + getTiporenov() + "'" +
            ", diascpzo1='" + getDiascpzo1() + "'" +
            ", diascpzo2='" + getDiascpzo2() + "'" +
            ", diascpzo3='" + getDiascpzo3() + "'" +
            ", diascpzo4='" + getDiascpzo4() + "'" +
            ", diascpzo5='" + getDiascpzo5() + "'" +
            ", diascpzo6='" + getDiascpzo6() + "'" +
            ", diascpzo7='" + getDiascpzo7() + "'" +
            ", diascpzo8='" + getDiascpzo8() + "'" +
            ", diascpzo9='" + getDiascpzo9() + "'" +
            ", diascpzo10='" + getDiascpzo10() + "'" +
            ", diascpzo11='" + getDiascpzo11() + "'" +
            ", diascpzo12='" + getDiascpzo12() + "'" +
            ", diascpzo13='" + getDiascpzo13() + "'" +
            ", diascpzo14='" + getDiascpzo14() + "'" +
            ", diascpzo15='" + getDiascpzo15() + "'" +
            ", diascpzo16='" + getDiascpzo16() + "'" +
            ", diascpzo17='" + getDiascpzo17() + "'" +
            ", diascpzo18='" + getDiascpzo18() + "'" +
            ", diascpzo19='" + getDiascpzo19() + "'" +
            ", diascpzo20='" + getDiascpzo20() + "'" +
            ", diascpzo21='" + getDiascpzo21() + "'" +
            ", diascpzo22='" + getDiascpzo22() + "'" +
            ", diascpzo23='" + getDiascpzo23() + "'" +
            ", diascpzo24='" + getDiascpzo24() + "'" +
            ", diascpzo25='" + getDiascpzo25() + "'" +
            ", diascpzo26='" + getDiascpzo26() + "'" +
            ", diascpzo27='" + getDiascpzo27() + "'" +
            ", diascpzo28='" + getDiascpzo28() + "'" +
            ", diascpzo29='" + getDiascpzo29() + "'" +
            ", diascpzo30='" + getDiascpzo30() + "'" +
            ", diascpzo31='" + getDiascpzo31() + "'" +
            ", diascpzo32='" + getDiascpzo32() + "'" +
            ", diascpzo33='" + getDiascpzo33() + "'" +
            ", diascpzo34='" + getDiascpzo34() + "'" +
            ", diascpzo35='" + getDiascpzo35() + "'" +
            ", diascpzo36='" + getDiascpzo36() + "'" +
            ", diascpzo37='" + getDiascpzo37() + "'" +
            ", diascpzo38='" + getDiascpzo38() + "'" +
            ", diascpzo39='" + getDiascpzo39() + "'" +
            ", diascpzo40='" + getDiascpzo40() + "'" +
            ", diascpzo41='" + getDiascpzo41() + "'" +
            ", diascpzo42='" + getDiascpzo42() + "'" +
            ", diascpzo43='" + getDiascpzo43() + "'" +
            ", diascpzo44='" + getDiascpzo44() + "'" +
            ", diascpzo45='" + getDiascpzo45() + "'" +
            ", diascpzo46='" + getDiascpzo46() + "'" +
            ", diascpzo47='" + getDiascpzo47() + "'" +
            ", diascpzo48='" + getDiascpzo48() + "'" +
            ", diascpzo49='" + getDiascpzo49() + "'" +
            ", diascpzo50='" + getDiascpzo50() + "'" +
            ", porccpzo1='" + getPorccpzo1() + "'" +
            ", porccpzo2='" + getPorccpzo2() + "'" +
            ", porccpzo3='" + getPorccpzo3() + "'" +
            ", porccpzo4='" + getPorccpzo4() + "'" +
            ", porccpzo5='" + getPorccpzo5() + "'" +
            ", porccpzo6='" + getPorccpzo6() + "'" +
            ", porccpzo7='" + getPorccpzo7() + "'" +
            ", porccpzo8='" + getPorccpzo8() + "'" +
            ", porccpzo9='" + getPorccpzo9() + "'" +
            ", porccpzo10='" + getPorccpzo10() + "'" +
            ", porccpzo11='" + getPorccpzo11() + "'" +
            ", porccpzo12='" + getPorccpzo12() + "'" +
            ", porccpzo13='" + getPorccpzo13() + "'" +
            ", porccpzo14='" + getPorccpzo14() + "'" +
            ", porccpzo15='" + getPorccpzo15() + "'" +
            ", porccpzo16='" + getPorccpzo16() + "'" +
            ", porccpzo17='" + getPorccpzo17() + "'" +
            ", porccpzo18='" + getPorccpzo18() + "'" +
            ", porccpzo19='" + getPorccpzo19() + "'" +
            ", porccpzo20='" + getPorccpzo20() + "'" +
            ", porccpzo21='" + getPorccpzo21() + "'" +
            ", porccpzo22='" + getPorccpzo22() + "'" +
            ", porccpzo23='" + getPorccpzo23() + "'" +
            ", porccpzo24='" + getPorccpzo24() + "'" +
            ", porccpzo25='" + getPorccpzo25() + "'" +
            ", porccpzo26='" + getPorccpzo26() + "'" +
            ", porccpzo27='" + getPorccpzo27() + "'" +
            ", porccpzo28='" + getPorccpzo28() + "'" +
            ", porccpzo29='" + getPorccpzo29() + "'" +
            ", porccpzo30='" + getPorccpzo30() + "'" +
            ", porccpzo31='" + getPorccpzo31() + "'" +
            ", porccpzo32='" + getPorccpzo32() + "'" +
            ", porccpzo33='" + getPorccpzo33() + "'" +
            ", porccpzo34='" + getPorccpzo34() + "'" +
            ", porccpzo35='" + getPorccpzo35() + "'" +
            ", porccpzo36='" + getPorccpzo36() + "'" +
            ", porccpzo37='" + getPorccpzo37() + "'" +
            ", porccpzo38='" + getPorccpzo38() + "'" +
            ", porccpzo39='" + getPorccpzo39() + "'" +
            ", porccpzo40='" + getPorccpzo40() + "'" +
            ", porccpzo41='" + getPorccpzo41() + "'" +
            ", porccpzo42='" + getPorccpzo42() + "'" +
            ", porccpzo43='" + getPorccpzo43() + "'" +
            ", porccpzo44='" + getPorccpzo44() + "'" +
            ", porccpzo45='" + getPorccpzo45() + "'" +
            ", porccpzo46='" + getPorccpzo46() + "'" +
            ", porccpzo47='" + getPorccpzo47() + "'" +
            ", porccpzo48='" + getPorccpzo48() + "'" +
            ", porccpzo49='" + getPorccpzo49() + "'" +
            ", porccpzo50='" + getPorccpzo50() + "'" +
            ", rsrcomb1='" + getRsrcomb1() + "'" +
            ", rsrcomb2='" + getRsrcomb2() + "'" +
            ", rsrcomb3='" + getRsrcomb3() + "'" +
            ", rsrcomb4='" + getRsrcomb4() + "'" +
            ", rsrcomb5='" + getRsrcomb5() + "'" +
            ", rsrcomb6='" + getRsrcomb6() + "'" +
            ", rsrcomb7='" + getRsrcomb7() + "'" +
            ", rsrcomb8='" + getRsrcomb8() + "'" +
            ", rsrcomb9='" + getRsrcomb9() + "'" +
            ", rsrcomb10='" + getRsrcomb10() + "'" +
            ", rsrcomb11='" + getRsrcomb11() + "'" +
            ", rsrcomb12='" + getRsrcomb12() + "'" +
            ", ultnestudi='" + getUltnestudi() + "'" +
            ", limnaseg1='" + getLimnaseg1() + "'" +
            ", limnaseg2='" + getLimnaseg2() + "'" +
            ", limnaseg3='" + getLimnaseg3() + "'" +
            ", limnaseg4='" + getLimnaseg4() + "'" +
            ", limnaseg5='" + getLimnaseg5() + "'" +
            ", limnaseg6='" + getLimnaseg6() + "'" +
            ", limnaseg7='" + getLimnaseg7() + "'" +
            ", limnaseg8='" + getLimnaseg8() + "'" +
            ", limnaseg9='" + getLimnaseg9() + "'" +
            ", limnaseg10='" + getLimnaseg10() + "'" +
            ", limnaseg11='" + getLimnaseg11() + "'" +
            ", limnaseg12='" + getLimnaseg12() + "'" +
            ", limnaseg13='" + getLimnaseg13() + "'" +
            ", limnaseg14='" + getLimnaseg14() + "'" +
            ", limnaseg15='" + getLimnaseg15() + "'" +
            ", limnaseg16='" + getLimnaseg16() + "'" +
            ", limnaseg17='" + getLimnaseg17() + "'" +
            ", limnaseg18='" + getLimnaseg18() + "'" +
            ", limnaseg19='" + getLimnaseg19() + "'" +
            ", limnaseg20='" + getLimnaseg20() + "'" +
            ", factsa1='" + getFactsa1() + "'" +
            ", factsa2='" + getFactsa2() + "'" +
            ", factsa3='" + getFactsa3() + "'" +
            ", factsa4='" + getFactsa4() + "'" +
            ", factsa5='" + getFactsa5() + "'" +
            ", factsa6='" + getFactsa6() + "'" +
            ", factsa7='" + getFactsa7() + "'" +
            ", factsa8='" + getFactsa8() + "'" +
            ", factsa9='" + getFactsa9() + "'" +
            ", factsa10='" + getFactsa10() + "'" +
            ", factsa11='" + getFactsa11() + "'" +
            ", factsa12='" + getFactsa12() + "'" +
            ", factsa13='" + getFactsa13() + "'" +
            ", factsa14='" + getFactsa14() + "'" +
            ", factsa15='" + getFactsa15() + "'" +
            ", factsa16='" + getFactsa16() + "'" +
            ", factsa17='" + getFactsa17() + "'" +
            ", factsa18='" + getFactsa18() + "'" +
            ", factsa19='" + getFactsa19() + "'" +
            ", factsa20='" + getFactsa20() + "'" +
            ", tmaxsa1='" + getTmaxsa1() + "'" +
            ", tmaxsa2='" + getTmaxsa2() + "'" +
            ", tmaxsa3='" + getTmaxsa3() + "'" +
            ", tmaxsa4='" + getTmaxsa4() + "'" +
            ", tmaxsa5='" + getTmaxsa5() + "'" +
            ", tmaxsa6='" + getTmaxsa6() + "'" +
            ", tmaxsa7='" + getTmaxsa7() + "'" +
            ", tmaxsa8='" + getTmaxsa8() + "'" +
            ", tmaxsa9='" + getTmaxsa9() + "'" +
            ", tmaxsa10='" + getTmaxsa10() + "'" +
            ", tmaxsa11='" + getTmaxsa11() + "'" +
            ", tmaxsa12='" + getTmaxsa12() + "'" +
            ", tmaxsa13='" + getTmaxsa13() + "'" +
            ", tmaxsa14='" + getTmaxsa14() + "'" +
            ", tmaxsa15='" + getTmaxsa15() + "'" +
            ", tmaxsa16='" + getTmaxsa16() + "'" +
            ", tmaxsa17='" + getTmaxsa17() + "'" +
            ", tmaxsa18='" + getTmaxsa18() + "'" +
            ", tmaxsa19='" + getTmaxsa19() + "'" +
            ", tmaxsa20='" + getTmaxsa20() + "'" +
            ", varsasem1='" + getVarsasem1() + "'" +
            ", varsasem2='" + getVarsasem2() + "'" +
            ", cvtmaxsa='" + getCvtmaxsa() + "'" +
            ", reqaseg1='" + getReqaseg1() + "'" +
            ", reqaseg2='" + getReqaseg2() + "'" +
            ", reqaseg3='" + getReqaseg3() + "'" +
            ", reqaseg4='" + getReqaseg4() + "'" +
            ", reqaseg5='" + getReqaseg5() + "'" +
            ", reqaseg6='" + getReqaseg6() + "'" +
            ", reqaseg7='" + getReqaseg7() + "'" +
            ", reqaseg8='" + getReqaseg8() + "'" +
            ", reqaseg9='" + getReqaseg9() + "'" +
            ", reqaseg10='" + getReqaseg10() + "'" +
            ", reqaseg11='" + getReqaseg11() + "'" +
            ", reqaseg12='" + getReqaseg12() + "'" +
            ", reqaseg13='" + getReqaseg13() + "'" +
            ", reqaseg14='" + getReqaseg14() + "'" +
            ", reqaseg15='" + getReqaseg15() + "'" +
            ", stramsram='" + getStramsram() + "'" +
            ", fstat='" + getFstat() + "'" +
            "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombrel == null) ? 0 : nombrel.hashCode());
        result = prime * result + ((nombrec == null) ? 0 : nombrec.hashCode());
        result = prime * result + ((nombrem == null) ? 0 : nombrem.hashCode());
        result = prime * result + ((ramsubramo == null) ? 0 : ramsubramo.hashCode());
        result = prime * result + ((contab == null) ? 0 : contab.hashCode());
        result = prime * result + ((cvnpolini == null) ? 0 : cvnpolini.hashCode());
        result = prime * result + ((ultnpoliza == null) ? 0 : ultnpoliza.hashCode());
        result = prime * result + ((cvnpolren == null) ? 0 : cvnpolren.hashCode());
        result = prime * result + ((cvnendoso == null) ? 0 : cvnendoso.hashCode());
        result = prime * result + ((ultnendoso1 == null) ? 0 : ultnendoso1.hashCode());
        result = prime * result + ((ultnendoso2 == null) ? 0 : ultnendoso2.hashCode());
        result = prime * result + ((ultnendoso3 == null) ? 0 : ultnendoso3.hashCode());
        result = prime * result + ((tiporamo == null) ? 0 : tiporamo.hashCode());
        result = prime * result + ((cvcobp == null) ? 0 : cvcobp.hashCode());
        result = prime * result + ((pzmaxcp == null) ? 0 : pzmaxcp.hashCode());
        result = prime * result + ((pzmabcp == null) ? 0 : pzmabcp.hashCode());
        result = prime * result + ((critgexp == null) ? 0 : critgexp.hashCode());
        result = prime * result + ((nesqgexp == null) ? 0 : nesqgexp.hashCode());
        result = prime * result + ((cvcontcob == null) ? 0 : cvcontcob.hashCode());
        result = prime * result + ((critdesc == null) ? 0 : critdesc.hashCode());
        result = prime * result + ((nesqdesc == null) ? 0 : nesqdesc.hashCode());
        result = prime * result + ((critcomp == null) ? 0 : critcomp.hashCode());
        result = prime * result + ((nesqcomp == null) ? 0 : nesqcomp.hashCode());
        result = prime * result + ((tiporenov == null) ? 0 : tiporenov.hashCode());
        result = prime * result + ((diascpzo1 == null) ? 0 : diascpzo1.hashCode());
        result = prime * result + ((diascpzo2 == null) ? 0 : diascpzo2.hashCode());
        result = prime * result + ((diascpzo3 == null) ? 0 : diascpzo3.hashCode());
        result = prime * result + ((diascpzo4 == null) ? 0 : diascpzo4.hashCode());
        result = prime * result + ((diascpzo5 == null) ? 0 : diascpzo5.hashCode());
        result = prime * result + ((diascpzo6 == null) ? 0 : diascpzo6.hashCode());
        result = prime * result + ((diascpzo7 == null) ? 0 : diascpzo7.hashCode());
        result = prime * result + ((diascpzo8 == null) ? 0 : diascpzo8.hashCode());
        result = prime * result + ((diascpzo9 == null) ? 0 : diascpzo9.hashCode());
        result = prime * result + ((diascpzo10 == null) ? 0 : diascpzo10.hashCode());
        result = prime * result + ((diascpzo11 == null) ? 0 : diascpzo11.hashCode());
        result = prime * result + ((diascpzo12 == null) ? 0 : diascpzo12.hashCode());
        result = prime * result + ((diascpzo13 == null) ? 0 : diascpzo13.hashCode());
        result = prime * result + ((diascpzo14 == null) ? 0 : diascpzo14.hashCode());
        result = prime * result + ((diascpzo15 == null) ? 0 : diascpzo15.hashCode());
        result = prime * result + ((diascpzo16 == null) ? 0 : diascpzo16.hashCode());
        result = prime * result + ((diascpzo17 == null) ? 0 : diascpzo17.hashCode());
        result = prime * result + ((diascpzo18 == null) ? 0 : diascpzo18.hashCode());
        result = prime * result + ((diascpzo19 == null) ? 0 : diascpzo19.hashCode());
        result = prime * result + ((diascpzo20 == null) ? 0 : diascpzo20.hashCode());
        result = prime * result + ((diascpzo21 == null) ? 0 : diascpzo21.hashCode());
        result = prime * result + ((diascpzo22 == null) ? 0 : diascpzo22.hashCode());
        result = prime * result + ((diascpzo23 == null) ? 0 : diascpzo23.hashCode());
        result = prime * result + ((diascpzo24 == null) ? 0 : diascpzo24.hashCode());
        result = prime * result + ((diascpzo25 == null) ? 0 : diascpzo25.hashCode());
        result = prime * result + ((diascpzo26 == null) ? 0 : diascpzo26.hashCode());
        result = prime * result + ((diascpzo27 == null) ? 0 : diascpzo27.hashCode());
        result = prime * result + ((diascpzo28 == null) ? 0 : diascpzo28.hashCode());
        result = prime * result + ((diascpzo29 == null) ? 0 : diascpzo29.hashCode());
        result = prime * result + ((diascpzo30 == null) ? 0 : diascpzo30.hashCode());
        result = prime * result + ((diascpzo31 == null) ? 0 : diascpzo31.hashCode());
        result = prime * result + ((diascpzo32 == null) ? 0 : diascpzo32.hashCode());
        result = prime * result + ((diascpzo33 == null) ? 0 : diascpzo33.hashCode());
        result = prime * result + ((diascpzo34 == null) ? 0 : diascpzo34.hashCode());
        result = prime * result + ((diascpzo35 == null) ? 0 : diascpzo35.hashCode());
        result = prime * result + ((diascpzo36 == null) ? 0 : diascpzo36.hashCode());
        result = prime * result + ((diascpzo37 == null) ? 0 : diascpzo37.hashCode());
        result = prime * result + ((diascpzo38 == null) ? 0 : diascpzo38.hashCode());
        result = prime * result + ((diascpzo39 == null) ? 0 : diascpzo39.hashCode());
        result = prime * result + ((diascpzo40 == null) ? 0 : diascpzo40.hashCode());
        result = prime * result + ((diascpzo41 == null) ? 0 : diascpzo41.hashCode());
        result = prime * result + ((diascpzo42 == null) ? 0 : diascpzo42.hashCode());
        result = prime * result + ((diascpzo43 == null) ? 0 : diascpzo43.hashCode());
        result = prime * result + ((diascpzo44 == null) ? 0 : diascpzo44.hashCode());
        result = prime * result + ((diascpzo45 == null) ? 0 : diascpzo45.hashCode());
        result = prime * result + ((diascpzo46 == null) ? 0 : diascpzo46.hashCode());
        result = prime * result + ((diascpzo47 == null) ? 0 : diascpzo47.hashCode());
        result = prime * result + ((diascpzo48 == null) ? 0 : diascpzo48.hashCode());
        result = prime * result + ((diascpzo49 == null) ? 0 : diascpzo49.hashCode());
        result = prime * result + ((diascpzo50 == null) ? 0 : diascpzo50.hashCode());
        result = prime * result + ((porccpzo1 == null) ? 0 : porccpzo1.hashCode());
        result = prime * result + ((porccpzo2 == null) ? 0 : porccpzo2.hashCode());
        result = prime * result + ((porccpzo3 == null) ? 0 : porccpzo3.hashCode());
        result = prime * result + ((porccpzo4 == null) ? 0 : porccpzo4.hashCode());
        result = prime * result + ((porccpzo5 == null) ? 0 : porccpzo5.hashCode());
        result = prime * result + ((porccpzo6 == null) ? 0 : porccpzo6.hashCode());
        result = prime * result + ((porccpzo7 == null) ? 0 : porccpzo7.hashCode());
        result = prime * result + ((porccpzo8 == null) ? 0 : porccpzo8.hashCode());
        result = prime * result + ((porccpzo9 == null) ? 0 : porccpzo9.hashCode());
        result = prime * result + ((porccpzo10 == null) ? 0 : porccpzo10.hashCode());
        result = prime * result + ((porccpzo11 == null) ? 0 : porccpzo11.hashCode());
        result = prime * result + ((porccpzo12 == null) ? 0 : porccpzo12.hashCode());
        result = prime * result + ((porccpzo13 == null) ? 0 : porccpzo13.hashCode());
        result = prime * result + ((porccpzo14 == null) ? 0 : porccpzo14.hashCode());
        result = prime * result + ((porccpzo15 == null) ? 0 : porccpzo15.hashCode());
        result = prime * result + ((porccpzo16 == null) ? 0 : porccpzo16.hashCode());
        result = prime * result + ((porccpzo17 == null) ? 0 : porccpzo17.hashCode());
        result = prime * result + ((porccpzo18 == null) ? 0 : porccpzo18.hashCode());
        result = prime * result + ((porccpzo19 == null) ? 0 : porccpzo19.hashCode());
        result = prime * result + ((porccpzo20 == null) ? 0 : porccpzo20.hashCode());
        result = prime * result + ((porccpzo21 == null) ? 0 : porccpzo21.hashCode());
        result = prime * result + ((porccpzo22 == null) ? 0 : porccpzo22.hashCode());
        result = prime * result + ((porccpzo23 == null) ? 0 : porccpzo23.hashCode());
        result = prime * result + ((porccpzo24 == null) ? 0 : porccpzo24.hashCode());
        result = prime * result + ((porccpzo25 == null) ? 0 : porccpzo25.hashCode());
        result = prime * result + ((porccpzo26 == null) ? 0 : porccpzo26.hashCode());
        result = prime * result + ((porccpzo27 == null) ? 0 : porccpzo27.hashCode());
        result = prime * result + ((porccpzo28 == null) ? 0 : porccpzo28.hashCode());
        result = prime * result + ((porccpzo29 == null) ? 0 : porccpzo29.hashCode());
        result = prime * result + ((porccpzo30 == null) ? 0 : porccpzo30.hashCode());
        result = prime * result + ((porccpzo31 == null) ? 0 : porccpzo31.hashCode());
        result = prime * result + ((porccpzo32 == null) ? 0 : porccpzo32.hashCode());
        result = prime * result + ((porccpzo33 == null) ? 0 : porccpzo33.hashCode());
        result = prime * result + ((porccpzo34 == null) ? 0 : porccpzo34.hashCode());
        result = prime * result + ((porccpzo35 == null) ? 0 : porccpzo35.hashCode());
        result = prime * result + ((porccpzo36 == null) ? 0 : porccpzo36.hashCode());
        result = prime * result + ((porccpzo37 == null) ? 0 : porccpzo37.hashCode());
        result = prime * result + ((porccpzo38 == null) ? 0 : porccpzo38.hashCode());
        result = prime * result + ((porccpzo39 == null) ? 0 : porccpzo39.hashCode());
        result = prime * result + ((porccpzo40 == null) ? 0 : porccpzo40.hashCode());
        result = prime * result + ((porccpzo41 == null) ? 0 : porccpzo41.hashCode());
        result = prime * result + ((porccpzo42 == null) ? 0 : porccpzo42.hashCode());
        result = prime * result + ((porccpzo43 == null) ? 0 : porccpzo43.hashCode());
        result = prime * result + ((porccpzo44 == null) ? 0 : porccpzo44.hashCode());
        result = prime * result + ((porccpzo45 == null) ? 0 : porccpzo45.hashCode());
        result = prime * result + ((porccpzo46 == null) ? 0 : porccpzo46.hashCode());
        result = prime * result + ((porccpzo47 == null) ? 0 : porccpzo47.hashCode());
        result = prime * result + ((porccpzo48 == null) ? 0 : porccpzo48.hashCode());
        result = prime * result + ((porccpzo49 == null) ? 0 : porccpzo49.hashCode());
        result = prime * result + ((porccpzo50 == null) ? 0 : porccpzo50.hashCode());
        result = prime * result + ((rsrcomb1 == null) ? 0 : rsrcomb1.hashCode());
        result = prime * result + ((rsrcomb2 == null) ? 0 : rsrcomb2.hashCode());
        result = prime * result + ((rsrcomb3 == null) ? 0 : rsrcomb3.hashCode());
        result = prime * result + ((rsrcomb4 == null) ? 0 : rsrcomb4.hashCode());
        result = prime * result + ((rsrcomb5 == null) ? 0 : rsrcomb5.hashCode());
        result = prime * result + ((rsrcomb6 == null) ? 0 : rsrcomb6.hashCode());
        result = prime * result + ((rsrcomb7 == null) ? 0 : rsrcomb7.hashCode());
        result = prime * result + ((rsrcomb8 == null) ? 0 : rsrcomb8.hashCode());
        result = prime * result + ((rsrcomb9 == null) ? 0 : rsrcomb9.hashCode());
        result = prime * result + ((rsrcomb10 == null) ? 0 : rsrcomb10.hashCode());
        result = prime * result + ((rsrcomb11 == null) ? 0 : rsrcomb11.hashCode());
        result = prime * result + ((rsrcomb12 == null) ? 0 : rsrcomb12.hashCode());
        result = prime * result + ((ultnestudi == null) ? 0 : ultnestudi.hashCode());
        result = prime * result + ((limnaseg1 == null) ? 0 : limnaseg1.hashCode());
        result = prime * result + ((limnaseg2 == null) ? 0 : limnaseg2.hashCode());
        result = prime * result + ((limnaseg3 == null) ? 0 : limnaseg3.hashCode());
        result = prime * result + ((limnaseg4 == null) ? 0 : limnaseg4.hashCode());
        result = prime * result + ((limnaseg5 == null) ? 0 : limnaseg5.hashCode());
        result = prime * result + ((limnaseg6 == null) ? 0 : limnaseg6.hashCode());
        result = prime * result + ((limnaseg7 == null) ? 0 : limnaseg7.hashCode());
        result = prime * result + ((limnaseg8 == null) ? 0 : limnaseg8.hashCode());
        result = prime * result + ((limnaseg9 == null) ? 0 : limnaseg9.hashCode());
        result = prime * result + ((limnaseg10 == null) ? 0 : limnaseg10.hashCode());
        result = prime * result + ((limnaseg11 == null) ? 0 : limnaseg11.hashCode());
        result = prime * result + ((limnaseg12 == null) ? 0 : limnaseg12.hashCode());
        result = prime * result + ((limnaseg13 == null) ? 0 : limnaseg13.hashCode());
        result = prime * result + ((limnaseg14 == null) ? 0 : limnaseg14.hashCode());
        result = prime * result + ((limnaseg15 == null) ? 0 : limnaseg15.hashCode());
        result = prime * result + ((limnaseg16 == null) ? 0 : limnaseg16.hashCode());
        result = prime * result + ((limnaseg17 == null) ? 0 : limnaseg17.hashCode());
        result = prime * result + ((limnaseg18 == null) ? 0 : limnaseg18.hashCode());
        result = prime * result + ((limnaseg19 == null) ? 0 : limnaseg19.hashCode());
        result = prime * result + ((limnaseg20 == null) ? 0 : limnaseg20.hashCode());
        result = prime * result + ((factsa1 == null) ? 0 : factsa1.hashCode());
        result = prime * result + ((factsa2 == null) ? 0 : factsa2.hashCode());
        result = prime * result + ((factsa3 == null) ? 0 : factsa3.hashCode());
        result = prime * result + ((factsa4 == null) ? 0 : factsa4.hashCode());
        result = prime * result + ((factsa5 == null) ? 0 : factsa5.hashCode());
        result = prime * result + ((factsa6 == null) ? 0 : factsa6.hashCode());
        result = prime * result + ((factsa7 == null) ? 0 : factsa7.hashCode());
        result = prime * result + ((factsa8 == null) ? 0 : factsa8.hashCode());
        result = prime * result + ((factsa9 == null) ? 0 : factsa9.hashCode());
        result = prime * result + ((factsa10 == null) ? 0 : factsa10.hashCode());
        result = prime * result + ((factsa11 == null) ? 0 : factsa11.hashCode());
        result = prime * result + ((factsa12 == null) ? 0 : factsa12.hashCode());
        result = prime * result + ((factsa13 == null) ? 0 : factsa13.hashCode());
        result = prime * result + ((factsa14 == null) ? 0 : factsa14.hashCode());
        result = prime * result + ((factsa15 == null) ? 0 : factsa15.hashCode());
        result = prime * result + ((factsa16 == null) ? 0 : factsa16.hashCode());
        result = prime * result + ((factsa17 == null) ? 0 : factsa17.hashCode());
        result = prime * result + ((factsa18 == null) ? 0 : factsa18.hashCode());
        result = prime * result + ((factsa19 == null) ? 0 : factsa19.hashCode());
        result = prime * result + ((factsa20 == null) ? 0 : factsa20.hashCode());
        result = prime * result + ((tmaxsa1 == null) ? 0 : tmaxsa1.hashCode());
        result = prime * result + ((tmaxsa2 == null) ? 0 : tmaxsa2.hashCode());
        result = prime * result + ((tmaxsa3 == null) ? 0 : tmaxsa3.hashCode());
        result = prime * result + ((tmaxsa4 == null) ? 0 : tmaxsa4.hashCode());
        result = prime * result + ((tmaxsa5 == null) ? 0 : tmaxsa5.hashCode());
        result = prime * result + ((tmaxsa6 == null) ? 0 : tmaxsa6.hashCode());
        result = prime * result + ((tmaxsa7 == null) ? 0 : tmaxsa7.hashCode());
        result = prime * result + ((tmaxsa8 == null) ? 0 : tmaxsa8.hashCode());
        result = prime * result + ((tmaxsa9 == null) ? 0 : tmaxsa9.hashCode());
        result = prime * result + ((tmaxsa10 == null) ? 0 : tmaxsa10.hashCode());
        result = prime * result + ((tmaxsa11 == null) ? 0 : tmaxsa11.hashCode());
        result = prime * result + ((tmaxsa12 == null) ? 0 : tmaxsa12.hashCode());
        result = prime * result + ((tmaxsa13 == null) ? 0 : tmaxsa13.hashCode());
        result = prime * result + ((tmaxsa14 == null) ? 0 : tmaxsa14.hashCode());
        result = prime * result + ((tmaxsa15 == null) ? 0 : tmaxsa15.hashCode());
        result = prime * result + ((tmaxsa16 == null) ? 0 : tmaxsa16.hashCode());
        result = prime * result + ((tmaxsa17 == null) ? 0 : tmaxsa17.hashCode());
        result = prime * result + ((tmaxsa18 == null) ? 0 : tmaxsa18.hashCode());
        result = prime * result + ((tmaxsa19 == null) ? 0 : tmaxsa19.hashCode());
        result = prime * result + ((tmaxsa20 == null) ? 0 : tmaxsa20.hashCode());
        result = prime * result + ((varsasem1 == null) ? 0 : varsasem1.hashCode());
        result = prime * result + ((varsasem2 == null) ? 0 : varsasem2.hashCode());
        result = prime * result + ((cvtmaxsa == null) ? 0 : cvtmaxsa.hashCode());
        result = prime * result + ((reqaseg1 == null) ? 0 : reqaseg1.hashCode());
        result = prime * result + ((reqaseg2 == null) ? 0 : reqaseg2.hashCode());
        result = prime * result + ((reqaseg3 == null) ? 0 : reqaseg3.hashCode());
        result = prime * result + ((reqaseg4 == null) ? 0 : reqaseg4.hashCode());
        result = prime * result + ((reqaseg5 == null) ? 0 : reqaseg5.hashCode());
        result = prime * result + ((reqaseg6 == null) ? 0 : reqaseg6.hashCode());
        result = prime * result + ((reqaseg7 == null) ? 0 : reqaseg7.hashCode());
        result = prime * result + ((reqaseg8 == null) ? 0 : reqaseg8.hashCode());
        result = prime * result + ((reqaseg9 == null) ? 0 : reqaseg9.hashCode());
        result = prime * result + ((reqaseg10 == null) ? 0 : reqaseg10.hashCode());
        result = prime * result + ((reqaseg11 == null) ? 0 : reqaseg11.hashCode());
        result = prime * result + ((reqaseg12 == null) ? 0 : reqaseg12.hashCode());
        result = prime * result + ((reqaseg13 == null) ? 0 : reqaseg13.hashCode());
        result = prime * result + ((reqaseg14 == null) ? 0 : reqaseg14.hashCode());
        result = prime * result + ((reqaseg15 == null) ? 0 : reqaseg15.hashCode());
        result = prime * result + ((stramsram == null) ? 0 : stramsram.hashCode());
        result = prime * result + ((fstat == null) ? 0 : fstat.hashCode());
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
        ${FTL_CatDTO} other = (${FTL_CatDTO}) obj;
        if (nombrel == null) {
            if (other.nombrel != null)
                return false;
        } else if (!nombrel.equals(other.nombrel))
            return false;
        if (nombrec == null) {
            if (other.nombrec != null)
                return false;
        } else if (!nombrec.equals(other.nombrec))
            return false;
        if (nombrem == null) {
            if (other.nombrem != null)
                return false;
        } else if (!nombrem.equals(other.nombrem))
            return false;
        if (ramsubramo == null) {
            if (other.ramsubramo != null)
                return false;
        } else if (!ramsubramo.equals(other.ramsubramo))
            return false;
        if (contab == null) {
            if (other.contab != null)
                return false;
        } else if (!contab.equals(other.contab))
            return false;
        if (cvnpolini == null) {
            if (other.cvnpolini != null)
                return false;
        } else if (!cvnpolini.equals(other.cvnpolini))
            return false;
        if (ultnpoliza == null) {
            if (other.ultnpoliza != null)
                return false;
        } else if (!ultnpoliza.equals(other.ultnpoliza))
            return false;
        if (cvnpolren == null) {
            if (other.cvnpolren != null)
                return false;
        } else if (!cvnpolren.equals(other.cvnpolren))
            return false;
        if (cvnendoso == null) {
            if (other.cvnendoso != null)
                return false;
        } else if (!cvnendoso.equals(other.cvnendoso))
            return false;
        if (ultnendoso1 == null) {
            if (other.ultnendoso1 != null)
                return false;
        } else if (!ultnendoso1.equals(other.ultnendoso1))
            return false;
        if (ultnendoso2 == null) {
            if (other.ultnendoso2 != null)
                return false;
        } else if (!ultnendoso2.equals(other.ultnendoso2))
            return false;
        if (ultnendoso3 == null) {
            if (other.ultnendoso3 != null)
                return false;
        } else if (!ultnendoso3.equals(other.ultnendoso3))
            return false;
        if (tiporamo == null) {
            if (other.tiporamo != null)
                return false;
        } else if (!tiporamo.equals(other.tiporamo))
            return false;
        if (cvcobp == null) {
            if (other.cvcobp != null)
                return false;
        } else if (!cvcobp.equals(other.cvcobp))
            return false;
        if (pzmaxcp == null) {
            if (other.pzmaxcp != null)
                return false;
        } else if (!pzmaxcp.equals(other.pzmaxcp))
            return false;
        if (pzmabcp == null) {
            if (other.pzmabcp != null)
                return false;
        } else if (!pzmabcp.equals(other.pzmabcp))
            return false;
        if (critgexp == null) {
            if (other.critgexp != null)
                return false;
        } else if (!critgexp.equals(other.critgexp))
            return false;
        if (nesqgexp == null) {
            if (other.nesqgexp != null)
                return false;
        } else if (!nesqgexp.equals(other.nesqgexp))
            return false;
        if (cvcontcob == null) {
            if (other.cvcontcob != null)
                return false;
        } else if (!cvcontcob.equals(other.cvcontcob))
            return false;
        if (critdesc == null) {
            if (other.critdesc != null)
                return false;
        } else if (!critdesc.equals(other.critdesc))
            return false;
        if (nesqdesc == null) {
            if (other.nesqdesc != null)
                return false;
        } else if (!nesqdesc.equals(other.nesqdesc))
            return false;
        if (critcomp == null) {
            if (other.critcomp != null)
                return false;
        } else if (!critcomp.equals(other.critcomp))
            return false;
        if (nesqcomp == null) {
            if (other.nesqcomp != null)
                return false;
        } else if (!nesqcomp.equals(other.nesqcomp))
            return false;
        if (tiporenov == null) {
            if (other.tiporenov != null)
                return false;
        } else if (!tiporenov.equals(other.tiporenov))
            return false;
        if (diascpzo1 == null) {
            if (other.diascpzo1 != null)
                return false;
        } else if (!diascpzo1.equals(other.diascpzo1))
            return false;
        if (diascpzo2 == null) {
            if (other.diascpzo2 != null)
                return false;
        } else if (!diascpzo2.equals(other.diascpzo2))
            return false;
        if (diascpzo3 == null) {
            if (other.diascpzo3 != null)
                return false;
        } else if (!diascpzo3.equals(other.diascpzo3))
            return false;
        if (diascpzo4 == null) {
            if (other.diascpzo4 != null)
                return false;
        } else if (!diascpzo4.equals(other.diascpzo4))
            return false;
        if (diascpzo5 == null) {
            if (other.diascpzo5 != null)
                return false;
        } else if (!diascpzo5.equals(other.diascpzo5))
            return false;
        if (diascpzo6 == null) {
            if (other.diascpzo6 != null)
                return false;
        } else if (!diascpzo6.equals(other.diascpzo6))
            return false;
        if (diascpzo7 == null) {
            if (other.diascpzo7 != null)
                return false;
        } else if (!diascpzo7.equals(other.diascpzo7))
            return false;
        if (diascpzo8 == null) {
            if (other.diascpzo8 != null)
                return false;
        } else if (!diascpzo8.equals(other.diascpzo8))
            return false;
        if (diascpzo9 == null) {
            if (other.diascpzo9 != null)
                return false;
        } else if (!diascpzo9.equals(other.diascpzo9))
            return false;
        if (diascpzo10 == null) {
            if (other.diascpzo10 != null)
                return false;
        } else if (!diascpzo10.equals(other.diascpzo10))
            return false;
        if (diascpzo11 == null) {
            if (other.diascpzo11 != null)
                return false;
        } else if (!diascpzo11.equals(other.diascpzo11))
            return false;
        if (diascpzo12 == null) {
            if (other.diascpzo12 != null)
                return false;
        } else if (!diascpzo12.equals(other.diascpzo12))
            return false;
        if (diascpzo13 == null) {
            if (other.diascpzo13 != null)
                return false;
        } else if (!diascpzo13.equals(other.diascpzo13))
            return false;
        if (diascpzo14 == null) {
            if (other.diascpzo14 != null)
                return false;
        } else if (!diascpzo14.equals(other.diascpzo14))
            return false;
        if (diascpzo15 == null) {
            if (other.diascpzo15 != null)
                return false;
        } else if (!diascpzo15.equals(other.diascpzo15))
            return false;
        if (diascpzo16 == null) {
            if (other.diascpzo16 != null)
                return false;
        } else if (!diascpzo16.equals(other.diascpzo16))
            return false;
        if (diascpzo17 == null) {
            if (other.diascpzo17 != null)
                return false;
        } else if (!diascpzo17.equals(other.diascpzo17))
            return false;
        if (diascpzo18 == null) {
            if (other.diascpzo18 != null)
                return false;
        } else if (!diascpzo18.equals(other.diascpzo18))
            return false;
        if (diascpzo19 == null) {
            if (other.diascpzo19 != null)
                return false;
        } else if (!diascpzo19.equals(other.diascpzo19))
            return false;
        if (diascpzo20 == null) {
            if (other.diascpzo20 != null)
                return false;
        } else if (!diascpzo20.equals(other.diascpzo20))
            return false;
        if (diascpzo21 == null) {
            if (other.diascpzo21 != null)
                return false;
        } else if (!diascpzo21.equals(other.diascpzo21))
            return false;
        if (diascpzo22 == null) {
            if (other.diascpzo22 != null)
                return false;
        } else if (!diascpzo22.equals(other.diascpzo22))
            return false;
        if (diascpzo23 == null) {
            if (other.diascpzo23 != null)
                return false;
        } else if (!diascpzo23.equals(other.diascpzo23))
            return false;
        if (diascpzo24 == null) {
            if (other.diascpzo24 != null)
                return false;
        } else if (!diascpzo24.equals(other.diascpzo24))
            return false;
        if (diascpzo25 == null) {
            if (other.diascpzo25 != null)
                return false;
        } else if (!diascpzo25.equals(other.diascpzo25))
            return false;
        if (diascpzo26 == null) {
            if (other.diascpzo26 != null)
                return false;
        } else if (!diascpzo26.equals(other.diascpzo26))
            return false;
        if (diascpzo27 == null) {
            if (other.diascpzo27 != null)
                return false;
        } else if (!diascpzo27.equals(other.diascpzo27))
            return false;
        if (diascpzo28 == null) {
            if (other.diascpzo28 != null)
                return false;
        } else if (!diascpzo28.equals(other.diascpzo28))
            return false;
        if (diascpzo29 == null) {
            if (other.diascpzo29 != null)
                return false;
        } else if (!diascpzo29.equals(other.diascpzo29))
            return false;
        if (diascpzo30 == null) {
            if (other.diascpzo30 != null)
                return false;
        } else if (!diascpzo30.equals(other.diascpzo30))
            return false;
        if (diascpzo31 == null) {
            if (other.diascpzo31 != null)
                return false;
        } else if (!diascpzo31.equals(other.diascpzo31))
            return false;
        if (diascpzo32 == null) {
            if (other.diascpzo32 != null)
                return false;
        } else if (!diascpzo32.equals(other.diascpzo32))
            return false;
        if (diascpzo33 == null) {
            if (other.diascpzo33 != null)
                return false;
        } else if (!diascpzo33.equals(other.diascpzo33))
            return false;
        if (diascpzo34 == null) {
            if (other.diascpzo34 != null)
                return false;
        } else if (!diascpzo34.equals(other.diascpzo34))
            return false;
        if (diascpzo35 == null) {
            if (other.diascpzo35 != null)
                return false;
        } else if (!diascpzo35.equals(other.diascpzo35))
            return false;
        if (diascpzo36 == null) {
            if (other.diascpzo36 != null)
                return false;
        } else if (!diascpzo36.equals(other.diascpzo36))
            return false;
        if (diascpzo37 == null) {
            if (other.diascpzo37 != null)
                return false;
        } else if (!diascpzo37.equals(other.diascpzo37))
            return false;
        if (diascpzo38 == null) {
            if (other.diascpzo38 != null)
                return false;
        } else if (!diascpzo38.equals(other.diascpzo38))
            return false;
        if (diascpzo39 == null) {
            if (other.diascpzo39 != null)
                return false;
        } else if (!diascpzo39.equals(other.diascpzo39))
            return false;
        if (diascpzo40 == null) {
            if (other.diascpzo40 != null)
                return false;
        } else if (!diascpzo40.equals(other.diascpzo40))
            return false;
        if (diascpzo41 == null) {
            if (other.diascpzo41 != null)
                return false;
        } else if (!diascpzo41.equals(other.diascpzo41))
            return false;
        if (diascpzo42 == null) {
            if (other.diascpzo42 != null)
                return false;
        } else if (!diascpzo42.equals(other.diascpzo42))
            return false;
        if (diascpzo43 == null) {
            if (other.diascpzo43 != null)
                return false;
        } else if (!diascpzo43.equals(other.diascpzo43))
            return false;
        if (diascpzo44 == null) {
            if (other.diascpzo44 != null)
                return false;
        } else if (!diascpzo44.equals(other.diascpzo44))
            return false;
        if (diascpzo45 == null) {
            if (other.diascpzo45 != null)
                return false;
        } else if (!diascpzo45.equals(other.diascpzo45))
            return false;
        if (diascpzo46 == null) {
            if (other.diascpzo46 != null)
                return false;
        } else if (!diascpzo46.equals(other.diascpzo46))
            return false;
        if (diascpzo47 == null) {
            if (other.diascpzo47 != null)
                return false;
        } else if (!diascpzo47.equals(other.diascpzo47))
            return false;
        if (diascpzo48 == null) {
            if (other.diascpzo48 != null)
                return false;
        } else if (!diascpzo48.equals(other.diascpzo48))
            return false;
        if (diascpzo49 == null) {
            if (other.diascpzo49 != null)
                return false;
        } else if (!diascpzo49.equals(other.diascpzo49))
            return false;
        if (diascpzo50 == null) {
            if (other.diascpzo50 != null)
                return false;
        } else if (!diascpzo50.equals(other.diascpzo50))
            return false;
        if (porccpzo1 == null) {
            if (other.porccpzo1 != null)
                return false;
        } else if (!porccpzo1.equals(other.porccpzo1))
            return false;
        if (porccpzo2 == null) {
            if (other.porccpzo2 != null)
                return false;
        } else if (!porccpzo2.equals(other.porccpzo2))
            return false;
        if (porccpzo3 == null) {
            if (other.porccpzo3 != null)
                return false;
        } else if (!porccpzo3.equals(other.porccpzo3))
            return false;
        if (porccpzo4 == null) {
            if (other.porccpzo4 != null)
                return false;
        } else if (!porccpzo4.equals(other.porccpzo4))
            return false;
        if (porccpzo5 == null) {
            if (other.porccpzo5 != null)
                return false;
        } else if (!porccpzo5.equals(other.porccpzo5))
            return false;
        if (porccpzo6 == null) {
            if (other.porccpzo6 != null)
                return false;
        } else if (!porccpzo6.equals(other.porccpzo6))
            return false;
        if (porccpzo7 == null) {
            if (other.porccpzo7 != null)
                return false;
        } else if (!porccpzo7.equals(other.porccpzo7))
            return false;
        if (porccpzo8 == null) {
            if (other.porccpzo8 != null)
                return false;
        } else if (!porccpzo8.equals(other.porccpzo8))
            return false;
        if (porccpzo9 == null) {
            if (other.porccpzo9 != null)
                return false;
        } else if (!porccpzo9.equals(other.porccpzo9))
            return false;
        if (porccpzo10 == null) {
            if (other.porccpzo10 != null)
                return false;
        } else if (!porccpzo10.equals(other.porccpzo10))
            return false;
        if (porccpzo11 == null) {
            if (other.porccpzo11 != null)
                return false;
        } else if (!porccpzo11.equals(other.porccpzo11))
            return false;
        if (porccpzo12 == null) {
            if (other.porccpzo12 != null)
                return false;
        } else if (!porccpzo12.equals(other.porccpzo12))
            return false;
        if (porccpzo13 == null) {
            if (other.porccpzo13 != null)
                return false;
        } else if (!porccpzo13.equals(other.porccpzo13))
            return false;
        if (porccpzo14 == null) {
            if (other.porccpzo14 != null)
                return false;
        } else if (!porccpzo14.equals(other.porccpzo14))
            return false;
        if (porccpzo15 == null) {
            if (other.porccpzo15 != null)
                return false;
        } else if (!porccpzo15.equals(other.porccpzo15))
            return false;
        if (porccpzo16 == null) {
            if (other.porccpzo16 != null)
                return false;
        } else if (!porccpzo16.equals(other.porccpzo16))
            return false;
        if (porccpzo17 == null) {
            if (other.porccpzo17 != null)
                return false;
        } else if (!porccpzo17.equals(other.porccpzo17))
            return false;
        if (porccpzo18 == null) {
            if (other.porccpzo18 != null)
                return false;
        } else if (!porccpzo18.equals(other.porccpzo18))
            return false;
        if (porccpzo19 == null) {
            if (other.porccpzo19 != null)
                return false;
        } else if (!porccpzo19.equals(other.porccpzo19))
            return false;
        if (porccpzo20 == null) {
            if (other.porccpzo20 != null)
                return false;
        } else if (!porccpzo20.equals(other.porccpzo20))
            return false;
        if (porccpzo21 == null) {
            if (other.porccpzo21 != null)
                return false;
        } else if (!porccpzo21.equals(other.porccpzo21))
            return false;
        if (porccpzo22 == null) {
            if (other.porccpzo22 != null)
                return false;
        } else if (!porccpzo22.equals(other.porccpzo22))
            return false;
        if (porccpzo23 == null) {
            if (other.porccpzo23 != null)
                return false;
        } else if (!porccpzo23.equals(other.porccpzo23))
            return false;
        if (porccpzo24 == null) {
            if (other.porccpzo24 != null)
                return false;
        } else if (!porccpzo24.equals(other.porccpzo24))
            return false;
        if (porccpzo25 == null) {
            if (other.porccpzo25 != null)
                return false;
        } else if (!porccpzo25.equals(other.porccpzo25))
            return false;
        if (porccpzo26 == null) {
            if (other.porccpzo26 != null)
                return false;
        } else if (!porccpzo26.equals(other.porccpzo26))
            return false;
        if (porccpzo27 == null) {
            if (other.porccpzo27 != null)
                return false;
        } else if (!porccpzo27.equals(other.porccpzo27))
            return false;
        if (porccpzo28 == null) {
            if (other.porccpzo28 != null)
                return false;
        } else if (!porccpzo28.equals(other.porccpzo28))
            return false;
        if (porccpzo29 == null) {
            if (other.porccpzo29 != null)
                return false;
        } else if (!porccpzo29.equals(other.porccpzo29))
            return false;
        if (porccpzo30 == null) {
            if (other.porccpzo30 != null)
                return false;
        } else if (!porccpzo30.equals(other.porccpzo30))
            return false;
        if (porccpzo31 == null) {
            if (other.porccpzo31 != null)
                return false;
        } else if (!porccpzo31.equals(other.porccpzo31))
            return false;
        if (porccpzo32 == null) {
            if (other.porccpzo32 != null)
                return false;
        } else if (!porccpzo32.equals(other.porccpzo32))
            return false;
        if (porccpzo33 == null) {
            if (other.porccpzo33 != null)
                return false;
        } else if (!porccpzo33.equals(other.porccpzo33))
            return false;
        if (porccpzo34 == null) {
            if (other.porccpzo34 != null)
                return false;
        } else if (!porccpzo34.equals(other.porccpzo34))
            return false;
        if (porccpzo35 == null) {
            if (other.porccpzo35 != null)
                return false;
        } else if (!porccpzo35.equals(other.porccpzo35))
            return false;
        if (porccpzo36 == null) {
            if (other.porccpzo36 != null)
                return false;
        } else if (!porccpzo36.equals(other.porccpzo36))
            return false;
        if (porccpzo37 == null) {
            if (other.porccpzo37 != null)
                return false;
        } else if (!porccpzo37.equals(other.porccpzo37))
            return false;
        if (porccpzo38 == null) {
            if (other.porccpzo38 != null)
                return false;
        } else if (!porccpzo38.equals(other.porccpzo38))
            return false;
        if (porccpzo39 == null) {
            if (other.porccpzo39 != null)
                return false;
        } else if (!porccpzo39.equals(other.porccpzo39))
            return false;
        if (porccpzo40 == null) {
            if (other.porccpzo40 != null)
                return false;
        } else if (!porccpzo40.equals(other.porccpzo40))
            return false;
        if (porccpzo41 == null) {
            if (other.porccpzo41 != null)
                return false;
        } else if (!porccpzo41.equals(other.porccpzo41))
            return false;
        if (porccpzo42 == null) {
            if (other.porccpzo42 != null)
                return false;
        } else if (!porccpzo42.equals(other.porccpzo42))
            return false;
        if (porccpzo43 == null) {
            if (other.porccpzo43 != null)
                return false;
        } else if (!porccpzo43.equals(other.porccpzo43))
            return false;
        if (porccpzo44 == null) {
            if (other.porccpzo44 != null)
                return false;
        } else if (!porccpzo44.equals(other.porccpzo44))
            return false;
        if (porccpzo45 == null) {
            if (other.porccpzo45 != null)
                return false;
        } else if (!porccpzo45.equals(other.porccpzo45))
            return false;
        if (porccpzo46 == null) {
            if (other.porccpzo46 != null)
                return false;
        } else if (!porccpzo46.equals(other.porccpzo46))
            return false;
        if (porccpzo47 == null) {
            if (other.porccpzo47 != null)
                return false;
        } else if (!porccpzo47.equals(other.porccpzo47))
            return false;
        if (porccpzo48 == null) {
            if (other.porccpzo48 != null)
                return false;
        } else if (!porccpzo48.equals(other.porccpzo48))
            return false;
        if (porccpzo49 == null) {
            if (other.porccpzo49 != null)
                return false;
        } else if (!porccpzo49.equals(other.porccpzo49))
            return false;
        if (porccpzo50 == null) {
            if (other.porccpzo50 != null)
                return false;
        } else if (!porccpzo50.equals(other.porccpzo50))
            return false;
        if (rsrcomb1 == null) {
            if (other.rsrcomb1 != null)
                return false;
        } else if (!rsrcomb1.equals(other.rsrcomb1))
            return false;
        if (rsrcomb2 == null) {
            if (other.rsrcomb2 != null)
                return false;
        } else if (!rsrcomb2.equals(other.rsrcomb2))
            return false;
        if (rsrcomb3 == null) {
            if (other.rsrcomb3 != null)
                return false;
        } else if (!rsrcomb3.equals(other.rsrcomb3))
            return false;
        if (rsrcomb4 == null) {
            if (other.rsrcomb4 != null)
                return false;
        } else if (!rsrcomb4.equals(other.rsrcomb4))
            return false;
        if (rsrcomb5 == null) {
            if (other.rsrcomb5 != null)
                return false;
        } else if (!rsrcomb5.equals(other.rsrcomb5))
            return false;
        if (rsrcomb6 == null) {
            if (other.rsrcomb6 != null)
                return false;
        } else if (!rsrcomb6.equals(other.rsrcomb6))
            return false;
        if (rsrcomb7 == null) {
            if (other.rsrcomb7 != null)
                return false;
        } else if (!rsrcomb7.equals(other.rsrcomb7))
            return false;
        if (rsrcomb8 == null) {
            if (other.rsrcomb8 != null)
                return false;
        } else if (!rsrcomb8.equals(other.rsrcomb8))
            return false;
        if (rsrcomb9 == null) {
            if (other.rsrcomb9 != null)
                return false;
        } else if (!rsrcomb9.equals(other.rsrcomb9))
            return false;
        if (rsrcomb10 == null) {
            if (other.rsrcomb10 != null)
                return false;
        } else if (!rsrcomb10.equals(other.rsrcomb10))
            return false;
        if (rsrcomb11 == null) {
            if (other.rsrcomb11 != null)
                return false;
        } else if (!rsrcomb11.equals(other.rsrcomb11))
            return false;
        if (rsrcomb12 == null) {
            if (other.rsrcomb12 != null)
                return false;
        } else if (!rsrcomb12.equals(other.rsrcomb12))
            return false;
        if (ultnestudi == null) {
            if (other.ultnestudi != null)
                return false;
        } else if (!ultnestudi.equals(other.ultnestudi))
            return false;
        if (limnaseg1 == null) {
            if (other.limnaseg1 != null)
                return false;
        } else if (!limnaseg1.equals(other.limnaseg1))
            return false;
        if (limnaseg2 == null) {
            if (other.limnaseg2 != null)
                return false;
        } else if (!limnaseg2.equals(other.limnaseg2))
            return false;
        if (limnaseg3 == null) {
            if (other.limnaseg3 != null)
                return false;
        } else if (!limnaseg3.equals(other.limnaseg3))
            return false;
        if (limnaseg4 == null) {
            if (other.limnaseg4 != null)
                return false;
        } else if (!limnaseg4.equals(other.limnaseg4))
            return false;
        if (limnaseg5 == null) {
            if (other.limnaseg5 != null)
                return false;
        } else if (!limnaseg5.equals(other.limnaseg5))
            return false;
        if (limnaseg6 == null) {
            if (other.limnaseg6 != null)
                return false;
        } else if (!limnaseg6.equals(other.limnaseg6))
            return false;
        if (limnaseg7 == null) {
            if (other.limnaseg7 != null)
                return false;
        } else if (!limnaseg7.equals(other.limnaseg7))
            return false;
        if (limnaseg8 == null) {
            if (other.limnaseg8 != null)
                return false;
        } else if (!limnaseg8.equals(other.limnaseg8))
            return false;
        if (limnaseg9 == null) {
            if (other.limnaseg9 != null)
                return false;
        } else if (!limnaseg9.equals(other.limnaseg9))
            return false;
        if (limnaseg10 == null) {
            if (other.limnaseg10 != null)
                return false;
        } else if (!limnaseg10.equals(other.limnaseg10))
            return false;
        if (limnaseg11 == null) {
            if (other.limnaseg11 != null)
                return false;
        } else if (!limnaseg11.equals(other.limnaseg11))
            return false;
        if (limnaseg12 == null) {
            if (other.limnaseg12 != null)
                return false;
        } else if (!limnaseg12.equals(other.limnaseg12))
            return false;
        if (limnaseg13 == null) {
            if (other.limnaseg13 != null)
                return false;
        } else if (!limnaseg13.equals(other.limnaseg13))
            return false;
        if (limnaseg14 == null) {
            if (other.limnaseg14 != null)
                return false;
        } else if (!limnaseg14.equals(other.limnaseg14))
            return false;
        if (limnaseg15 == null) {
            if (other.limnaseg15 != null)
                return false;
        } else if (!limnaseg15.equals(other.limnaseg15))
            return false;
        if (limnaseg16 == null) {
            if (other.limnaseg16 != null)
                return false;
        } else if (!limnaseg16.equals(other.limnaseg16))
            return false;
        if (limnaseg17 == null) {
            if (other.limnaseg17 != null)
                return false;
        } else if (!limnaseg17.equals(other.limnaseg17))
            return false;
        if (limnaseg18 == null) {
            if (other.limnaseg18 != null)
                return false;
        } else if (!limnaseg18.equals(other.limnaseg18))
            return false;
        if (limnaseg19 == null) {
            if (other.limnaseg19 != null)
                return false;
        } else if (!limnaseg19.equals(other.limnaseg19))
            return false;
        if (limnaseg20 == null) {
            if (other.limnaseg20 != null)
                return false;
        } else if (!limnaseg20.equals(other.limnaseg20))
            return false;
        if (factsa1 == null) {
            if (other.factsa1 != null)
                return false;
        } else if (!factsa1.equals(other.factsa1))
            return false;
        if (factsa2 == null) {
            if (other.factsa2 != null)
                return false;
        } else if (!factsa2.equals(other.factsa2))
            return false;
        if (factsa3 == null) {
            if (other.factsa3 != null)
                return false;
        } else if (!factsa3.equals(other.factsa3))
            return false;
        if (factsa4 == null) {
            if (other.factsa4 != null)
                return false;
        } else if (!factsa4.equals(other.factsa4))
            return false;
        if (factsa5 == null) {
            if (other.factsa5 != null)
                return false;
        } else if (!factsa5.equals(other.factsa5))
            return false;
        if (factsa6 == null) {
            if (other.factsa6 != null)
                return false;
        } else if (!factsa6.equals(other.factsa6))
            return false;
        if (factsa7 == null) {
            if (other.factsa7 != null)
                return false;
        } else if (!factsa7.equals(other.factsa7))
            return false;
        if (factsa8 == null) {
            if (other.factsa8 != null)
                return false;
        } else if (!factsa8.equals(other.factsa8))
            return false;
        if (factsa9 == null) {
            if (other.factsa9 != null)
                return false;
        } else if (!factsa9.equals(other.factsa9))
            return false;
        if (factsa10 == null) {
            if (other.factsa10 != null)
                return false;
        } else if (!factsa10.equals(other.factsa10))
            return false;
        if (factsa11 == null) {
            if (other.factsa11 != null)
                return false;
        } else if (!factsa11.equals(other.factsa11))
            return false;
        if (factsa12 == null) {
            if (other.factsa12 != null)
                return false;
        } else if (!factsa12.equals(other.factsa12))
            return false;
        if (factsa13 == null) {
            if (other.factsa13 != null)
                return false;
        } else if (!factsa13.equals(other.factsa13))
            return false;
        if (factsa14 == null) {
            if (other.factsa14 != null)
                return false;
        } else if (!factsa14.equals(other.factsa14))
            return false;
        if (factsa15 == null) {
            if (other.factsa15 != null)
                return false;
        } else if (!factsa15.equals(other.factsa15))
            return false;
        if (factsa16 == null) {
            if (other.factsa16 != null)
                return false;
        } else if (!factsa16.equals(other.factsa16))
            return false;
        if (factsa17 == null) {
            if (other.factsa17 != null)
                return false;
        } else if (!factsa17.equals(other.factsa17))
            return false;
        if (factsa18 == null) {
            if (other.factsa18 != null)
                return false;
        } else if (!factsa18.equals(other.factsa18))
            return false;
        if (factsa19 == null) {
            if (other.factsa19 != null)
                return false;
        } else if (!factsa19.equals(other.factsa19))
            return false;
        if (factsa20 == null) {
            if (other.factsa20 != null)
                return false;
        } else if (!factsa20.equals(other.factsa20))
            return false;
        if (tmaxsa1 == null) {
            if (other.tmaxsa1 != null)
                return false;
        } else if (!tmaxsa1.equals(other.tmaxsa1))
            return false;
        if (tmaxsa2 == null) {
            if (other.tmaxsa2 != null)
                return false;
        } else if (!tmaxsa2.equals(other.tmaxsa2))
            return false;
        if (tmaxsa3 == null) {
            if (other.tmaxsa3 != null)
                return false;
        } else if (!tmaxsa3.equals(other.tmaxsa3))
            return false;
        if (tmaxsa4 == null) {
            if (other.tmaxsa4 != null)
                return false;
        } else if (!tmaxsa4.equals(other.tmaxsa4))
            return false;
        if (tmaxsa5 == null) {
            if (other.tmaxsa5 != null)
                return false;
        } else if (!tmaxsa5.equals(other.tmaxsa5))
            return false;
        if (tmaxsa6 == null) {
            if (other.tmaxsa6 != null)
                return false;
        } else if (!tmaxsa6.equals(other.tmaxsa6))
            return false;
        if (tmaxsa7 == null) {
            if (other.tmaxsa7 != null)
                return false;
        } else if (!tmaxsa7.equals(other.tmaxsa7))
            return false;
        if (tmaxsa8 == null) {
            if (other.tmaxsa8 != null)
                return false;
        } else if (!tmaxsa8.equals(other.tmaxsa8))
            return false;
        if (tmaxsa9 == null) {
            if (other.tmaxsa9 != null)
                return false;
        } else if (!tmaxsa9.equals(other.tmaxsa9))
            return false;
        if (tmaxsa10 == null) {
            if (other.tmaxsa10 != null)
                return false;
        } else if (!tmaxsa10.equals(other.tmaxsa10))
            return false;
        if (tmaxsa11 == null) {
            if (other.tmaxsa11 != null)
                return false;
        } else if (!tmaxsa11.equals(other.tmaxsa11))
            return false;
        if (tmaxsa12 == null) {
            if (other.tmaxsa12 != null)
                return false;
        } else if (!tmaxsa12.equals(other.tmaxsa12))
            return false;
        if (tmaxsa13 == null) {
            if (other.tmaxsa13 != null)
                return false;
        } else if (!tmaxsa13.equals(other.tmaxsa13))
            return false;
        if (tmaxsa14 == null) {
            if (other.tmaxsa14 != null)
                return false;
        } else if (!tmaxsa14.equals(other.tmaxsa14))
            return false;
        if (tmaxsa15 == null) {
            if (other.tmaxsa15 != null)
                return false;
        } else if (!tmaxsa15.equals(other.tmaxsa15))
            return false;
        if (tmaxsa16 == null) {
            if (other.tmaxsa16 != null)
                return false;
        } else if (!tmaxsa16.equals(other.tmaxsa16))
            return false;
        if (tmaxsa17 == null) {
            if (other.tmaxsa17 != null)
                return false;
        } else if (!tmaxsa17.equals(other.tmaxsa17))
            return false;
        if (tmaxsa18 == null) {
            if (other.tmaxsa18 != null)
                return false;
        } else if (!tmaxsa18.equals(other.tmaxsa18))
            return false;
        if (tmaxsa19 == null) {
            if (other.tmaxsa19 != null)
                return false;
        } else if (!tmaxsa19.equals(other.tmaxsa19))
            return false;
        if (tmaxsa20 == null) {
            if (other.tmaxsa20 != null)
                return false;
        } else if (!tmaxsa20.equals(other.tmaxsa20))
            return false;
        if (varsasem1 == null) {
            if (other.varsasem1 != null)
                return false;
        } else if (!varsasem1.equals(other.varsasem1))
            return false;
        if (varsasem2 == null) {
            if (other.varsasem2 != null)
                return false;
        } else if (!varsasem2.equals(other.varsasem2))
            return false;
        if (cvtmaxsa == null) {
            if (other.cvtmaxsa != null)
                return false;
        } else if (!cvtmaxsa.equals(other.cvtmaxsa))
            return false;
        if (reqaseg1 == null) {
            if (other.reqaseg1 != null)
                return false;
        } else if (!reqaseg1.equals(other.reqaseg1))
            return false;
        if (reqaseg2 == null) {
            if (other.reqaseg2 != null)
                return false;
        } else if (!reqaseg2.equals(other.reqaseg2))
            return false;
        if (reqaseg3 == null) {
            if (other.reqaseg3 != null)
                return false;
        } else if (!reqaseg3.equals(other.reqaseg3))
            return false;
        if (reqaseg4 == null) {
            if (other.reqaseg4 != null)
                return false;
        } else if (!reqaseg4.equals(other.reqaseg4))
            return false;
        if (reqaseg5 == null) {
            if (other.reqaseg5 != null)
                return false;
        } else if (!reqaseg5.equals(other.reqaseg5))
            return false;
        if (reqaseg6 == null) {
            if (other.reqaseg6 != null)
                return false;
        } else if (!reqaseg6.equals(other.reqaseg6))
            return false;
        if (reqaseg7 == null) {
            if (other.reqaseg7 != null)
                return false;
        } else if (!reqaseg7.equals(other.reqaseg7))
            return false;
        if (reqaseg8 == null) {
            if (other.reqaseg8 != null)
                return false;
        } else if (!reqaseg8.equals(other.reqaseg8))
            return false;
        if (reqaseg9 == null) {
            if (other.reqaseg9 != null)
                return false;
        } else if (!reqaseg9.equals(other.reqaseg9))
            return false;
        if (reqaseg10 == null) {
            if (other.reqaseg10 != null)
                return false;
        } else if (!reqaseg10.equals(other.reqaseg10))
            return false;
        if (reqaseg11 == null) {
            if (other.reqaseg11 != null)
                return false;
        } else if (!reqaseg11.equals(other.reqaseg11))
            return false;
        if (reqaseg12 == null) {
            if (other.reqaseg12 != null)
                return false;
        } else if (!reqaseg12.equals(other.reqaseg12))
            return false;
        if (reqaseg13 == null) {
            if (other.reqaseg13 != null)
                return false;
        } else if (!reqaseg13.equals(other.reqaseg13))
            return false;
        if (reqaseg14 == null) {
            if (other.reqaseg14 != null)
                return false;
        } else if (!reqaseg14.equals(other.reqaseg14))
            return false;
        if (reqaseg15 == null) {
            if (other.reqaseg15 != null)
                return false;
        } else if (!reqaseg15.equals(other.reqaseg15))
            return false;
        if (stramsram == null) {
            if (other.stramsram != null)
                return false;
        } else if (!stramsram.equals(other.stramsram))
            return false;
        if (fstat == null) {
            if (other.fstat != null)
                return false;
        } else if (!fstat.equals(other.fstat))
            return false;
        return true;
    }

}

