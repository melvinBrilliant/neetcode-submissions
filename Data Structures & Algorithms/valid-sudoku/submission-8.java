class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] columns = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                int val = board[i][j] - '1';
                if (rows[i][val])
                    return false;
                else
                    rows[i][val] = true;
                if (columns[j][val])
                    return false;
                else
                    columns[j][val] = true;
                int boxIndex = (i / 3) * 3 + (j / 3);
                if (boxes[boxIndex][val])
                    return false;
                else
                    boxes[boxIndex][val] = true;
            }
        }
        return true;
    }
}
