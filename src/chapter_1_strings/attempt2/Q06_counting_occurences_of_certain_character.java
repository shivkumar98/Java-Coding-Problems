package chapter_1_strings.attempt2;

public class Q06_counting_occurences_of_certain_character {
	
	// write a program which counts occurences of a certain
	// character in a given string.
	
	static Long countOccurencesOfCharacter(String str, Character ch) {
		return str.chars()
		.filter(i -> i==ch)
		.count();
	}
	
	public static void main(String[] args) {
		System.out.println(countOccurencesOfCharacter("hello", 'l')); // 2
		System.out.println(countOccurencesOfCharacter("", ' ')); // 0
		System.out.println(countOccurencesOfCharacter("hello", 'l')); // 2


	}

}

class Solution6 {

	// solution 1:
	// replace character with blank in string
	// return original length by modified length
	
	static int countCharacter(String str, char ch) {
		return
		str.length() - str.replace(String.valueOf(ch),"").length();
	}
	
	// solution 2:
	// single loop solution:
	static int countCharacter2(String str, char ch) {
		int count =0;
		for (int i=0;i<str.length();i++) {
			if (str.charAt(i) == ch)
				count++;
		}
		return count;
	}
	
	// solution 3 is same as mine!
}
