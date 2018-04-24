/**
 * @author
 * @date : 2018年4月14日 下午9:55:20
 */
package chaptersix;

/**
 * @author shakwer
 *
 */
public class FinalArguments {
	void with(final Gizmo g) {
		//  g = new Gizmo(); // Illegal -- g is final
		g.spin();
	}

	void without(Gizmo g) {
		g = new Gizmo(); // OK -- g not final
		g.spin();
	}

	// void f(final int i) { i++; } // Can't change
	// You can only read from a final primitive:
	int g(final int i) {
		//i++;//不能改变i的值
		return i + 1;
		
	}

	public static void main(String[] args) {
		FinalArguments bf = new FinalArguments();
		bf.without(null);
//		bf.with(null);
		System.out.println(bf.g(2));//返回了i+1
	}
}

class Gizmo {
	public void spin() {
		System.out.println("spin");
	}
}