/**
 * @author
 * @date : 2018��4��1�� ����9:32:15
 */
package chapterfive;

/**
 * @author shakwer
 *
 */
public class Assert {
	private static void perr(String msg) {
		System.err.println(msg);
	}

	public final static void is_true(boolean exp) {
		if (!exp)
			perr("Assertion failed");
	}

	public final static void is_false(boolean exp) {
		if (exp)
			perr("Assertion failed");
	}

	public final static void is_true(boolean exp, String msg) {
		if (!exp)
			perr("Assertion failed: " + msg);
	}

	public final static void is_false(boolean exp, String msg) {
		if (exp)
			perr("Assertion failed: " + msg);
	}
}
