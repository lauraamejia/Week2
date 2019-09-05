import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class calculatorTest {


	calculator calculate;

	@Before
	public void setUp() {
		calculate = Mockito.spy(calculator.class);
	}

	@Test
	public void sum() {

		// arrange
		int a = 1;
		int b = 3;

		// act
		int result = calculate.sum(a, b);

		// assert
		assertEquals(4, result);
	}

	@Test
	public void subtraction() {

		// arrange
		int a = 4;
		int b = 2;

		// act
		int result = calculate.subtraction(a, b);

		// assert
		assertEquals(2, result);
	}

	@Test
	public void checkPalindrome() {

		// arrange

		String word = "Esdaadse";

		// act

		String result = calculate.checkPalindrome(word);

		// assert

		assertEquals("It is palindrome", result);
	}

	@Test
	public void TrueAndTrue() {
		// arrange
		boolean condition1 = true;
		boolean condition2 = true;

		// act
		boolean validate = calculate.logic(condition1, condition2);

		// asert
		Assert.assertTrue(validate);

	}

	@Test
	public void biggestSum() {
		// arrange
		int a[] = { 6, 3 };
		int b[] = { 9, 1 };
		int expected[] = { 9, 1 };

		// act
		int[] result = calculate.addVectors(a, b);

		// asert
		assertArrayEquals(expected, result);

	}
}
