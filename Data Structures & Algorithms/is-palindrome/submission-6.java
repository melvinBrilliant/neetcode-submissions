class Solution {
    public boolean isPalindrome(String s) {
        s = s.trim();
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            char left = Character.toLowerCase(s.charAt(l));
            if (!Character.isLetterOrDigit(left)) {
                l++;
                continue;
            }
            char right = Character.toLowerCase(s.charAt(r));
            if (!Character.isLetterOrDigit(right)) {
                r--;
                continue;
            }
            if (left == right) {
                l++; r--;
            } else {
                return false;
            }
        }
        return true;
    }
}
