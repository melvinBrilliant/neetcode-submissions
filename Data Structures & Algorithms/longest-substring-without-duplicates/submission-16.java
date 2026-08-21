class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        int left = 0;
        int right = 1;
        int maxCount = 1;
        Set<Character> set = new HashSet<>();
        while (right < s.length()) {
            char lChar = s.charAt(left);
            char rChar = s.charAt(right);
            set.add(lChar);
            if (set.contains(rChar)) {
                left++;
                if (left == right) {
                    right = left + 1;
                }
                set.remove(lChar);
            } else {
                set.add(rChar);
                right++;
            }
            maxCount = Math.max(set.size(), maxCount);
        }
        return maxCount;
    }
}
