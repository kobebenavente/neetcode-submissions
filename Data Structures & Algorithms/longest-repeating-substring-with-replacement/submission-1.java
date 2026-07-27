class Solution {
    public int characterReplacement(String s, int k) {
        /*
        -string s only contains uppercase character
        -given an int k
        -can choose up to k chars and replace them with any other char
        -goal: return length of longest substring containing only one distinct character after using
        -k replacements

        K used = 
        4 - 
        {A - 4, B - 1}
        Input: s = "AAABACB", k = 1
                         ^
                    ^
        */
        
        Map<Character, Integer> chars = new HashMap<>();

        int l = 0;
        int best = 0;
        for(int r = 0; r < s.length(); r++){
            chars.put(s.charAt(r), chars.getOrDefault(s.charAt(r), 0) + 1);
            while(r - l + 1 - Collections.max(chars.values()) > k){
                chars.put(s.charAt(l), chars.get(s.charAt(l)) - 1);
                l++;
            } 
            best = Math.max(r - l + 1 , best);
        }
        return best;
    }
}
