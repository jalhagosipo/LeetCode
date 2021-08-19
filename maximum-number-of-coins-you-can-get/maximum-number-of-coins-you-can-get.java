class Solution {
   public int maxCoins(int[] piles) {
        int result = 0;
        Integer boxedPiles[] = Arrays.stream(piles).boxed().toArray(Integer[]::new);
        Arrays.sort(boxedPiles, Collections.reverseOrder());
        int sortedPiles[] = Arrays.stream(boxedPiles).mapToInt(Integer::intValue).toArray();
        int[] newPiles = Arrays.copyOfRange(sortedPiles, 0, (sortedPiles.length * 2) / 3);
        for(int i = 1; i < newPiles.length; i+=2) {
            result += newPiles[i];
        }
        return result;
    }
}