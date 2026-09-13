func maxArea(heights []int) int {
    l := 0
    r := len(heights) - 1
    maxArea := 0
    for (l < r) {
        left := heights[l]
        right := heights[r]
        width := r - l
        tall := min(left, right)
        area := width * tall
        maxArea = max(area, maxArea)
        if (left < right) {
            l++
        } else {
            r--
        }
    }
    return maxArea
}
