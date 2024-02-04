class Solution {
    public int minimumTimeToInitialState(String word, int k) {
        int start = k;
        String  compareWord = word;
        int ans = 1;
        while(start < word.length()){
            int compareIdx = 0;
            boolean flag = true;
            for(int idx=start; idx<word.length(); idx++){
                if(word.charAt(idx) != compareWord.charAt(compareIdx)){
                    start += k;
                    ans ++;
                    flag = false;
                    break;
                }
                compareIdx ++;
            }
            if(flag){
                return ans;
            }
        }
        return ans;
    }
}