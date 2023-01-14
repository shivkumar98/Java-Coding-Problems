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
