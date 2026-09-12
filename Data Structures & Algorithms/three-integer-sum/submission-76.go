func threeSum(nums []int) [][]int {
    sort.Ints(nums)
    var res [][]int
    for i := 0; i < len(nums); i++ {
        if (i != 0 && nums[i] == nums[i - 1]) {
            continue
        }
        j := i + 1
        k := len(nums) - 1
        target := -1 * nums[i]
        for j < k {
            sum := nums[j] + nums[k]
            if sum == target {
                res = append(res, []int{nums[i], nums[j], nums[k]})
                j++
                k--
                for (j < k && nums[j] == nums[j - 1]) {
                    j++
                }
                for (j < k && nums[k] == nums[k + 1]) {
                    k--
                }
            } else if sum < target {
                j++
            } else {
                k--
            }
        }
    }
    return res
}
