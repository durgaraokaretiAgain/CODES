import java.util.*;
class MatrixElementsPresentInAllRowa{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Result:");
        CommonElements(arr,n,m);
        
    }
    static void CommonElements(int[][] arr,int n,int m){
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<m;i++){
            map.put(arr[0][i],1);
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                if(map.containsKey(arr[i][j]) && map.get(arr[i][j])==i){
                    map.put(arr[i][j],i+1);
                }
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==n){
                System.out.println(entry.getKey());
            }
        }
    }

}