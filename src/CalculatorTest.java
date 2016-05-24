import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testEmptyString() {
		fail("Not yet implemented");
		
		Calculator cal = new Calculator();
		int res;
		res = cal.add("");
		
		assertEquals(0,res);
	}

}
