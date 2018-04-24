/**
 * @author
 * @date : 2018年4月1日 下午8:13:36
 */
package chapterfour;

/**
 * @author shakwer
 *
 */
public class Mugs {
	Mug c1;
	Mug c2;
	{
		c1 = new Mug(1);
		c2 = new Mug(2);
		System.out.println("c1 & c2 initialized");
	}

	Mugs() {
		System.out.println("Mugs()");
	}

	public static void main(String[] args) {
		System.out.println("Inside main()");
		Mugs x = new Mugs();
	}
}

/**
 * c1 & c2 initialized
 * Mug(1)
 * Mug(2)
 * 
 * Inside main()
 * Mugs()
 */

class Mug {
	Mug(int marker) {
		System.out.println("Mug(" + marker + ")");
	}

	void f(int marker) {
		System.out.println("f(" + marker + ")");
	}
}