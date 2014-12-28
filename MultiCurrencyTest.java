import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class MultiCurrencyTest {

	@Test
	public void testMultiplication(){
		Dollar fiveDollar  = new Dollar(5);
		Dollar product = fiveDollar.times(2);
		assertEquals(10, product.amount);
		
		product = fiveDollar.times(3);
		assertEquals(15, product.amount);
	}
	
	@Test 
	public void testEquality(){
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
	}
}
