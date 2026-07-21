class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        /*

        -given two int arrays nums 1 and nums 2
        -given m = number of valid elements in nums1
        -given n = number of elemtsn in nums2
        -array as a total length of (m+n)

        i = 2
        j = 0
        k = 1

        [10,20,20,20,20,40]

        while(i >= 0 and k >= 0):
        (2 and 20 ):

        */

        int i = nums1.length - 1;
        int j = m - 1;
        int k = n-1;
    
        while(i >= 0 && k >= 0){
            if(j < 0 || nums2[k] >= nums1[j]){
                nums1[i] = nums2[k];
                i--;
                k--;
            } else {
                nums1[i] = nums1[j];
                i--;
                j--;
            }
        }
    }
}