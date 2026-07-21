class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sHashMap = new HashMap<>();
        Map<Character, Integer> tHashMap = new HashMap<>();

        for(char c : s.toCharArray()){
            if(sHashMap.containsKey(c)){
                sHashMap.put(c, sHashMap.get(c) + 1);
            } else {
                sHashMap.put(c, 1);
            }
        }
        for(char c : t.toCharArray()){
            if(tHashMap.containsKey(c)){
                tHashMap.put(c, tHashMap.get(c) + 1);
            } else {
                tHashMap.put(c, 1);
            }
        }       
        return sHashMap.equals(tHashMap); 

    }
}
