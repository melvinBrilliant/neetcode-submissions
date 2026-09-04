class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            int[] anagramArray = new int[26];
            for (char c : str.toCharArray()) {
                int alphabetIndex = c - 97;
                anagramArray[alphabetIndex]++;
            }
            String anagramKey = Arrays.toString(anagramArray);
            if (map.containsKey(anagramKey)) {
                map.get(anagramKey).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(anagramKey, list);
            }
        }
        return new ArrayList<>(map.values());
    }
}
