class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int left=0;
        Set<Character>set=new HashSet<>();
        for(int ryt=0;ryt<s.length();ryt++){
            while(set.contains(s.charAt(ryt))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(ryt));
            max=Math.max(max,set.size());
        }
        return max;
    }
}