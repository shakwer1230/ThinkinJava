/**
 * @author
 * @date : 2018��4��1�� ����8:57:12
 */
package chapterfour;

import java.util.Random;

/**
 * @author shakwer
 *
 */
public class ArrayClassObj {
	static Random rand = new Random();

	static int pRand(int mod) {
		return Math.abs(rand.nextInt()) % mod + 1;
	}

	public static void main(String[] args) {
		Integer[] a = new Integer[pRand(20)];
		prt("length of a = " + a.length);
		for (int i = 0; i < a.length; i++) {
			a[i] = new Integer(pRand(500));
			prt("a[" + i + "] = " + a[i]);
		}
	}

	static void prt(String s) {
		System.out.println(s);
	}

}
