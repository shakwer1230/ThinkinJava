/**
 * @author
 * @date : 2018年4月1日 下午12:07:18
 */
package chapterfour;

/**
 * @author shakwer
 *
 */
public class Garbage {

	public static void main(String[] args) {
		while (!Chair.f) {
			new Chair();
			new String("To take up space");
		}
		if (args.length == 0) {
			System.err.println("Usage:\n" + " java Garbage before  \n or: \n" + " java Garbage after");
			return;
		}
		while (!Chair.f) {
			new Chair();
			new String("To take up space");
		}

		System.out.println("After all Chairs have been created:\n" 
		        + "total created=" + Chair.created
				+ ", total finalized=" + Chair.finalized);

		if (args[0].equals("before")) {
			System.out.println("gc():");
			System.gc();
			System.out.println("runFinaliezation():");
			System.runFinalization();
		}
		System.out.println("bye");
		if (args[1].equals("after")) {
			System.out.println("runFinalizersOnExit():");
			System.runFinalizersOnExit(true);
		}
	}
}

class Chair {
	static boolean gcrun = false;
	static boolean f = false;
	static int created = 0;
	static int finalized = 0;
	int i;

	/**
	 * 
	 */
	public Chair() {
		// TODO Auto-generated constructor stub
		i = ++created;
		if (i == 47) {
			System.out.println("Created 47");
		}
	}

	public void finalize() {
		if (!gcrun) {
			gcrun = true;
			System.out.println("Begining to finalize after " + created + " Chairs are created");
		}
		if (i == 47) {
			System.out.println("Finalizing Chair #47," + " Setting flag to stop Chair creation");
			f = true;
		}
		finalized++;
		if (finalized > created) {
			System.out.println("All " + finalized + " finalized");
		}
	}

}
