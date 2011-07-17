package test.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import mbmp.model.BaseHeirarchicalType;

public class BaseHeirarchicalTypeTest {


	@Test
	public void addChildShouldAddToChildrenAndSetParentOnChild() {
		// given
		BaseHeirarchicalType child = new BaseHeirarchicalType(1l, 0l, "childA");
		BaseHeirarchicalType parent = new BaseHeirarchicalType(4l, 0l,
				"parentB");

		// when
		parent.addChild(child);

		//then
		assertEquals( parent, child.getParent());
		assertTrue( parent.getChildren().contains(child));
	}

	@Test
	public void typesWithNoParentsShouldBeSameType() {
		// given
		BaseHeirarchicalType left = new BaseHeirarchicalType(1l, 0l, "child");
		BaseHeirarchicalType right = new BaseHeirarchicalType(2l, 0l, "child");

		// when
		boolean isa = left.isA(right);

		// then
		assertTrue(isa);
	}

	@Test
	public void leftParentNullRightParentNotNullShouldNotBeSameType() {
		// given
		BaseHeirarchicalType left = new BaseHeirarchicalType(1l, 0l, "child");
		BaseHeirarchicalType right = new BaseHeirarchicalType(2l, 0l, "rightchild");
		BaseHeirarchicalType parentRight = new BaseHeirarchicalType(3l, 0l,
				"parentRight");
		parentRight.addChild(right);
		// when
		boolean isa = left.isA(right);

		// then
		assertFalse(isa);
	}
	
	@Test
	public void leftParentNotNullRightParentNullShouldNotBeSameType() {
		// given
		BaseHeirarchicalType left = new BaseHeirarchicalType(1l, 0l, "child");
		BaseHeirarchicalType right = new BaseHeirarchicalType(2l, 0l, "rightchild");
		BaseHeirarchicalType parentLeft = new BaseHeirarchicalType(3l, 0l,
				"parentLeft");
		parentLeft.addChild(right);
		// when
		boolean isa = left.isA(right);

		// then
		assertFalse(isa);
	}
	
	@Test
	public void sameTreeShouldBeSameType() {
		//given
		BaseHeirarchicalType leftChild = new BaseHeirarchicalType(1l, 0l, "child");
		BaseHeirarchicalType leftParent = new BaseHeirarchicalType(1l, 0l, "parent");
		BaseHeirarchicalType leftGrandParent = new BaseHeirarchicalType(1l, 0l, "grandParent");
		BaseHeirarchicalType rightChild = new BaseHeirarchicalType(1l, 0l, "child");
		BaseHeirarchicalType rightParent = new BaseHeirarchicalType(1l, 0l, "parent");
		BaseHeirarchicalType rightGrandParent = new BaseHeirarchicalType(1l, 0l, "grandParent");
		
		rightGrandParent.addChild( rightParent);
		rightParent.addChild(rightChild);
		leftGrandParent.addChild( leftParent);
		leftParent.addChild( leftChild);
		
		//when
		boolean isType = leftChild.isA( rightChild);
		
		//then
		assertTrue( isType);
	}
	
	@Test
	public void differntParentShouldNotBeSameType() {
		//given
		BaseHeirarchicalType leftChild = new BaseHeirarchicalType(1l, 0l, "child");
		BaseHeirarchicalType leftParent = new BaseHeirarchicalType(1l, 0l, "parent");
		BaseHeirarchicalType leftGrandParent = new BaseHeirarchicalType(1l, 0l, "grandParent");
		BaseHeirarchicalType rightChild = new BaseHeirarchicalType(1l, 0l, "child");
		BaseHeirarchicalType rightParent = new BaseHeirarchicalType(1l, 0l, "differentParent");
		BaseHeirarchicalType rightGrandParent = new BaseHeirarchicalType(1l, 0l, "grandParent");
		
		rightGrandParent.addChild( rightParent);
		rightParent.addChild(rightChild);
		leftGrandParent.addChild( leftParent);
		leftParent.addChild( leftChild);
		
		//when
		boolean isType = leftChild.isA( rightChild);
		
		//then
		assertFalse( isType);
	}
	
	@Test
	public void differntGrandParentShouldNotBeSameType() {
		//given
		BaseHeirarchicalType leftChild = new BaseHeirarchicalType(1l, 0l, "child");
		BaseHeirarchicalType leftParent = new BaseHeirarchicalType(1l, 0l, "parent");
		BaseHeirarchicalType leftGrandParent = new BaseHeirarchicalType(1l, 0l, "grandParent");
		BaseHeirarchicalType rightChild = new BaseHeirarchicalType(1l, 0l, "child");
		BaseHeirarchicalType rightParent = new BaseHeirarchicalType(1l, 0l, "Parent");
		BaseHeirarchicalType rightGrandParent = new BaseHeirarchicalType(1l, 0l, "differentgrandParent");
		
		rightGrandParent.addChild( rightParent);
		rightParent.addChild(rightChild);
		leftGrandParent.addChild( leftParent);
		leftParent.addChild( leftChild);
		
		//when
		boolean isType = leftChild.isA( rightChild);
		
		//then
		assertFalse( isType);
	}
	
	@Test
	public void unequalTreeHeightsShouldNotBeSameType() {
		//given
		BaseHeirarchicalType leftChild = new BaseHeirarchicalType(1l, 0l, "child");
		BaseHeirarchicalType leftParent = new BaseHeirarchicalType(1l, 0l, "parent");
		BaseHeirarchicalType leftGrandParent = new BaseHeirarchicalType(1l, 0l, "grandParent");
		BaseHeirarchicalType rightChild = new BaseHeirarchicalType(1l, 0l, "child");
		BaseHeirarchicalType rightParent = new BaseHeirarchicalType(1l, 0l, "Parent");
		
		rightParent.addChild(rightChild);
		leftGrandParent.addChild( leftParent);
		leftParent.addChild( leftChild);
		
		//when
		boolean isType = leftChild.isA( rightChild);
		
		//then
		assertFalse( isType);
	}

}
