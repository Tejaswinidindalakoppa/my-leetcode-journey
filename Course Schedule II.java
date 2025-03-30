
class Solution {
    public int[] findOrder(int n, int[][] pq) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++)adj.add(new ArrayList<>());

        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        
       
        int[] indegree = new int[n];
        
        for(int i=0;i<pq.length;i++){
                indegree[pq[i][1]]++;
                adj.get(pq[i][0]).add(pq[i][1]);
        }
        
        for(int i=0;i<n;i++)
            if(indegree[i] == 0)    
                q.offer(i);
                
        while(!q.isEmpty()){
            int idx = q.poll();

            s.push(idx);
            for(int x: adj.get(idx)){
                
                if(--indegree[x] == 0)
                    q.offer(x);
            }
        }
        
        
        
        if(s.size()<n)return new int[]{};
        int[] res = new int[n];
        int i = 0;
        while(!s.isEmpty())
            res[i++] = s.pop();
        return res;
    }
}