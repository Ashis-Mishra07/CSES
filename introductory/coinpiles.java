import java.util.Scanner;

public class coinpiles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            long a =sc.nextLong();
            long b=sc.nextLong();

            if( (2*a-b >=0) && (2*a-b)%3==0 && (2*b-a >=0) && (2*b-a)%3==0  ){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        // 842572599 577431753
    }
}
