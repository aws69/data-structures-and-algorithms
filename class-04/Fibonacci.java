public class Fibonacci {
    public static int nthFibonacci(int n) {
        if (n < 2) {
            return n ;
        }

        int[] sum = new int[n + 1];
        sum[0]=0;
        sum[1]=1;

        for (int i = 2; i <= n; i++) {
            sum[i]=sum[i-1] + sum[i-2];
        }

        return sum[n];
    }

    public static void main(String[] args) {
        int n = 10;
        int result = nthFibonacci(n);
        System.out.println(result);
    }
}