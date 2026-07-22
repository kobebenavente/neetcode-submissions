class Solution {
    public int characterReplacement(String s, int k) {
    /*
    -Goal: find length of longest substring which ocntains only one distinct character

    Input: s = "AAABABB", k = 1
                ^
                     ^

    Output: 5

    */

    Map<Character, Integer> seen = new HashMap<>();

    int left = 0;
    int best = 0;

    for(int right = 0; right < s.length(); right++){
        seen.put(s.charAt(right), seen.getOrDefault(s.charAt(right), 0) + 1);
        while(!seen.isEmpty() && right - left + 1 - Collections.max(seen.values()) > k){
                seen.put(s.charAt(left), seen.get(s.charAt(left)) - 1);
                left++;
            }
        best = Math.max(right - left + 1, best);
    }
    return best;        
    }

}
