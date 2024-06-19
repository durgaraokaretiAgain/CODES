import java.util.*;
class CumulativeSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        int temp=0;
        for(int i=0;i<n;i++){
            temp+=a[i];
            a[i] = temp;
        }
        System.out.println("Cumulative Sum: ");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    } 
}