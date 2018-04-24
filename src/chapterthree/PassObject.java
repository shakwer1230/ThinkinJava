/**
 * @author
 * @date : 2018年3月21日 下午9:56:32
 */
package chapterthree;

/**
 * @author shakwer
 *
 */
public class PassObject {
	
	
	static void f(Letter y) {
		y.c='z';
	}
	public static void main(String[] args) {
		Letter x=new Letter();
		x.c='a';
		System.out.println("1: x.c:"+x.c);
		f(x);
		System.out.println("2: x.c:"+x.c);
	}
}
class Letter{
	char c;
}
