/**
 * @author
 * @date : 2018年4月1日 下午9:51:31
 */
package chapterfive;

/**
 * @author shakwer
 *
 */
public class IceCream {
	public static void main(String[] args) {
		// ! Sundae x = new Sundae();
		Sundae x = Sundae.makeASundae();
	}
}

class Sundae {
	private Sundae() {
		System.out.println();
	}

	static Sundae makeASundae() {
		return new Sundae();
	}
}