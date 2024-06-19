import java.util.*;
class MatchstickCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int matchstickCount = countMatchsticks(str);
        System.out.println("Number of matchsticks: " + matchstickCount);
    }

    public static int countMatchsticks(String str) {
        int matchstickCount = 0;

        int[] digitMatchsticks = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                matchstickCount += 6;
            } else if (Character.isDigit(c)) {
                int digit = Character.getNumericValue(c);
                matchstickCount += digitMatchsticks[digit];
            }
        }

        return matchstickCount;
    }
}
