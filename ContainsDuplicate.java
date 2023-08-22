import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,2,4};
        boolean ans = containsDuplicate(arr);
        System.out.println(ans);
    }
    public static boolean containsDuplicate(int[] nums){
        Arrays.sort(nums);

        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
