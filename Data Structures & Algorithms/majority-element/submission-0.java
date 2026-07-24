class Solution {
    public int majorityElement(int[] nums) {
        int maj=nums[0];
        int freq=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==maj){
                freq++;
            }else{
                freq--;
            }
            if(freq<0){
                maj=nums[i];
                freq=0;
            }
        }
        return maj;
    }
}