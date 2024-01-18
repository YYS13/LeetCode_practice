class Solution {
    public int climbStairs(int n) {
        if(n <= 2){
            return n;
        }else{
            int[] ways = new int[n+1];
            ways[0] = 0;
            ways[1] = 1;
            ways[2] = 2;
            for(int i=3; i<n+1; i++){
                ways[i] = ways[i-1] + ways[i-2];
            }
            return ways[n];
        }
    }
}