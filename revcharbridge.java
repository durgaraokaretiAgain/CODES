import java.util.*;
class revcharbridge{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string length");
        int n = sc.nextInt();
        String str ="";
        for(int i=0;i<n;i++){
            str = str+Character.toString((char)(65+i));
        }
        StringBuilder sb = new StringBuilder(str.substring(0,n-1));
        System.out.println(str+sb.reverse());
        for(int i=1;i<n;i++){
            System.out.println(str.substring(0,n-i)+" ".repeat(i)+sb.substring(i-1,n-1));
        }
    }
}