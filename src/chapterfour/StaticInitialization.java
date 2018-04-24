/**
 * @author
 * @date : 2018��4��1�� ����1:32:00
 */
package chapterfour;

/**
 * @author shakwer
 *
 */
public class StaticInitialization {
	public static void main(String[] args) {
		System.out.println("Creating new Cupboard() in main");
		new Cupboard();
		System.out.println("Creating new Cupboard() in main");
		new Cupboard();
		t2.f2(1);
		t3.f3(1);
	}
    //Bowl(1)
	//Bowl(2)
	//Table()
	//f(1)
	static Table t2 = new Table();
	//Bowl(4)//��̬�����ڱ��������ĵ�ʱ����Ѿ����䣬
	//Bowl(5)
	//Bowl(3)//�Ǿ�̬�����ڳ�ʼ����ʱ�򣬷���
	//Cupboard()
	//f(2)
	static Cupboard t3 = new Cupboard();
	//Creating new Cupboard() in main
	//Bowl(3)
	//Cupboard()
	//f(2)
	//Creating new Cupboard() in main
	//Bowl(3)
	//Cupboard()
	//f(2)
	//f2(1)
	//f3(1)
}

class Bowl {
	Bowl(int marker) {
		System.out.println("Bowl(" + marker + ")");
	}

	void f(int marker) {
		System.out.println("f(" + marker + ")");
	}
}

class Table {
	static Bowl b1 = new Bowl(1);

	Table() {
		System.out.println("Table()");
		b2.f(1);
	}

	void f2(int marker) {
		System.out.println("f2(" + marker + ")");
	}

	static Bowl b2 = new Bowl(2);
}

class Cupboard {
	Bowl b3 = new Bowl(3);
	static Bowl b4 = new Bowl(4);

	Cupboard() {
		System.out.println("Cupboard()");
		b4.f(2);
	}

	void f3(int marker) {
		System.out.println("f3(" + marker + ")");
	}

	static Bowl b5 = new Bowl(5);
}