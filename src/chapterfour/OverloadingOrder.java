/**
 * @author
 * @date : 2018年4月1日 上午11:15:36
 */
package chapterfour;

/**
 * @author shakwer
 *
 */
public class OverloadingOrder {
	public static void main(String[] args) {
		print("String First", 11);
		print(99, "Int First");
	}
	
	static void print(String s,int i) {
		System.out.println("String: "+s+", int: "+i);
	}
	static void print(int i,String s) {
		System.out.println("int: "+i+", String: "+s);
	}
}
