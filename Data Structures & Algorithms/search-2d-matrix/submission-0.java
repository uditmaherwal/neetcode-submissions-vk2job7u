class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int column = matrix[0].length;

        for(int row = 0; row < rows; row++){
            for(int col = 0; col < column; col++){
                if(matrix[row][col] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
