import java.util.ArrayList;
import java.util.Scanner;

public class graycode {
    public static ArrayList<String> solution(int n){
        if(n==1){
            ArrayList<String> base=new ArrayList<>();
            base.add("0");
            base.add("1");
            return base;
        }

        ArrayList <String> prev=solution(n-1);
        ArrayList<String> now=new ArrayList<>();

        for(int i=0;i<prev.size();i++){
            String str=prev.get(i);
            now.add("0"+str);
        }
        for (int i = prev.size()-1; i >=0; i--) {
            String str = prev.get(i);
            now.add("1" + str);
        }
        return now;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        ArrayList<String> ans=new ArrayList<>();
        ans=solution(n);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
    }
}
