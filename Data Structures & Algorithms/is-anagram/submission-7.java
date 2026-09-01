class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> hashMap = new HashMap<>();

        // base condition
        if (s.length() != t.length()) {
            return false;
        }

        for (char s_char: s.toCharArray()) {
            if (hashMap.containsKey(s_char)) {
                hashMap.put(s_char, hashMap.get(s_char) + 1);
            } else {
                hashMap.put(s_char, 1);
            }
        }

        for (char t_char: t.toCharArray()) {
            if (hashMap.containsKey(t_char)) {
                hashMap.put(t_char, hashMap.get(t_char) - 1);
                if (hashMap.get(t_char).equals(0)) {
                    hashMap.remove(t_char);
                }
            } else {
                return false;
            }
        }

        return hashMap.isEmpty() ? true : false;
    }
}
