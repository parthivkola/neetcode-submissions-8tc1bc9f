class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        char[] a = s.toCharArray();

        for (int i = 0; i < a.length; i++) {
            Set<Character> set = new HashSet<>();
            int len = 0;

            for (int j = i; j < a.length; j++) {
                if (set.contains(a[j])) {
                    break;
                }
                set.add(a[j]);
                len++;
            }

            max = Math.max(max, len);
        }

        return max;
    }
}