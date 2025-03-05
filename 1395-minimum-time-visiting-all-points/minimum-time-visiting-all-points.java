class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
       //try to maximize diagonal movement
       int res = 0;
        for(int i=0;i<points.length-1;i++){
            int a = Math.abs(points[i+1][0] - points[i][0]);
            int b = Math.abs(points[i+1][1] - points[i][1]);
            res += (Math.min(a,b) + (Math.max(a,b) - Math.min(a,b)));
        }
        return res;
    }
}