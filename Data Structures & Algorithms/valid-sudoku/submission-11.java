class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] columns = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') continue;
                int val = board[i][j] - '1';
                // check rows
                if (rows[i][val]) {
                    return false;
                } else {
                    rows[i][val] = true;
                }
                // check columns
                if (columns[j][val]) {
                    return false;
                } else {
                    columns[j][val] = true;
                }
                int boxIndex = (i / 3) * 3 + (j / 3);
                if (boxes[boxIndex][val]) {
                    return false;
                } else {
                    boxes[boxIndex][val] = true;
                }
            }
        }
        return true;
    }
}
