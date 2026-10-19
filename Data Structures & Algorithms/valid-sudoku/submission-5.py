class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        
        row_hash = defaultdict(set)
        col_hash = defaultdict(set)
        box_hash = defaultdict(set)

        [[".",".","4",".",".",".","6","3","."]
        ,[".",".",".",".",".",".",".",".","."]
        ,["5",".",".",".",".",".",".","9","."]
        ,[".",".",".","5","6",".",".",".","."]
        ,["4",".","3",".",".",".",".",".","1"]
        ,[".",".",".","7",".",".",".",".","."]
        ,[".",".",".","5",".",".",".",".","."]
        ,[".",".",".",".",".",".",".",".","."]
        ,[".",".",".",".",".",".",".",".","."]]
        for i in range (9):
            for j in range (9):
                if board[i][j] != ".":
                    if (board[i][j] not in row_hash[i] and board[i][j] not in box_hash[(i//3,j//3)] and board[i][j] not in col_hash[j]):
                        print("ROW, BOX")
                        row_hash[i].add(board[i][j])
                        box_hash[(i//3,j//3)].add(board[i][j])
                        col_hash[j].add(board[i][j])
                    else:
                        return False

                # if (board[i][j] not in box_hash[(i//3,j//3)]):
                #     print("BOX")
                #     box_hash[(i//3,j//3)].add(board[i][j])
                # else:
                #     return False
                # if board[i][j] != ".":
                #     if ( board[i][j] not in col_hash[j]):
                #         print("COL")
                #         col_hash[j].add(board[i][j])
                #     else:
                #         return False

                print("/// ", i,j , " ////")
            print("////////")            
        
        return True