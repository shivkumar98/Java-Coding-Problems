package Chapter_1_Strings;

public class Q18_CheckTwoStringsAreAnagrams_Solution {
	
	static boolean isAnagram(String str1, String str2) {
		int[] characterCount = new int[256];
		char[] splitString1 = str1.toCharArray();
		char[] splitString2 = str2.toCharArray();
		
		for (int i =0; i<splitString1.length;i++) {
			characterCount[splitString1[i]]++;
			characterCount[splitString2[i]]--;
		}
	
		//check if characterCount is all 0;
		 for (int i=0; i<characterCount.length; i++) {
			 if (characterCount[i] != 0) {
				 return false;
			 }
		 }
		 return true;
	}
	public static void main(String[] args) {
		System.out.println(isAnagram("ello2", "2leol")); // true
		System.out.println(isAnagram("not", "anagram")); // false
	}
}
