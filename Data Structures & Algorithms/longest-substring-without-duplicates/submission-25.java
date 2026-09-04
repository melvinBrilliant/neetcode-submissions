class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) return s.length();
        Set<Character> set = new HashSet<>();
        int left = 0;
        int right = 1;
        int maxLength = 1;
        while (right < s.length()) {
            char lChar = s.charAt(left);
            char rChar = s.charAt(right);
            set.add(lChar);
            if (set.contains(rChar)) {
                set.remove(lChar);
                left++;
                if (left == right) right = left + 1;
            } else {
                set.add(rChar);
                right++;
            }
            maxLength = Math.max(set.size(), maxLength);
        }
        return maxLength;
    }
}
