package thyscom.eulersolutions;

public class E4 {

	/**
	 * A palindromic number reads the same both ways. The largest palindrome
	 * made from the product of two 2-digit numbers is 9009 = 91 99.
	 * 
	 * Find the largest palindrome made from the product of two 3-digit numbers.
	 */
	public static void main(String[] args) {
		E4 e4 = new E4();
		System.out.println(e4.brute());
	}

	/**
	 * Brute force solution. Explore the complete solution space and bubble up
	 * the last largest palindrome.
	 * @return
	 */
	private long brute() {
		long currentLargest = 0;
		
		int min = 100;
		int max = 999;
		
		for(int i = min; i <= max; i++) {
			for(int j = min; j <= max; j ++) {
				long product = j * i;
				if (isPalindrome(product) & product > currentLargest) {
					currentLargest = product;
				}
			}
		}
		return currentLargest;
	}
	
	private boolean isPalindrome(long testCase) {
		String pal = new Long(testCase).toString();
		for(int i = 0; i < pal.length()/2; i++) {
			if (pal.charAt(i) != pal.charAt(pal.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}
