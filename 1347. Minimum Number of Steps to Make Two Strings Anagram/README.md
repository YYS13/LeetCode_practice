# 1347. Minimum Number of Steps to Make Two Strings Anagram
### You are given two strings of the same length s and t. In one step you can choose any character of t and replace it with another character. 

### Return the minimum number of steps to make t an anagram of s. 

### An Anagram of a string is a string that contains the same characters with a different (or the same) ordering.

 

## Example 1:  

#### Input: s = "bab", t = "aba"  
#### Output: 1 
#### Explanation: Replace the first 'a' in t with b, t = "bba" which is anagram of s. 

## Example 2:  

#### Input: s = "leetcode", t = "practice"
#### Output: 5
#### Explanation: Replace 'p', 'r', 'a', 'i' and 'c' from t with proper characters to make t anagram of s.   

# Note
### 先計算每個字出現次數
### 檢查t的每個字若該字沒在s中出現過則要替換所以 min_count + 1 ，反之則和s中出現次數抵銷，若字數超出s的出現次數則 min_count + 1(要轉成其他字)