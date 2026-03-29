class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[]res=new int[nums.length];
        int max=1;
        for(int i=0;i<nums.length;i++){
            res[i]=mul(nums,i);
        }
        return res;
    }
    public int mul(int[]nums,int i){
        int x=1;
        for(int j=0;j<nums.length;j++){
            if(j==i){
                continue;
            }else{
                x*=nums[j];
            }
        }
        return x;
    }
}  
