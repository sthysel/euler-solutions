// git@github.com:sthysel/EulerSolutions.git

package thyscom.eulersolutions;

public class E5 {

	/**
	 * 2520 is the smallest number that can be divided by each of the numbers
	 * from 1 to 10 without any remainder.
	 * 
	 * What is the smallest positive number that is evenly divisible by all of
	 * the numbers from 1 to 20?
	 * 
	 * Answer: 232792560
	 */

	int max = 20;

	public static void main(String[] args) {

		E5 e5 = new E5();
		System.out.println(e5.messyBruteFind());
		System.out.println(e5.bruteFind());

	}

	/**
	 * Compute the prime factorization of each number from 1 to 20, and multiply
	 * the greatest power of each prime together:
	 * 
	 * 20 = 2^2 * 5 19 = 19 18 = 2 * 3^2 17 = 17 16 = 2^4 15 = 3 * 5 14 = 2 * 7
	 * 13 = 13 11 = 11
	 * 
	 * All others are included in the previous numbers.
	 * 
	 * ANSWER: 2^4 * 3^2 * 5 * 7 * 11 * 13 * 17 * 19 = 232 792 560
	 * 
	 */
	
	private int primeFind() {
		
	}

	private int bruteFind() {
		int candidate = 20;
		while (true) {
			if (testDivisibility(candidate)) {
				return candidate;
			} else {
				candidate = candidate + 2;
			}
		}

	}

	private boolean testDivisibility(int candidate) {
		for (int i = 1; i <= 20; i++) {
			if (candidate % i != 0) {
				return false;
			}
		}
		return true;
	}

	private int messyBruteFind() {
		int candidate = 20;
		while (true) {
			int div = 1;
			while (div <= max) {
				if (candidate % div != 0) {
					break;
				}
				div++;
			}
			if (div >= max) {
				return candidate;
			}
			candidate = candidate + 2;
		}
	}
}
