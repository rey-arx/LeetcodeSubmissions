class Solution {
    public int maxProfit(int[] arr) {
        int p=0;
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if((arr[i] - min)>p) p = (arr[i] - min);
            if(arr[i]<min) min = arr[i];
        }
        return p;
    }
}