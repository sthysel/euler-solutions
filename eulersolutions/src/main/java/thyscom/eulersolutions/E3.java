package thyscom.eulersolutions;

import java.util.Collections;
import java.util.List;

public class E3 {

	/**
	 * The prime factors of 13195 are 5, 7, 13 and 29.
	 * What is the largest prime factor of the number 600851475143 ?
	 */
	public static void main(String[] args) {
		List<Integer> factors = PrimeTools.factorize(600851475143L);
		
		Collections.reverse(factors);
		System.out.println(factors.get(0));
	}
}
