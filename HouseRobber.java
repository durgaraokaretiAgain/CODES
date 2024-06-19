import java.util.*;
class HouseRobber{
    static int Hrob(int A[],int n){

        int MaxRob[] = new int[n+1];
        MaxRob[0]=0;
        MaxRob[1]=A[0];
        for(int i=2;i<=n;i++){
            MaxRob[i]=Math.max(MaxRob[i-1],MaxRob[i-2]+A[i-1]);
        }
        return MaxRob[n];
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        System.out.println("Maximum Amount:");
        System.out.println(Hrob(A,n));
    }
}