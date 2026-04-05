class Solution {
    public int maxArea(int[] heights) {
        int heightsLen = heights.length;
        int largestContainerWithWater = Integer.MIN_VALUE;
        for (int first = 0; first < heightsLen; first++) {
            for (int second = first + 1; second < heightsLen; second++) {
                int currentContainerWithWater = Math.min(heights[first], heights[second]) * (second - first);
                largestContainerWithWater = Math.max(largestContainerWithWater, currentContainerWithWater);
            }
        }

        return largestContainerWithWater;
    }
}
