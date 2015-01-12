package jdo.quote.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;

import jdo.fields.Money;
import jdo.model.BasePersistentModel;
import jdo.order.model.OrderItem;
import jdo.product.model.Product;
import jdo.request.model.RequestItem;

@Entity
public class QuoteItem extends BasePersistentModel {

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
	@ManyToOne
	private Product product;
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

	public Product getProduct() {
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

	public void setProduct(Product product) {
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
