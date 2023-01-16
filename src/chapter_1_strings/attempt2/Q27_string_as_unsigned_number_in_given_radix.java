package chapter_1_strings.attempt2;

public class Q27_string_as_unsigned_number_in_given_radix {
	
	// write a program which converts a given string#
	// into an unsigned number
}

class Solution27 {
	public static void main(String[] args) {
		// JDK 8 offers parseUnsignedInt() and parseUnsignedLong()
		String nri = "255500";
		int result = Integer.parseUnsignedInt(nri, Character.MAX_RADIX);
		System.out.println(result); // 129570192
	}
}
