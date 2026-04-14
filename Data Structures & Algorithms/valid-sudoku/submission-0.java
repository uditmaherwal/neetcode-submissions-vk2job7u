class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int i = 0; i < 9; i++){
            Set<Integer> set = new HashSet<>();
            for(int j = 0; j < 9; j++){
                if (board[i][j] == '.') continue;
                int k = (int)(board[i][j]);
                if(set.contains(k)){
                    return false;
                }
                set.add(k);
            }
        }

        for(int i = 0; i < 9; i++){
            Set<Integer> set = new HashSet<>();
            for(int j = 0; j < 9; j++){
                if (board[j][i] == '.') continue;
                int k = (int)(board[j][i]);
                if(set.contains(k)){
                    return false;
                }
                set.add(k);
            }
        }

        for (int k = 0; k < 9; k++) {
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row = (k / 3) * 3 + i;
                    int col = (k % 3) * 3 + j;
                    if (board[row][col] == '.') continue;
                    if (set.contains(board[row][col])) return false;
                    set.add(board[row][col]);
                }
            }
        }

        return true;
    }
}
