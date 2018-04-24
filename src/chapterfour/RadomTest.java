/**
 * @author
 * @date : 2018年4月1日 下午8:37:13
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
		 * 对于有参构造，需要注意的是，如果seed值相同，不管执行多少次，随机生成的数据是相同的 使用有参数构造生成Random对象
		 * 不管执行多少次，每次得到的结果都相同 -1157793070 1913984760 1107254586
		 */
		for (int i = 0; i < 3; i++) {
			System.out.println(random1.nextInt());
		}
		
		Random random2=new Random();
        /*
		System.out.println("nextInt()：" + random.nextInt()); // 随机生成一个整数，这个整数的范围就是int类型的范围-2^31~2^31-1
		System.out.println("nextLong()：" + random.nextLong()); // 随机生成long类型范围的整数
		System.out.println("nextFloat()：" + random.nextFloat()); // 随机生成[0, 1.0)区间的小数
		System.out.println("nextDouble()：" + random.nextDouble()); // 随机生成[0, 1.0)区间的小数
        */
		
		byte[] byteArr = new byte[10];
		random2.nextBytes(byteArr); // 随机生成byte，并存放在定义的数组中，生成的个数等于定义的数组的个数
		for (int i = 0; i < byteArr.length; i++) {
			System.out.println(byteArr[i]);
		}
		
		
		   /**
         * random.nextInt(n)
         * 随机生成一个正整数，整数范围[0,n)
         * 如果想生成其他范围的数据，可以在此基础上进行加减
         *
         * 例如：
         * 1. 想生成范围在[0,n]的整数
         *      random.nextInt(n+1)
         * 2. 想生成范围在[m,n]的整数, n > m
         *      random.nextInt(n-m+1) + m 
         *      random.nextInt() % (n-m) + m
         * 3. 想生成范围在(m,n)的整数
         *      random.nextInt(n-m+1) + m -1
         *      random.nextInt() % (n-m) + m - 1
         * ...... 主要是依靠简单的加减法  
         */
        System.out.println("nextInt(10)：" + random2.nextInt(10)); //随机生成一个整数，整数范围[0,10)
        for (int i = 0; i < 20; i++) {
            //[3,15)
            //这里有坑，需要注意，如果前面用了+号，应该要把计算结果整体用括号括起来，不然它会把+号解释为字符串拼接
            System.out.println("我生成了一个[3,15)区间的数，它是：" 
            + (random2.nextInt(12) + 3));
        }
        
//        random.ints();  //生成无限个int类型范围内的数据，因为是无限个，这里就不打印了，会卡死的......
//        random.ints(10, 100);   //生成无限个[10,100)范围内的数据
       int[] arrs=random2.ints(10).toArray();   //生成无限个[10,100)范围内的数据
       System.out.println(arrs.length);
       for (int i = 0; i < arrs.length; i++) {
           System.out.println(arrs[i]);
       }
       
       
       //生成5个在[10,100)范围内的整数
       random2.ints(5, 10, 100).forEach(System.out :: println); //这句话和下面三句话功能相同
       /**
        * 对于
        *      random.ints();
        *      random.ints(ori, des);
        * 两个生成无限个随机数的方法，我们可以利用Stream里的terminal操作，来截断无限这个操作
        */
       //limit表示限制只要10个，等价于random.ints(10)
       random2.ints().limit(10).forEach(System.out :: println);
      
       //等价于random.ints(5, 10, 100)
       random2.ints(10, 100).limit(5).forEach(System.out :: println);
	}
}
