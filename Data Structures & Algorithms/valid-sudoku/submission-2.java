class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] columns = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') continue;
                int val = board[r][c] - '1';
                if (rows[r][val])
                    return false;
                else
                    rows[r][val] = true;
                if (columns[c][val])
                    return false;
                else
                    columns[c][val] = true;
                int boxIndex = (r / 3) * 3 + (c / 3);
                if (boxes[boxIndex][val])
                    return false;
                else 
                    boxes[boxIndex][val] = true;
            }
        }
        return true;
    }
}
