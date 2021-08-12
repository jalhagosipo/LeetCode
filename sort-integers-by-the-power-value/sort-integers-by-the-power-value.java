class Solution {
    class Kth implements Comparable {
        int key;
        int val;
        Kth(int key, int val) {
            this.key = key;
            this.val = val;
        }

        @Override
        public int compareTo(Object compareItem) {
            int comparedVal=((Kth)compareItem).val;
            return this.val-comparedVal;
        }
    }
    // 1387
    public int getKth(int lo, int hi, int k) {
        List<Kth> list = new ArrayList<>();

        for(int i = lo; i<=hi; i++) {
            int cnt = getKthCount(i, 0);
            Kth item = new Kth(i, cnt);
            list.add(item);
        }

        Collections.sort(list);

        return list.get(k - 1).key;
    }

    int getKthCount(int val, int cnt) {
        if(val == 1) return cnt;

        if(val%2 == 0) return getKthCount(val/2, ++cnt);
        else return getKthCount(3 * val + 1, ++cnt);
    }
}