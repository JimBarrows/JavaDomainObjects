package jdo.ecommerce.model.subscription;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import jdo.ecommerce.model.productdescriptions.NeedType;
import jdo.ecommerce.model.productdescriptions.PartyNeed;
import jdo.model.BasePersistentModel;
import jdo.order.model.OrderItem;
import jdo.party.model.PartyRole;
import jdo.party.model.communication.CommunicationEvent;
import jdo.party.model.contactmechanism.ContactMechanism;
import jdo.product.model.Product;
import jdo.product.model.category.ProductCategory;

/**
 * Represents all the data needed for a subscription to Newsgroups, product information, user groups, or other things that can be subscribed to.
 * 
 * @author jim
 */
@Entity
public class Subscription extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long						serialVersionUID	= 1L;

	@Temporal(TemporalType.TIMESTAMP)
	private Date												endDate;

	@ManyToMany(mappedBy = "subscriptionsInvolved")
	private List<SubscriptionActivity>	fullfilledVia;

	@ManyToOne
	private NeedType										needType;

	@OneToMany
	private List<OrderItem>							orderedVia;

	@ManyToOne
	private CommunicationEvent					originatingFrom;

	@ManyToOne
	private PartyNeed										partyNeed;

	@ManyToOne
	private Product											product;

	@ManyToOne
	private ProductCategory							productCategory;

	@ManyToOne
	private ContactMechanism						sendTo;

	@Temporal(TemporalType.DATE)
	private Date												startDate;

	@ManyToOne
	private PartyRole										subscriber;

	@ManyToOne
	private PartyRole										subscriptionFor;

	@ManyToOne
	private SubscriptionType						type;

	public Date getEndDate() {
		return endDate;
	}

	public List<SubscriptionActivity> getFullfilledVia() {
		return fullfilledVia;
	}

	public NeedType getNeedType() {
		return needType;
	}

	public List<OrderItem> getOrderedVia() {
		return orderedVia;
	}

	public CommunicationEvent getOriginatingFrom() {
		return originatingFrom;
	}

	public PartyNeed getPartyNeed() {
		return partyNeed;
	}

	public Product getProduct() {
		return product;
	}

	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public ContactMechanism getSendTo() {
		return sendTo;
	}

	public Date getStartDate() {
		return startDate;
	}

	public PartyRole getSubscriber() {
		return subscriber;
	}

	public PartyRole getSubscriptionFor() {
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

	public void setOrderedVia(List<OrderItem> orderedVia) {
		this.orderedVia = orderedVia;
	}

	public void setOriginatingFrom(CommunicationEvent originatingFrom) {
		this.originatingFrom = originatingFrom;
	}

	public void setPartyNeed(PartyNeed partyNeed) {
		this.partyNeed = partyNeed;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}

	public void setSendTo(ContactMechanism sendTo) {
		this.sendTo = sendTo;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public void setSubscriber(PartyRole subscriber) {
		this.subscriber = subscriber;
	}

	public void setSubscriptionFor(PartyRole subscriptionFor) {
		this.subscriptionFor = subscriptionFor;
	}

	public void setType(SubscriptionType type) {
		this.type = type;
	}

}
