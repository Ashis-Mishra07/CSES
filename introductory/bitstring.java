import java.util.Scanner;

public class bitstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        long mod=(long)(1e9 + 7);
        long ans=1;
        
        for(int i=1;i<=n;i++){
            ans=(ans*2)%mod;
        }
        System.out.println(ans);

    }
}
