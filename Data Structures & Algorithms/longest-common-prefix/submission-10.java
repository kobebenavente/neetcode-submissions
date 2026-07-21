class Solution {
    public String longestCommonPrefix(String[] strs) {
        /*

        ["bat","bag","bank","band"]
           ^
                 ^

        String currLongest = "bat"
        for each word, determine which is shorter--set the length of
        inner loop to that 
        first check if first char and second char are equal, if they arent,
        return ""
        move pointers while checking if theyre equal to each other,
        if one char at pointer doesnt equal the other, grab pointer size
        and set currLongest to currLongest.substring(0, pointer)
        */

        String currLongest = strs[0];

        for(int i = 1; i < strs.length; i++){
            int counter = 0;
            for(int j = 0; j < Math.min(currLongest.length(),strs[i]
            .length()); j++){
                if(currLongest.charAt(j) != strs[i].charAt(j)){
                    break;
                }
                counter++;
            }
            currLongest = currLongest.substring(0, counter);
        }
        return currLongest;
    }
}