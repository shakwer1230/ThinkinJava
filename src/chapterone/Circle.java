/**
 * 
 */
package chapterone;

/**
 * @author shakwer
 *圆
 */
public class Circle extends Shape {
	//重写基类方法
	void erase() {
		System.out.println("删除一个圆");
	}
	
	void draw() {
		System.out.println("画一个圆");
	}
}
