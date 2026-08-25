class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        if (s.length() == 1) return 1;       
        Set<Character> set = new HashSet<>();
        int maxLength = 1;
        int left = 0;
        int right = 1;
        while (right < s.length()) {
            char lChar = s.charAt(left);
            char rChar = s.charAt(right);
            set.add(lChar);
            if (set.contains(rChar)) {
                set.remove(lChar);
                left++;
                if (left == right) 
                    right = left + 1;
            } else {
                set.add(rChar);
                right++;
            }
            maxLength = Math.max(maxLength, set.size());
        }
        return maxLength;
    }
}
