/**
 * @author
 * @date : 2018��4��2�� ����10:09:33
 */
package chaptersix;

/**
 * @author shakwer
 *
 */
public class Hide {
	public static void main(String[] args) {
		Bart b = new Bart();
		b.doh(1); // doh(float) used
		b.doh('x');
		b.doh(1.0f);
		b.doh(new Milhouse());
	}
}

class Homer {
	char doh(char c) {
		System.out.println("doh(char)");
		return 'd';
	}

	float doh(float f) {
		System.out.println("doh(float)");
		return 1.0f;
	}
}

class Milhouse {
}

class Bart extends Homer {
	void doh(Milhouse m) {
		System.out.println("Minhouse()");
	}
}