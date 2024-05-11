import java.util.*;

public class pallindromereorder {
    public static void addTime(StringBuilder ans, char ch,int times){
        for(int i=0;i<times;i++){
            ans.append(ch);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        HashMap<Character,Integer> map=new HashMap<>();
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            set.add(ch);
        }
        int oddCount=0;
        for(Character ch:map.keySet()){
            if(map.get(ch)%2==1){
                oddCount++;
            }
        }
        if(oddCount>1){
            System.out.println("NO SOLUTION");
        }
        else{
            StringBuilder front=new StringBuilder("");
            StringBuilder back= new StringBuilder("");
            StringBuilder single= new StringBuilder("");

            for(Character ch:set){
                if(map.get(ch)%2==1){
                    addTime(single, ch, map.get(ch));
                }
                else{
                    addTime(front,ch,map.get(ch)/2);
                    addTime(back,ch,map.get(ch)/2);
                }
            }
            StringBuilder ans=new StringBuilder();
            back.reverse();
            ans.append(front.toString());
            ans.append(single.toString());
            ans.append(back.toString());


            System.out.println(ans.toString());

        }
    }
}