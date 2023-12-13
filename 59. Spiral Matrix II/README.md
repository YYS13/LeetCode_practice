# 59. Spiral Matrix II
### Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.

 

## Example 1:  

#### Input: n = 3  
#### Output: [[1,2,3],[8,9,4],[7,6,5]] 
## Example 2:  

#### Input: n = 1
#### Output: [[1]]  
 

# Note
### 設定兩個狀態，控制row、column移動方向，每次先往檢查下一格是否有被填值，若沒有才往前移動並填值，若有的話則控制狀態(reverse、col_major)使方向變換，依順時針螺旋方式填直到所有數字都被填入為止