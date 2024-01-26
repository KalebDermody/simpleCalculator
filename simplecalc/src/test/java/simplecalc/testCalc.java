package simplecalc;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

import junit.framework.TestCase;

public class testCalc extends TestCase{
	Calculator calc = new Calculator();
	
	@Test
	public void testadd() {		
		assertEquals(2,(int)calc.add(1,1));
		assertEquals(0,(int)calc.add(1,-1));
		assertEquals(4,(int)calc.add(1,3));
		assertEquals(0,(int)calc.add(0,0));
		assertNotEquals(3,(int)calc.add(1,1));
	}
	
	@Test
	public void testaddBooleans() {
		Calculator calc = new Calculator();		
		assertNotNull((int)calc.add(2,4));
		assertNull(calc.add(999,999));				
	}
}
