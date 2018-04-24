/**
 * @author
 * @date : 2018年4月1日 下午8:18:55
 */
package chapterfour;

/**
 * @author shakwer
 *
 */
public class Arrays {
	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4, 5 };
		int[] a2;
		a2 = a1;
//		a2 = a1.clone();//深度拷贝
		for (int i = 0; i < a2.length; i++)
			a2[i]++;
		for (int i = 0; i < a1.length; i++)
			prt("a1[" + i + "] = " + a1[i]);
	}
/***
 * a1[0]=2
 * a1[1]=3
 * a1[2]=4
 * a1[4]=5
 * a1[5]=6
 */
	/**
	 * @param s
	 */
	static void prt(String s) {
		System.out.println(s);
	}
}
