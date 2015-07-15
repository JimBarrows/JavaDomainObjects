package test.fixtures;

import jdo.validations.annotations.AtLeastOneNotBlank;

@AtLeastOneNotBlank(fieldNames = { "field1", "field2" })
public class AtLeastOneNotBlankTestFixture {

	private String field1;
	private String field2;

	public AtLeastOneNotBlankTestFixture(String field1, String field2) {
		super();
		this.field1 = field1;
		this.field2 = field2;
	}

	public AtLeastOneNotBlankTestFixture() {
	}

	public String getField1() {
		return field1;
	}

	public void setField1(String field1) {
		this.field1 = field1;
	}

	public String getField2() {
		return field2;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}

}
