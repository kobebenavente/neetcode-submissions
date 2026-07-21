class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        //GOAL: return merged string of alternating characters between word 1 and word 2
        //if one string is longer than the other, append remaining characters to the end 
        //of the string after merging. 

        //abc xyz
        //  ^   ^
        //i = 0 
        //ax
        //i = 1
        //axbycz

        //for both sides, check if i + 1 is greater than the word's length, if it is,
        //dont append and let the other word append and its respective pointer will increase by 1 still.

        StringBuilder result = new StringBuilder();
        int left = 0;
        int right = 0;

        //"abh" "acdxxc"
        //if (left < word1.length()):
        // a 1
        // acb a2
        // acbh a3
        // left is not less than word1.length which equals 3
        // 

        int wordCounter = 0;

        for(int i = 0; i< Math.max(word1.length(), word2.length()); i++){
            if(left < word1.length()){
            result.append(word1.charAt(i));
            left++;
            }
            if(right < word2.length()){
            result.append(word2.charAt(i));
            right++;
            }

        }
        return result.toString();

    }
}