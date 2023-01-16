package chapter_1_strings.attempt2;

public class Q22_find_longest_common_prefix {
	
	static String longestCommonPrefix(String[] strings) {
		
		String shortestString = strings[0];
		for (String str:strings) {
			if (str.length()<shortestString.length())
				shortestString = str;
		}
		
		int longestCommonPrefix = 0;
		OUTER: for (int index=0;index<shortestString.length();index++) {
			int matchingStrings =0;
			for (String str: strings) {
				if (str.charAt(index)==shortestString.charAt(index))
					matchingStrings++;
				else
					break OUTER;
			}
			if (matchingStrings<strings.length)
				break OUTER;
			else if (matchingStrings==strings.length)
				longestCommonPrefix++;
		}
		
		return shortestString.substring(0,longestCommonPrefix);
	}
	
	public static void main(String[] args) {
		String result =longestCommonPrefix(new String[] {"hello", "hell", "hello"}); // he
		System.out.println(result);
	}

}


class Solution22 {
	// this solution takes the first string and compares
	// its characters in the rest of the strings
	// the algorithm stop if:
	// 1. length of first string is greater than the length of any other string
	// 2. The current character of the first string is not same as others
	
	static String longestCommonPrefix(String[] strs) {
		if (strs.length==1)
			return strs[0];
		
		int firstLength = strs[0].length();
		
		for (int prefixLength=0;prefixLength<firstLength;prefixLength++) {
			// take character of first string
			char c = strs[0].charAt(prefixLength);
			// comparing other strings:
			for (int i=0;i<strs.length;i++) {
				if (c!=strs[i].charAt(prefixLength) || strs[i].length()<=prefixLength) {
					return strs[i].substring(0, prefixLength);
				}
			}
		}
		return strs[0];
	}
	
}
