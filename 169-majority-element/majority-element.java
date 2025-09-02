class Solution {
    public int majorityElement(int[] nums) {
        int vote =1;
        int cand = nums[0];
        for(int i=1;i<nums.length;i++){
            if(vote ==0){
                vote++;
                cand = nums[i];
            }
            else if(nums[i] != cand) vote--;
            else vote++;
        }
        return cand;
    }
}