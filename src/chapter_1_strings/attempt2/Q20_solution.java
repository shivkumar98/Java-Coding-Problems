package chapter_1_strings.attempt2;

public class Q20_solution {
	
	// solution 1
	// mostly same as mine
	
	static String concatRepeat(String str, int n) {
		StringBuilder sb = new StringBuilder(str.length()*n);
		for (int i=0;i<n;i++) {
			sb.append(str);
		}
		return sb.toString();
	}
	
	// solution 2: from JDK 11
	//static String concatRepeat2(String str, int n) {
	//	return str.repeat(n);
	//}

}
