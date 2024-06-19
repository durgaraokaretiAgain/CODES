import java.util.*;
class CountUniqueRows{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] arr = new char[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.next().charAt(0);
            }
        }
        System.out.println("Unique row count: "+countUniqueRows(arr));

    }
    static int countUniqueRows(char[][] arr){
        HashMap<String,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
        String str = new String(arr[i]);
        hm.put(str,hm.getOrDefault(str,0)+1);
        
        }
        int count=0;
        for(Map.Entry<String,Integer>entry : hm.entrySet())
        {
            if(entry.getValue()==1)
                count++;
        }
        return count;
    }
}