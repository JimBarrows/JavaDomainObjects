package jdo.ecommerce.model.subscription;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import jdo.model.BasePersistentModel;

@Entity
public class SubscriptionActivity extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@Lob
	private String				comment;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date				sentOne;

	@ManyToMany
	private List<Subscription>	subscriptionsInvolved;

	
	public String getComment() {
		return comment;
	}

	
	public Date getSentOne() {
		return sentOne;
	}


	public List<Subscription> getSubscriptionsInvolved() {
		return subscriptionsInvolved;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setSentOne(Date sentOne) {
		this.sentOne = sentOne;
	}

	public void setSubscriptionsInvolved(List<Subscription> subscriptionsInvovled) {
		this.subscriptionsInvolved = subscriptionsInvovled;
	}

}
