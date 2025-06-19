package Arrays;

// Leetcode 88: Merge Sorted Array
// https://leetcode.com/problems/merge-sorted-array/


public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        // m = 3, n = 3
        // nums1 has enough space to hold elements of nums2
        // Merge nums2 into nums1 in sorted order
        // nums1 should be modified in-place
        // Time Complexity: O(m + n)
        // Space Complexity: O(1)
        
        int i = 3 - 1;
        int j = nums2.length - 1;
        int k = 3 + nums2.length - 1;

        while( j >= 0) {
            if(i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                k--;
                i--;
            } else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }

        System.out.print("Merged Array: ");
        for(int num : nums1) {
            System.out.print(num + " ");
        }
    }
}