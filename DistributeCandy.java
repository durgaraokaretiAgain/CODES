import java.util.*;
class DistributeCandy{
    static int[] MinNumbOfCandies(int[] CRating ,int n){

        int[] candies = new int[n];
        Arrays.fill(candies,1);
        for(int i=1;i<n;i++){
            if(CRating[i]>CRating[i-1])
                candies[i] = candies[i]+1;
        }

        for(int i=n-2;i>=0;i--){
            if(CRating[i]>CRating[i+1]){
                candies[i]=Math.max(candies[i],candies[i+1]+1);
            }
        }
        return candies;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of children:");
        int n = sc.nextInt();
        int[] CRating = new int[n];
        System.out.println("Enter the ratings of children:");
        for(int i=0;i<n;i++){
            CRating[i] = sc.nextInt();
        }
        System.out.println("Minimum number of candies required are:");
        int[] candies = MinNumbOfCandies(CRating,CRating.length);
        for(int i=0;i<candies.length;i++){
            System.out.print(candies[i]+" ");
        }
    }
}