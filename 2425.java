//16th janaury 2025

class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int res = 0;
        if (nums1.length % 2 == 1) {
            for (int num : nums2) {
                res ^= num;
            }
        }
        if (nums2.length % 2 == 1) {
            for (int num : nums1) {
                res ^= num;
            }
        }       
        return res;
    }
}
