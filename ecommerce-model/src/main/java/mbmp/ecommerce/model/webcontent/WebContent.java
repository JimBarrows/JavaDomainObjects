package mbmp.ecommerce.model.webcontent;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import mbmp.ecommerce.model.party.contactmechanism.WebAddress;
import mbmp.model.BasePersistentModel;

@Entity
public class WebContent extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String content;
	
	private String description;
	
	private List<WebContentRole> involving;
	
	private WebAddress locationOf;
	
	private List<WebContentAssociation> relatedTo;
	
	private WebContentStatusType status;
	
	private WebContentType type;

	@Lob
	public String getContent() {
		return content;
	}

	public String getDescription() {
		return description;
	}

	@OneToMany
	public List<WebContentRole> getInvolving() {
		return involving;
	}

	@ManyToOne
	public WebAddress getLocationOf() {
		return locationOf;
	}

	@OneToMany(mappedBy="forWebContent")
	public List<WebContentAssociation> getRelatedTo() {
		return relatedTo;
	}

	@ManyToOne
	public WebContentStatusType getStatus() {
		return status;
	}

	@ManyToOne
	public WebContentType getType() {
		return type;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setInvolving(List<WebContentRole> involving) {
		this.involving = involving;
	}

	public void setLocationOf(WebAddress locationOf) {
		this.locationOf = locationOf;
	}

	public void setRelatedTo(List<WebContentAssociation> relatedTo) {
		this.relatedTo = relatedTo;
	}

	public void setStatus(WebContentStatusType status) {
		this.status = status;
	}

	public void setType(WebContentType type) {
		this.type = type;
	}

}
