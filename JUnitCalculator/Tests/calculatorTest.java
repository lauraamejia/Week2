import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class calculatorTest {
	
	@Test
	public void CalTests() {
	assertEquals("error in add()", 4,calculator.sum(1,2));
	assertEquals("error in add()", -3,calculator.sum(-1,-2));
	assertEquals("error in add()", 9,calculator.sum(9,0));
	}

	public void CalTestsAddFail() {
	assertEquals("error in add()", 0,calculator.sum(1,2));
	}

	public void CalTestsSubPass() {
	assertEquals("error in sub()", 1,calculator.sum(1,2));
	assertEquals("error in sub()", -1,calculator.sum(-1,-2));
	assertEquals("error in sub()", 0,calculator.sum(2,1));
	}

	public void CalTestsSubFail() {
	assertEquals("error in add()", 0,calculator.sum(2,1));

	}
}
