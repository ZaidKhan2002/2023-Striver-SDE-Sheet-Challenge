import java.util.ArrayList;

public class BestTimeStocks {
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int maxProfit = 0;
        int minSoFar = prices.get(0);

        for (int i = 0; i < prices.size(); i++) {
            minSoFar = Math.min(minSoFar, prices.get(i));
            int profit = prices.get(i) - minSoFar;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}
