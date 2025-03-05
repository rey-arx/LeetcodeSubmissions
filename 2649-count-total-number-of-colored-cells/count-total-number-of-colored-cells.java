class Solution {
    public long coloredCells(int n) {
        long n1 = 1;
        long m=1;
        for(int i=1;i<n;i++) {
            n1+= m*4;
            m++;
        }
        return n1;
    }
}