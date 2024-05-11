import java.util.ArrayList;
import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        long oddCount = 0;
        ArrayList<Long> arr=new ArrayList<>();
        for(int i=0;i<t;i++){
            long ele=sc.nextLong();
            arr.add(ele);
        }
        
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)%2!=0){
                oddCount++;
            }
        }
        if(oddCount%2==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
