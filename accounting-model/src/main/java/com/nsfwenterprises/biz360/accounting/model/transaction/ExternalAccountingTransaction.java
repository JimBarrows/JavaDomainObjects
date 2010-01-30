package com.nsfwenterprises.biz360.accounting.model.transaction;

import javax.persistence.Entity;

import com.nsfwenterprises.biz360.party.model.Party;

@Entity
public class ExternalAccountingTransaction extends AccountingTransaction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Party partyFrom;
	
	private Party partyTo;

	public Party getPartyFrom() {
		return partyFrom;
	}

	public Party getPartyTo() {
		return partyTo;
	}

	public void setPartyFrom(Party partyFrom) {
		this.partyFrom = partyFrom;
	}

	public void setPartyTo(Party partyTo) {
		this.partyTo = partyTo;
	}
	
}
