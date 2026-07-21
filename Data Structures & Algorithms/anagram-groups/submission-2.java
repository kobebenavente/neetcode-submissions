class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> solution = new ArrayList<>();

        Map<Map<Character,Integer>, List<String>> anagrams = new HashMap<>();

        for(String str : strs){
            Map<Character, Integer> tempMap = new HashMap<>();
            for(Character c : str.toCharArray()){
                tempMap.put(c, tempMap.getOrDefault(c, 0) + 1);
            }

            if(anagrams.containsKey(tempMap)){
                anagrams.get(tempMap).add(str);
            } else {
                anagrams.put(tempMap, new ArrayList<>(List.of(str)));
            }
        }
        for(Map.Entry<Map<Character,Integer>, List<String>> entry : anagrams.entrySet()){
            solution.add(new ArrayList<>(entry.getValue()));
        }
        return solution;
    }
}
