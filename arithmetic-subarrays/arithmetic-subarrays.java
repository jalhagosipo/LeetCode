class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int size = l.length;
        List<Boolean> result = new ArrayList<>();
        for(int i = 0; i< size; i++) {
            int[] sub = Arrays.copyOfRange(nums, l[i], r[i] + 1);
            Arrays.sort(sub);
            int diff = sub[0] - sub[1];
            boolean answer = true;
            for(int j = 1; j<sub.length - 1; j++) {
                if(diff != sub[j] - sub[j+1]) {
                    answer = false;
                    break;
                }
            }
            result.add(answer);
        }
        return result;
    }
}