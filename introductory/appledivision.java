import java.util.*;

public class appledivision {
    public static long filling(int index, long bag1, long bag2, long arr[]) {
        if(index==0){
            long temp1=bag1+arr[0];
            long temp2=bag2+arr[0];
            long ans=Math.min(Math.abs(temp1-bag2), Math.abs(temp2-bag1));
            return ans;
        }
        long temp1=filling(index-1, bag1+arr[index], bag2, arr);
        long temp2=filling(index-1, bag1, bag2+arr[index], arr);
        return Math.min(temp1, temp2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            long ele = sc.nextLong(); // Changed from nextInt() to nextLong()
            arr[i] = ele;
            
        }
        
        System.out.println(filling(n - 1, 0, 0, arr));

    }
}
