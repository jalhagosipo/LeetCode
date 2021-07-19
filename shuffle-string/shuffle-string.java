class Solution {
   // 1528
    public String restoreString(String s, int[] indices) {
        char[] tmpArr = new char[indices.length];
        char[] cary = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for(int i=0;i< indices.length;i++) {
            tmpArr[indices[i]] = cary[i];
        }
        for(char c : tmpArr) {
            sb.append(c);
        }
        return sb.toString();
    }
}