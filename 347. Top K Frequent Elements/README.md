# 347. Top K Frequent Elements
### Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

 

## Example 1:  

#### Input: nums = [1,1,1,2,2,3], k = 2  
#### Output: [1,2] 
## Example 2:  

#### Input: nums = [1], k = 1
#### Output: [1]  
 

#### Follow up:  Your algorithm's time complexity must be better than O(n log n), where n is the array's size.


# Note  
### Step1 計算各element出現次數=>O(n)  
### Step2 抓出最大出現次數=>至多O(n)  
### Step3 創建一個list，其中元素也為list，出現次數相同的num會被放在同一個list中，並且每個list代表出現次數由小排到大=>至多O(n)  
### Step4 掃過整個table將num放在其出現次數對應的list中=>至多O(n)  
### Step5 將Step3的list，由左到右依序將num放入answer list中，雖然迴圈看似是雙層但事實上跑k次就會停=>O(k)