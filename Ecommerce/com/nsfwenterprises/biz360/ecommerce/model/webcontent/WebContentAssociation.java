package com.nsfwenterprises.biz360.ecommerce.model.webcontent;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.nsfwenterprises.biz360.model.BasePersistentModel;

@Entity
public class WebContentAssociation extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private WebContent forWebContent;
	
	private FunctionType functionType;
	
	private WebContent ofWebContent;
	
	private int xLoc;
	
	private int yLoc;

	@ManyToOne
	public WebContent getForWebContent() {
		return forWebContent;
	}

	@ManyToOne
	public FunctionType getFunctionType() {
		return functionType;
	}

	@ManyToOne
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
