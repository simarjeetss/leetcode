import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(str));
    }
    public static List<List<String>> groupAnagrams(String[] strs){
        HashMap<String, ArrayList<String>> m = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String word = new String(arr);

            if(!m.containsKey(word)){
                m.put(word, new ArrayList<>());
            }
            m.get(word).add(strs[i]);
        }
        return new ArrayList<>(m.values());
    }
}
