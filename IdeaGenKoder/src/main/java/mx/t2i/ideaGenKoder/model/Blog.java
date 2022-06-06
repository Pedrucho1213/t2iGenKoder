package mx.t2i.ideaGenKoder.model;

import java.util.ArrayList;
import java.util.List;

public class Blog {
	String blogTitle;
	String message;
	List<BlogUrl> listaUrl;
	
	public Blog() {
		listaUrl = new ArrayList<BlogUrl>();
	}

	public String getBlogTitle() {
		return blogTitle;
	}

	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<BlogUrl> getListaUrl() {
		return listaUrl;
	}

	public void setListaUrl(List<BlogUrl> listaUrl) {
		this.listaUrl = listaUrl;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((blogTitle == null) ? 0 : blogTitle.hashCode());
		result = prime * result + ((listaUrl == null) ? 0 : listaUrl.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Blog other = (Blog) obj;
		if (blogTitle == null) {
			if (other.blogTitle != null)
				return false;
		} else if (!blogTitle.equals(other.blogTitle))
			return false;
		if (listaUrl == null) {
			if (other.listaUrl != null)
				return false;
		} else if (!listaUrl.equals(other.listaUrl))
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Blog [blogTitle=" + blogTitle + ", message=" + message + ", listaUrl=" + listaUrl + "]";
	}
}
