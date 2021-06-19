class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n == 1) return 1;
        HashMap<Integer, List<Integer>> hm = new HashMap<>();
        boolean[] notJudge = new boolean[n+1];
        int result = -1;
        for(int[] t: trust) {
            int a = t[0], b= t[1];
            notJudge[a] = true;
            if(hm.get(b) == null) {
                hm.put(b, new ArrayList<>(Arrays.asList(a)));
            } else {
                List list = hm.get(b);
                list.add(a);
                hm.put(b, list);
            }
        }

        for(int key: hm.keySet()) {
            if(hm.get(key).size() == n - 1 && !notJudge[key]) {
                result = key;
                break;
            }
        }
        return  result;
    }
}