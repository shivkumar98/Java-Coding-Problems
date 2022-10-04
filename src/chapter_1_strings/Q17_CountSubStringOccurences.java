package chapter_1_strings;

public class Q17_CountSubStringOccurences {
	
	/* I will write a program which will count the number of times a substring occurs in string
	 * E.g. "111" contains "1" 3 times
	 */

	static int countNumberOfSubStringOccurs(String text, String substring) {
		System.out.println(text.indexOf(substring));
		//convert string to char array
		int substringLength = substring.length();
		
		int numOfOccurs = 0;
		for (int i =0; i+substringLength-1<text.length(); i++) {
			String fragment = text.substring(i, i+substring.length());
			if (fragment.equals(substring)){
				numOfOccurs++;
			}
		}
		return numOfOccurs;
	}
	
	public static void main(String[] args) {
		String text = "1111";
		String substring = "1";
		System.out.println(countNumberOfSubStringOccurs("111","1")); //3
		System.out.println(countNumberOfSubStringOccurs("111","11")); //2
		System.out.println(countNumberOfSubStringOccurs("1111", "1")); //4
	}
	
}
