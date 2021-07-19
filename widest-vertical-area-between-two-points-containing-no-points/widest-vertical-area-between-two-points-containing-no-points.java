class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        // 2차원 배열의 0번 인덱스 값을 긱준으로 내림차순
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0] - o1[0];
            }
        });

        int result = 0;
        int prev = points[0][0];
        for(int i=1;i<points.length;i++) {
            int[] data = points[i];
            result = (prev - data[0] > result) ? prev - data[0] : result;
            prev = data[0];
        }

        return result;
    }
}