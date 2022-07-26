package Chapter_1_Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q01_CountDuplicateCharacters {
	
	
	/*
	 * Counting duplicate characters: Write a program that counts duplicate
characters from a given string.
	 */
	
	static String countDuplicateCharacters(String str) {
		String[] splitString = str.split("");
		List<String> letters = new ArrayList<String>();
		String counterofCharacters = "";
		
		
		// finding unique set
		for (String s: splitString) {
			if (!letters.contains(s)) {
				letters.add(s);
			}
		}
		
		for (String s:letters) {
			int count = 0;
			for (int i =0; i<splitString.length; i++) {
				if (splitString[i].equals(s)) {
				count++;	
				}
			}
			counterofCharacters+=s+":"+String.valueOf(count) +" ";
		}
		return counterofCharacters;
	}
	
	public static void main(String[] args) {
		System.out.println(countDuplicateCharacters("hello")); // returns:h:1 e:1 l:2 o:1 
	}
}
