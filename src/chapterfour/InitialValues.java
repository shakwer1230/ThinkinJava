/**
 * @author
 * @date : 2018年4月1日 下午1:00:40
 */
package chapterfour;

/**
 * @author shakwer
 *
 */
public class InitialValues {
	public static void main(String[] args) {
		Measurement d = new Measurement();
		d.print();
		/*
		 * In this case you could also say: new Measurement().print();
		 */
	}
}

/**
 * 基本变量初始化
 * @author shakwer
 *
 */
class Measurement {
	boolean t;
	char c;
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
Integer in;
	void print() {
		System.out.println("Data type Inital value\n" 
	            + "boolean " + t +"\n" //false
				+ "char " + c + "\n" //NULL
	            + "byte " + b + "\n" //0
				+ "short " + s + "\n" //0
	            + "int " + i + "\n" //0
				+ "long " + l + "\n" //o
	            + "float " + f + "\n" //0.0
				+ "double " + d);//0.0
		in.getClass();
	}
}
