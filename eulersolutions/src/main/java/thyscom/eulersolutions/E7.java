package thyscom.eulersolutions;

public class E7 {

	/**
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can
	 * see that the 6th prime is 13.
	 * 
	 * What is the 10001st prime number?
	 * 
	 */
	public static void main(String[] args) {
		E7 e7 = new E7();
		System.out.println(e7.bruteFind());
	}

	private long bruteFind() {
		int primeCount = 0;
		long candidate = 1;
		while (primeCount < 10001) {
			candidate++;
			if (PrimeTools.isPrime(candidate)) {
				primeCount++;
			}
		}
		return candidate;
	}
}
