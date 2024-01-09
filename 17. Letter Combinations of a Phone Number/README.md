# 17. Letter Combinations of a Phone Number
### Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

 

## Example 1:  

#### Input: digits = "23"   
#### Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"] 
## Example 2:  

#### Input: digits = ""
#### Output: []  
## Example 3: 

#### Input: digits = "2" 
#### Output: ["a","b","c"]

# Note
### 答案會是第一個 digit 的 letters 個別加上後面那串 digits 所產生的結果
### 使用遞迴的方式