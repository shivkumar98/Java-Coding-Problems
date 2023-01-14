package chapter_1_strings.attempt2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q10_solution {

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
	
	public static void main(String[] args) {
		System.out.println(permutateAndStore("ABC"));
	}
}
