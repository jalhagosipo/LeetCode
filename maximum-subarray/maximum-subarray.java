class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0, max = -10000;
        for(int num : nums) {
            sum += num;
            if(sum < 0) {
                max = max < sum ? sum : max;
                sum = 0;
            } else {
                max = sum > max ? sum : max;
            }
        }
        return max;
    }
}