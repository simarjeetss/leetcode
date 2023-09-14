public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        //
    }
    public static int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int[] res = new int[n];
        int prod = 1;

        int[] left = new int[n];
        int[] right = new int[n];

        //filling the left array
        for(int i=0;i<n;i++){
            left[i] = prod;
            prod *= nums[i];
        }
        //filling the right array
        prod = 1;
        for(int i=n-1; i>=0;i--){
            right[i] = prod;
            prod *= nums[i];
        }

        for(int i=0;i<n;i++){
            res[i] = left[i] * right[i];
        }

        return res;
    }
}
