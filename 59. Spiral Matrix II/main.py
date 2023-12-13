class Solution:
    def exist_value(self, matrix, row, col):
        if matrix[row][col] != 0:
            return True
        else:
            return False
    def generateMatrix(self, n: int) -> List[List[int]]:
        matrix = []
        for i in range(n):
            matrix.append([])
            for j in range(n):
                matrix[i].append(0)
        row, col = 0, 0
        reverse = False
        row_major = True
        value = 2
        matrix[0][0] = 1
        while(value != n*n + 1):
            if reverse == False:
                if row_major == True:
                    while (col+1 != n) and (not self.exist_value(matrix, row, col+1)):
                        col += 1
                        matrix[row][col] = value
                        value += 1
                    row_major = False
                else:
                    while (row+1 != n) and (not self.exist_value(matrix, row+1, col)):
                        row += 1
                        matrix[row][col] = value
                        value += 1
                    reverse = True
                    row_major = True
            else:
                if row_major == True:
                    while (col-1 != -1) and (not self.exist_value(matrix, row, col-1)):
                        col -= 1
                        matrix[row][col] = value
                        value += 1
                    row_major = False
                else:
                    while (row-1 != -1) and (not self.exist_value(matrix, row-1, col)):
                        row -= 1
                        matrix[row][col] = value
                        value += 1
                    reverse = False
                    row_major = True
        return matrix