/**
 * @author
 * @date : 2018��4��1�� ����11:41:28
 */
package chapterfour;

/**
 * @author shakwer
 *
 */
public class Leaf {
	private int i = 0;

	Leaf increment() {
		i++;
		return this;
	}

	void print() {
		System.out.println("i = " + i);
	}

	public static void main(String[] args) {
		Leaf x = new Leaf();
		x.increment().increment().increment().print();
	}
}
