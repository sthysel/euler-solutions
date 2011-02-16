package thyscom.eulersolutions;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.commons.lang.ArrayUtils;
import org.junit.Test;

public class PrimeToolsTest {

	@Test
	public void testIsPrime() {
		assertFalse(PrimeTools.isPrime(20));
		assertFalse(PrimeTools.isPrime(12));
		assertTrue(PrimeTools.isPrime(7));
		assertFalse(PrimeTools.isPrime(346785));
	}

	@Test
	public void testFactorise1() {
		List<Integer> factors = PrimeTools.factorize(43837665);
		int[] a = ArrayUtils.toPrimitive(factors.toArray(new Integer[factors
				.size()]));
		assertArrayEquals(new int[] { 3, 5, 1399, 2089 }, a);
	}

	@Test
	public void testFactorise2() {
		List<Integer> factors = PrimeTools.factorize(12);
		int[] a = ArrayUtils.toPrimitive(factors.toArray(new Integer[factors
				.size()]));
		assertArrayEquals(new int[] { 2, 2, 3 }, a);
	}

	@Test
	public void testFactorise3() {
		List<Integer> factors = PrimeTools.factorize(8);
		int[] a = ArrayUtils.toPrimitive(factors.toArray(new Integer[factors
				.size()]));
		assertArrayEquals(new int[] { 2, 2, 2 }, a);
	}
	
}
