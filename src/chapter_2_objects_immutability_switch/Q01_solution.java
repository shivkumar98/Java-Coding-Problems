package chapter_2_objects_immutability_switch;

import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* PROBLEM 40: Checking null references in functional style and imperative code
 * Write a program that performs the null checks on the given references in a functional style and impertaive code
 */
public class Q01_solution {
	/* JDK 8 wrapped null checks (==null & !=null) into Objects.isNull() and Objects.nonNull()*/
	
	/* Suppose we were checking a list of integers were null:
	 * - we would first check if the reference to the list is null
	 * - then we would check if each member is null
	 */
	public static void main(String[] args) {
		
	}
	
	/* we can check for nulls in a functional style:
	 * 
	 */
	static int sumIntegers(List<Integer> list) {
		if (list==null) {
			throw new IllegalArgumentException();
		}
		return list.stream()
				.filter(i-> i!=null) // this does not match the style of the below
				.mapToInt(Integer::intValue).sum();
	}
	
	static boolean listContainsNulls(List<Integer> list) {
		if (list==null)
			return false;
		else {
			return list.stream()
					.anyMatch(i -> i==null);
		}
	}
	
	/* we can replace the lambda in the filter with this wrapper method:*/
	static int sumIntegersV2(List<Integer> list) {
		return list.stream()
				.filter(Objects::nonNull)
				.mapToInt(Integer::intValue).sum();
	}
	
	static boolean listContainsNullsV2(List<Integer> list) {
		if (Objects.isNull(list))
			return false;
		return list.stream()
		.anyMatch(Objects::isNull);
		}
	
}

/* Objects class has another useful method: requireNonNull
 *  this enforces that a constructors is passed non-null values
*/

class CarV2 {
	private final Color color;
	private final String name;
	public CarV2(String name, Color color) {
		this.color = Objects.requireNonNull(color, "color cant be null");
		this.name = Objects.requireNonNull(name, "name cant be null");
	}
	// this much more cleaner than testing for nulls and throwing an exception.
	// Note: the above will throw a NullPointerException by default
}