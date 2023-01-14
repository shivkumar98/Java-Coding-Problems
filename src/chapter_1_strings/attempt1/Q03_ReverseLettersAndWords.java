package chapter_1_strings.attempt1;

public class Q03_ReverseLettersAndWords {
	
	/*
	 *  Write a program that reverses the letters of
each word and a program that reverses the letters of each word and the
words themselves.
	 */
	
	static String reverseLettersOfWords(String str) {
		String[] splitString = str.split(" ");
		String reversedString = "";
		
		for (int i = 0; i<splitString.length-1;i++ ) {
			reversedString += reverseWord(splitString[i]) + " ";
		}
			reversedString+=reverseWord(splitString[splitString.length-1]);
		
		return reversedString;
		
	}
	
	private static String reverseWord(String string) {
		return new StringBuilder(string).reverse().toString();
	}
	
	static String reverseLettersAndWords(String str) {
		
		return new StringBuilder(str).reverse().toString();
		
	}
	
	public static void main(String[] args) {
		System.out.println(reverseLettersOfWords("hello world"));
		
		System.out.println(reverseLettersAndWords("hello world"));
	}

}
