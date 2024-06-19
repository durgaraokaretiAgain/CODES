import java.util.*;
class SumOfAllOddFreqInMatrix{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
                arr[i][j] = sc.nextInt();
        }
        System.out.println("Sum :"+SumOfFrequencies(arr,n,m));
    }
    static int SumOfFrequencies(int[][] arr,int n,int m){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                hm.put(arr[i][j],hm.getOrDefault(arr[i][j],0)+1);
            }
        }
        int sum =0;
        for(Map.Entry<Integer,Integer> map:hm.entrySet()){
            int key = map.getKey();
            int val = map.getValue();
            if(val%2!=0)
                sum+=key*val;
        }
        return sum;
    }
}