package Chapter_1_Strings;


public class Q20_ConcatenatingStrings_n_times_Solution {
	
	static String concatRepeat(String str, int n) {
		StringBuilder sb = new StringBuilder(str.length()*n);
		for (int i=0;i<n;i++) {
			sb.append(str);
		}
		return sb.toString();
	}

}
