class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

		Map<String, List<String>> groupedAnagrams = new HashMap<>();

		for(String str : strs){

			char[] freq = new char[26];

			for(Character c : str.toCharArray()){
				freq[c - 'a']++;
			}

			if(!groupedAnagrams.containsKey(Arrays.toString(freq))){
				groupedAnagrams.put(Arrays.toString(freq), new ArrayList<>(List.of(str)));
			} else {
				groupedAnagrams.get(Arrays.toString(freq)).add(str);
			}

		}

		List<List<String>> finalSolution = new ArrayList<>();

		for(Map.Entry<String, List<String>> entry : groupedAnagrams.entrySet()){
			finalSolution.add(new ArrayList<>(entry.getValue()));
		}

		return finalSolution;
        
    }
}
