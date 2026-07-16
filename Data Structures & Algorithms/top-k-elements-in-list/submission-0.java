class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hs= new HashMap<>();
        for(int num: nums){
            if(hs.containsKey(num)){
                hs.put(num,hs.get(num)+1);
            }else{
                hs.put(num,1);
            }
        }
        
        PriorityQueue<Map.Entry<Integer,Integer>>pq=new PriorityQueue<>(
            (a,b)->b.getValue()-a.getValue()
        );
        pq.addAll(hs.entrySet());
        

        int[]arr=new int[k];
        for ( int i = 0; i <k;i++){
          Map.Entry<Integer,Integer> entry=  pq.poll();
            arr[i]= entry.getKey();
        }
        return arr;
    }
}
