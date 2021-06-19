class Solution {
   public String getHappyString(int n, int k) {

        Stack<Character> st = new Stack();
        List<String> result = new ArrayList<>();
        String tmp = "";
        getResultHappyString('\0', tmp, result, n);
        return result.size() >= k ? result.get(k-1) : "";
    }

    private void getResultHappyString(Character c, String tmp, List<String> result, int n) {
        if(tmp.length() == n) {
            result.add(tmp);
        } else {
            if(c != 'a') getResultHappyString('a', tmp + 'a', result, n);
            if(c != 'b') getResultHappyString('b', tmp + 'b', result, n);
            if(c != 'c') getResultHappyString('c', tmp + 'c', result, n);
        }
    }
}