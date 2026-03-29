class Solution {
    public int search(int[] nums, int target) {
        return binsearch(nums,target,0,nums.length-1);
    }
    public int binsearch(int[]nums,int k,int left,int right){
        if(left>right)return -1;
        int mid=(left+right)/2;
        if(nums[mid]==k)return mid;
        else if(nums[mid]>k)return binsearch(nums,k,left,mid-1);
        else return binsearch(nums,k,mid+1,right);
    }
}