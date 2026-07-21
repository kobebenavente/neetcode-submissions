class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

		Map<Character, Integer> charFrequency = new HashMap<>();

		for(Character c : s.toCharArray()){			
			charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
		}

		for(Character c : t.toCharArray()){
			if(!charFrequency.containsKey(c)){
				return false;
			}

			charFrequency.put(c, charFrequency.get(c) - 1);

			if(charFrequency.get(c) < 0){
				return false;
			}
		}

		return true;
    }
}
