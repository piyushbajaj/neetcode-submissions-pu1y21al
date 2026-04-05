class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder cleanString = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                cleanString.append(ch);
            }
        }

        return isPalindrome_util(cleanString.toString().toLowerCase());
    }

    private boolean isPalindrome_util(String cleanString) {
        int start = 0;
        int end = cleanString.length() - 1;

        while (start < end) {
            if (cleanString.charAt(start) == cleanString.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }

        return true;
    }
}
