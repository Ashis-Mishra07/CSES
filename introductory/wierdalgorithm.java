import java.util.ArrayList;
import java.util.Scanner;

public class wierdalgorithm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Long> arr=new ArrayList<>();

        long n =sc.nextInt();
        arr.add(n);
        while(n!=1){
            if(n%2==0){
                n=n/2;
                arr.add(n);
            }
            else{
                n=n*3+1;
                arr.add(n);
            }
        }
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}
