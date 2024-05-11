import java.util.ArrayList;
import java.util.Scanner;

public class kthlargestdivisor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int k=sc.nextInt();

        int min=Math.min(a, b);
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=1;i<=min;i++){
            if(a%i==0 && b%i==0){
                arr.add(i);
            }
        }
        // System.out.println(arr);
        System.out.println(arr.get(arr.size()-k));
    }
}
