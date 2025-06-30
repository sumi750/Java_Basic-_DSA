package ArrayPractice;

public class BuyAndSell {
    public static int proFit(int[] arr){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int num : arr){
            if(buyPrice < num){
                int profit = num - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else buyPrice = num;
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println("Maximum profit " + proFit(arr));
    }
}
