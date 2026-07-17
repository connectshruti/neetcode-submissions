class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>hs= new HashSet();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        int maxCount=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
           int num = nums[i];
           count=1;
           if(hs.contains(num-1)){
            if(maxCount<count){
                maxCount=count;
            }
            continue;
           }
           int duplicate= num+1;
           while(hs.contains(duplicate)){
            count++; duplicate++;
           }
           if(maxCount<count){
            maxCount=count;
           }

        }
        return maxCount;
    }
}
