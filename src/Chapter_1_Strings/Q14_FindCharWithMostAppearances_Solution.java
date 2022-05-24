package Chapter_1_Strings;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Question_14_FindCharWithMostAppearances_Solution {
	
	// this solution relies on a HashMap
	// 1: first loop the chars of the string and put into HashMap
	// 2: compute max val of HashMap
	// 3: Get character with max val
	
	public static char maxOccurenceCharacter(String str){
		
		char[] charArray = str.toCharArray();
		Map<Character, Integer> charCount = new HashMap<>();
		
		for (char c: charArray) {
			charCount.compute(c, (k,v)-> (v==null)?1:++v);
		}
		
		int maxOccurence = Collections.max(charCount.values());
		
		
		for (Entry<Character, Integer> entry:charCount.entrySet()) {
			if (entry.getValue() == maxOccurence) {
				return entry.getKey();
			}
		}
		return '/';
	}
	
	public static void main(String[] args) {
		System.out.println( maxOccurenceCharacter("heo") );  //e
	}

}
