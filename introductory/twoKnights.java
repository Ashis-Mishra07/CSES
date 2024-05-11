import java.util.Scanner;

public class twoKnights {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(long i=1;i<=x;i++){
            long total=((i*i)*((i*i)-1))/2;
            long invalid=2*2*(i-1)*(i-2);

            long ans=total-invalid;
            System.out.println(ans);
        }
    }
}
