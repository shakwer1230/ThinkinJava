/**
 * @author
 * @date : 2018��4��1�� ����10:35:24
 */
package chaptersix;

/**
 * @author shakwer
 *
 */
public class Detergent extends Cleanser{
	// Change a method:
	public void scrub() {
		append(" Detergent.scrub() ");
		super.scrub(); // Call base-class version
	}

	// Add methods to the interface:
	public void foam() {
		append(" foam()");
	}

	// Test the new class:
	public static void main(String[] args) {
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		x.print();
		System.out.println("Testing base class:");
		Cleanser.main(args);
	}
}
/**
 *Cleanser dilute() apply() Detergent.scrub()  scrub() foam()
 * Testing base class:
 * Cleanser dilute() apply() scrub()
 *
 */

class Cleanser {
	public String s = new String("Cleanser");

	public void append(String a) {
		s += a;
	}

	public void dilute() {
		append(" dilute()");
	}

	public void apply() {
		append(" apply()");
	}

	public void scrub() {
		append(" scrub()");
	}

	public void print() {
		System.out.println(s);
	}

	public static void main(String[] args) {
		Cleanser x = new Cleanser();
		x.dilute();
		x.apply();
		x.scrub();
		x.print();
	}
}