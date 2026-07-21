class Solution {
    public boolean isAnagram(String s, String t) {

        /*

        hashmap where key = character value = count
        scan through each element in s
        add to hashmap
        scan through t
        for every character, decrement in hashmap
            if hashmap doesnt have character key or value is -1, return false because 
            if the two strings arent anagrams, they will have a character that isnt in each other's word
            or there will be too many of a specific character

        */

        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> characters = new HashMap<>();

        for(Character c : s.toCharArray()){
            characters.put(c, characters.getOrDefault(c, 0) + 1);
        }

        for(Character c : t.toCharArray()){

            if(!characters.containsKey(c)){
                return false;
            }

            characters.put(c, characters.get(c) - 1);
            if(characters.get(c) < 0){
                return false;
            }
        }
        return true;
    }
}
