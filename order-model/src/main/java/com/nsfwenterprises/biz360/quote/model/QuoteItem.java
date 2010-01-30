package com.nsfwenterprises.biz360.quote.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.Min;

import com.nsfwenterprises.biz360.model.BasePersistentModel;
import com.nsfwenterprises.biz360.order.model.OrderItem;
import com.nsfwenterprises.biz360.product.model.Product;
import com.nsfwenterprises.biz360.request.model.RequestItem;

@Entity
public class QuoteItem extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String comment;
	
	private Date estimatedDeliveryDate;
	
	private List<OrderItem> orderItems;
	
	private Quote partOf;
	
	private Product product;
	
	private int quantity;
	
	private RequestItem responseTo;
	
	private int sequenceId;
	
	private List<QuoteTerm> terms;
	
	private BigDecimal unitPrice;

	@Lob
	public String getComment() {
		return comment;
	}

	@Temporal(TemporalType.DATE)
	public Date getEstimatedDeliveryDate() {
		return estimatedDeliveryDate;
	}

	@OneToMany
	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	@ManyToOne
	public Quote getPartOf() {
		return partOf;
	}

	@ManyToOne
	public Product getProduct() {
		return product;
	}

	@Min(1)
	public int getQuantity() {
		return quantity;
	}

	@ManyToOne
	public RequestItem getResponseTo() {
		return responseTo;
	}

	@Min(1)
	public int getSequenceId() {
		return sequenceId;
	}

	@OneToMany
	public List<QuoteTerm> getTerms() {
		return terms;
	}

	public BigDecimal getUnitPrice() {
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

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
}
