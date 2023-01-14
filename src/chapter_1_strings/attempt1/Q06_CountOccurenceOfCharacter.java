package chapter_1_strings.attempt1;

public class Q06_CountOccurenceOfCharacter {

	/*6. Counting occurrences of a certain character: Write a program that counts
the occurrences of a certain character in a given string
	 */
	
	// this solution is the same as of the book
	static int countCharacterInString(String str, Character c) {
		int counter = 0;
		for (int i=0; i< str.length(); i++) {
			
			if (str.charAt(i)==c) {
				counter++;
			}
		}
		
		return counter;
	} 
	
	public static void main(String[] args) {
		System.out.println(countCharacterInString("helooooooo", 'o'));
	}
}
