class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int l = 0;
        int r = heights.length -1;
        while (l < r) {
            int left = heights[l];
            int right = heights[r];
            int tall = Math.min(heights[l], heights[r]);
            int width = r - l;
            int area = tall * width;
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
