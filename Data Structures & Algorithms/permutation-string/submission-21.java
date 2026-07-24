class Solution {
    public boolean checkInclusion(String s1, String s2) {
        

        /*
        store abc in a char freq array:
        [1, 1, 1, 0, 0, 0, ...]
        [0, 0, 0 ,0 ,0 ,0 ]

        for every char in s2:
        
        Input: s1 = "abc", s2 = "lecaabee"
                                 ^ 
                                    ^ 


        for every letter in s2:
        move right pointer forward
        for the character at the left pointer, if subtract count in charFreqArray makes it less than 0, move left pointer
        until it reaches right pointer

        for the character at the right pointer, if subtracting count in char freq array makes it less than 0, move left pointer 
        forward until it reaches the right pointer (while adding everything you see with left pointer as it moves)

        else, subtract from charfreqarray char at right pointer


        */

        if(s1.length() > s2.length()){
            return false;
        }

        char[] chars = new char[26];
        char[] chars2 = new char[26];

        for(int i = 0; i < s1.length(); i++){
            chars[s1.charAt(i) - 'a']++;
            chars2[s2.charAt(i) - 'a']++;
        }
        if(Arrays.equals(chars, chars2)){
            return true;
        }

        int l = 0;
        for(int r = s1.length(); r < s2.length(); r++){
            chars2[s2.charAt(l) - 'a']--;
            l++;
            chars2[s2.charAt(r) - 'a']++;
            if(Arrays.equals(chars, chars2)){
                return true;
            }
        }

        return false;

        
    }
}
