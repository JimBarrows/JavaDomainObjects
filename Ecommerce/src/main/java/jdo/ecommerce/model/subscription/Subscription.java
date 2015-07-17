package jdo.ecommerce.model.subscription;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import jdo.ecommerce.model.productdescriptions.NeedType;
import jdo.ecommerce.model.productdescriptions.PartyNeed;
import jdo.model.BasePersistentModel;

/**
 * Represents all the data needed for a subscription to Newsgroups, product
 * information, user groups, or other things that can be subscribed to.
 * 
 * @author jim
 */
@Entity
public class Subscription extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.TIMESTAMP)
	private Date endDate;

	@ManyToMany(mappedBy = "subscriptionsInvolved")
	private List<SubscriptionActivity> fullfilledVia;

	@ManyToOne
	private NeedType needType;

	/**
	 * UUID of OrderItem.
	 * 
	 */
	@ElementCollection
	private List<UUID> orderedVia;

	/**
	 * UUId of CommunicationEvent.
	 * 
	 */
	private UUID originatingFrom;

	@ManyToOne
	private PartyNeed partyNeed;

	/**
	 * UUID for Product.
	 * 
	 */
	private UUID product;

	/**
	 * UUId for ProductCategory.
	 * 
	 */
	private UUID productCategory;

	/**
	 * UUID for ContactMechanism.
	 * 
	 */
	private UUID sendTo;

	@Temporal(TemporalType.DATE)
	private Date startDate;

	/**
	 * UUID for PartyRole.
	 * 
	 */
	private UUID subscriber;

	/**
	 * UUID for PartyRole.
	 * 
	 */
	private UUID subscriptionFor;

	@ManyToOne
	private SubscriptionType type;

	public Date getEndDate() {
		return endDate;
	}

	public List<SubscriptionActivity> getFullfilledVia() {
		return fullfilledVia;
	}

	public NeedType getNeedType() {
		return needType;
	}

	public List<UUID> getOrderedVia() {
		return orderedVia;
	}

	public UUID getOriginatingFrom() {
		return originatingFrom;
	}

	public PartyNeed getPartyNeed() {
		return partyNeed;
	}

	public UUID getProduct() {
		return product;
	}

	public UUID getProductCategory() {
		return productCategory;
	}

	public UUID getSendTo() {
		return sendTo;
	}

	public Date getStartDate() {
		return startDate;
	}

	public UUID getSubscriber() {
		return subscriber;
	}

	public UUID getSubscriptionFor() {
		return subscriptionFor;
	}

	public SubscriptionType getType() {
		return type;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public void setFullfilledVia(List<SubscriptionActivity> fullfilledVia) {
		this.fullfilledVia = fullfilledVia;
	}

	public void setNeedType(NeedType needType) {
		this.needType = needType;
	}

	public void setOrderedVia(List<UUID> orderedVia) {
		this.orderedVia = orderedVia;
	}

	public void setOriginatingFrom(UUID originatingFrom) {
		this.originatingFrom = originatingFrom;
	}

	public void setPartyNeed(PartyNeed partyNeed) {
		this.partyNeed = partyNeed;
	}

	public void setProduct(UUID product) {
		this.product = product;
	}

	public void setProductCategory(UUID productCategory) {
		this.productCategory = productCategory;
	}

	public void setSendTo(UUID sendTo) {
		this.sendTo = sendTo;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public void setSubscriber(UUID subscriber) {
		this.subscriber = subscriber;
	}

	public void setSubscriptionFor(UUID subscriptionFor) {
		this.subscriptionFor = subscriptionFor;
	}

	public void setType(SubscriptionType type) {
		this.type = type;
	}

}
