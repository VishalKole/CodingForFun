public class MedianOfTwoSortedArrays {
    public static void main(String[] s) {
        int[] a = {1, 2};
        int[] b = {3, 4};
        System.out.println(findMedianSortedArrays(a, b));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans = 0;

        int pointer1=(0+nums1.length)/2, pointer2=(0+nums2.length)/2;
        for(int i=0;i<Math.ceil(Math.log10(nums1.length+nums2.length));i++){
           // if(nums1[pointer1])
        }

        return ans;
    }
}
