/**
 * @author Windy Zoeng
 */
public class Prime_Speed {
    public void test(int n) {
        long start = System.currentTimeMillis();    //取开始时间
        int sum = 0;    //加和
        boolean flag;   //质数flag
        for (int i = 2; i <= n; i++) {
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
        System.out.println("sum of all prime is: " + sum);
    }

    public static void main(String[] args) {
        Prime_Speed sumOfPrime = new Prime_Speed();
        sumOfPrime.test(200000);
    }
}
