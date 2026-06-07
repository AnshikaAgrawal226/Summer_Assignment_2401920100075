class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();

        String clean = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                clean += ch;
            }
        }

        int start = 0;
        int end = clean.length() - 1;

        while (start < end) {
            if (clean.charAt(start) != clean.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}