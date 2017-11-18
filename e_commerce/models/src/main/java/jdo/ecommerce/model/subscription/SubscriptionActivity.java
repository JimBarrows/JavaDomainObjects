package jdo.ecommerce.model.subscription;

import jdo.model.BasePersistentModel;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

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
