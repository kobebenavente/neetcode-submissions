class Solution {
    public boolean checkInclusion(String s1, String s2) {
        /*

        */

        if(s2.length() < s1.length()){
            return false;
        }
        int[] s1charFreq = new int[26];
        int[] s2charFreq = new int[26];
        for(int i = 0; i < s1.length(); i++){
            s1charFreq[s1.charAt(i) - 'a']++;
            s2charFreq[s2.charAt(i) - 'a']++;
        }

        if(Arrays.equals(s1charFreq, s2charFreq)){
            return true;
        }

        int l = 0;
        for(int r = s1.length(); r < s2.length(); r++){
            s2charFreq[s2.charAt(l) - 'a']--;
            s2charFreq[s2.charAt(r) - 'a']++;
            l++;
            if(Arrays.equals(s1charFreq, s2charFreq)){
                return true;
            } 
        }

        return false;
    }
}
