class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length())return "";
        HashMap<Character,Integer>map=new HashMap<>();
        for(char c : t.toCharArray()) map.put(c,map.getOrDefault(c,0)+1);
        int have=0;
        int need=map.size();
        HashMap<Character,Integer>window=new HashMap<>();
        int l=0;
        int minLen=Integer.MAX_VALUE;
        int start=0;
        for(int r=0;r<s.length();r++){
            char c = s.charAt(r);
            window.put(c,window.getOrDefault(c,0)+1);
            if(map.containsKey(c) && map.get(c).intValue()==window.get(c).intValue()) have++;
            while(have==need){
                if((r-l+1)<minLen){
                    minLen=r-l+1;
                    start=l;
                }
                char left=s.charAt(l);
                window.put(left,window.get(left)-1);
                if(map.containsKey(left)&&window.get(left)<map.get(left))have--;
                l++;
            }
        }
        if(minLen==Integer.MAX_VALUE)return "";
        return s.substring(start,start+minLen);
    }
}
