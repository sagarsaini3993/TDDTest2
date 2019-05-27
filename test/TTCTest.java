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
		double actualOutput = t.calculateTotal(from, to);
		assertEquals("2.5", String.valueOf(actualOutput));
		
		
	}
	
	@Test
	public void testZone2() {
		TTC t = new TTC();
		String[] from = {"Sheppard"};
		String[] to = {"Finch"};
		double actualOutput = t.calculateTotal(from, to);

		assertEquals("3.0", String.valueOf(actualOutput));

	}
	
	@Test
	public void testBetweenZones() {
		TTC t = new TTC();
		String[] from = {"DonMills"};
		String[] to = {"Finch"};
		double actualOutput = t.calculateTotal(from, to);
		assertEquals("3.0", String.valueOf(actualOutput));

	}
	
	@Test
	public void moreThanOneTrip() {
		
		TTC t = new TTC();
		String[] from = {"Finch"};
		String[] to = {"Sheppard"};
		double actualOutput = t.calculateTotal(from, to);
		assertEquals("3.0", String.valueOf(actualOutput));
		
		
		String[] from1 = {"Leslie"};
		String[] to1 = {"DonMills"};
		
		double actualOutput1 = t.calculateTotal(from1, to1);
		assertEquals("2.5", String.valueOf(actualOutput1));
		
		double totalFare = actualOutput + actualOutput1;
		assertEquals("5.50", totalFare);
		

	}

}
