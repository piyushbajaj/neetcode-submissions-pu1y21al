class Solution {
    public boolean isAnagram(String s, String t) {
        // base condition
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> hashAnagram = new HashMap<>();

        for (char ch : s.toCharArray()) {
            hashAnagram.put(ch, hashAnagram.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t.toCharArray()) {
            hashAnagram.put(ch, hashAnagram.getOrDefault(ch, 0) - 1);
        }

        for (Map.Entry<Character, Integer> entry : hashAnagram.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }

        return true;
    }
}
