/**
 * @author
 * @date : 2018��4��14�� ����12:57:59
 */
package chaptersix;

/**
 * @author shakwer
 *public��ʾ���ǿ��ڰ���ʹ�ã�
 *Static ǿ������ֻ��һ����
 *��final ��������һ������
 *
 *���й̶���ʼ��ֵ���������ڳ�������fianl static �����������ͣ����ǵ����ָ��ݹ���Ҫȫ�����ô�д;
 *ҲҪע��i5 �ڱ����ڼ���δ֪�ģ�������û�д�д
 */
class Value {
	int i = 1;
}

public class FinalData {
	final int i1=9;
	static final int I2=99;
	public static final int I3=39;
	final int i4=(int)(Math.random()*20);
	static final int i5=(int)(Math.random()*20);
	
	Value v1=new Value();
	final Value v2=new Value();
	static final Value v3=new Value();
	
	final int[]a= {1,2,3,4,5,6};
	public void print(String id) {
		System.out.println(id+": i1="+i1+",i2="+I2+",i3="+I3+",i4="+i4+",i5="+i5);
	}
	
	public static void main(String[] args) {
		FinalData fd1=new FinalData();
//		fd1.i1++;//can't change the value
		fd1.v2.i++;// Object isn't constant!
//		fd1.i3++;
//		fd1.i4++;
//		fd1.i5++;
		fd1.v1=new Value();
		for (int i = 0; i < fd1.a.length; i++) {
			fd1.a[i]++; // Object isn't constant!
			//! fd1.v2 = new Value(); // Error: Can't
			//! fd1.v3 = new Value(); // change handle
			//! fd1.a = new int[3];
		}
		fd1.print("fd1");
		System.out.println("Creating new FinalData");
		
		FinalData fd2=new FinalData();
		fd1.print("fd1");
		fd2.print("fd2");
	}
}
