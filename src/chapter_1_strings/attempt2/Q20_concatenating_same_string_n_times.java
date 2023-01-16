package chapter_1_strings.attempt2;

public class Q20_concatenating_same_string_n_times {
	
	// write a program which concatenates a string n times
	
	static String concatenateNTimes(String str, int n) {
		if ( n<=0 ) 
			return "";
		StringBuilder result = new StringBuilder();
		for (int i=0;i<n;i++) {
			result.append(str);
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(concatenateNTimes("hi",0)); // ""
		System.out.println(concatenateNTimes("hi",2)); // hihi
		System.out.println(concatenateNTimes("hi", -1)); // ""
	}

}
