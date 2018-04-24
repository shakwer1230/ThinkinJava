/**
 * @author
 * @date : 2018��4��14�� ����10:12:53
 */
package chaptersix;

import java.util.Vector;

/**
 * @author shakwer
 *
 */
// : Jurassic.java
// Making an entire class final
class SmallBrain {
}

final class Dinosaur {
	int i = 7;
	int j = 1;
	SmallBrain x = new SmallBrain();

	void f() {
	}
}

// ! class Further extends Dinosaur {}
// error: Cannot extend final class 'Dinosaur
public class Jurassic {
	public static void main(String[] args) {
		Dinosaur n = new Dinosaur();
		n.f();
		n.i = 40;
		n.j++;

	}
}
