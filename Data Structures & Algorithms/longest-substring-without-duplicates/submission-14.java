class Solution {
    public int lengthOfLongestSubstring(String s) {
        // cek panjang substring nya pake sliding window
        // terus cek duplikat di substring nya pake hashSet / hashMap
        if (s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        int maxLength = 0;
        int length = 1;
        int left = 0;
        int right = 1;
        Set<Character> set = new HashSet<>();
        while (right < s.length()) {
            char lChar = s.charAt(left);
            char rChar = s.charAt(right);
            set.add(lChar);
            if (set.contains(rChar)) {
                left++;
                right = left + 1;
                length = 1;
                set.clear();
            } else {
                set.add(rChar);
                length++;
                right++;
            }
            maxLength = Math.max(length, maxLength);
        }
        return maxLength;
    }
}
