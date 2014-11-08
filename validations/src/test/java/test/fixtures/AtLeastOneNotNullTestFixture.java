package test.fixtures;

import jdo.validations.AtLeastOneNotNull;

@AtLeastOneNotNull(fieldNames = { "field1", "field2" })
public class AtLeastOneNotNullTestFixture {

	private String	field1;
	private Integer	field2=null;
	public String getField1() {
		return field1;
	}
	public void setField1(String field1) {
		this.field1 = field1;
	}
	public Integer getField2() {
		return field2;
	}
	public void setField2(Integer field2) {
		this.field2 = field2;
	}
	public AtLeastOneNotNullTestFixture(String field1, int field2) {
		super();
		this.field1 = field1;
		this.field2 = field2;
	}
	public AtLeastOneNotNullTestFixture() {
		// TODO Auto-generated constructor stub
	}
	

}
