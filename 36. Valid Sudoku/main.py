class Solution:
    def checkSubBox(self, board):
        col = 0
        row = 0
        while True:
            check_table = [False] * 10
            for i in range(row, row + 3):
                for j in range(col, col + 3):
                    if board[i][j] != ".":
                        if check_table[int(board[i][j])]:
                            return False
                        else:
                            check_table[int(board[i][j])] = True
            row +=3
            if row == 9 and col == 6:
                break
            if row == 9:
                col += 3
                row = 0
        return True
    def checkRow(self, board):
        for row in board:
            check_table = [False] * 10
            for item in row:
                if item != ".":
                    if check_table[int(item)]:
                            return False
                    else:
                        check_table[int(item)] = True
        return True
    def checkCol(self, board):
        for i in range(9):
            check_table = [False] * 10
            for j in range(9):
                if board[j][i] != ".":
                    if check_table[int(board[j][i])]:
                        return False
                    else:
                        check_table[int(board[j][i])] = True
        return True
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        if self.checkSubBox(board) and self.checkRow(board) and self.checkCol(board):
            return True
        else:
            return False