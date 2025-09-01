class Solution {
    public void sortColors(int[] nums) {
        int temp[] = new int[3];
        for(int i=0;i<nums.length;i++){
            temp[nums[i]] = temp[nums[i]]+1;
        }
        // System.out.println(Arrays.toString(temp));
        int i = 0;
        for(int j=0;j<temp[0];j++){
        nums[i]=0;
        i++;
        } 
        for(int j=0;j<temp[1];j++){
        nums[i]=1;
        i++;
        } 
        for(int j=0;j<temp[2];j++){
        nums[i]=2;
        i++;
        } 
    }
}