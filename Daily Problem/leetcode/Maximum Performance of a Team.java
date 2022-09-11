class Solution {
    static int MOD = 1000000007;
    //creating class to store speed and efficiency together for sorting
    private class Engineer{
        int speed;
        int efficiency;
        public Engineer(int speed, int efficiency){
            this.speed = speed;
            this.efficiency = efficiency;
        }
    }
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        //creating list of engineer
        List<Engineer> engineers = new ArrayList<>();
        for(int i=0;i<n;i++){
            engineers.add(new Engineer(speed[i],efficiency[i]));
        }
        
        //sorting according to decreasing order of efficiency
        engineers.sort((a,b)->(b.efficiency-a.efficiency));
        
        //taking help of pq for getting minimum speed engineer everytime if k limit reach
        PriorityQueue<Engineer> pq = new PriorityQueue<>((a,b)->(a.speed-b.speed));
        
        long curSpeed=0;
        long performance=0;
        
        for(Engineer e:engineers){
            if(pq.size()==k){
            // if k limit reach remove minimum speed element because max speed element can increase performance
                curSpeed-=pq.remove().speed; 
            }
            //adding engineer to pq
            pq.add(e);
            //updating curspeed & performance
            curSpeed+=e.speed;
            performance = Math.max(performance,curSpeed*e.efficiency);
        }
        return (int)(performance%MOD);
    }
}
// TC : O(N*logN)
// SC : O(N)
