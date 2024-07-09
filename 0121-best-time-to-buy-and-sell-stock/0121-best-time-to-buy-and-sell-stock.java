class Solution {
    public int maxProfit(int[] prices) {
        int bPrice=prices[0];
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(bPrice>prices[i]){
                bPrice=prices[i];
            }
            
            profit=Math.max(profit,prices[i]-bPrice);
        }
        return profit;
    }
}