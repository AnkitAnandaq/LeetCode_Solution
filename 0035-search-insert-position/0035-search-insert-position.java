class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        for (i = 0; i <= nums.length-1; i++) {
            if (nums[i] >= target) {
                return i;
            } else {
                continue;
            }
        }
        return i;
    }
}