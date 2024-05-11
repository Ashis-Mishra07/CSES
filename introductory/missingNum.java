
import java.util.*;

public class missingNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n-1];
        long sum=0;
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        long actualSum=(long)n*(n+1)/2;

        System.out.println(actualSum-sum);
    }
}
