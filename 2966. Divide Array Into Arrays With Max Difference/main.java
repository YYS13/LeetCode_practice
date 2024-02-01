class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int[][] ans = new int[nums.length / 3][3];
        int[][] empty = new int[0][0];
        if(nums.length == 0){
            return empty;
        }else{
            Arrays.sort(nums);
            int round = 0;
            for(int idx=0; idx<nums.length; idx+=3){
                if(nums[idx+2] - nums[idx] > k){
                    return empty;
                }else{
                    ans[round][0] = nums[idx];
                    ans[round][1] = nums[idx+1];
                    ans[round][2] = nums[idx+2];
                    round ++;
                }
            }
        }
        return ans;
    }
}