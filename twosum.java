import java.util.HashMap;

public class twosum{
    public static int[] twosumsol(int[] nums, int target){
        HashMap<Integer,Integer> map =  new HashMap<>();
        int[] ans = new int[2];
        for(int i=0;i<nums.length;i++){
            int temp = target - nums[i];
            if(map.containsKey(temp)){
                return new int[]{map.get(temp), nums[i]};
            }
            else{
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        
    }
}