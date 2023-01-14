package chapter_1_strings.attempt2;

public class Q06_solution {

	// solution 1:
	// replace character with blank in string
	// return original length by modified length
	
	static int countCharacter(String str, char ch) {
		return
		str.length() - str.replace(String.valueOf(ch),"").length();
	}
	
	// solution 2:
	// single loop solution:
	static int countCharacter2(String str, char ch) {
		int count =0;
		for (int i=0;i<str.length();i++) {
			if (str.charAt(i) == ch)
				count++;
		}
		return count;
	}
	
	// solution 3 is same as mine!
}
