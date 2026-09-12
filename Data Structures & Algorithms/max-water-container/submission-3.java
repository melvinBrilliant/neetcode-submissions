class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int maxArea = 0;
        while (l < r) {
            int left = heights[l];
            int right = heights[r];
            int width = r - l;
            int tall = Math.min(left, right);
            int area = width * tall;
            maxArea = Math.max(area, maxArea);
            if (left < right) {
                l++;
            } else {
                r--;
            }
        }
        return maxArea;
    }
}
