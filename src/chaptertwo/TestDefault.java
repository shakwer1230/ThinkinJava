/**
 * @author
 * @date : 2018年3月20日 下午11:10:49
 */
package chaptertwo;

/**
 * @author shakwer
 *基本类型的默认值
 */
public class TestDefault {
	boolean isFalse ;//true
	Boolean isTure;
	char ischar;//'\u0000' --null
	byte isByte;// byet 0
	short isShort; //short 0
	int isInt; //0
	long isLong; //0L
	float isFloat; //0.0f
	double isDouble; //0.0d
	
	public static void main(String[] args) {
		TestDefault defaults=new TestDefault();

		//true
		if(defaults.isFalse) {
			System.out.println("false");
		}else {
			System.out.println("true");
		}
		
		//报异常 java.lang.NullPointerException
//		if(!defaults.isTure) {
//			System.out.println("false");
//		}else {
//			System.out.println("true");
//		}
		//null
		System.out.println(defaults.ischar=='\u0000'?"null":"empty");
		
		//0
		System.out.println(defaults.isByte);
		
		//0
		System.out.println(defaults.isShort);
		
		//0
		System.out.println(defaults.isInt);
		
		//0
		System.out.println(defaults.isLong);
		
		//0.0
		System.out.println(defaults.isFloat);
		
		//0.0
		System.out.println(defaults.isDouble);
	}
	
	
	
}
