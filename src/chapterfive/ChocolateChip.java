/**
 * @author
 * @date : 2018��4��1�� ����10:04:27
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
