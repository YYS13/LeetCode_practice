class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];
        for(char c: tasks){
            count[c-'A'] ++;
        }
        Arrays.sort(count);
        int interNum = count[25] - 1 ;
        int idle = interNum * n;
        for(int i = 24; i >= 0; i--){
            idle -= Math.min(interNum, count[i]);
        }

        return idle < 0 ? tasks.length : tasks.length + idle;
    }    
}