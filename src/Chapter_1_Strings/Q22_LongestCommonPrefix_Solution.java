package Chapter_1_Strings;

public class Q22_LongestCommonPrefix_Solution {
	
	// this solution takes the first string and compares each of its characters in the rest of the strings
	// the algorithm stops if
	// 1) length of first string is greater than length of any other string
	// 2) current character is not same as current character of other strings
	
	static String longestCommonPrefix(String[] strs) {
		if (strs.length == 1)
			return strs[0];
		
		int firstLen = strs[0].length();
		
		 for (int prefixLen = 0; prefixLen < firstLen; prefixLen++) {
			 char ch = strs[0].charAt(prefixLen);
			 for (int i = 1; i < strs.length; i++) {
			 if (prefixLen >= strs[i].length()
			 || strs[i].charAt(prefixLen) != ch) {
			 return strs[i].substring(0, prefixLen);
			}
		 }
		}
		return strs[0];
	}
	
	public static void main(String[] args) {
		String[] strs = {"hello", "hell", "helium"};
		System.out.println(longestCommonPrefix(strs)); //"hel"
		
	}

}
