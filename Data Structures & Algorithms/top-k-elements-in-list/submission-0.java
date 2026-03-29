class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int n : nums){
            int count=map.getOrDefault(n,0);
            map.put(n,count+1);
        }
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        for(int key : map.keySet()){
            pq.add(new int[]{key,map.get(key)});
            if(pq.size()>k) pq.poll();
        }
        int[]res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=pq.poll()[0];
        }
        return res;
    }
}
