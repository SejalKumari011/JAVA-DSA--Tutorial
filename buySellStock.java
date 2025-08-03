public class buySellStock {


    public static int buySell(int prices[]){
        int maxProfit=0;
        int bestBuy=prices[0];

        for(int i=0;i<prices.length;i++){
            if(prices[i]>bestBuy){
                maxProfit=Math.max(maxProfit, prices[i]-bestBuy);
            }

            bestBuy=Math.min(bestBuy, prices[i]);
        }
        return maxProfit;

    }
    public static void main(String [] args){
        int prices[]={7,6,4,3,1};

        System.out.println(buySell(prices));
    }
    
}
