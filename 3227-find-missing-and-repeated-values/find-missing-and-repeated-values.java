class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] nums = new int[(grid[0].length*grid[0].length)+1];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
            nums[grid[i][j]]++;
            }
        }
        int res[] = new int[2];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==2) res[0] = i;
            if(nums[i]==0) res[1] = i;
        }
        return res;
    }
}