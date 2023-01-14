package chapter_1_strings.attempt2;

public class Q02_first_non_repeating_character {
	
	// Q2: write a program that returns first non-repeated character of string
	
	static Character firstNonRepeatedCharacter(String str) {
		if (str.length()== 1)
			return str.charAt(0);
		OUTER: for (int i=0; i<str.length(); i++) {
			// System.out.println("character: "+character);
			// checking other character in rest of string
			for (int j=1;j<str.length();j++) {
				// System.out.println("j: "+j);
				if (str.charAt(i)==str.charAt(j)) {
					continue OUTER;
				}
				return str.charAt(i);
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println(firstNonRepeatedCharacter("abbcc")); // expect a
		System.out.println(firstNonRepeatedCharacter("aabccc")); // expect b
		System.out.println(firstNonRepeatedCharacter("aabcccd")); // expect b
		System.out.println(firstNonRepeatedCharacter("a")); // expect a
	}

}
