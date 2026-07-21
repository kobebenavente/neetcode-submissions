class Solution {
    public String longestCommonPrefix(String[] strs) {
        /*


        ["bat","bag","bank","band"]
                        ^

        set first word seen to currLongest
        start at second word (if there isnt a second word, just return first--this will be implied through for loop)
        check every character between curr longest and current word ONLY up to the shorter of the two
        if a character isnt the same, take substring up to where the loop ended


        */

        String currLongest = strs[0];

        for(int i = 1; i<strs.length;i++){

            int endOfSubstring = Math.min(currLongest.length(), strs[i].length());
            for(int j = 0; j < Math.min(currLongest.length(), strs[i].length()); j++){
                if(currLongest.charAt(j) != strs[i].charAt(j)){
                    endOfSubstring = j;
                    break;
                }
            }
            currLongest = currLongest.substring(0,endOfSubstring);
        }

        return currLongest;
    }
}