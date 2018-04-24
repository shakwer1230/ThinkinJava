/**
 * @author
 * @date : 2018��4��1�� ����8:37:13
 */
package chapterfour;

import java.util.Arrays;
import java.util.Random;

/**
 * @author shakwer
 *
 */
public class RadomTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random random1 = new Random(10);
		/**
		 * �����вι��죬��Ҫע����ǣ����seedֵ��ͬ������ִ�ж��ٴΣ�������ɵ���������ͬ�� ʹ���в�����������Random����
		 * ����ִ�ж��ٴΣ�ÿ�εõ��Ľ������ͬ -1157793070 1913984760 1107254586
		 */
		for (int i = 0; i < 3; i++) {
			System.out.println(random1.nextInt());
		}
		
		Random random2=new Random();
        /*
		System.out.println("nextInt()��" + random.nextInt()); // �������һ����������������ķ�Χ����int���͵ķ�Χ-2^31~2^31-1
		System.out.println("nextLong()��" + random.nextLong()); // �������long���ͷ�Χ������
		System.out.println("nextFloat()��" + random.nextFloat()); // �������[0, 1.0)�����С��
		System.out.println("nextDouble()��" + random.nextDouble()); // �������[0, 1.0)�����С��
        */
		
		byte[] byteArr = new byte[10];
		random2.nextBytes(byteArr); // �������byte��������ڶ���������У����ɵĸ������ڶ��������ĸ���
		for (int i = 0; i < byteArr.length; i++) {
			System.out.println(byteArr[i]);
		}
		
		
		   /**
         * random.nextInt(n)
         * �������һ����������������Χ[0,n)
         * ���������������Χ�����ݣ������ڴ˻����Ͻ��мӼ�
         *
         * ���磺
         * 1. �����ɷ�Χ��[0,n]������
         *      random.nextInt(n+1)
         * 2. �����ɷ�Χ��[m,n]������, n > m
         *      random.nextInt(n-m+1) + m 
         *      random.nextInt() % (n-m) + m
         * 3. �����ɷ�Χ��(m,n)������
         *      random.nextInt(n-m+1) + m -1
         *      random.nextInt() % (n-m) + m - 1
         * ...... ��Ҫ�������򵥵ļӼ���  
         */
        System.out.println("nextInt(10)��" + random2.nextInt(10)); //�������һ��������������Χ[0,10)
        for (int i = 0; i < 20; i++) {
            //[3,15)
            //�����пӣ���Ҫע�⣬���ǰ������+�ţ�Ӧ��Ҫ�Ѽ�������������������������Ȼ�����+�Ž���Ϊ�ַ���ƴ��
            System.out.println("��������һ��[3,15)������������ǣ�" 
            + (random2.nextInt(12) + 3));
        }
        
//        random.ints();  //�������޸�int���ͷ�Χ�ڵ����ݣ���Ϊ�����޸�������Ͳ���ӡ�ˣ��Ῠ����......
//        random.ints(10, 100);   //�������޸�[10,100)��Χ�ڵ�����
       int[] arrs=random2.ints(10).toArray();   //�������޸�[10,100)��Χ�ڵ�����
       System.out.println(arrs.length);
       for (int i = 0; i < arrs.length; i++) {
           System.out.println(arrs[i]);
       }
       
       
       //����5����[10,100)��Χ�ڵ�����
       random2.ints(5, 10, 100).forEach(System.out :: println); //��仰���������仰������ͬ
       /**
        * ����
        *      random.ints();
        *      random.ints(ori, des);
        * �����������޸�������ķ��������ǿ�������Stream���terminal���������ض������������
        */
       //limit��ʾ����ֻҪ10�����ȼ���random.ints(10)
       random2.ints().limit(10).forEach(System.out :: println);
      
       //�ȼ���random.ints(5, 10, 100)
       random2.ints(10, 100).limit(5).forEach(System.out :: println);
	}
}
