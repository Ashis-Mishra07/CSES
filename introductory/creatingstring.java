import java.util.*;

public class creatingstring {
    public static void create(String str,String temp,HashSet<String> ans){
        if(str.length()==0){
            ans.add(temp);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String newStr=str.substring(0, i)+str.substring(i+1);
            
            create(newStr, temp+ch,ans);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        HashSet<String> ans=new HashSet<>();
        create(str,"",ans);
        System.out.println(ans.size());
        ArrayList<String> finalAns=new ArrayList<>();
        for(String s:ans){
            finalAns.add(s);
        }
        Collections.sort(finalAns);
        for(int i=0;i<finalAns.size();i++){
            System.out.println(finalAns.get(i));
        }
    }
}
