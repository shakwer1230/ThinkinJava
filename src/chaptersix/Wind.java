/**
 * @author
 * @date : 2018��4��14�� ����12:25:01
 */
package chaptersix;

/**
 * @author shakwer
 *
 */
 class InStrument {
	public void play() {
		System.out.println(this.getClass().getName());
	}
	static void tune(Wind i) {
		//
		i.play();
		System.out.println("Constructor");
	}
}

 public class Wind extends InStrument{
	public static void main(String[] args) {
		Wind fluent=new Wind();
		Wind.tune(fluent);
		
	}
}
