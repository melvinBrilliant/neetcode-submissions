class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int[] flatten = Arrays.stream(matrix)
            .flatMapToInt(IntStream::of)
            .toArray();
        int l = 0;
        int r = flatten.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            int mid = flatten[m];
            if (mid == target)
                return true;
            else if (mid < target)
                l = m + 1;
            else
                r = m - 1;
        }
        return false;
    }
}
