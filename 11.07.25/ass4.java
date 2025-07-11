public class Main {
    public static void main(String[] args) {
        int[] prices = {44000, 54000, 46000, 47000, 48000};

        int maxProfit = Integer.MIN_VALUE;

        for (int buyDay = 0; buyDay < prices.length - 1; buyDay++) {
            for (int sellDay = buyDay + 1; sellDay < prices.length; sellDay++) {
                int profit = prices[sellDay] - prices[buyDay];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        System.out.println("Maximum profit (or minimum loss): Rs. " + maxProfit);
    }
}