# 116. Populating Next Right Pointers in Each Node
### You are given a perfect binary tree where all leaves are on the same level, and every parent has two children. The binary tree has the following definition:

### struct Node { 
### int val; 
### Node *left; 
### Node *right; 
### Node *next; 
### } 

 

## Example 1:  

#### Input: root = [1,2,3,4,5,6,7]  
#### Output: [1,#,2,3,#,4,5,6,7,#] 
## Example 2:  

#### Input: root = []
#### Output: []  
 

#### Follow up:  The recursive approach is fine. You may assume implicit stack space does not count as extra space for this problem.


# Note
### 先將每個點的左右點連起來(如果擁有的話)，再檢查該點的 right、next 是否有點，有的話將 right 和 next.left 連起來
### 針對每個點做遞迴檢查即可