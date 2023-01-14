package chapter_1_strings.attempt2;

import java.util.ArrayList;
import java.util.List;

public class Q10_all_permutations_of_string {
	
	private static String permutate(String str) {
		return (new StringBuilder(str).reverse().toString());
	}
	
	static List<String> generatePermutations(String str){
		List<String> results = new ArrayList<>();
		if (str.length()==3) {
			results.add(str);
			results.add(str.substring(0,1) + permutate(str.substring(1, str.length())));
		}
		return results;
	}
	
	public static void main(String[] args) {
		String str = "abc";
		System.out.println(generatePermutations(str)); // [abc, acb]

	}

}
