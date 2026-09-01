class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        for (int val: nums) {
            if (hashSet.contains(val)) {
                return true;
            } else {
                hashSet.add(val);
            }
        }
        return false;
    }
}