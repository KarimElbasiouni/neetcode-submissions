class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        
        row_hash = defaultdict(set)
        col_hash = defaultdict(set)
        box_hash = defaultdict(set)

        for i in range (9):
            for j in range (9):
                if board[i][j] != ".":
                    if (board[i][j] not in row_hash[i] 
                        and board[i][j] not in box_hash[(i//3,j//3)] 
                        and board[i][j] not in col_hash[j]):

                        row_hash[i].add(board[i][j])
                        box_hash[(i//3,j//3)].add(board[i][j])
                        col_hash[j].add(board[i][j])
                    else:
                        return False      
        
        return True