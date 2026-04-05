class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        for (int index = 0; index < len; index++) {
            if (nums[index] > 0) {
                break;
            }

            if (index > 0 && nums[index] == nums[index - 1]) {
                continue;
            }

            int start = index + 1;
            int end = len - 1;
            while (start < end) {
                List<Integer> subResult = new ArrayList<>();
                int sum = nums[index] + nums[start] + nums[end];
                if (sum < 0) {
                    start++;
                } else if (sum > 0) {
                    end--;
                } else {
                    subResult.add(nums[index]);
                    subResult.add(nums[start]);
                    subResult.add(nums[end]);
                    start++;
                    end--;

                    while (start < end && nums[start] == nums[start - 1]) {
                        start++;
                    }

                    result.add(subResult);
                }
            }
        }

        return result;
    }
}
