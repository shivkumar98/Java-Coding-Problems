package chapter_1_strings;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Counting the number of occurences of a substring can have 2 interpretations:
 * 		"11" in "111" occurs 1 time
 * 		"11" in "111" occurs 2 times
 */

public class Q17_CountSubStringOccurences_Solution {
	
	// for first scenario:
	static int countStringInString(String string, String toFind) {
		int position = 0;
		int count = 0;
		int n = toFind.length();
		
		while (string.indexOf(toFind, position)!=-1) {
			count++;
			position+=n;
		}
		return count;
	}
	static int countStringInString2(String string, String toFind) {
		int result = string.split(Pattern.quote(toFind), -1).length - 1;
		return result;
		
	}
	// for second scenario:
	static int countStringInString3(String string, String toFind) {
		Pattern pattern = Pattern.compile(Pattern.quote(toFind));
		Matcher matcher = pattern.matcher(string);
		
		int count = 0;
		int position = 0;
		while (matcher.find(position)) {
			count++;
			position = matcher.start()+1;
		}
		return count;
	}
	// Shiv's new solution:
	static int countStringInString4(String text, String toFind) {
		int toFindLength = toFind.length();
		int count = 0;
		for (int i=0; i+toFindLength-1<text.length();i+=toFindLength) {
			if (text.substring(i, i+toFindLength).equals(toFind)) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println( countStringInString("111", "11") ); //1
		System.out.println(	countStringInString2("111", "11") ); //1
		System.out.println( countStringInString4("111", "11")  );
	}
	
	

}
