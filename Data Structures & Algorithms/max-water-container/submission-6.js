class Solution {
    /**
     * @param {number[]} heights
     * @return {number}
     */
    maxArea(heights) {
        let l = 0;
        let r = heights.length - 1
        let maxArea = 0;
        for (let i = 0; i < heights.length; i++) {
            let left = heights[l];
            let right = heights[r];
            let width = r - l;
            let tall = Math.min(left, right);
            let area = width * tall;
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
