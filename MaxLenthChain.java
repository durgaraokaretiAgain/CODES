import java.util.*;
class MaxLenthChain{
    static int maxLength(int[][] ch,int n){
        int count=1;
        Arrays.sort(ch,(a,b)->a[1]-b[1]);
        int prev=ch[0][1];
        for(int i=1;i<n;i++){

            if(ch[i][0]>prev){
                count++;
                prev=ch[i][1];
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] ch=new int[n][2];
        for(int i=0;i<n;i++){
            ch[i][0]=sc.nextInt();
            ch[i][1]=sc.nextInt();
        }
        System.out.println("Max chain length");
        System.out.println(maxLength(ch,n));
    }
}