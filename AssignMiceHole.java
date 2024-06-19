import java.util.*;
class AssignMiceHole{
    static int FindMinTime(int[] m,int[] h,int n){
        Arrays.sort(m);
        Arrays.sort(h);
        int max=0;
        for(int i=0;i<n;i++){
            max = Math.max(max,Math.abs(m[i]-h[i]));
        }
        return max;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of mice And holes");
        int n = sc.nextInt();
        System.out.println("Enter mice And holes");
        int[] m = new int[n];
        int[] h = new int[n];
        for(int i=0;i<n;i++){
            m[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            h[i]=sc.nextInt();
        }
        System.out.println("Min time to place last mice into a hole is : " +FindMinTime(m,h,n));

    }
}