# 328. Odd Even Linked List
### Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list. 
### The first node is considered odd, and the second node is even, and so on. 
### Note that the relative order inside both the even and odd groups should remain as it was in the input. 
### You must solve the problem in O(1) extra space complexity and O(n) time complexity. 



## Example 1:  


#### Input: head = [1,2,3,4,5]  
#### Output: [1,3,5,2,4] 
## Example 2:  

#### Input: root = head = [2,1,3,5,6,4,7]
#### Output: [2,3,6,7,1,5,4]  
 



# Note
### 前兩個 Node 分別為 odd 、 even 的第一個用螺旋方式修改指標 (odd 的下一個為 even 尾巴的下一個，even 的下一個為 odd 尾巴的下一個)
### 共兩個case(共奇數個Nodes、共偶數個Nodes)
