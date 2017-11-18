package jdo.humanresoures.model.skills;

import jdo.model.PersistentEntity;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Resume extends PersistentEntity {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	private Date				dateReceived;

	private String				text;

	public Date getDateReceived() {
		return dateReceived;
	}

	public String getText() {
		return text;
	}

	public void setDateReceived(Date dateReceived) {
		this.dateReceived = dateReceived;
	}

	public void setText(String text) {
		this.text = text;
	}

}
