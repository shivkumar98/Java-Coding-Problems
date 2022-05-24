package Chapter_1_Strings;

public class Question_12_RemovingDuplicateCharacters_Solution {

	/*
	 * Write a program that removes the
duplicate characters from the given string
	 */
	
	public static String removeDuplicates(String str) {
		char[] chArray = str.toCharArray(); // or, use charAt(i)
		 StringBuilder sb = new StringBuilder();
		 for (char ch : chArray) {
		 if (sb.indexOf(String.valueOf(ch)) == -1) {
		 sb.append(ch);
		 }
		 }
		 return sb.toString();
	}
	
	
	public static void main(String[] args) {
		System.out.println(removeDuplicates("Helllo"));
	}
	
}
