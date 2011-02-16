// git@github.com:sthysel/EulerSolutions.git

package thyscom.eulersolutions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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

	private static int max = 20;

	public static void main(String[] args) {
		E5 e5 = new E5();
		System.out.println(e5.primeFind()); // To much java...
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
	private double primeFind() {
		Map<Integer, Integer> primeFactors = new HashMap<Integer, Integer>();

		int total = 1;
		for (int i = 2; i <= 20; i++) {
			System.out.println(i);
			Map<Integer, Integer> bin = countFactors(PrimeTools.factorize(i));
			mergeBin(primeFactors, bin);
			System.out.println(primeFactors);
		}

		for (Entry<Integer, Integer> entry : primeFactors.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
			total = (int) (total * Math.pow(entry.getKey(), entry.getValue()));
		}
		return total;
	}

	// count the factors in the list
	private Map<Integer, Integer> countFactors(List<Integer> factorList) {
		Map<Integer, Integer> factorBins = new HashMap<Integer, Integer>();
		for (Integer factor : factorList) {
			if (factorBins.containsKey(factor)) {
				factorBins.put(factor, factorBins.get(factor) + 1);
			} else {
				factorBins.put(factor, 1);
			}
		}
		System.out.println(factorBins);
		return factorBins;
	}

	// merge the bins, keeping the biggest factor
	private void mergeBin(Map<Integer, Integer> primeFactors,
			Map<Integer, Integer> bin) {

		for (Entry<Integer, Integer> entry : bin.entrySet()) {
			Integer factor = entry.getKey();
			Integer factorCount = entry.getValue();
			if (primeFactors.containsKey(factor)) {
				if (factorCount > primeFactors.get(factor)) {
					primeFactors.put(factor, factorCount);
				}
			} else {
				primeFactors.put(factor, factorCount);
			}
		}

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
