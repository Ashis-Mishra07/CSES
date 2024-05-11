import java.util.ArrayList;
import java.util.Scanner;

public class towerofhanoi {
    public static void towerOfHanoi(int n , int src,int helper,int dest, ArrayList<Integer> ans){
        if(n==0){
            return;
        }
        towerOfHanoi(n-1, src, dest, helper,ans);
        ans.add(src);
        ans.add(dest);
        towerOfHanoi(n-1, helper, src, dest,ans);
    }
    public static void main(String[] args) {
        ArrayList<Integer> ans=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        towerOfHanoi(n,1,2,3,ans);
        System.out.println(ans.size()/2);
        for(int i=0;i<ans.size();i=i+2){
            System.out.print(ans.get(i)+" ");
            System.out.println(ans.get(i+1));
        }
    }
}
