class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            int n = row.length;
            int l = 0;
            int r = n - 1;
            while (l <= r) {
                int midIndex = (l + r) / 2;
                int mid = row[midIndex];
                if (target == mid) {
                    return true;
                } else if (mid < target) {
                    l = midIndex + 1;
                } else {
                    r = midIndex - 1;
                }
            }
        }
        return false;
    }
}
