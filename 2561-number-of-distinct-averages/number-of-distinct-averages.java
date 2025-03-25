class Solution {
    public int distinctAverages(int[] nums) {
        HashSet<Double> hash = new HashSet<>();
        int i=0;
        int j=nums.length-1;
        Arrays.sort(nums);
        while(i<j){
            Double d = (double)(nums[i]+nums[j])/2;
            hash.add(d);
            i++;
            j--;
        }
        return hash.size();
    }
}