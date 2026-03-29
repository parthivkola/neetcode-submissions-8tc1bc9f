class Solution {
    public int characterReplacement(String s, int k) {
        int[]freq=new int[26];
        int l=0,maxLen=0,maxFreq=0;
        for(int r=0;r<s.length();r++){
            freq[s.charAt(r)-'A']++;
            maxFreq=Math.max(freq[s.charAt(r)-'A'],maxFreq);
            while((r-l+1)-maxFreq>k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            maxLen=Math.max(r-l+1,maxLen);
        }
        return maxLen;
    }
}
