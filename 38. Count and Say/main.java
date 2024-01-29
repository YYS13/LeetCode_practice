class Solution {
    public String read(String str){
        int strLen = str.length();
        String ans = "";
        int count = 1;
        for(int i=1; i<strLen; i++){
            if(str.charAt(i) == str.charAt(i-1)){
                count ++;
            }else{
                String temp = String.valueOf(count) + str.charAt(i-1);
                ans = ans + temp;
                count = 1;
            }
        }
        String temp = String.valueOf(count) + str.charAt(strLen-1);
        ans = ans + temp;
        return ans;
    }
    public String countAndSay(int n) {
        if(n == 1){
            return "1";
        }else{
            String[] dp_table = new String[n];
            dp_table[0] = "1";
            dp_table[1] = "11";
            for(int i=2; i<n; i++){
                dp_table[i] = read(dp_table[i-1]);
            }
            return dp_table[n-1];
        }
    }
}