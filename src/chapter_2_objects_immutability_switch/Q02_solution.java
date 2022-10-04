package chapter_2_objects_immutability_switch;

import java.awt.Color;
import java.util.Objects;
import java.util.function.Supplier;

/* we defined the following class in the previous example:
class CarV2 {
	private final  Color color;
	private final  String name;
	public CarV2(String name, Color color) {
		this.color = Objects.requireNonNull(color, "color cant be null");
		this.name = Objects.requireNonNull(name, "name cant be null");
	}
}
*/

/* what if we wanted to throw illegalArgumentException instead?
 * The Objects class has no default way to do this but we can define our own method
 * This method will require the supplier interface
 */

class MyObjects {
	static <T> T requireNonNullElseThrowIAE(T obj, String message) {
		if (Objects.isNull(obj)) {
			throw new IllegalArgumentException(message);
		} else return obj;
	}
}
class CarV3 {
	Color color;
	String name;
	public CarV3(String name, Color color) {
		this.color = MyObjects.requireNonNullElseThrowIAE(color, null);
		this.name = MyObjects.requireNonNullElseThrowIAE(name, "Name cannot be set as null");
	}
}

public class Q02_solution {
	public static void main(String[] args) {
		// CarV3 car = new CarV3( "toyota", null); - throws exception without a message
		// CarV3 car = new CarV3(null, new Color(1)); - throws exception with message: Name cannot be set as null
	}
}