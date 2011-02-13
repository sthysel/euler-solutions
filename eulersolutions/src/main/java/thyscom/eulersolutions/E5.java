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
		System.out.println(e5.bruteFind());
		System.out.println(e5.bruteFind2());

	}

	private int bruteFind2() {
		int candidate = 20;
		while(true) {
			if(testDivisibility(candidate)) {
				return candidate;
			} else {
				candidate = candidate + 2;
			}
		}
		
	}
	
	private boolean testDivisibility(int candidate) {
		for(int i = 1; i <= 20; i++) {
			if( candidate % i != 0) {
				return false;
			}
		}
		return true;
	}
	
	private int bruteFind() {
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
