package Chapter_1_Strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Question_2_FirstNonRepeatedCharacter_Solution {

	/*
	 *  we want to solve this problem efficiently
		with a single traversal
		
		We can use a LinkedHashMap which maintains insertion order
		We then return the first key whose value is one
	 */
	
	static Character firstNonRepeatedChar(String str) {
		
		Map<Character, Integer> charCount = new LinkedHashMap<>();
		
		for (int i =0; i<str.length(); i++) {
			charCount.compute(str.charAt(i), (k,v)-> (v == null)?1:0);
		}
		
		for (Entry<Character, Integer> i:charCount.entrySet()) {
			if(i.getValue()==1) {
				return i.getKey();
			}
		}
		return '!';
	}
	
	public static void main(String[] args) {
		System.out.println(firstNonRepeatedChar("llxoo")); // x
	}
	
	
}
