/**
 * @author
 * @date : 2018年3月21日 下午10:01:15
 */
package chapterthree;

/**
 * @author shakwer
 *
 */
public class Equivalence {
	public static void main(String[] args) {
		Integer n1=new Integer(47);
		Integer n2=new Integer(47);
		System.out.println(n1==n2);//比较的是两个对象的地址
		System.out.println(n1.equals(n2));//比较的是两对象的值
		
		String s1=new String("47");
		String s2=new String("47");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3="47";
		String s4="47";
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
	}
}
