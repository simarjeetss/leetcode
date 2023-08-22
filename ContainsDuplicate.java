import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,4};
        boolean ans = containsDuplicate(arr);
        System.out.println(ans);
    }
    public static boolean containsDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i : nums){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }
        return false;
    }
}
