class Solution {
    public int maxProfit(int[] prizes) {
        if (prizes.length<1){
            return 0;
        }
        int maxProfit=0;
        int lowest=prizes[0];
        for(int i=0;i<prizes.length;i++){
            if(lowest>prizes[i]){
                lowest=prizes[i];
            }
            int sold=prizes[i]-lowest;
            System.out.println(sold);
            if(sold>0&&maxProfit<sold){
                maxProfit=sold;
            }
        }
        return maxProfit;
    }
}
