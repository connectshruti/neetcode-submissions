class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=heights.length-1;
        int maxArea=0;
        while(i<j){
            int area=(mini(heights[i],heights[j]))*(j-i);
            if(maxArea<area){
                maxArea=area;
            }
            if(heights[i]<heights[j]){
                i++;
            }else{
                j--;
            }

        }
        return maxArea;
    }
    private int mini(int a, int b){
        if(a<b){
            return a;
        }
        return b;
    }
}
