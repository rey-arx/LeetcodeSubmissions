class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] nums1 = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            nums1[nums[i]-1] = 1;
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums1[i]!=1) result.add(i+1);
        }
        return result;
    }
}