import java.util.*;
class GCDOfArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter array values:");
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        
        int temp =arr[0];
        for(int i=1;i<n;i++){
            temp=Findgcd(temp,arr[i]);
            if(temp==1)
                break;
        }
        System.out.println("GCD of Arra: "+temp);
    }
    static int Findgcd(int a,int b){
        while(b!=0){
            int t =b;
            b=a%b;
            a=t;
        }
        return a;
    }
}