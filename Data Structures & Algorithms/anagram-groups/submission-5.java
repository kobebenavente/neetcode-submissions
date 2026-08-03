class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            int[] charFreq = new int[26];
            for(char c : strs[i].toCharArray()){
                charFreq[c - 'a']++;
            }
            String charFreqString = Arrays.toString(charFreq);
            if(!groups.containsKey(charFreqString)){
                groups.put(charFreqString, new ArrayList<>(List.of(strs[i])));
            } else {
                groups.get(charFreqString).add(strs[i]);
            }
        }
        List<List<String>> solution = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry : groups.entrySet()){
            solution.add(entry.getValue());
        }
        return solution;
    }


}
