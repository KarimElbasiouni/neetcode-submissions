class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i = 0; i<board[0].length; i++){
            Set<Character> rowSet = new HashSet<>();
            Set<Character> colSet = new HashSet<>();
            Set<Character> boxSet = new HashSet<>();
            for(int j = 0; j<board.length; j++){
                
                int boxRow = j/3 +(i/3)*3;
                int boxCol = (i%3)*3 +(j%3);

                if(rowSet.contains(board[i][j]) 
                || colSet.contains(board[j][i])
                || boxSet.contains(board[boxRow][boxCol])){
                    return false;
                }

                if(board[i][j] != '.'){
                    rowSet.add(board[i][j]);
                }
                if(board[j][i] != '.'){
                    colSet.add(board[j][i]);
                }
                if(board[boxRow][boxCol] != '.'){
                    boxSet.add(board[boxRow][boxCol]);
                }
                
            }
             System.out.println();
        }

        return true;
    }
}
