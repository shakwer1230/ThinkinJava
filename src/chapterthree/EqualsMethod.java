/**
 * @author
 * @date : 2018��3��21�� ����10:06:23
 */
package chapterthree;

/**
 * @author shakwer
 *
 */
public class EqualsMethod {
	public static void main(String[] args) {
		Value v1 = new Value();
		Value v2 = new Value();
		v1.i = v2.i = 100;
		System.out.println(v1.equals(v2));
		}
}
class Value {
	public boolean equals(int i) {
		return i==this.i;
	}
int i;}