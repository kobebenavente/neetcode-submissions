class Solution {
    public boolean isAnagram(String s, String t) {

        /*

        scan through s, add every character to an arraylist
        scan through t, for every character -- check every element in the array list for the character and if its there
        remove it

        */

        if(s.length() != t.length()){
            return false;
        }

        List<Character> characters = new ArrayList<>();

        for(int i = 0; i<s.length(); i++){
            characters.add(s.charAt(i));
        }

        for(int i = 0; i<t.length(); i++){
            for(int j = 0; j < characters.size(); j++){
                if(characters.get(j) == t.charAt(i)){
                    characters.remove(j);
                    break;
                }
            }
        }

        if(characters.isEmpty()){
            return true;
        }
        return false;
    }
}
