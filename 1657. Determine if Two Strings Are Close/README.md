# 1657. Determine if Two Strings Are Close  
### Two strings are considered close if you can attain one from the other using the following operations: 

### Operation 1: Swap any two existing characters. 
### For example, abcde -> aecdb 
### Operation 2: Transform every occurrence of one existing character into another existing character, and do the same with the other character. 
### For example, aacabb -> bbcbaa (all a's turn into b's, and all b's turn into a's) 
### You can use the operations on either string as many times as necessary. 

### Given two strings, word1 and word2, return true if word1 and word2 are close, and false otherwise. 

 

## Example 1:  

#### word1 = "abc", word2 = "bca"  
#### Output: true 
#### Explanation: You can attain word2 from word1 in 2 operations. 
####              Apply Operation 1: "abc" -> "acb" 
####              Apply Operation 1: "acb" -> "bca" 

## Example 2:  

#### Input: word1 = "a", word2 = "aa" 
#### Output: false 
#### Explanation: It is impossible to attain word2 from word1, or vice versa, in any number of operations. 

# Note
### 字不一樣長、出現的字不一樣一定為False
### 計算各字出現次數，若出現次數都一樣則可以透過字的更改與 swap 完成兩個 word 一模一樣