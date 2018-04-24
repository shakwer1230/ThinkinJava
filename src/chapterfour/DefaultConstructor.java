/**
 * @author
 * @date : 2018年4月1日 上午11:33:56
 */
package chapterfour;

/**
 * @author shakwer
 *
 */
public class DefaultConstructor {
	public static void main(String[] args) {
		Bird nc = new Bird(); // default!
	}
}

class Bird {
	int i;
}

class Bush {
	Bush(int i) {
	}

	Bush(double d) {
	}
}