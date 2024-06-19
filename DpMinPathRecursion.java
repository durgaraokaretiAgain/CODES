import java.util.*;
class DpMinPathRecursion{
    static int FindPath(int m,int n){
        if(m==1 || n==1){
            return 1;
        }
        return FindPath(m-1,n)+FindPath(m,n-1)+FindPath(m-1,n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns");
        int n = sc.nextInt();
        System.out.println("The number of paths are: "+FindPath(m,n));
        
    }
}