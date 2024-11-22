class Solution {
    public int maximumProfit(int prices[]) {
        // code here
        int n = prices.length;
        int maxProfit = 0;
        
        for(int i =0 ;i< n-1 ; i++){
            if(prices[i] < prices[i+1]){
                int profit = prices[i+1] - prices[i];
                maxProfit += profit;
            }
        }
        
        return maxProfit;
    }
}