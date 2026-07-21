class Solution {
    public boolean isPalindrome(String s) {
        //left and right pointer
        char[] string = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        boolean result = true;



        while(left < right){
                    while(Character.isLetter(string[left]) != true && Character.isDigit(string[left]) != true
            && left < right){
                left++;
        }

        while(Character.isDigit(string[right]) != true && Character.isLetter(string[right]) != true
            && left < right ){
                right--;
        }
            // if both characters are letters, make them lowercase and compare
            if(Character.isLetter(string[left]) && Character.isLetter(string[right])){
                if(Character.toLowerCase(string[left]) != Character.toLowerCase(string[right])){
                    return false;
                } 
            } else {
                // if both characters are not letters or any other case 
                if(string[left] != string[right]){
                    return false;
                }
            }
            left++;
            right--; 
        }

        return result;
    }
}
