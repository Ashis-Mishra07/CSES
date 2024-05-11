import java.util.Scanner;

public class trailingZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        long ans=0;
        for(long i=5;i<=n;i=i*5){
            ans=ans+n/i;
        }
        System.out.println(ans);
    }
}
