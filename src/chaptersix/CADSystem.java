/**
 * @author
 * @date : 2018年4月1日 下午11:27:03
 */
package chaptersix;

/**
 * @author shakwer
 *
 */
public class CADSystem extends Shape{
	private Circle c;
	private Triangle t;
	private Line[] lines = new Line[10];

	CADSystem(int i) {
		super(i + 1);
		for (int j = 0; j < 10; j++)
			lines[j] = new Line(j, j * j);
		c = new Circle(1);
		t = new Triangle(1);
		System.out.println("Combined constructor");
	}

	void cleanup() {
		System.out.println("CADSystem.cleanup()");
		t.cleanup();
		c.cleanup();
		for (int i = 0; i < lines.length; i++)
			lines[i].cleanup();
		super.cleanup();
	}

	public static void main(String[] args) {
		CADSystem x = new CADSystem(47);
		try {
			// Code and exception handling...
		} finally {
			x.cleanup();
		}
	}
}

/*
 * Shape constructor
 * Shape constructor
 * Drawing a Line:0,0
 * Shape constructor
 * Drawing a Line:1,1
 * Shape constructor
 * Drawing a Line:2,4
 * Shape constructor
 * Drawing a Line:3,9
 * Shape constructor
 * Drawing a Line:4,16
 * Shape constructor
 * Drawing a Line:5,25
 * .............
 * Shape constructor
 * Drawing a Line:9,81
 * Shape constructor
 * Drawing a Circle
 * Shape constructor
 * Drawing a Triangle
 * Combined constructor
 * 
 * CADSystem.cleanup()
 *  Erasing a Triangle
 * Shape cleanup
 * Erasing a Circle
 * Shape cleanup
 * 
 */



class Shape {
	Shape(int i) {
		System.out.println("Shape constructor");
	}

	void cleanup() {
		System.out.println("Shape cleanup");
	}
}

class Circle extends Shape {
	Circle(int i) {
		super(i);
		System.out.println("Drawing a Circle");
	}

	void cleanup() {
		System.out.println("Erasing a Circle");
		super.cleanup();
	}
}

class Triangle extends Shape {
	Triangle(int i) {
		super(i);
		System.out.println("Drawing a Triangle");
	}

	void cleanup() {
		System.out.println("Erasing a Triangle");
		super.cleanup();
	}
}

class Line extends Shape {
	private int start, end;

	Line(int start, int end) {
		super(start);
		this.start = start;
		this.end = end;
		System.out.println("Drawing a Line: " + start + ", " + end);
	}

	void cleanup() {
		System.out.println("Erasing a Line: " + start + ", " + end);
		super.cleanup();
	}
}
