class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            int[] anagramArr = new int[26];
            for (char c : str.toCharArray()) {
                anagramArr[c - 97]++;
            }
            String anagramKey = Arrays.toString(anagramArr);
            if (map.containsKey(anagramKey)) {
                map.get(anagramKey).add(str);
            } else {
                map.put(anagramKey, new ArrayList<>(List.of(str)));
            }
        }
        return new ArrayList<>(map.values());
    }
}