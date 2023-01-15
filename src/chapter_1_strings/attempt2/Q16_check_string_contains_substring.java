package chapter_1_strings.attempt2;

public class Q16_check_string_contains_substring {
	
	static boolean containsSubstring(String str, String substring) {
		return str.contains(substring);
	}
	
	public static void main(String[] args) {
		System.out.println(containsSubstring("Hello", "el"));
		System.out.println(containsSubstring("Hello", "le"));
	}

}
