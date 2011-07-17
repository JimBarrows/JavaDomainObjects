package mbmp.ecommerce.model.subscription;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import mbmp.ecommerce.model.product.NeedType;
import mbmp.ecommerce.model.product.PartyNeed;
import mbmp.model.BasePersistentModel;
import mbmp.order.model.OrderItem;
import mbmp.party.model.PartyRole;
import mbmp.party.model.communication.CommunicationEvent;
import mbmp.party.model.contactmechanism.ContactMechanism;
import mbmp.product.model.Product;
import mbmp.product.model.category.ProductCategory;

/**Represents all the data needed for a subscription to Newsgroups, product information, user groups, or other things that can be subscribed to.
 * 
 * 
 * @author jim
 *
 */
@Entity
public class Subscription extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Date endDate;
	
	private List<SubscriptionActivity> fullfilledVia;
	
	private NeedType needType;
	
	private List<OrderItem> orderedVia;
	
	private CommunicationEvent originatingFrom;
	
	private PartyNeed partyNeed;
	
	private Product product;
	
	private ProductCategory productCategory;	
	
	private ContactMechanism sendTo;
	
	private Date startDate;
	
	private PartyRole subscriber;
	
	private PartyRole subscriptionFor;
	
	private SubscriptionType type;

	public Date getEndDate() {
		return endDate;
	}

	@ManyToMany(mappedBy="subscriptionsInvolved")
	public List<SubscriptionActivity> getFullfilledVia() {
		return fullfilledVia;
	}

	@ManyToOne
	public NeedType getNeedType() {
		return needType;
	}

	@OneToMany
	public List<OrderItem> getOrderedVia() {
		return orderedVia;
	}

	@ManyToOne
	public CommunicationEvent getOriginatingFrom() {
		return originatingFrom;
	}

	@ManyToOne
	public PartyNeed getPartyNeed() {
		return partyNeed;
	}

	@ManyToOne
	public Product getProduct() {
		return product;
	}

	@ManyToOne
	public ProductCategory getProductCategory() {
		return productCategory;
	}

	@ManyToOne
	public ContactMechanism getSendTo() {
		return sendTo;
	}

	@Temporal(TemporalType.DATE)
	public Date getStartDate() {
		return startDate;
	}

	@ManyToOne
	public PartyRole getSubscriber() {
		return subscriber;
	}

	@ManyToOne
	public PartyRole getSubscriptionFor() {
		return subscriptionFor;
	}

	@ManyToOne
	public SubscriptionType getType() {
		return type;
	}

	@Temporal(TemporalType.TIMESTAMP)
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
