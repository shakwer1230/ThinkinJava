/**
 * @author
 * @date : 2018年4月2日 下午11:07:15
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

	
	//利用了protected 属性  在子类中开放public方法 操作父类的x属性
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