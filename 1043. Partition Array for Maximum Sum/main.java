class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(i < k){
                if(arr[i] > max){
                    max = arr[i];
                }
                dp[i] = max * (i+1);
            }else{
                max = arr[i];
                int maxSum = max + dp[i-1];
                for(int n=1; n<k; n++){
                    if(arr[i-n] > max){
                        max = arr[i -n];
                    }
                    int temp = max * (n+1) + dp[i-n-1];
                    if(temp > maxSum){
                        maxSum = temp;
                    }
                }
                dp[i] = maxSum;
            }
        }
        return dp[arr.length -1];
    }
}