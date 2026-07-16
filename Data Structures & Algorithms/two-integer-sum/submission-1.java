class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>hs=new HashMap();
        int[]result=new int[2];
        for(int i=0;i<nums.length;i++){
           if(hs.containsKey(target-nums[i])){
            int firstIndex=hs.get(target-nums[i]);
            int secondIndex=i;
            result[0]= firstIndex;
            result[1]=secondIndex;
            return result;
           }
           hs.put(nums[i],i);
        
    }
    return result;
}
}