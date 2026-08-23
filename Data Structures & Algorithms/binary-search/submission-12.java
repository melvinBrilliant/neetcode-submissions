class Solution {
    public int search(int[] nums, int target) {
        if (target > nums[nums.length - 1])
            return -1;
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            int mid = nums[m];
            if (mid == target) {
                return m;
            } else if (mid > target) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }
}
