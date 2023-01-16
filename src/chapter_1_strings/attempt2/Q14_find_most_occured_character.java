package chapter_1_strings.attempt2;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Q14_find_most_occured_character {
	
	// write a program that finds the character
	// with most occurences in string
	
	static Character mostOccuredCharacter(String str) {
		if (str.length()==1) {
			return str.charAt(0);
		} else {
			Map<Character, Integer> charCount = new HashMap<>();
			char[] chArr = str.toCharArray();
			for (char c: chArr) {
				charCount.compute(c, (k,v)->(v==null)?1:++v);
			}
			if (charCount.values().stream().filter(i->i==1).count()==str.length()) {
				return null;
			} else {
				int maxValue = 1;
				char mostOccured = ' ';
				for (char c: charCount.keySet()) {
					if (charCount.get(c)>maxValue) {
						maxValue=charCount.get(c);
						mostOccured=c;
					}
				}
				return mostOccured;
			}
		}

	}
	
	public static void main(String[] args) {
		System.out.println(mostOccuredCharacter("a")); // a
		System.out.println(mostOccuredCharacter("ab")); // null
		System.out.println(mostOccuredCharacter("aabbbccc")); // b
	}

}

class Solution14 {
	
	// solution 1:
	// 1. loop the characters and put values into HashMap
	// 2. compute the max value of HashMap
	// 3. Get character that has max number of occurences
	
	static char maxOccurenceCharacter(String str){
		Map<Character, Integer> counter = new HashMap<>();
		 char[] charArr = str.toCharArray();
		 for (int i=0;i<charArr.length;i++) {
			 counter.compute(charArr[i], (k,v)->(v==null)?1:++v);
		 }
		 
		 int maxOccurences = Collections.max(counter.values());
		 char maxChar = Character.MIN_VALUE;
		 
		 for (Entry<Character,Integer> entry: counter.entrySet()) {
			 if (entry.getValue()==maxOccurences) {
				 maxChar = entry.getKey();
			 }
		 }
		 return maxChar;
	}

}

