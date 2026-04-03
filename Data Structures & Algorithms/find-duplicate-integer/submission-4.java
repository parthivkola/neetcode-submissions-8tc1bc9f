class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] check = new boolean[nums.length];

        for(int i = 0 ; i < nums.length; i++){
            if(check[nums[i]]){
                return nums[i];
            }
            else{
                check[nums[i]] = true;
            }
        }
        return -1;
    }
}