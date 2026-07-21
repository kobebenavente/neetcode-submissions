class Solution {
    public int lengthOfLongestSubstring(String s) {
        //length of longest substring without duplicate characters
        //abcabcbb
        //   ^
        //use a hashset to store characters. hashset checking, adding, and removing take O(1) time 

        //left end = 0
        //-start right end window at index 0.

        //-if hashset contains currently looked at character:
        //  while the hash set contains the duplicate character,
        //  remove left end character from hashset and move left end forward
        // 
        //- else: add character to hashset.

        //- move right end forward.


        //- return hashset size

        int longestSubstring = 0;

        Set<Character> characters = new HashSet<>();

        int leftSideWindow = 0;
        for(int rightSideWindow = 0; rightSideWindow < s.length(); rightSideWindow++){
                while(characters.contains(s.charAt(rightSideWindow))){
                    characters.remove(s.charAt(leftSideWindow));
                    leftSideWindow++;
                }

                characters.add(s.charAt(rightSideWindow));
                longestSubstring = Math.max(characters.size(), longestSubstring);
            }

            return longestSubstring;

        }


}
