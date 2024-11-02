class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (buyPrice > prices[i]) {
                buyPrice = prices[i]; // Update buy price if a lower price is found
            }
            profit = Math.max(profit, prices[i] - buyPrice); // Calculate maximum profit
        }

        return profit;        
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();

        // Sample input
        int[] prices = {7, 1, 5, 3, 6, 4}; // Example stock prices

        // Call the maxProfit method
        int result = solution.maxProfit(prices);

        // Print the result
        System.out.println("Maximum Profit: " + result);
    }
}
