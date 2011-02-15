package thyscom.eulersolutions;

/**
 * Playing with prime numbers.
 * 
 * Ignoring BigInteger and other fine tools.
 * 
 * @author thysmeintjes
 */
public class PrimeTools {

	/**
	 * Is given number prime ? 
	 * The moment we know its composite its not prime.
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

}
