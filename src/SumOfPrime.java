/**
 * @author Windy Zoeng
 */
public class SumOfPrime {
    public void loopCount(int num) {
        if (num > 0) {
            long start = System.currentTimeMillis();    //取开始时间
            int count = 0;
            int sum = 0;
            int[] array = new int[num / 2];     //去一半
            int size = 0;   //统计质数的数量，下一个质数的下标位置
            array[size++] = 2;//最小的质数是2
            boolean flag;
            for (int i = 3, n; i <= num; i += 2, count++) {
                n = (int) Math.sqrt(i);
                flag = true;              //设置flag为true
                for (int j = 0; array[j] <= n; j++) {
                    if (i % array[j] == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag && size<=array.length) {
                    array[size++] = i;
                }
            }
            for (int i = 0; i < size; i++) {
                sum += array[i];
            }
            System.out.println("循环了" + count + "次");
            long end = System.currentTimeMillis();
            System.out.println("The time cost is: " + (end - start));
            System.out.println("sum of all primes is: " + sum);
        }
    }

    public void speed(int num) {
        if (num > 0) {
            long start = System.currentTimeMillis();    //取开始时间
            int sum = 0;    //加和
            boolean flag;   //质数flag
            for (int i = 2; i <= num; i++) {
                if (i % 2 == 0 && i != 2)
                    continue; //偶数和1排除
                flag = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag)
                    sum += i;
            }
            long end = System.currentTimeMillis();
            System.out.println("The time cost is: " + (end - start));
            System.out.println("sum of all primes is: " + sum);
        }
    }

    public static void main(String[] args) {
        SumOfPrime sumOfPrime = new SumOfPrime();
        System.out.println("----Solution1----");
        sumOfPrime.speed(200000);
        System.out.println("----Solution2----");
        sumOfPrime.loopCount(200000);
    }
}
