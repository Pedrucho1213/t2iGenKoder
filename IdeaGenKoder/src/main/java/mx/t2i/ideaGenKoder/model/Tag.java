package mx.t2i.ideaGenKoder.model;

public class Tag {
   /* private Long id;
    private String name;
    */
	private String respListFtlFileName;
	private String respListOutFileName;
    private String FTL_package;
    private String FTL_Model;
    private String FTL_extends;
    private String FTL_CORE_SYSTEM;
    private String FTL_coreModel;

    public Tag() {

    }

    public Tag(String respListFtlFileName, String respListOutFileName, String FTL_package, String FTL_Model, 
    		String FTL_extends, String FTL_CORE_SYSTEM, String FTL_coreModel) {
        super();
       /* this.id = id;
        this.name = name;
        */
    	this.respListFtlFileName = respListFtlFileName;   
    	this.respListOutFileName = respListOutFileName;   
    	this.FTL_package =          FTL_package;        
    	this.FTL_Model =            FTL_Model;          
    	this.FTL_extends =          FTL_extends;        
    	this.FTL_CORE_SYSTEM =      FTL_CORE_SYSTEM;    
    	this.FTL_coreModel =        FTL_coreModel;     
    }


    /*   public Tag(String name) {
        this.name = name;
    }
     */
    

	public String getRespListFtlFileName() {
		return respListFtlFileName;
	}
	public void setRespListFtlFileName(String respListFtlFileName) {
		this.respListFtlFileName = respListFtlFileName;
	}

	public String getRespListOutFileName() {
		return respListOutFileName;
	}

	public void setRespListOutFileName(String respListOutFileName) {
		this.respListOutFileName = respListOutFileName;
	}

	public String getFTL_package() {
		return FTL_package;
	}

	public void setFTL_package(String ftl_package) {
		FTL_package = ftl_package;
	}

	public String getFTL_Model() {
		return FTL_Model;
	}

	public void setFTL_Model(String ftl_Model) {
		FTL_Model = ftl_Model;
	}

	public String getFTL_extends() {
		return FTL_extends;
	}

	public void setFTL_extends(String ftl_extends) {
		FTL_extends = ftl_extends;
	}

	public String getFTL_CORE_SYSTEM() {
		return FTL_CORE_SYSTEM;
	}

	public void setFTL_CORE_SYSTEM(String ftl_CORE_SYSTEM) {
		FTL_CORE_SYSTEM = ftl_CORE_SYSTEM;
	}

	public String getFTL_coreModel() {
		return FTL_coreModel;
	}

	public void setFTL_coreModel(String ftl_coreModel) {
		FTL_coreModel = ftl_coreModel;
	}

    
    /*
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    */
}