import java.util.*;
class EvenNumberOfDigits{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter Array elements");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] result = FindDigits(arr);
        System.out.println("Even numbers:");
        for(Integer i:result){
            System.out.println(i);
        }
    }
    static int[] FindDigits(int[] arr){
        ArrayList<Integer> result = new ArrayList();
        for(Integer i : arr){
            if(String.valueOf(i).length()%2==0)
                result.add(i);
        }
        int[] res = new int[result.size()];
        for(int i=0;i<result.size();i++){
            res[i] = result.get(i);
        }
        return res;
    }
}