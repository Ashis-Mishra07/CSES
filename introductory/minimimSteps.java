
import java.util.*;
public class minimimSteps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        long steps=0;
        for(int i=1;i<n;i++){
            if(arr[i]>=arr[i-1]){
                continue;
            }
            else{
                steps+=arr[i-1]-arr[i];
                arr[i] = arr[i - 1];
            }
        }
        System.out.println(steps);
    }
}
