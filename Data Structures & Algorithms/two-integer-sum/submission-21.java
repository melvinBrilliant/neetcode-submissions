class Solution {
    public int[] twoSum(int[] nums, int target) {
        // HashMap corespondenta (numar, target - numar)

        int[] res = new int[2];
        Map<Integer, Integer> hm = new HashMap<>(); 
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(target - nums[i])) {
                res[0] = hm.get(target - nums[i]);
                res[1] = i;
            }

            hm.put(nums[i], i);
        }

        return res;
    }
}
