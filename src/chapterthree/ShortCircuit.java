/**
 * @author
 * @date : 2018年3月21日 下午10:12:07
 */
package chapterthree;

/**
 * @author shakwer
 *
 */
public class ShortCircuit {
	static boolean test1(int val) {
		System.out.println("test1("+val+")");
		System.err.println("result:"+(val<1));
		return val<1;
	}
	
	static boolean test2(int val) {
		System.out.println("test2("+val+")");
		System.err.println("result:"+(val<2));
		return val<2;
	}
	static boolean test3(int val) {
		System.out.println("test3("+val+")");
		System.err.println("result:"+(val<3));
		return val<3;
	}
	
	public static void main(String[] args) {
//		if(test1(0)&&test2(2)&&test3(2)) {
//			System.out.println("express is true");
//		}else {
//			System.out.println("expression is false");
//		}
		
		
		System.out.println(1&1);
		System.out.println(0|1);
		System.out.println(1^1);
	}
}
