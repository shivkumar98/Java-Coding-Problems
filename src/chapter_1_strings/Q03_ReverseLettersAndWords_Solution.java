package chapter_1_strings;

public class Q03_ReverseLettersAndWords_Solution {

	/*
	 *  Write a program that reverses the letters of
each word and a program that reverses the letters of each word and the
words themselves.
	 */
	
	/* The solution in the book reverse each word and
	 * follows by appending white space
	 */
	
	static String reverseWords(String str){
		String[] splitString = str.split(" ");
		StringBuilder reversedString = new StringBuilder();
		
		for (String word: splitString) {
			StringBuilder reversedWord = new StringBuilder(word).reverse();
			reversedString.append(reversedWord).append(" ");
		}
		
		return reversedString.toString();
		
	}
	
}
