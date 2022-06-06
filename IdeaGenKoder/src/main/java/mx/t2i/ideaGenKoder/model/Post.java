package mx.t2i.ideaGenKoder.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import mx.t2i.ideaGenKoder.model.Post;
import mx.t2i.ideaGenKoder.model.Tag;;

public class Post {

	private String respListOutFileName;
    private String FTL_package;
    private String FTL_Model;
    private String FTL_extends;
    private String FTL_CORE_SYSTEM;
    private String FTL_coreModel;
    private Set < Tag > tags = new HashSet < > ();

    public Post() {

    }
    /*
    public Post()String respListOutFileName, String ftl_package, String ftl_Model, 
    		String ftl_extends, String ftl_CORE_SYSTEM, String ftl_coreModel) 
	{
                                                      
    	this.respListOutFileName = respListOutFileName;   
    	this.ftl_package =          ftl_package;        
    	this.ftl_Model =            ftl_Model;          
    	this.ftl_extends =          ftl_extends;        
    	this.ftl_CORE_SYSTEM =      ftl_CORE_SYSTEM;    
    	this.ftl_coreModel =        ftl_coreModel;      
    	
    } */
    
    /*
    private String respListFtlFileName;
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

	public void setFTL_Model(String fTL_Model) {
		FTL_Model = fTL_Model;
	}

	public String getFTL_extends() {
		return FTL_extends;
	}

	public void setFTL_extends(String fTL_extends) {
		FTL_extends = fTL_extends;
	}

	public String getFTL_CORE_SYSTEM() {
		return FTL_CORE_SYSTEM;
	}

	public void setFTL_CORE_SYSTEM(String fTL_CORE_SYSTEM) {
		FTL_CORE_SYSTEM = fTL_CORE_SYSTEM;
	}

	public String getFTL_coreModel() {
		return FTL_coreModel;
	}

	public void setFTL_coreModel(String fTL_coreModel) {
		FTL_coreModel = fTL_coreModel;
	}

	*/
	
	
    public Set < Tag > getTags() {
        return tags;
    }

    public void setTags(Set < Tag > tags) {
        this.tags = tags;
    }
	
    
    
    /*
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPostedAt() {
        return postedAt;
    }

    public void setPostedAt(Date postedAt) {
        this.postedAt = postedAt;
    }

    public Date getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    public void setLastUpdatedAt(Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }


    */
	
}