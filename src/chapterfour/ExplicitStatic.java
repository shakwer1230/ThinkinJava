/**
 * @author
 * @date : 2018年4月1日 下午8:04:44
 */
package chapterfour;

/**
 * @author shakwer
 *
 */
public class ExplicitStatic {
	public static void main(String[] args) {
		System.out.println("Inside main()");
		Cups.c1.f(99);
	}
	
	static Cups x=new Cups();
	static Cups y=new Cups();
}

/**
 * 
 * Cup(1)
 * Cup(2)
 * 
 * Cups()
 * Cups()
 * Inside main()
 * f(99)
 */

class Cup{
	/**
	 * 
	 */
	public Cup(int maker) {
		// TODO Auto-generated constructor stub
		System.out.println("Cup("+maker+")");
	}
	void f(int maker) {
		System.out.println("f("+maker+")");
	}
}

class Cups{
	static Cup c1;
	static Cup c2;
	static {
		c1=new Cup(1);
		c2=new Cup(2);
	}
	/**
	 * 
	 */
	public Cups() {
		// TODO Auto-generated constructor stub
		System.out.println("Cups()");
	}
}
