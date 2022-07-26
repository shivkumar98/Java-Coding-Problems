package Chapter_1_Strings;

import java.text.NumberFormat;

public class Q07_ConvertStringToIntLongFloat {

	/*
	 * 7. Converting String into int, long, float, or double: Write a program
that converts the given String object (representing a number) into int,
long, float, or double
	 */
	
	static Number convertToNumber(String str) {
		
		//assuming positive numbers
		
		boolean isInteger = true;
		// checking if integer
		for (int i = 0; i <str.length(); i++) {
			;
			if (!Character.isDigit(str.charAt(i))) {
				isInteger=false;
				break;
			}
		}
		
		try {
			int x = Integer.valueOf(str);
			return x;
		} catch (NumberFormatException e) {
			try {
				long x = Long.valueOf(str);
				return x;
			} catch (NumberFormatException ef) {
				try {
					double x = Double.valueOf(str);
					return x;
				} catch (NumberFormatException egg) {
					try {
						float x = Float.valueOf(str);
						return x;
					} catch (Exception eggs) {
						return 0;
					}
				}
				
			}
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		System.out.println(convertToNumber("1.223f"));
		System.out.println(Integer.MAX_VALUE);
	}
}
