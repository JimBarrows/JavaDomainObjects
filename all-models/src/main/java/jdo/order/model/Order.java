package jdo.order.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import jdo.model.BasePersistentModel;
import jdo.order.model.adjustment.OrderAdjustment;
import jdo.order.model.status.OrderStatus;
import jdo.order.model.terms.OrderTerm;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:32 AM
 */
@Entity
@Table(name = "PurchaseSalesOrders")
public class Order extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@OneToMany(mappedBy = "affectingOrder")
	private List<OrderAdjustment> affectedBy = new ArrayList<OrderAdjustment>();
	@OneToMany(mappedBy = "order")
	@OrderBy("orderItemSeqId")
	private List<OrderItem> composedOf = new ArrayList<OrderItem>();
	@OneToMany(mappedBy = "order")
	private List<OrderContactMechanism> contactMechanisms = new ArrayList<OrderContactMechanism>();
	@Temporal(TemporalType.DATE)
	private Date entryDate;
	@OneToMany(mappedBy = "partOf")
	private List<OrderRole> involving = new ArrayList<OrderRole>();
	@Temporal(TemporalType.DATE)
	private Date orderDate;
	@OneToMany(mappedBy = "statusForOrder")
	private List<OrderStatus> stateOf = new ArrayList<OrderStatus>();
	@OneToMany(mappedBy = "conditionForOrder")
	private List<OrderTerm> subjectTo = new ArrayList<OrderTerm>();

	public List<OrderAdjustment> getAffectedBy() {
		return affectedBy;
	}

	public List<OrderItem> getComposedOf() {
		return composedOf;
	}

	public List<OrderContactMechanism> getContactMechanisms() {
		return contactMechanisms;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public List<OrderRole> getInvolving() {
		return involving;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public List<OrderStatus> getStateOf() {
		return stateOf;
	}

	public List<OrderTerm> getSubjectTo() {
		return subjectTo;
	}

	public void setAffectedBy(List<OrderAdjustment> affectedBy) {
		this.affectedBy = affectedBy;
	}

	public void setComposedOf(List<OrderItem> composedOf) {
		this.composedOf = composedOf;
	}

	public void setContactMechanisms(
			List<OrderContactMechanism> contactMechanisms) {
		this.contactMechanisms = contactMechanisms;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public void setInvolving(List<OrderRole> involving) {
		this.involving = involving;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public void setStateOf(List<OrderStatus> stateOf) {
		this.stateOf = stateOf;
	}

	public void setSubjectTo(List<OrderTerm> subjectTo) {
		this.subjectTo = subjectTo;
	}

}