package jdo.order.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import jdo.fields.Money;
import jdo.model.BasePersistentModel;
import jdo.order.model.status.OrderStatus;
import jdo.order.model.terms.OrderTerm;
import jdo.product.model.Product;
import jdo.product.model.feature.ProductFeature;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:32 AM
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class OrderItem extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long				serialVersionUID	= 1L;

	private String							comment;

	private Date							estimatedDeliveryDate;

	private ProductFeature					forFeature;

	private Product							forProduct;

	private List<OrderItemContactMechanism>	having;

	private List<OrderItemRole>				involving;

	private String							itemDescription;

	private OrderItem						orderedWith;

	private long							orderItemSeqId;

	private int								quantity;

	private String							shippingInstructions;

	private List<OrderStatus>				stateOf				= new ArrayList<OrderStatus>();

	private List<OrderTerm>					subjectTo			= new ArrayList<OrderTerm>();

	private Money							unitPrice;

	public String getComment() {
		return comment;
	}

	@Temporal(TemporalType.DATE)
	public Date getEstimatedDeliveryDate() {
		return estimatedDeliveryDate;
	}

	@ManyToOne
	public ProductFeature getForFeature() {
		return forFeature;
	}

	@ManyToOne
	public Product getForProduct() {
		return forProduct;
	}

	@OneToMany
	public List<OrderItemContactMechanism> getHaving() {
		return having;
	}

	@OneToMany
	public List<OrderItemRole> getInvolving() {
		return involving;
	}

	@Lob
	public String getItemDescription() {
		return itemDescription;
	}

	@ManyToOne
	public OrderItem getOrderedWith() {
		return orderedWith;
	}

	@NotNull
	@Min(0)
	public long getOrderItemSeqId() {
		return orderItemSeqId;
	}

	@NotNull
	@Min(1)
	public int getQuantity() {
		return quantity;
	}

	@Lob
	public String getShippingInstructions() {
		return shippingInstructions;
	}

	@OneToMany(mappedBy = "statusForItem")
	public List<OrderStatus> getStateOf() {
		return stateOf;
	}

	@OneToMany(mappedBy = "conditionForItem")
	public List<OrderTerm> getSubjectTo() {
		return subjectTo;
	}

	@Embedded
	public Money getUnitPrice() {
		return unitPrice;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setEstimatedDeliveryDate(Date estimatedDeliveryDate) {
		this.estimatedDeliveryDate = estimatedDeliveryDate;
	}

	public void setForFeature(ProductFeature forFeature) {
		this.forFeature = forFeature;
	}

	public void setForProduct(Product itemFor) {
		this.forProduct = itemFor;
	}

	public void setHaving(List<OrderItemContactMechanism> having) {
		this.having = having;
	}

	public void setInvolving(List<OrderItemRole> involving) {
		this.involving = involving;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public void setOrderedWith(OrderItem orderedWith) {
		this.orderedWith = orderedWith;
	}

	public void setOrderItemSeqId(long orderItemSeqId) {
		this.orderItemSeqId = orderItemSeqId;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setShippingInstructions(String shippingInstructions) {
		this.shippingInstructions = shippingInstructions;
	}

	public void setStateOf(List<OrderStatus> stateOf) {
		this.stateOf = stateOf;
	}

	public void setSubjectTo(List<OrderTerm> subjectTo) {
		this.subjectTo = subjectTo;
	}

	public void setUnitPrice(Money unitPrice) {
		this.unitPrice = unitPrice;
	}

}