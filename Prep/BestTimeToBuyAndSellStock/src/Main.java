public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));
    }

//    public static int maxProfit(int[] prices) {
//        int profit = 0;
//        for(int i=0;i<prices.length;i++) {
//            for(int j=i+1;j<prices.length;j++) {
//                profit = Math.max(prices[j] - prices[i], profit);
//            }
//        }
//        return profit;
//    }

    public static int maxProfit(int[] prices) {
        int profit = 0;
        int leastPrice = Integer.MAX_VALUE;
        int profitIfSoldToday = 0;
        for (int price : prices) {
            if (price < leastPrice) {
                leastPrice = price;
            }
            profitIfSoldToday = price - leastPrice;
            if (profit < profitIfSoldToday) {
                profit = profitIfSoldToday;
            }
        }
        return profit;
    }
}