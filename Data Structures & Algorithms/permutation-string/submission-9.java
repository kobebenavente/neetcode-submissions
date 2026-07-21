class Solution {
    public boolean checkInclusion(String s1, String s2) {
        //What is a permutation?:
        // a specific arrangement of characters 
        // s2 must contain a perumtation of s1 to be true

        // Ideas:
        // -if S2 has a permutation of S1, the length of S1
        // somewhere within S2 will include the permutation.
        // - why is this important? we can use the length of S1
        // as the fixed window size as we pass through the entire
        // S2 string.

        // -character frequency array for both strings
        // -input S1 frequency into array via loop
        // -create left pointer and right pointer for S2.
        // -counter = 0
        // -while(right < S2.length()):
        // -add character to the freq array
        // -if counter == S1.length():
        // -if S2 freq array equals S1 freq array, return true
        

        int[] S1Freq = new int[26];
        int[] S2Freq = new int[26];

        for(int i = 0; i < s1.length(); i++){
            S1Freq[s1.charAt(i) - 'a']++;
        }

        int counter = 0;

        int left = 0;
        int right = 0;
        //counter = 0
        //s2[d]
        //counter += 1
        //right +=1
        //s2[d,c]
        //counter += 2
        //right += 2
        //s2[d,c,d]
        //
        while(right < s2.length()){
            S2Freq[s2.charAt(right) - 'a']++;
            counter++;
            if(counter == s1.length()){
                if(Arrays.equals(S1Freq, S2Freq) == true){
                    return true;
                }
                S2Freq[s2.charAt(left) - 'a']--;
                left++;
                counter--;
            }
            right++;
        }

        return false;
    }
}
