/**
 * @author
 * @date : 2018��4��2�� ����11:07:15
 */
package chaptersix;

/**
 * @author shakwer
 *
 */
public class Orc extends Villain {
	private int j;

	public Orc(int jj) {
		super(jj);
		j = jj;
	}

	
	//������protected ����  �������п���public���� ���������x����
	public void change(int x) {
		set(x);
	}
}

class Villain {
	private int i;

	protected int read() {
		return i;
	}

	protected void set(int ii) {
		i = ii;
	}

	public Villain(int ii) {
		i = ii;
	}

	public int value(int m) {
		return m * i;
	}
}