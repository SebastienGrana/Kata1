import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testEmptyString() {		
		Calculator cal = new Calculator();
		int res;
		res = cal.add("");
		
		assertEquals(0,res);
	}

}
