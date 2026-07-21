class Solution {
    public int lengthOfLongestSubstring(String s) {
        /*
        zxyzxyz
        ^
        ^
        */

        Set<Character> chars = new HashSet<>();

        int left = 0;
        int best = 0;
        for(int right = 0; right < s.length(); right++){
            while(chars.contains(s.charAt(right))){
                chars.remove(s.charAt(left));
                left++;
            }
            chars.add(s.charAt(right));
            best = Math.max(best, right - left + 1);
        }
        return best;
    }
}
