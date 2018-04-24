/**
 * @author
 * @date : 2018年4月1日 下午9:01:12
 */
package chapterfour;

import java.util.Arrays;

/**
 * @author shakwer
 *
 */
public class ArrayInit {
	public static void main(String[] args) {
		Integer[] a = { new Integer(1), new Integer(2), new Integer(3), };
		// Java 1.1 only:
		Integer[] b = new Integer[] { new Integer(1), new Integer(2), new Integer(3), };
		System.out.println(Arrays.toString(a));;
	}
}
