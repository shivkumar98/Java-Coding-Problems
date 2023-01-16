package chapter_1_strings.attempt2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

class Solution10 {

	// solution 1:
	
	public static Set<String> permutateAndStore(String str){
		return permutateAndStore("", str);
	}

	private static Set<String> permutateAndStore(String prefix, String str) {
		Set<String> perms = new HashSet<>();
		int n = str.length();
		if (n == 0) {
			perms.add(prefix);
		} else {
			for (int i=0;i<n;i++) {
				perms.addAll(permutateAndStore(prefix+str.charAt(i),
								str.substring(i+1,n) + str.substring(0,i)));
			}
		}
		return perms;
	}
	
}
