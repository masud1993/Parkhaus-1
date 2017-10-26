import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class priceCalculatorTest {
	priceCalculator pC1;

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void getPrice_oneDay_500() {
		assertEquals(500, pC1.getPrice(1));
	}
}
