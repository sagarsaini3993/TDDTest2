import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TTCTest {

	@Before
	public void setUp() throws Exception {
	}
	
	
	

	@Test
	public void testZone1() {
		
		
		TTC t = new TTC();
		String[] from = {"Leslie"};
		String[] to = {"DonMills"};
		double output = t.calculateTotal(from, to);
		assertEquals("$2.50", output);
		
		
	}

}
