class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int[]diff=new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            diff[i]=Math.abs(x-arr[i]);
        }
        List<Integer>res=new ArrayList<>();
        while(k!=0){
            int min = Integer.MAX_VALUE;
            int idx=0;
            for(int i=0;i<arr.length;i++){
                if(min!=diff[i]){
                    min=Math.min(min,diff[i]);
                    if(min==diff[i])idx=i;
                }
            }
            res.add(arr[idx]);
            diff[idx]=Integer.MAX_VALUE;
            k--;
        }
        Collections.sort(res);
        return res;
    }
}