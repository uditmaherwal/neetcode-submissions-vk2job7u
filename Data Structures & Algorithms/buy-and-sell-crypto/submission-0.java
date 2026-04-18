class Solution {
    public int maxProfit(int[] prices) {
        int highest = 0;
        for(int i = 0; i < prices.length; i++){
            for(int j = i+1; j < prices.length; j++){
                highest = Math.max(prices[j] - prices[i], highest);
            }
        }
        return highest;
    }
}

//Brute force
//Time Complexity : O(n^2)
//Space Complexity : O(1)
