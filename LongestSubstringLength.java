import java.util.*;
public class LongestSubstringLength {
    public static void main(String[] args) {
        String s = "abcdefghijkl";
        System.out.println(longestSubstrLength(s));
    }

    public static int longestSubstrLength(String s){
        int start = 0;
        int end = 0;
        int res = 0;

        HashSet<Character> set = new HashSet<>();
        while(end < s.length()){
            char ch = s.charAt(end);
            if(!set.contains(ch)){
                set.add(ch);
                end++;
                res = Math.max(res,set.size());
            }else{
                set.remove(ch);
                start++;
            }
        }
        return res;
    }
}
