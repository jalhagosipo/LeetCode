class Solution {
    class Point {
      int x;
      int y;
      Point(int x, int y) {
          this.x = x;
          this.y = y;
      }
    }
    
    public int[][] kClosest(int[][] points, int k) {
        Map<Point, Integer> map = new HashMap<>();
        int[][] ans = new int[k][2];
        for(int i=0;i<points.length;i++) {
            int[] point = points[i];
            int x = point[0];
            int y = point[1];
            map.put(new Point(x, y), x * x + y * y);
        }

        List<Point> keySetList = new ArrayList<>(map.keySet());
        Collections.sort(keySetList, (o1, o2) -> (map.get(o1).compareTo(map.get(o2))));

        for(int i=0;i<k;i++) {
            Point point = keySetList.get(i);
            ans[i][0] = point.x;
            ans[i][1] = point.y;
        }
        
        return ans;
    }
}