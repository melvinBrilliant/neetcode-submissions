class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                continue;
            }
            sb.append(Character.toLowerCase(c));
        }
        String origin = sb.toString();
        String reverse = sb.reverse().toString();
        return origin.equals(reverse);
    }
}
