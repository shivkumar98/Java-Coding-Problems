package Chapter_1_Strings;

import java.util.Arrays;

public class Question_15_SortArraysOfStringByLength {
	
	/*
	 * Write a program that sorts by the
		length of the given array of strings
	 */
	
	public static String[] sortArry(String[] strArray) {
		for (int i=0; i<strArray.length && i+1<strArray.length; i++ ) {
			if (strArray[i].length()>strArray[i+1].length()) {
				String temp = strArray[i];
				strArray[i] = strArray[i+1];
				strArray[i+1] = temp;
			}
		}
		return strArray;
	}
	
	public static void main(String[] args) {
		String[] strArray = {"1992929","123", "1", "12", "12345"};
		sortArry(strArray);
		System.out.println(Arrays.toString(strArray));
	}
	
	
 
}
