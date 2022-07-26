package Chapter_1_Strings;

import java.util.Arrays;
import java.util.List;

public class Q20_LongestCommonPrefix {
	
	/*
	 *  Finding the longest common prefix: 
	 *  Write a program that finds the longest
	 *  common prefix of given strings.
	 */
	
	static String findLongestCommonPrefix(List<String> strings) {
		int numberOfStrings = strings.size();
		int shortestStringLength = 5555;
		String shortestString = "";
		for(String str: strings) {
			if (str.length()<shortestStringLength) {
				shortestStringLength=str.length();
				shortestString = str;
			}
		}
		String commonPrefix = "";
		for (int i=1;i<shortestStringLength+1;i++) {
			String matchingLetters = shortestString.substring(0, i); // flag
			System.out.println("matchingletters: "+matchingLetters);
			int stringsInCommon = 0;
			for (String str: strings) {
				if (str.substring(0,i).equals(matchingLetters)) {
					stringsInCommon++;
				}
			}
			if (stringsInCommon == numberOfStrings) {
				commonPrefix = shortestString.substring(0,i);
			} else {
				break;
			}
		}
		return commonPrefix;
	}
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("he", "hello", "helium");
		List<String> strings2 = Arrays.asList("x", "y", "z");
		System.out.println(findLongestCommonPrefix(strings)); // "he"
		System.out.println(findLongestCommonPrefix(strings2)); // ""
	}

}
