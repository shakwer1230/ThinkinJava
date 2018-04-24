/**
 * @author
 * @date : 2018年4月1日 下午11:17:38
 */
package chaptersix;

/**
 * @author shakwer
 *
 */
public class Chess extends BoardGame {
	Chess() {
		super(11);
		System.out.println("Chess constructor");
	}

	public static void main(String[] args) {
		Chess x = new Chess();
	}
}
/**
 * Game constructor
 * BoardGame constructor
 * Chess constructor
 */

class Game {
	Game(int i) {
		System.out.println("Game constructor");
	}
}

class BoardGame extends Game {
	BoardGame(int i) {
		super(i);
		System.out.println("BoardGame constructor");
	}
}