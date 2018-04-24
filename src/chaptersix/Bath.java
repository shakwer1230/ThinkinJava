/**
 * @author
 * @date : 2018��4��1�� ����10:27:31
 */
package chaptersix;

/**
 * @author shakwer
 *
 */
public class Bath {
	private String// Initializing at point of definition:
	s1 = new String("Happy"), s2 = "Happy", s3, s4;
	Soap castille;
	int i;
	float toy;

	Bath() {
		System.out.println("Inside Bath()");
		s3 = new String("Joy");
		i = 47;
		toy = 3.14f;
		castille = new Soap();
	}

	void print() {
		// Delayed initialization:
		if (s4 == null)
			s4 = new String("Joy");
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
		System.out.println("s4 = " + s4);
		System.out.println("i = " + i);
		System.out.println("toy = " + toy);
		System.out.println("castille = " + castille);
	}

	public static void main(String[] args) {
		Bath b = new Bath();
		b.print();
	}
}

/***
 * Inside Bath()
 * Soap()
 * s1 = Happy
 * s2 = Happy
 * s3 = Joy
 * s4 = Joy
 * i= 47
 * toy=3.14
 * castille= Constructed
 */

class Soap {
	private String s;

	Soap() {
		System.out.println("Soap()");
		s = new String("Constructed");
	}

	public String toString() {
		return s;
	}
}