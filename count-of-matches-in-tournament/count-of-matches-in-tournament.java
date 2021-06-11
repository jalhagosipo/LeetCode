class Solution {
    private int numberOfMatchesResult = 0;
    public int numberOfMatches(int n) {
        if(n==1) return numberOfMatchesResult;
        if(n % 2 == 0) {
            numberOfMatchesResult += n/2;
            return numberOfMatches(n/2);
        } else {
            numberOfMatchesResult += (n-1)/2;
            return numberOfMatches((n-1)/2 + 1);
        }
    }
}