/**
 * @author
 * @date : 2018��4��14�� ����9:49:49
 */
package chaptersix;

/**
 * @author shakwer
 *
 */
public class BlankFinal {
	final int i = 0; // Initialized final
	final int j; // Blank final
	final Poppet p; // Blank final handle
	// Blank finals MUST be initialized
	// in the constructor:

	BlankFinal() {
		j = 1; // Initialize blank final
		p = new Poppet();
	}

	BlankFinal(int x) {
		j = x; // Initialize blank final
		p = new Poppet();
	}

	public static void main(String[] args) {
		BlankFinal bf = new BlankFinal();
	}
}

class Poppet {
}