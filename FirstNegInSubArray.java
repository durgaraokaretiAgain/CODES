import java.util.*;
class FirstNegInSubArray{
    static ArrayList<Integer>  FindElements(int A[] ,int n,int k){

        ArrayList<Integer> ans = new ArrayList<>();
        boolean flag=false;
        for(int i=0;i<n-k+1;i++){
            flag = false;
            for(int j=0;j<k;j++){
                if(A[i+j]<0){
                    ans.add(A[i+j]);
                    flag=true;
                    break;
                }

            }
            if(!flag)
                ans.add(0);
        }

        return ans;

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements");
        int[] A = new int[n];
        for(int i=0;i<n;i++)
            A[i] = sc.nextInt();
        System.out.println("Enter Window Size :");
        int k = sc.nextInt();
        ArrayList<Integer> ans = FindElements(A,n,k);

        for(Integer i:ans)
            System.out.print(i+" ");
    }
}