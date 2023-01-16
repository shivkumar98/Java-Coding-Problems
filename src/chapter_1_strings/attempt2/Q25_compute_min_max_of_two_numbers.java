package chapter_1_strings.attempt2;

import java.util.function.BinaryOperator;

public class Q25_compute_min_max_of_two_numbers {
	
	static int[] minMax(int a, int b) {
		if (a<=b)
			return new int[] {a,b};
		else
			return new int[] {b,a};
	}

}

class Solution25 {
	
	public static void main(String[] args) {
		
		// solution 1:
		// before JDK8 we would use Math.min and max methods:
		int i1 = -45;
		int i2 = -15;
		int min = Math.min(i1, i2);
		int max = Math.max(i1, i2);
		
		// solution 2:
		// JDK8 offers min,max methods for wrapper classes
		double d1 = 0.123456789;
		double d2 = 0.987654321;
		double minDouble = Double.min(d1, d2);
		double maxDouble = Double.max(d1, d2);
		
		
		// solution 3:
		float f1 = 1.223f;
		final float f2 = 33.245f;
		float minFloat = BinaryOperator.minBy(Float::compareTo).apply(f1, f2);
		float maxFloat = BinaryOperator.maxBy(Float::compareTo).apply(f1, f2);
	}
	
}