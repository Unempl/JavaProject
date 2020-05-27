/**
 * @author Windy Zoeng
 */
public class Prime_LoopCount {
    public void test(int num) {
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
            if (flag) {
                array[size++] = i;
            }
        }
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
        System.out.println("循环了" + count + "次");
        long end = System.currentTimeMillis();
        System.out.println("The time cost is: " + (end - start));
        System.out.println("sum of prime is: " + sum);
    }

    public static void main(String[] args) {
        Prime_LoopCount sumOfPrime = new Prime_LoopCount();
        sumOfPrime.test(200000);
    }
}
