class Solution {
    public int maxArea(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }
        int max=Integer.MIN_VALUE;
        int left=0;
        int right=heights.length-1;
        while(left<right){
            int water=(right-left)*Math.min(heights[left],heights[right]);
            if(water>max)max=water;
            if(heights[left]<heights[right])left++;
            else right--;
        }
        return max;
    }
}
