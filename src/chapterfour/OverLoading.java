/**
 * @author
 * @date : 2018年4月1日 上午11:05:34
 */
package chapterfour;

import chaptertwo.Test;

/**
 * @author shakwer
 *
 */
public class OverLoading {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Tree t = new Tree(i);
			t.info();
			t.info("overloaded method");
		}
		new Tree();
	}
}

class Tree {
	int height;

	/**
	 * 
	 */
	public Tree() {
		// TODO Auto-generated constructor stub
		prt("Planing a seedling");
		height = 0;
	}

	Tree(int i) {
		prt("Creating a new tree that is " + i + " feet tall");
		height = i;
	}

	void info() {
		prt("Tree is " + height + " feet tall");
	}

	void info(String s) {
		prt(s + " : Tree is " + height + " feet tall");
	}

	static void prt(String s) {
		System.out.println(s);
	}
}
