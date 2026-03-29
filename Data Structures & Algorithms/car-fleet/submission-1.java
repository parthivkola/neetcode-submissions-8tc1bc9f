class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        Integer[]idx=new Integer[n];
        for(int i=0;i<n;i++)idx[i]=i;
        Arrays.sort(idx,(a,b)->Integer.compare(position[b],position[a]));
        int fleets=0;
        double prevTime=0;
        for(int i=0;i<n;i++){
            int car=idx[i];
            double time=(double)(target-position[car])/speed[car];
            if(time>prevTime){
                fleets++;
                prevTime=time;
            }
        }
        return fleets;
    }
}
