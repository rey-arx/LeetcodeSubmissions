class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg=0;
        double sum=0;
        int i =0;
        for(;i<k;i++){
            sum+=nums[i];
        }
        avg = sum/k;
        System.out.println(i);
        for(;i<nums.length;i++){
            sum+=nums[i];
            sum-=nums[i-k];
            if((sum/k) > avg) avg = sum/k;
        }

         return avg;
    }
}