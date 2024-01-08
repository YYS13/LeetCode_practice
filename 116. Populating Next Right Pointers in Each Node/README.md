# 116. Populating Next Right Pointers in Each Node
### You are given a perfect binary tree where all leaves are on the same level, and every parent has two children. The binary tree has the following definition:

### struct Node { 
### int val; 
### Node *left; 
### Node *right; 
### Node *next; 
### } 

 

## Example 1:  

![image](https://raw.githubusercontent.com/YYS13/LeetCode_practice/e4c32d725e837da358161e7ab10bab5a5f7dbcb4/116.%20Populating%20Next%20Right%20Pointers%20in%20Each%20Node/%E8%9E%A2%E5%B9%95%E6%93%B7%E5%8F%96%E7%95%AB%E9%9D%A2%202024-01-08%20110457.png)

#### Input: root = [1,2,3,4,5,6,7]  
#### Output: [1,#,2,3,#,4,5,6,7,#] 
## Example 2:  

#### Input: root = []
#### Output: []  
 

#### Follow up:  The recursive approach is fine. You may assume implicit stack space does not count as extra space for this problem.


# Note
### 先將每個點的左右點連起來(如果擁有的話)，再檢查該點的 right、next 是否有點，有的話將 right 和 next.left 連起來
### 針對每個點做遞迴檢查即可
