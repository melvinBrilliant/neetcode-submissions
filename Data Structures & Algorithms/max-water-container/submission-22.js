class Solution {
    /**
     * @param {number[]} heights
     * @return {number}
     */
    maxArea(heights) {
        const n = heights.length;
        let l = 0;
        let r = n - 1;
        let maxArea = 0;
        while (l < r) {
            const left = heights[l];
            const right = heights[r];
            const width = r - l;
            const tall = Math.min(left, right);
            const area = width * tall;
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
