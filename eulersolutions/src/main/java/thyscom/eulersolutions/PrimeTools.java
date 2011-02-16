package thyscom.eulersolutions;

import java.util.ArrayList;
import java.util.List;

/**
 * Playing with prime numbers.
 * 
 * Ignoring BigInteger and other fine tools.
 * 
 * @author thysmeintjes
 */
public class PrimeTools {

	/**
	 * Is given number prime ? The moment we know its composite its not prime.
	 * Time depends on size of number
	 * 
	 * @return
	 */
	public static boolean isPrime(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	public static List<Integer> factorize(long l) {
		List<Integer> factors = new ArrayList<Integer>();
		
		for (int i = 2; i <= (int) Math.sqrt(l); i++) {
			while (l % i == 0) {
				l /= i;
				factors.add(i);
			}
		}
		if (l > 1) {
			factors.add((int) l);
		}
		return factors;
	}
}
