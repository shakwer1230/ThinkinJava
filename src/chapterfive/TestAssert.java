/**
 * @author
 * @date : 2018��4��1�� ����9:34:55
 */
package chapterfive;

/**
 * @author shakwer
 *
 */
public class TestAssert {
	public static void main(String[] args) {
		Assert.is_true((2 + 2) == 5);
		Assert.is_false((1 + 1) == 2);
		Assert.is_true((2 + 2) == 5, "2 + 2 == 5");
		Assert.is_false((1 + 1) == 2, "1 +1 != 2");
	}
}
