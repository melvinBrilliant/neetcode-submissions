class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        int j = 0;
        int k = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) { // i as the anchor
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            j = i + 1;
            k = nums.length - 1;
            while (j < k) { // finding the right j and k pair, so that with i they make the '3sum'
                List<Integer> triplet = List.of(nums[i], nums[j], nums[k]);
                int target = -1 * nums[i];
                int addPair = nums[j] + nums[k];
                if (addPair == target) {
                    res.add(triplet);
                    j++;
                    k--;
                } else if (addPair < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return new ArrayList<>(res);
    }
}
