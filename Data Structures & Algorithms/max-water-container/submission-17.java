class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length,
            r = n - 1,
            l = 0,
            maxArea = 0;
        while (l < r) {
            int left = heights[l],
                right = heights[r],
                width = r - l,
                tall = Math.min(left, right);
            maxArea = Math.max(width * tall, maxArea);
            if (left < right) {
                l++;
            } else {
                r--;
            }
        }
        return maxArea;
    }
}
