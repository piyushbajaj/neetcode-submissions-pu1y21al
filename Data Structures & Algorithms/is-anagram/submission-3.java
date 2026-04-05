class Solution {
    public boolean isAnagram(String s, String t) {
        int[] characters = new int[26];

        for(char ch: s.toCharArray()) {
            characters[ch - 'a']++;
        }

        for(char ch: t.toCharArray()) {
            characters[ch - 'a']--;
        }

        for (int index = 0; index < 26; index++) {
            if (characters[index] != 0) {
                return false;
            }
        }

        return true;
    }
}
