class Solution {
    public int numTeams(int[] rating) {
        int size = rating.length;
        boolean isBigger = false, isSmaller = false;
        int result = 0;
        
        for(int i = 0; i < size - 2; i++) {
            for(int j = i + 1; j < size - 1; j++) {
                
                if(rating[i] < rating[j]) isBigger = true;
                else if(rating[i] > rating[j]) isSmaller = true;
                
                for(int k = j + 1; k < size; k++) {
                    if(isBigger && rating[j] < rating[k]) result++;
                    if(isSmaller && rating[j] > rating[k]) result++;
                }
                isBigger = false;
                isSmaller = false;
            }
        }
        
        return result;
    }
}