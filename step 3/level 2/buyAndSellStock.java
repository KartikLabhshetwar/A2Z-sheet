public class buyAndSellStock {

    static int bestTimeToBuyAndSell(int[] arr){
        int buy = Integer.MAX_VALUE;
        int profit = 0;

        for(int i = 0; i < arr.length; i++){
            if(buy > arr[i]){
                buy = arr[i];
            }

            int maxProfit = arr[i] - buy;

            System.out.println("buy: "+buy);

            profit = Math.max(profit, maxProfit);
        }

        return profit;

    }

    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4};

        int result = bestTimeToBuyAndSell(arr);
        System.out.println("The profit will be: "+ result);
    }
}
