public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();
        if (len1 > len2) return false;

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        // Count frequency of s1
        for (char c : s1.toCharArray()) {
            count1[c - 'a']++;
        }

        // First window in s2
        for (int i = 0; i < len1; i++) {
            count2[s2.charAt(i) - 'a']++;
        }

        if (matches(count1, count2)) return true;

        // Slide the window
        for (int i = len1; i < len2; i++) {
            count2[s2.charAt(i) - 'a']++;                // add new char
            count2[s2.charAt(i - len1) - 'a']--;        // remove old char

            if (matches(count1, count2)) return true;
        }

        return false;
    }

    // Check if two frequency arrays match
    private boolean matches(int[] count1, int[] count2) {
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) return false;
        }
        return true;
    }
}