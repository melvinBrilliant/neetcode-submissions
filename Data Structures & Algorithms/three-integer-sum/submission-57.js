class Solution {
    /**
     * @param {number[]} nums
     * @return {number[][]}
     */
    threeSum(nums) {
        nums.sort((a, b) => a- b);
        let res = [];
        for (let i = 0; i < nums.length; i++) {
            if (i != 0 && nums[i] === nums[i - 1]) {
                continue;
            }
            let j = i + 1;
            let k = nums.length - 1;
            let target = -1 * nums[i];
            while (j < k) {
                let sum = nums[j] + nums[k];
                if (sum === target) {
                    res.push([nums[i], nums[j], nums[k]]);
                    j++; k--;
                    while (j < k && nums[j] === nums[j - 1]) j++;
                    while (j < k && nums[k] === nums[k + 1]) k--;
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return res;
    }
}
