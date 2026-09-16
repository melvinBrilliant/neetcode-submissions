class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n <= 1)
            return n;
        int left = 0;
        int right = 1;
        Set<Character> set = new HashSet<>();
        int maxLength = 1;
        while (right < n) {
            char lChar = s.charAt(left);
            char rChar = s.charAt(right);
            set.add(lChar);
            if (set.contains(rChar)) {
                set.remove(lChar);
                left++;
                if (right == left) {
                    right = left + 1;
                }
            } else {
                right++;
                set.add(rChar);
            }
            maxLength = Math.max(maxLength, set.size());
        }
        return maxLength;
    }
}
