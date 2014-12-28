import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class MultiCurrencyTest {

	@Test
	public void testMultiplication(){
		Dollar fiveDollar  = new Dollar(5);
		
		assertEquals(new Dollar(10), fiveDollar.times(2));
		assertEquals(new Dollar(15), fiveDollar.times(3));
	}
	
	@Test 
	public void testEquality(){
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
		
		assertTrue(new Franc(5).equals(new Franc(5)));
		assertFalse(new Franc(5).equals(new Franc(6)));
	}
	
	@Test 
	public void testFranceMultiplication(){
		Franc fiveFranc = new Franc(5);
		
		assertEquals(new Franc(10), fiveFranc.times(2));
		assertEquals(new Franc(15), fiveFranc.times(3));
	}
}
