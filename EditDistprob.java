import java.util.Scanner;
class EditDistprob{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        
        System.out.println(editDist(s1, s2, s1.length(), s2.length()));
    }
    public static int editDist(String s1, String s2, int m, int n){
        if(m == 0){
            return n;
        }
        if(n == 0){
            return m;
        }
        if(s1.charAt(m-1) == s2.charAt(n-1)){
            return editDist(s1, s2, m-1, n-1);
        }
        return 1 + Math.min(editDist(s1, s2, m, n-1), Math.min(editDist(s1, s2, m-1, n), editDist(s1, s2, m-1, n-1)));
    }
}