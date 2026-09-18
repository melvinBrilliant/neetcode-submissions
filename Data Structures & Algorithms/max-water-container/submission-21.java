class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length,
            r = n - 1,
            l = 0,
            maxArea = 0;
        while (l < r) {
            maxArea = Math.max((r - l) * Math.min(heights[l], heights[r]), maxArea);
            if (heights[l] < heights[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxArea;
    }
}
