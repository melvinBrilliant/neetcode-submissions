class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            Integer get = map.get(complement);
            if (get == null) {
                map.put(nums[i], i);
            } else {
                ans[0] = get;
                ans[1] = i;
            }
        }
        return ans;
    }
}
