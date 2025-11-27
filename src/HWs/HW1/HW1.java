package HWs.HW1;

public class HW1 {
    public static void main(String[] args){

        long[] TwoSums = new long[2];

        Thread thread1 = new Thread(() -> {
            long temp = 0;

            for (long i = 1; i <= 500_000; i++){
                temp += i;
            }

            TwoSums[0] = temp;
        });

        Thread thread2 = new Thread(() -> {
            long temp = 0;

            for (long i = 500_001; i <= 1_000_000; i++){
                temp += i;
            }

            TwoSums[1] = temp;
        });

        long timeAtStart = System.currentTimeMillis();

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        long timeAtEnd = System.currentTimeMillis();

        System.out.println(timeAtEnd - timeAtStart);
        System.out.println(TwoSums[0] + TwoSums[1]);

        timeAtStart = System.currentTimeMillis();

        long sum = 0;

        for (long i = 0; i <= 1000000; i++){
            sum += i;
        }

        timeAtEnd = System.currentTimeMillis();

        System.out.println(timeAtEnd - timeAtStart);
        System.out.println(sum);
    }
}