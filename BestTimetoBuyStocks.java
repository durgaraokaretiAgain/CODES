import java.util.*;
class BestTimetoBuyStocks{
    static int maxProfit(int[] stocks,int n){
        int maxSofar=0;
        int max=0;
        for(int i=n-1;i>=0;i--){
            if(stocks[i]>maxSofar){
                maxSofar = stocks[i];
            }
           max+=maxSofar-stocks[i];
        }   
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days:");
        int n = sc.nextInt();
        int[] stocks = new int[n];
        System.out.println("Enter the prices of stocks:");
        for(int i=0;i<n;i++){
            stocks[i] = sc.nextInt();
        }
        System.out.println("Maximum profit is:");
        System.out.println(maxProfit(stocks,stocks.length));
    }
}