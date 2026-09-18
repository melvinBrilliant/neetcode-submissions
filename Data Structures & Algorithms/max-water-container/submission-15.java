class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length, l = 0, r = n - 1, maxArea = 0;
        while (l < r) {
            int left = heights[l], right = heights[r];
            int tall = Math.min(left, right);
            int width = r - l;
            maxArea = Math.max(tall * width, maxArea);
            if (left < right) {
                l++;
            } else {
                r--;
            }
        }
        return maxArea;
    }
}
