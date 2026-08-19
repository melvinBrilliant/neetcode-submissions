class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) { // i as the anchor
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) { // finding the right j and k pair, so that with i they make the '3sum'
                List<Integer> triplet = List.of(nums[i], nums[j], nums[k]);
                int target = -1 * nums[i];
                int addPair = nums[j] + nums[k];
                if (addPair == target) {
                    res.add(triplet);
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                } else if (addPair < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return res;
    }
}
