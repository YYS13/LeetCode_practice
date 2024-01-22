class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] check = new int[nums.length];
        int[] ans = new int[2];
        for(int idx=0; idx<nums.length; idx++){
            if(check[nums[idx] - 1] == 1){
                ans[0] = nums[idx];
            }else{
                check[nums[idx] - 1] = 1;
            }   
        }
        for(int idx=0; idx<nums.length; idx++){
            if(check[idx] == 0){
                ans[1] = idx + 1;
                break; 
            }
        }
        return ans;
    }
}