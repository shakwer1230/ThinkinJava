/**
 * @author
 * @date : 2018年4月1日 下午11:14:04
 */
package chaptersix;

/**
 * @author shakwer
 *
 */
public class Cartoon extends Drawing{
	/**
	 * 
	 */
	public Cartoon() {
		// TODO Auto-generated constructor stub
		System.out.println("Cartoon Constuctor");
	}
	public static void main(String[] args) {
		Cartoon x=new Cartoon();
	}
}

/**
 * Art constructor
 * Drawing constructor
 * Cartoon Constuctor
 */
class Art {
	Art() {
		System.out.println("Art constructor");
	}
}

class Drawing extends Art {
	Drawing() {
		System.out.println("Drawing constructor");
	}
}