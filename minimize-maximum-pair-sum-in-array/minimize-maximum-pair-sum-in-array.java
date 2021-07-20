class Solution {
   public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 1;
        for(int i =0; i < nums.length / 2; i++) {
            int sum = nums[i] + nums[nums.length - 1 - i];
            if(result < sum) {
                result = sum;
            }
        }
        return result;
    }
}