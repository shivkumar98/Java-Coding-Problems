package chapter_1_strings;

import java.util.HashMap;
import java.util.Map;

public class Q14_FindCharWithMostAppearances {

	
	/*
	 *  Write a program that
finds the character with the most appearances in the given string.
	 */
	
	public static char charWithMostOccurences(String str) {
		StringBuilder sb= new StringBuilder(str);
		Map<Character, Integer> charCount = new HashMap<>();
		
		char[] charArray = str.toCharArray();
		for (char c: charArray) {
			charCount.compute(c, (k,v)-> (v==null)?1:++v);
		}
		
		int max = 0;
		char highestOccurence = ' ';
		for (char c:charCount.keySet()) {
			if (charCount.get(c) > max) {
				max = charCount.get(c);
				highestOccurence=c;
			}
		}
		return highestOccurence;
	}
	
	public static void main(String[] args) {
		System.out.println(charWithMostOccurences("aaaaaabbbbbbbbbbcccccccccc")); //b
	}
}
