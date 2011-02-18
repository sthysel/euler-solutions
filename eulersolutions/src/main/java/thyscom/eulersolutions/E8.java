/**
 * Find the greatest product of five consecutive digits in the 1000-digit
 * number.
 * @throws IOException 
 */

package thyscom.eulersolutions;

import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class E8 {

	public static void main(String[] args) throws IOException {
		String number = FileUtils.readFileToString(FileUtils.toFile(E8.class
				.getResource("e8data.txt")));
		// String number = FileUtils.readFileToString(new File("e8data.txt"));
		number = number.replaceAll("\n", "");
		System.out.println(number.length());

		E8 e8 = new E8();
		System.out.println("\n" + e8.findProduct(number));
	}

	private long findProduct(String number) {
		long product = 0;
		for (int i = 0; i < number.length() - 4; i++) {
			long currentProduct = productOf5(number, i);
			if (currentProduct > product) {
				product = currentProduct;
			}
		}
		return product;
	}

	private long productOf5(String number, int start) {
		long currentProduct = 1;
		for (int j = start; j < start + 5; j++) {
			currentProduct = currentProduct * Integer.parseInt(number.substring(j,j+1));
		}

		return currentProduct;
	}
}
