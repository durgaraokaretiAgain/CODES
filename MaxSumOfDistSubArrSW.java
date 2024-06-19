
import java.util.*;
class MaxSumOfDistSubArrSW{
    static int FindSum(int[] A,int n,int k){
        HashMap<Integer,Integer> hm = new HashMap<>();
        int max_sum = 0,curr_sum=0;
        for(int i=0;i<k;i++){
            hm.put(A[i],hm.getOrDefault(A[i],0)+1);
            curr_sum+=A[i];
        }
        if(hm.size()!=k)
            curr_sum=0;
        else
            max_sum = curr_sum;
        for(int i=k;i<n;i++){
            
            if(hm.get(A[i-k])!=null){
                if(hm.get(A[i-k])>1)
                    hm.put(A[i-k],hm.get(A[i-k])-1);
                else
                    hm.remove(A[i-k]);
            }
            
            hm.put(A[i],hm.getOrDefault(A[i],0)+1);
            curr_sum+=A[i]-A[i-k];
            
            if(hm.size()==k)    
                max_sum = Math.max(curr_sum,max_sum);
        }

        return max_sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n = sc.nextInt();
        System.out.println("Enter array elements :");
        int[] A = new int[n];
        for(int i=0;i<n;i++)
            A[i] = sc.nextInt();
        System.out.println("Enter Window size :");
        int B = sc.nextInt();

        int res = FindSum(A,n,B);
        System.out.println("Result :");
        System.out.println(res);
    }
}