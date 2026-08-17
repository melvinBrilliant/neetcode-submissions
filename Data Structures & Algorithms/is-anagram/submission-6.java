class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            mapS.compute(s.charAt(i), (k, v) -> v == null ? 1 : ++v);
            mapT.compute(t.charAt(i), (k, v) -> v == null ? 1 : ++v);
        }
        return mapS.equals(mapT);
    }
}
