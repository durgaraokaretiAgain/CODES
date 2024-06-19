import java.util.*;
class SortArrayByDistinctPrimeFactCount{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter Array Value:");
        ArrayList<Integer> arr = new ArrayList();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        Collections.sort(arr,(a,b) ->FindPrimeFactCount(a) - FindPrimeFactCount(b));
        System.out.println("Sortde values;");
        for(Integer i : arr){
            System.out.print(i+" ");
        }
        
    }
    static int FindPrimeFactCount(int num){
        Set<Integer> PrimeFacts = new HashSet<>();
        for(int i=2;i<=num;i++){
            while(num%i==0){
                PrimeFacts.add(i);
                num=num/i;
            }
        }
        return PrimeFacts.size();
    }

}