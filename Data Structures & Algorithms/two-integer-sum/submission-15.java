class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            Integer getComplementIndex = map.get(complement);
            if (getComplementIndex == null) {
                map.put(nums[i], i);
            } else {
                ans[0] = getComplementIndex;
                ans[1] = i;
                return ans;
            }
        }
        return ans;
    }
}
