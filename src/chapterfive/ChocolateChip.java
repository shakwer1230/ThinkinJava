/**
 * @author
 * @date : 2018年4月1日 下午10:04:27
 */
package chapterfive;

import chapterfour.Cookie;

/**
 * @author shakwer
 *
 */
public class ChocolateChip extends Cookie {
	public ChocolateChip() {
		System.out.println("ChocolateChip constructor");
	}

	public static void main(String[] args) {
		ChocolateChip x = new ChocolateChip();
		// ! x.foo(); // Can't access foo
	}
}
