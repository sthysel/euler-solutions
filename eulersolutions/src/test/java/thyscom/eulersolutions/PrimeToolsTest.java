package thyscom.eulersolutions;

import static org.junit.Assert.*;
import org.junit.Test;

public class PrimeToolsTest {

	@Test
	public void testIsPrime() {
		assertFalse(PrimeTools.isPrime(20));
		assertFalse(PrimeTools.isPrime(12));
		assertTrue(PrimeTools.isPrime(7));
		assertFalse(PrimeTools.isPrime(346785));
	}
}
