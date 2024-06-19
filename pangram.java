import java.util.*;

class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str1 = sc.nextLine();
        str1 = str1.toLowerCase();
        char[] ch = str1.toCharArray();

        Set<Character> charSet = new HashSet<>();
        for (Character c : ch) {
            if (Character.isLetter(c)) {
                charSet.add(c);
            }
        }

        if (charSet.size() == 26) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not Pangram");
        }
    }
}
