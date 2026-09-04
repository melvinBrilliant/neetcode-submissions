class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            int[] anagramArr = new int[26];
            for (char c : str.toCharArray()) {
                anagramArr[c - 97]++;
            }
            String anagramKey = Arrays.toString(anagramArr);
            map.computeIfAbsent(
                anagramKey, 
                key -> new ArrayList<>()
            ).add(str);
        }
        return new ArrayList<>(map.values());
    }
}