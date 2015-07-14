package jdo.ecommerce.model.webcontent;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import jdo.model.BasePersistentModel;

@Entity
public class WebContent extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Lob
	private String content;

	private String description;

	@OneToMany
	private List<WebContentRole> involving;

	/**
	 * UUID for WebAddress.
	 * 
	 */
	private UUID locationOf;

	@OneToMany(mappedBy = "forWebContent")
	private List<WebContentAssociation> relatedTo;

	@ManyToOne
	private WebContentStatusType status;

	@ManyToOne
	private WebContentType type;

	public String getContent() {
		return content;
	}

	public String getDescription() {
		return description;
	}

	public List<WebContentRole> getInvolving() {
		return involving;
	}

	public UUID getLocationOf() {
		return locationOf;
	}

	public List<WebContentAssociation> getRelatedTo() {
		return relatedTo;
	}

	public WebContentStatusType getStatus() {
		return status;
	}

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

	public void setLocationOf(UUID locationOf) {
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
