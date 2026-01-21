class Solution {
    public void moveZeroes(int[] nums) {
        Queue<Integer> queue = new LinkedList<>();
        int siz = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                queue.offer(nums[i]);
                siz++;
            }
        }
        Arrays.fill(nums,0);
        Iterator itr = queue.iterator();
        int j=0;
        while(itr.hasNext()){
            nums[j++] = queue.poll(); 
        }
    }
}