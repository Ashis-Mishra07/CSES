import java.util.Scanner;

public class digitqueries {
    static long power(long a, long b) {
        // If b = 0, whatever be the value of a,
        // our result will be 1.
        long res = 1;
        while (b > 0) {
            // If b is an odd number, then
            // (a^b) = (a * (a^(b–1)/2)^2)
            if ((b & 1) == 1) {
                res = (res * a);
            }

            // If b is an even number, then
            // (a^b) = ((a^2)^(b/2))
            a = (a * a);
            b >>= 1;
        }
        return res;
    }
    
    static long findDigit(long N) {
        // No of digits
        long digits = 1;
        // Total numbers in the current digit interval
        long base = 9;

        // Find the interval in which the Nth digit lies
        while (N - digits * base > 0) {
            N -= digits * base;
            base *= 10;
            digits++;
        }
        long index = N % digits;

        // Calculate the number which contains the Nth digit
        long res = power(10, (digits - 1)) + (N - 1) / digits;

        // Find out which digit in the number is the result
        if (index != 0)
            res = res / power(10, digits - index);
        return res % 10;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int q = sc.nextInt();
        long[] queries = new long[q];
        for(int i=0;i<q;i++){
            queries[i]=sc.nextLong();
        }
        for (int i = 0; i < q; i++){
            System.out.println(findDigit(queries[i]));
        }
    }
}
