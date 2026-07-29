class Solution {
    public boolean isPalindrome(String s) {
        char[] c = s.toLowerCase().toCharArray();

        int left = 0;
        int right = c.length - 1;

        while (left < right) {

            while (left < right && !Character.isLetterOrDigit(c[left])) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(c[right])) {
                right--;
            }

            if (c[left] != c[right]) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}