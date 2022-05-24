package Chapter_1_Strings;

import java.sql.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question_10_GeneratePermutations {
	
	/*
	 * 10. Generating all permutations: Write a program that generates all of the
permutations of a given string.
	 */

	static Set<String> getAllPermutations(String str){
		Set<String> list = new HashSet<String>();
		list.add(str);
		
		for (int i=0; i<str.length();i++) {
			for (int j=0;(j>=i) && ((i+j)<str.length());j++) {
				if (str.substring(i,j) != "") {
					list.add(new StringBuilder(str.substring(i,j)).reverse().toString());
				list.add(str.substring(i,j));
				}
			}
		}
		
		
		
		return list;
	}
	
	static Set<String> getCombinations(String str){
		Set<String> combinations = new HashSet<>();
		String firstDigit = str.substring(1,str.length());
		System.out.println("firstDigit "+firstDigit);
		for (int i=0; i<str.length(); i++) {
			for (int j=i+1;j<str.length();j++) {

			}		
		}
		
		return combinations;
		
	}
	
	public static void main(String[] args) {
		//System.out.println(getAllPermutations("1234"));
		System.out.println(getCombinations("1234"));
	}
}
