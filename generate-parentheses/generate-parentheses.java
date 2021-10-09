class Solution {
   public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        makeParentehsis(0, 0, result, "", n);
        return result;
    }
    
    private void makeParentehsis(int open, int close, List<String> res, String str, int n) {
        if(str.length() == 2 * n) {
            res.add(str);
            return;
        }
        if(open <= close) {
            if(open + 1 <= n) makeParentehsis(open + 1, close, res, new String(str + "("), n);
        } else {
            if(open + 1 <= n) makeParentehsis(open + 1, close, res, new String(str + "("), n);
            if(close + 1 <= n) makeParentehsis(open, close + 1, res, new String(str + ")"), n);
        }
    }
}