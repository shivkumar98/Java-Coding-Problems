package chapter_1_strings.attempt2;

public class Q28_converting_into_number_by_unsigned_conversion {
	// convert a given int to long by an unsigned conversion
	public static void main(String[] args) {
		int x = 123;
		long y = Integer.toUnsignedLong(x);
	}
}

class Solution28 {
	// lets take the min value of int
	// and place its unsigned value into a long
	long result = Integer.toUnsignedLong(Integer.MIN_VALUE);
	
}
