package mx.t2i.ideaGenKoder.model;

public class BlogUrl {
	private String url;
	private String title;
	public BlogUrl(String url, String title) {
		this.url = url;
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
