import java.util.*;

public class LexicographicallySortedChars {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int k = sc.nextInt();
        System.out.println("Output: " + SortedChars(str, k));
    }

    static String SortedChars(String str, int k) {
        Map<Character, Integer> hm = new HashMap<>();

        for (char c : str.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        TreeSet<Character> result = new TreeSet<>();
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            int frequency = entry.getValue();

            if (frequency%k==0 || frequency ==1) {
                result.add(entry.getKey());
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character c : result) {
            int frequency = hm.get(c);
            for (int i = 0; i < frequency; i++) {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    // static boolean isPowerOfK(int n, int k) {
    //     while (n > 1) {
    //         if (n % k != 0) {
    //             return false;
    //         }
    //         n /= k;
    //     }
    //     return n == 1;
    // }
}
