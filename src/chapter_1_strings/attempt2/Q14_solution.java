package chapter_1_strings.attempt2;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Q14_solution {
	
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
