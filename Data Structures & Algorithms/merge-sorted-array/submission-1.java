class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        /*

        increasing order 

        m = number of valid elements in nums1
        n = number of elements in nums2

        3 different pointers:
         -one at last index of nums2 (highest number in nums2 to start)
         -one at last index of nums1 (to be the highest number between nums1 and nums2)
         -one at m-1 (highest number in nums1 to start)

            nums1=[10,20,20,40,0,0]
                                 ^
                            ^           
            
            nums2=[1,2]
                     ^
            nums1biggest = -1
            nums2biggest = 1
            biggest = 0


        */

        int nums1biggest = m - 1;
        int nums2biggest = n - 1;
        int biggest = nums1.length - 1;

        while(nums2biggest >= 0){
            if(nums1biggest < 0 || nums2[nums2biggest] > nums1[nums1biggest]){
                nums1[biggest] = nums2[nums2biggest];
                nums2biggest--;
                biggest--;
            } else {
                nums1[biggest] = nums1[nums1biggest];
                nums1biggest--;
                biggest--;
            }
        }
    }
}