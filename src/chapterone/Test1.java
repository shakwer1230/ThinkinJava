/**
 * 
 */
package chapterone;

/**
 * 
 * @author shakwer
 *
 */
public class Test1 {
	public static void main(String[] args) {
		Circle c=new Circle();
		Triangle triangle=new Triangle();
		Line line=new Line();
		
		doStuff(c);
		doStuff(triangle);
		doStuff(line);
	}
	//��������
	//��̬��
	static void doStuff(Shape shape) {
		shape.erase();
		shape.draw();
	}
	
}
