package jdo.accounting.model.asset;

import jdo.model.BasePersistentModel;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
public class FixedAsset extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long					serialVersionUID	= 1L;

	private Date								dateAcquired;

	private Date								dateLastServiced;

	@OneToMany
	private List<FixedAssetDepreciationMethod>	depreciatedVia;

	@Lob
	private String								description;

	@NotEmpty
	private String								name;

	private Date								nextService;

	private int									productionCapacity;

	public Date getDateAcquired() {
		return dateAcquired;
	}

	public Date getDateLastServiced() {
		return dateLastServiced;
	}

	
	public List<FixedAssetDepreciationMethod> getDepreciatedVia() {
		return depreciatedVia;
	}

	public String getDescription() {
		return description;
	}

	public String getName() {
		return name;
	}

	public Date getNextService() {
		return nextService;
	}

	public int getProductionCapacity() {
		return productionCapacity;
	}

	public void setDateAcquired(Date dateAcquired) {
		this.dateAcquired = dateAcquired;
	}

	public void setDateLastServiced(Date dateLastServiced) {
		this.dateLastServiced = dateLastServiced;
	}

	public void setDepreciatedVia(List<FixedAssetDepreciationMethod> depreciatedVia) {
		this.depreciatedVia = depreciatedVia;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNextService(Date nextService) {
		this.nextService = nextService;
	}

	public void setProductionCapacity(int productionCapacity) {
		this.productionCapacity = productionCapacity;
	}

}
