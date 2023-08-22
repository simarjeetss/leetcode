public class TwoSumII {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] res = twoSum(arr, target);
        for(int i:res){
            System.out.print(i + " ");
        }
    }
    public static int[] twoSum(int[] numbers, int target){
        int ptr1 = 0;
        int ptr2 = numbers.length - 1;

        while(ptr1 <= ptr2){
            if(numbers[ptr1] + numbers[ptr2] > target ){
                ptr2--;
            }
            else if(numbers[ptr1] + numbers[ptr2] < target){
                ptr1++;
            }
            else{
                return new int[]{ptr1 +1, ptr2 +1};
            }
        }
        return new int[]{ptr1 +1, ptr2 +1};
    }
}
