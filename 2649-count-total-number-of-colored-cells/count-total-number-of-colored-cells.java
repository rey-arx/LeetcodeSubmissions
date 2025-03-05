class Solution {
    public long coloredCells(int n) {
        long n1 = rec(n);
        // long m=1;
        // for(int i=1;i<n;i++) {
        //     n1+= m*4;
        //     m++;
        // }
        return n1;
    }
    public long rec(int n){
        if(n ==1) return 1;
        return rec(n-1) + (4* (n-1));
    }
}