package chapter_1_strings.attempt2;

public class Q26_summing_two_numbers_and_operation_overflow {
	/*
	 * Write a program, that sums two large int/long numbers
	 * and throws an arithmetic exception incase of operation overflow
	 */
	
	public static void main(String[] args) {
		int x = Integer.MAX_VALUE;
		int y = 1;
		int sum = x+y;
		System.out.println(sum); // -2147483648
	}
}

class Solutio26 {
	
	public static void main(String[] args) {
		
		// suppose we sum the max values of long
		long x = Long.MAX_VALUE;
		long y = Long.MIN_VALUE;
		long z = x+y; // returns -2
		
		// JDK 8 has an addExact method in the Math class
		// now if we sum x and y, we get an exception
		long exact = Math.addExact(x, y); // throws arithmetic exception
		
	}

}