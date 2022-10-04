package chapter_2_objects_immutability_switch;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* PROBLEM 41: Checking null references ande throwing a customised NullPointerError
 * Write a program that performs null checks on given references and throws NullPointerException with custom messages
 * NOTE: my solution does not work :(
 */
public class Q02 {
	
	static boolean containsNulls(List<Integer> list) {
		if (Objects.isNull(list)){
			return false;
		}
		for (int i: list) {
			if (Objects.isNull(i)) {
				throw new NullPointerException("the following index contained a null: "+i);
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		containsNulls(Arrays.asList(1,null));
	}

}
