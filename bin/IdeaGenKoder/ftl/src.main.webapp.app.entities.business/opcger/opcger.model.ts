import * as dayjs from 'dayjs';

export interface IOpcger {
  id?: number, //    private Long id;
  ramsubramo?: number, // private Integer ramsubramo;
  moneda?: number, // private Integer moneda;
  numnorma?: number, // private Integer numnorma;
  finivig?: dayjs.Dayjs, // private Instant finivig;
  descnorm?: string, // private String descnorm;
  valor1?: number, // private Double valor1;
  valor2?: number, // private Double valor2;
  valor3?: number, // private Double valor3;
  valor4?: number, // private Double valor4;
  valor5?: number, // private Double valor5;
  valor6?: number, // private Double valor6;
  valor7?: number, // private Double valor7;
  valor8?: number, // private Double valor8;
  valor9?: number, // private Double valor9;
  valor10?: number, // private Double valor10;
  valor11?: number, // private Double valor11;
  valor12?: number, // private Double valor12;
  descval1?: string, // private String descval1;
  descval2?: string, // private String descval2;
  descval3?: string, // private String descval3;
  descval4?: string, // private String descval4;
  descval5?: string, // private String descval5;
  descval6?: string, // private String descval6;
  descval7?: string, // private String descval7;
  descval8?: string, // private String descval8;
  descval9?: string, // private String descval9;
  descval10?: string, // private String descval10;
  descval11?: string, // private String descval11;
  descval12?: string, // private String descval12;
  nombrel?: string, // private String nombrel;
  moneda_i?: string, // private String moneda_i;
}

export class Opcger implements IOpcger {
  constructor(
    public id?: number, //    private Long id;
    public ramsubramo?: number, // private Integer ramsubramo;
    public moneda?: number, // private Integer moneda;
    public numnorma?: number, // private Integer numnorma;
    public finivig?: dayjs.Dayjs, // private Instant finivig;
    public descnorm?: string, // private String descnorm;
    public valor1?: number, // private Double valor1;
    public valor2?: number, // private Double valor2;
    public valor3?: number, // private Double valor3;
    public valor4?: number, // private Double valor4;
    public valor5?: number, // private Double valor5;
    public valor6?: number, // private Double valor6;
    public valor7?: number, // private Double valor7;
    public valor8?: number, // private Double valor8;
    public valor9?: number, // private Double valor9;
    public valor10?: number, // private Double valor10;
    public valor11?: number, // private Double valor11;
    public valor12?: number, // private Double valor12;
    public descval1?: string, // private String descval1;
    public descval2?: string, // private String descval2;
    public descval3?: string, // private String descval3;
    public descval4?: string, // private String descval4;
    public descval5?: string, // private String descval5;
    public descval6?: string, // private String descval6;
    public descval7?: string, // private String descval7;
    public descval8?: string, // private String descval8;
    public descval9?: string, // private String descval9;
    public descval10?: string, // private String descval10;
    public descval11?: string, // private String descval11;
    public descval12?: string, // private String descval12;
    public nombrel?: string, // private String nombrel;
    public moneda_i?: string, // private String moneda_i;
    ) {}
}

export function getOpcgerIdentifier(opcger: IOpcger): number | undefined {
  return opcger.id;
}
