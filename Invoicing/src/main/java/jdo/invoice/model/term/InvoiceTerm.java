package jdo.invoice.model.term;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.AssertTrue;

import jdo.invoice.model.Invoice;
import jdo.invoice.model.InvoiceItem;
import jdo.model.BasePersistentModel;

@Entity
public class InvoiceTerm extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	private Invoice conditionForInvoice;
	@ManyToOne
	private InvoiceItem conditionForInvoiceItem;

	private int termValue;
	@ManyToOne
	private InvoiceTermType type;

	@AssertTrue
	public boolean forItemXorInvoiceOnly() {
		return (conditionForInvoiceItem != null)
				^ (conditionForInvoice != null);
	}

	public Invoice getConditionForInvoice() {
		return conditionForInvoice;
	}

	public InvoiceItem getConditionForInvoiceItem() {
		return conditionForInvoiceItem;
	}

	public int getTermValue() {
		return termValue;
	}

	public InvoiceTermType getType() {
		return type;
	}

	public void setConditionForInvoice(Invoice conditionForInvoice) {
		this.conditionForInvoice = conditionForInvoice;
	}

	public void setConditionForInvoiceItem(InvoiceItem conditionForInvoiceItem) {
		this.conditionForInvoiceItem = conditionForInvoiceItem;
	}

	public void setTermValue(int termValue) {
		this.termValue = termValue;
	}

	public void setType(InvoiceTermType type) {
		this.type = type;
	}

}
