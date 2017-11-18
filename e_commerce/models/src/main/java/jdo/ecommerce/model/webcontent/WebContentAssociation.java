package jdo.ecommerce.model.webcontent;

import jdo.model.BasePersistentModel;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class WebContentAssociation extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@ManyToOne
	private WebContent			forWebContent;

	@ManyToOne
	private FunctionType		functionType;

	@ManyToOne
	private WebContent			ofWebContent;

	private int					xLoc;

	private int					yLoc;

	
	public WebContent getForWebContent() {
		return forWebContent;
	}

	
	public FunctionType getFunctionType() {
		return functionType;
	}

	
	public WebContent getOfWebContent() {
		return ofWebContent;
	}

	public int getXLoc() {
		return xLoc;
	}

	public int getYLoc() {
		return yLoc;
	}

	public void setForWebContent(WebContent forWebContent) {
		this.forWebContent = forWebContent;
	}

	public void setFunctionType(FunctionType functionType) {
		this.functionType = functionType;
	}

	public void setOfWebContent(WebContent ofWebContent) {
		this.ofWebContent = ofWebContent;
	}

	public void setXLoc(int loc) {
		xLoc = loc;
	}

	public void setYLoc(int loc) {
		yLoc = loc;
	}

}
