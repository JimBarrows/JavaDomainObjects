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
	private static final long serialVersionUID = 1L;

	@Lob
	private String comment;

	@Temporal(TemporalType.DATE)
	private Date estimatedDeliveryDate;

	@ManyToOne
	private ProductFeature forFeature;
	@ManyToOne
	private Product forProduct;
	@OneToMany
	private List<OrderItemContactMechanism> having;
	@OneToMany
	private List<OrderItemRole> involving;
	@Lob
	private String itemDescription;
	@ManyToOne
	private OrderItem orderedWith;

	private long orderItemSeqId;

	private int quantity;

	@Lob
	private String shippingInstructions;

	@OneToMany(mappedBy = "statusForItem")
	private List<OrderStatus> stateOf = new ArrayList<OrderStatus>();

	@OneToMany(mappedBy = "conditionForItem")
	private List<OrderTerm> subjectTo = new ArrayList<OrderTerm>();
	@Embedded
	private Money unitPrice;

	public String getComment() {
		return comment;
	}

	public Date getEstimatedDeliveryDate() {
		return estimatedDeliveryDate;
	}

	public ProductFeature getForFeature() {
		return forFeature;
	}

	public Product getForProduct() {
		return forProduct;
	}

	public List<OrderItemContactMechanism> getHaving() {
		return having;
	}

	public List<OrderItemRole> getInvolving() {
		return involving;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public OrderItem getOrderedWith() {
		return orderedWith;
	}

	public long getOrderItemSeqId() {
		return orderItemSeqId;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getShippingInstructions() {
		return shippingInstructions;
	}

	public List<OrderStatus> getStateOf() {
		return stateOf;
	}

	public List<OrderTerm> getSubjectTo() {
		return subjectTo;
	}

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