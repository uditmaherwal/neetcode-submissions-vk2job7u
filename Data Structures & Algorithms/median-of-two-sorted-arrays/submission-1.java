class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length + nums2.length;

        if(nums1.length > nums2.length){
            return findMedianSortedArrays(nums2, nums1);
        }

        int half = (total+1)/2;

        int l = 0;
        int r = nums1.length;

        while(l <= r){
            int i = (l+r)/2;
            int j = half - i;

            int a_left = i > 0 ? nums1[i-1] : Integer.MIN_VALUE;
            int a_right = i < nums1.length ? nums1[i] : Integer.MAX_VALUE;
            int b_left = j > 0 ? nums2[j-1] : Integer.MIN_VALUE;
            int b_right = j < nums2.length ? nums2[j] : Integer.MAX_VALUE;

            if(a_left <= b_right && b_left <= a_right){
                if(total % 2 != 0){
                    return Math.max(a_left, b_left);
                }
                return (Math.max(a_left, b_left) + Math.min(a_right, b_right)) / 2.0;
            }else if(a_left > b_right){
                r = i - 1;
            }else{
                l = i + 1;
            }
        }
        return -1;        
    }
}