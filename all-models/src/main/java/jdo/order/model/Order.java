package jdo.order.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
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
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "Orders")
public class Order extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long			serialVersionUID	= 1L;

	private List<OrderAdjustment>		affectedBy			= new ArrayList<OrderAdjustment>();

	private List<OrderItem>				composedOf			= new ArrayList<OrderItem>();

	private List<OrderContactMechanism>	contactMechanisms	= new ArrayList<OrderContactMechanism>();

	private Date						entryDate;

	private List<OrderRole>				involving			= new ArrayList<OrderRole>();

	private Date						orderDate;

	private List<OrderStatus>			stateOf				= new ArrayList<OrderStatus>();

	private List<OrderTerm>				subjectTo			= new ArrayList<OrderTerm>();

	@OneToMany
	public List<OrderAdjustment> getAffectedBy() {
		return affectedBy;
	}

	@OneToMany
	@OrderBy("orderItemSeqId")
	public List<OrderItem> getComposedOf() {
		return composedOf;
	}

	@OneToMany
	public List<OrderContactMechanism> getContactMechanisms() {
		return contactMechanisms;
	}

	@Temporal(TemporalType.DATE)
	public Date getEntryDate() {
		return entryDate;
	}

	@OneToMany
	public List<OrderRole> getInvolving() {
		return involving;
	}

	@Temporal(TemporalType.DATE)
	public Date getOrderDate() {
		return orderDate;
	}

	@OneToMany
	public List<OrderStatus> getStateOf() {
		return stateOf;
	}

	@OneToMany
	public List<OrderTerm> getSubjectTo() {
		return subjectTo;
	}

	public void setAffectedBy(List<OrderAdjustment> affectedBy) {
		this.affectedBy = affectedBy;
	}

	public void setComposedOf(List<OrderItem> composedOf) {
		this.composedOf = composedOf;
	}

	public void setContactMechanisms(List<OrderContactMechanism> contactMechanisms) {
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