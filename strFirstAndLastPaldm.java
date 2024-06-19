import java.util.*;
class strFirstAndLastPaldm{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.next();
        System.out.println("Enter x Value:");
        int x = sc.nextInt();
        System.out.println(CheckPaldm(str,x));
    }
    static boolean CheckPaldm(String str,int x){
        int l =str.length();
        StringBuilder sb =new  StringBuilder(str.substring(l-x,l));
        return (str.substring(0,x).equals(sb.reverse().toString()));
    }
}