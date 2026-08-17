class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int complement = target - num;
            Integer complementIndex = map.get(complement);
            if (map.get(complement) != null) {
                return new int[] {complementIndex, i};
            } else {
                map.put(num, i);
            }
        }
        return null;
    }
}
