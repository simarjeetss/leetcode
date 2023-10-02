
import java.util.*;
public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        String res = "";

        HashMap<Character, Integer> m1 = new HashMap<>();
        HashMap<Character, Integer> m2 = new HashMap<>();

        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            m2.put(ch, m2.getOrDefault(ch,0)+1);
        }

        int match=0;
        int want = t.length();

        int i=-1, j=-1;
        while(true){

            boolean flag1 = false;
            boolean flag2 = false;

            //add elements to the window
            while(i < s.length() - 1 && match < want){
                i++;
                char ch = s.charAt(i);
                m1.put(ch, m1.getOrDefault(ch,0) + 1);

                if(m1.getOrDefault(ch,0) <= m2.getOrDefault(ch,0)){
                    match++;
                }
                flag1 = true;
            }

            //remove elements from the window
            while(j < i && match == want){
                String sb = s.substring(j+1, i+1);
                if(sb.length() < res.length() || res.length() == 0){
                    res = sb;
                }
                j++;
                char ch = s.charAt(j);
                if(m1.get(ch) == 1){
                    m1.remove(ch);
                }else{
                    m1.put(ch, m1.get(ch) - 1);
                }
                if(m1.getOrDefault(ch,0) < m2.getOrDefault(ch,0)){
                    match--;
                }
                flag2 = true;
            }
            if(!flag1){
                break;
            }
        }
        return res;
    }
}
