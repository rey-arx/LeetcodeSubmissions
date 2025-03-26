class Solution {
    public int removeDuplicates(int[] nums) {
        int temp = nums[0];
        int i=1;
        int j=1;
        while(j<nums.length){
            if(nums[j]==temp){
                j++;
            }
            else{
                nums[i] = nums[j];
                temp=nums[j];
                i++;
                j++;
            }
        }
        return i;
    }
}