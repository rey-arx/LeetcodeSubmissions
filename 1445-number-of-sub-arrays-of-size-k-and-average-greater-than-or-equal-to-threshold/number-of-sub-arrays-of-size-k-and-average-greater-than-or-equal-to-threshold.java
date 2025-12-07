class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int result =  0;
        double sum =0;
        int i=0;
        for(;i<k;i++){
            sum+=arr[i];
        }
        if((sum/k) >= threshold) result++;
        for(;i<arr.length;i++){
            sum+=arr[i]-arr[i-k];
            if((sum/k) >= threshold) result++;
        }
        return result;
    }
}