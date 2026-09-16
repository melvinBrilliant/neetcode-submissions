class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n <= 1)
            return n;
        int left = 0;
        int right = 0;
        Set<Character> set = new HashSet<>();
        int maxLength = 1;
        while (right < n) {
            char c = s.charAt(right);
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        return maxLength;
    }
}
