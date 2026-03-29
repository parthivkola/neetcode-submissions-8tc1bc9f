class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int n : nums) set.add(n);

        int seq = 0;

        for(int n : set){

            if(!set.contains(n - 1)){   // start of sequence

                int curr = n;
                int len = 1;

                while(set.contains(curr + 1)){
                    curr++;
                    len++;
                }

                seq = Math.max(seq, len);
            }
        }

        return seq;
    }
}