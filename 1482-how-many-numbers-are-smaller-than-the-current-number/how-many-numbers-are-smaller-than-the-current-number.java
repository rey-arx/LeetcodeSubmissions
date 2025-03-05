class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int nums1[] = new int[101];
        for(int i=0;i<nums.length;i++){
            nums1[nums[i]]++;
        }
        for(int i=1;i<=nums1.length-1;i++){
            nums1[i]+=nums1[i-1];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) continue;
            nums[i]= nums1[nums[i]-1];
        }
        return nums;
    }
}