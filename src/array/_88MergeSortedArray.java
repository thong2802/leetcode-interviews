package array;

public class _88MergeSortedArray {

        public static void merge(int[] nums1, int m, int[] nums2, int n) {
            for(int x : nums2) {
                mergerNums2ToNums1(x, nums1, m);
                m++;
            }

        }

        public static void mergerNums2ToNums1(int x, int[] nums1, int m) {
            boolean findK = false;
            for(int i = 0; i < m; i++) {
                if(nums1[i] > x) {
                    findK = true;
                    for(int k = m-1; k >= i; k--) {
                        nums1[k+1] = nums1[k];
                    }
                    nums1[i] = x;
                    break;
                }
            }

            if(findK == false) {
                nums1[m] = x;
            }
        }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
        for (int a : nums1) {
            System.out.println(a);
        }
    }
}


/* https://leetcode.com/problems/merge-sorted-array/description/
 * 88: Merge sorted array
 * example:
 * Input = nums1 = [1,2,3], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 */

/*
 * Constraints:
 * nums1.length == m + n
 * nums2.length = n
 * 0 <= m; n <= 200
 * 1 <= m + n <= 200
 * -10^9 <= nums1[i], nums2[i] < 10^9
 */