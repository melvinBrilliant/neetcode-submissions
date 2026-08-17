class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums.length <= 1) {
            return false;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            var get = map.get(num);
            if (get == null) {
                map.put(num, 0);
            } else {
                return true;
            }
        }
        return false;
    }
}