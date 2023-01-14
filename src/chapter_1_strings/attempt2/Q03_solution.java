package chapter_1_strings.attempt2;

public class Q03_solution {
	
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
