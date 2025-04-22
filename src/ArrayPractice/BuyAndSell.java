package ArrayPractice;

public class BuyAndSell {
    public static int proFit(int[] arr){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : arr){
            if(buyPrice < price){
                int profit = price - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            }
            else{
                buyPrice = price;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] arr = {7,1,5,4,6,9};
        System.out.println("Maximum profit " + proFit(arr));
    }
}
