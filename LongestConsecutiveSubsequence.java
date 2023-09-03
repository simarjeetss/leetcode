import java.util.HashSet;

public class LongestConsecutiveSubsequence {
    public static int longestConsecutive(int[] nums){
        int n = nums.length;
        if(n == 0){
            return 0;
        }
        int res = 1;
        HashSet<Integer> s = new HashSet<>();
        for (int num : nums) {    //adding all the values into the set
            s.add(num);
        }

        for(int i=0;i<n;i++){
            int temp = 1;
            if(!s.contains(nums[i] - 1)){   //check if the previous element exists in the array
                while(s.contains(nums[i] + 1)){ //check is the next element exists in the array
                    temp++;
                    nums[i]++;
                }
                res = Math.max(res,temp);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {100,4,200,1,2,3,5};
        System.out.println(longestConsecutive(arr));
    }
}
