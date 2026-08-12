class Solution {
    public int characterReplacement(String s, int k) {
        /*
        Goal: after performing at most k replacements,return length of the LONGEST SUBSTRING which 
        contains only ONE DISTINCT CHARACTER

        XYYVD
        if the quantity of ALL currently looked at elements - quantity of the most frequent
        is greater than k, we are out of replacements

        in the case that we are out
        continuously remove whatever char is at the left pointer from count
        until total - most frequent <= k

        */

        int best = 0;
        int l = 0;
        Map<Character, Integer> seen = new HashMap<>();
        for(int r = 0; r < s.length(); r++){
            seen.put(s.charAt(r), seen.getOrDefault(s.charAt(r), 0) + 1);
            while(((r - l + 1) - Collections.max(seen.values())) > k){
                seen.put(s.charAt(l), seen.get(s.charAt(l)) - 1);
                l++;
            }
            best = Math.max(r - l + 1, best);
        }

        return best;
    }
}
