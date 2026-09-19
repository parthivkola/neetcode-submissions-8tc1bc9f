class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int r=0;
        int sum=nums[0];
        int res=Integer.MAX_VALUE;
        while(r<nums.length){
            if(sum<target){
                r++;
                if(r<nums.length)sum+=nums[r];
            }else{
                res=Math.min(res,r-l+1);
                sum-=nums[l];
                l++;
            }
        }
        if(res==Integer.MAX_VALUE)return 0;
        return res;
    }
}