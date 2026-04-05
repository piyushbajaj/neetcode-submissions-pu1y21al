class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] frequencyCounter = new ArrayList[nums.length + 1];

        for (int i = 0; i < frequencyCounter.length; i++) {
            frequencyCounter[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> map : frequencyMap.entrySet()) {
            frequencyCounter[map.getValue()].add(map.getKey());
        }

        int[] result = new int[k];
        int cnt = 0;
        for (int index = frequencyCounter.length - 1; index > 0 && cnt < k; index--) {
            if (!frequencyCounter[index].isEmpty()) {
                for (int num : frequencyCounter[index]) {
                    result[cnt++] = num;
                    if (cnt == k) {
                        return result;
                    }
                }
            }
        }

        return result;
    }
}
