package chapter_1_strings.attempt2;

public class Q03_reversing_letters_and_words {

	/* Q4: Write a program which reverses letters of each word
	       and a program which reverses the letters of each word 
	 		and the word themselves
	*/
	
	static String reverseLetters(String str) {
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();
	}
	
	static String reverseWordsInPlace(String str) {
		String[] splitString = str.split(" ");
		StringBuilder result = new StringBuilder();
		for (int i=0; i<splitString.length;i++) {
			result.append(reverseLetters(splitString[i])+ " ");
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(reverseLetters("hello")); // expect olleh
		System.out.println(reverseWordsInPlace("Hello I am Shiv")); // expect olleH I ma vihS
	}
	
}

class Solution3 {
	
	private static final String WHITESPACE = " ";
	
	public String reverseWords(String str) {
		String[] words = str.split(WHITESPACE);
		StringBuilder reversedString = new StringBuilder();
		
		for (String word: words) {
			StringBuilder reversedWord = new StringBuilder();
			
			for (int i=word.length()-1; i >= 0; i--) {
				reversedString.append(word.charAt(i));
			}
		}
		return reversedString.toString();
	}

}
