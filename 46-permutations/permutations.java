class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> arr= new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        perm(res,arr,freq,nums,nums.length);
        return res;
    }
    public void perm(List<List<Integer>> res,ArrayList<Integer> arr,boolean[] freq,int[] nums, int n){
        if(arr.size()==n){
            res.add(new ArrayList<>(arr));
            return;
        }
        for(int i=0;i<n;i++){
            if(!freq[i]){
            arr.add(nums[i]);
            freq[i]=!freq[i];
            perm(res,arr,freq,nums,n);
            arr.removeLast();
            freq[i]=!freq[i];
            }
        }
    }
}