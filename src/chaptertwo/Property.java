/**
 * @author
 * @date : 2018��3��21�� ����9:42:56
 */
package chaptertwo;

import java.util.Arrays;
import java.util.Date;
import java.util.Properties;

/**
 * @author shakwer
 *
 */
public class Property {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(args));
		System.out.println(new Date());
		Properties p=System.getProperties();
		
		p.list(System.out);
		System.out.println("---Memory usage");
		Runtime rt=Runtime.getRuntime();
		System.out.println("Total Memory="
				+rt.totalMemory()
				+" Free Momory="
				+rt.freeMemory());
		
		try {
			//��ǰ��������5��
			Thread.currentThread().sleep(5*1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println("ok");
	}
}
