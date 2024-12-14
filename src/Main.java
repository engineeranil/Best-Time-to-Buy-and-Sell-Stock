public class Main {
    public static void main(String[] args) {
            int[] prices = {7,6,4,3,1};
            int max=0;
            int profit =0;
            for(int i = 0; i<prices.length; i++){
                for(int j =0; j<prices.length; j++){
                    if(prices[i]<prices[j] && j>i){
                        profit  = prices[j]-prices[i];
                    }
                    if(profit>max){
                        max = profit;
                    }
                }

            }
        System.out.println(max);
    }
}
