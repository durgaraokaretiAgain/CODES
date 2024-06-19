import java.util.*;
class AssignCookies{
    static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0;
        int count=0;
        while(i<g.length && j<s.length){
            if(g[i]<=s[j]){
                count++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array g");
        int n=sc.nextInt();
        int g[]=new int[n];
        System.out.println("Enter the size of array s");
        int m=sc.nextInt();
        int s[]=new int[m];
        System.out.println("Enter the elements of array g");
        for(int i=0;i<n;i++){
            g[i]=sc.nextInt();
        }
        System.out.println("Enter the elements of array s");
        for(int i=0;i<m;i++){
            s[i]=sc.nextInt();
        }
        System.out.println("The maximum number of content children is "+findContentChildren(g,s));

    }
}