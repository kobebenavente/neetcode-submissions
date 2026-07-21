class Solution {
    public String longestCommonPrefix(String[] strs) {
        //Goal: Return the longest common prefix of ALL the strings.
        //first string in strs will be the initial LCP. 
        // starting at index 1 and until the end of the strs array:
        //for the length of the shorter word between LCP and nums[i]:
        //if LCP.charAt[j] != nums.charAt(j): break
        // else: j++
        // LCP = LCP.substring(0, j);
        // return LCP

        String LCP = strs[0];
        int k = 0;

        for(int i = 1; i < strs.length; i ++){
            for(int j = 0; j < Math.min(LCP.length(), strs[i].length()) ; j++){
                if(LCP.charAt(j) != strs[i].charAt(j)){
                    break;
                }
                k++;
            }
            LCP = LCP.substring(0, k);
            k = 0;
        }
        return LCP;
    }
}