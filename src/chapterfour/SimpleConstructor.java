/**
 * @author
 * @date : 2018年4月1日 上午11:00:32
 */
package chapterfour;

/**
 * @author shakwer
 *
 */
public class SimpleConstructor {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
//			new Rock();
			Rock rock= new Rock(i);

		}
	}
}



class Rock{
	/**
	 * 
	 */
	public Rock() {
		// TODO Auto-generated constructor stub
		System.out.println("Creating Rock");
	}
	
	Rock(int i){
		System.out.println("Creating Rock Number "+i);
	}
}
