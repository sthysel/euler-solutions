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

	/**
	 * Returns a Integer List of prime factors given a long.
	 * The usual caveats of Integers and large numbers apply.
	 * @param number
	 * @return List of prime factors
	 */
	public static List<Integer> factorize(long number) {
		List<Integer> factors = new ArrayList<Integer>();
		
		for (int divisor = 2; divisor <= (int) Math.sqrt(number); divisor++) {
			while (number % divisor == 0) {
				number /= divisor;
				factors.add(divisor);
			}
		}
		if (number > 1) {
			factors.add((int) number);
		}
		return factors;
	}
}
