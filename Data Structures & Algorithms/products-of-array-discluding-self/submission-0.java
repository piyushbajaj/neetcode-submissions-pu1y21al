class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n + 1];
        int[] suffix = new int[n + 1];

        // prefix
        prefix[0] = 1;
        for (int front = 1; front < n + 1; front++) {
            prefix[front] = prefix[front - 1] * nums[front - 1];
        }

        // prefix
        suffix[n] = 1;
        for (int rear = n - 1; rear >= 0; rear--) {
            suffix[rear] = suffix[rear + 1] * nums[rear];
        }

        // result array
        for (int index = 0; index < n; index++) {
            nums[index] = prefix[index] * suffix[index + 1];
        }

        return nums;
    }
}  
