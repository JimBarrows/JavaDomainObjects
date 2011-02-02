package com.nsfwenterprises.biz360.invoice.model.term;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.hibernate.validator.AssertTrue;

import com.nsfwenterprises.biz360.invoice.model.Invoice;
import com.nsfwenterprises.biz360.invoice.model.InvoiceItem;
import com.nsfwenterprises.biz360.model.BasePersistentModel;

@Entity
public class InvoiceTerm extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Invoice conditionForInvoice;
	
	private InvoiceItem conditionForInvoiceItem;
	
	private int termValue;
	
	private InvoiceTermType type;
	
	@AssertTrue
	public boolean forItemOrInvoiceOnly() {
		return (conditionForInvoiceItem != null) ^ (conditionForInvoice != null);
	}

	@ManyToOne
	public Invoice getConditionForInvoice() {
		return conditionForInvoice;
	}

	@ManyToOne
	public InvoiceItem getConditionForInvoiceItem() {
		return conditionForInvoiceItem;
	}

	public int getTermValue() {
		return termValue;
	}

	@ManyToOne
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
