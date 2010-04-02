package com.nsfwenterprises.biz360.ecommerce.model.subscription;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.nsfwenterprises.biz360.model.BasePersistentModel;

@Entity
public class SubscriptionActivity extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String comment;
	
	private Date sentOne;
	
	private List<Subscription> subscriptionsInvolved;

	@Lob
	public String getComment() {
		return comment;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getSentOne() {
		return sentOne;
	}

	@ManyToMany
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
