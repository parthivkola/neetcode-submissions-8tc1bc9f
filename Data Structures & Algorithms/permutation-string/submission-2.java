class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        
        // If s1 is longer than s2, s2 cannot contain a permutation of s1
        if (n1 > n2) return false;

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        // 1. Initialize frequencies for the first window of size n1
        for (int i = 0; i < n1; i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        // 2. Check if the very first window is a match without an explicit loop
        if (Arrays.equals(s1Count, s2Count)) return true;

        // 3. Slide the window across s2
        // 'right' represents the new character entering the window
        for (int right = n1; right < n2; right++) {
            // Add the new character on the right
            s2Count[s2.charAt(right) - 'a']++;
            
            // Remove the oldest character on the left
            int left = right - n1;
            s2Count[s2.charAt(left) - 'a']--;

            // Compare frequencies in O(1) time without your inner loop
            if (Arrays.equals(s1Count, s2Count)) return true;
        }

        return false;
    }
}
