package Chapter_1_Strings;

public class Q20_ConcatenatingStrings_n_times {
	
	/*
	 * Concatenating the same string n times:
	 *  Write a program that concatenates
		the same string a given number of time
	 */
	
	static String concatenateString(String str, int n) {
		StringBuilder result = new StringBuilder();
		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i < n; i++) {
			result.append(sb);
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(concatenateString("hello", 2)); // hellohello
		System.out.println(concatenateString("", 22)); // ""
		System.out.println(concatenateString("hello", 3)); //hellohellohello
	}

}
