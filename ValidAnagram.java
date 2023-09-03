import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram1"));
    }
    public static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        HashMap<Character,Integer> m1 = new HashMap<>();
        HashMap<Character,Integer> m2 = new HashMap<>();

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        for(int i=0;i<s1.length();i++){
            m1.put(arr1[i], m1.getOrDefault(arr1[i],0) + 1);
            m2.put(arr2[i], m2.getOrDefault(arr2[i],0) + 1);
        }
        return m1.equals(m2);
    }
}
