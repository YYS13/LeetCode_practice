# 645. Set Mismatch 
### You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number. 

### You are given an integer array nums representing the data status of this set after the error. 

### Find the number that occurs twice and the number that is missing and return them in the form of an array. 

## Example 1: 
 
#### Input: nums = [1,2,2,4] 
#### Output: [2,3] 
 
## Example 2:  
#### Input: nums = [1,1] 
#### Output: [1,2] 

# Note 
### 建一個 check Array 檢查該數字是否有出現過，有的話設為1，若存取某格內容為1時，代表該數重複出現，即設為 ans[0] 
### 找出 check Array 中值仍為0的數設為ans[1]即可 

