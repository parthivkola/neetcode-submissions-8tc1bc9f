class Solution {
    public int maxArea(int[] heights) {
        int max=Integer.MIN_VALUE;
        int left=0;
        int right=heights.length-1;
        while(left<right){
            int water=(right-left)*Math.min(heights[left],heights[right]);
            max=Math.max(water,max);
            if(heights[left]<heights[right])left++;
            else right--;
        }
        return max;
    }
}
