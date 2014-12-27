import org.junit.Assert;
import org.junit.Test;

public class MultiCurrencyTest{
	@Test
	public void testMultiplication(){
		Dollar fiveDollar  = new Dollar(5);
		fiveDollar.times(2);
		Assert.assertEquals(10, fiveDollar.amount);
	}
}
