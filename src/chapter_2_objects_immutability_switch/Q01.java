package chapter_2_objects_immutability_switch;

/* PROBLEM 40: Checking null references in functional style and imperative code
 * Write a program that performs the null checks on the given references in a functional style and impertaive code
 */
public class Q01 {
	static boolean isNull(Object obj) {
		if (obj == null) {
			return true;
		} else return false;
	}
	public static void main(String[] args) {
		System.out.println(isNull(new String())); //false
		String obj = null;
		System.out.println(isNull(obj)); // true
	}
}


