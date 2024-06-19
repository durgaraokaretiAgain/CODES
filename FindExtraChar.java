import java.util.*;
class FindExtraChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings");
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(findTheDifference(s, t));
    }

    public static char findTheDifference(String s, String t) {
        int xorval=0;
        for (char c : s.toCharArray()) {
            xorval^=c;
        }
        for (char c : t.toCharArray()) {
            xorval^=c;
        }
        return (char)xorval;
    }
}