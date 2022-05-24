package Chapter_1_Strings;

public class Question_10_GeneratePermutations_Solution {
	
	public static void permutateAndPrint(String str) {
		permutateAndPrint("", str);
	}

	private static void permutateAndPrint(String prefix, String str) {
		int n = str.length();
		
		if (n==0) {
			System.out.println(prefix+ " ");
		} else {
			for (int i=0; i<n; i++) {
				permutateAndPrint(prefix+str.charAt(i), str.substring(i+1,n)+str.substring(0,i));
			}
		}
	}
	
	public static void main(String[] args) {
		permutateAndPrint("ABCD");
	}
}
