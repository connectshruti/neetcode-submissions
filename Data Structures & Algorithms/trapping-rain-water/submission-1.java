class Solution {
    public int trap(int[] height) {
        int[]prefix=new int[height.length];
        int[]sufix=new int[height.length];
        prefix[0]=height[0];
        for(int i=1;i<height.length;i++){
            prefix[i]=prefix[i-1];
            if(height[i]>prefix[i-1]){
                prefix[i]=height[i];
            }
            
        }
        sufix[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            sufix[i]=sufix[i+1];
            if(height[i]>sufix[i+1]){
                sufix[i]=height[i];
            }
        }
        int counting=0;
        for(int i=1;i<height.length-1;i++){
            int count=mini(prefix[i],sufix[i])-height[i];
         counting=counting+count;
        }
    
    return counting;

    }
    private int mini(int a,int b){
        if(a<b){
            return a;
        }
return b;
    }
}
