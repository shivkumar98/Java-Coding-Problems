package Chapter_1_Strings;
import java.util.Arrays;
public class Q18_CheckTwoStringsAreAnagrams {
	/*
	 * Two strings that have the same characters, but that are in a different order, are
	   anagrams.
	 */
	
	static boolean twoStringsAreAnagrams(String str1, String str2) {
		//converting strings to array
		char[] splitString1 = str1.toCharArray();
		char[] splitString2 = str2.toCharArray();
		Arrays.sort(splitString1);
		Arrays.sort(splitString2);
		return Arrays.toString(splitString1).equals(Arrays.toString(splitString2) );
	}
	
	public static void main(String[] args) {
		System.out.println(twoStringsAreAnagrams("hello", "lleoh")); // true
		System.out.println(twoStringsAreAnagrams("yoyo", "yey2")); // false
	}
}
