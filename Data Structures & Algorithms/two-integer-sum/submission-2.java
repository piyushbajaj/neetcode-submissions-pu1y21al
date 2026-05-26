class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = 1;

        int len = nums.length;

        if (len <= 1) {
            return new int[]{};
        }

        while(i < len - 1) {
            if (nums[i] + nums[j] == target) {
                return new int[]{i, j};
            }

            j++;
            if (j == len) {
                i++;
                j = i+1;
            }

        }

        return new int[]{};
    }
}
