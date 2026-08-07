class Solution {
    public boolean isValid(String s) {
        if (s.length() <= 1) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        Stack<Character> open = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character getOpen = map.get(s.charAt(i));
            if (getOpen == null) {
                open.push(s.charAt(i));
                continue;
            }
            if (open.size() == 0) {
                return false;
            }
            Character openTop = open.pop();
            if (openTop != getOpen) {
                return false;
            }
        }
        if (open.size() != 0) {
            return false;
        }
        return true;
    }
}
