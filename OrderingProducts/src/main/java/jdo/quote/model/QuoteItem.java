package jdo.quote.model;

import jdo.fields.Money;
import jdo.model.PersistentEntity;
import jdo.order.model.OrderItem;
import jdo.request.model.RequestItem;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
public class QuoteItem extends PersistentEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Lob
	private String comment;
	@Temporal(TemporalType.DATE)
	private Date estimatedDeliveryDate;
	@OneToMany
	private List<OrderItem> orderItems;
	@ManyToOne
	private Quote partOf;
	/**
	 * UUID for Product.
	 * 
	 */
	private UUID product;
	@Min(1)
	private int quantity;
	@ManyToOne
	private RequestItem responseTo;
	@Min(1)
	private int sequenceId;
	@OneToMany
	private List<QuoteTerm> terms;
	@Embedded
	private Money unitPrice;

	public String getComment() {
		return comment;
	}

	public Date getEstimatedDeliveryDate() {
		return estimatedDeliveryDate;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public Quote getPartOf() {
		return partOf;
	}

	public UUID getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}

	public RequestItem getResponseTo() {
		return responseTo;
	}

	public int getSequenceId() {
		return sequenceId;
	}

	public List<QuoteTerm> getTerms() {
		return terms;
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

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public void setPartOf(Quote partOf) {
		this.partOf = partOf;
	}

	public void setProduct(UUID product) {
		this.product = product;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setResponseTo(RequestItem responseTo) {
		this.responseTo = responseTo;
	}

	public void setSequenceId(int sequenceId) {
		this.sequenceId = sequenceId;
	}

	public void setTerms(List<QuoteTerm> terms) {
		this.terms = terms;
	}

	public void setUnitPrice(Money unitPrice) {
		this.unitPrice = unitPrice;
	}

}
