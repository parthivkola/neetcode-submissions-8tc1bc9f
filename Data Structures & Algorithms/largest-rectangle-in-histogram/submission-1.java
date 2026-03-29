class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea=0;
        Stack<Integer>st=new Stack<>();
        int n=heights.length;

        for(int i=0;i<=n;i++){
            int currHt=(i==n)?0:heights[i];
            while(!st.isEmpty()&&currHt<heights[st.peek()]){
                int h=heights[st.pop()];

                int right=i;

                int left=st.isEmpty()?-1:st.peek();

                int width=right-left-1;
                int area=h*width;
                maxArea=Math.max(maxArea,area);
            }
            st.push(i);
        }
        return maxArea;
    }
}
