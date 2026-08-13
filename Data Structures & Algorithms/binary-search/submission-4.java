class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length - 1;
        if (target < nums[0] || target > nums[n]) {
            return -1;
        }
        int lIndex = 0;
        int rIndex = nums.length - 1;
        int midIndex = (lIndex + rIndex) / 2;
        while (lIndex <= midIndex) {
            int left = nums[lIndex];
            int right = nums[rIndex];
            int mid = nums[midIndex];
            if (mid == target) {
                return midIndex;
            } else if (mid < target) {
                lIndex = midIndex + 1;
            } else if (mid > target) {
                rIndex = midIndex - 1;
            }
            midIndex = (lIndex + rIndex) / 2;
        }
        return -1;
    }
}
