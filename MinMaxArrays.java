import java.util.*;

public class MinMaxArrays {

    public static int minimizeSet(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2) {
        Set<Integer> arr1 = new HashSet<>();
        Set<Integer> arr2 = new HashSet<>();

        int num = 1;

        while (arr1.size() < uniqueCnt1) {
            if (num % divisor1 != 0) {
                arr1.add(num);
            }
            num++;
        }

        num = 1;
        while (arr2.size() < uniqueCnt2) {
            if (num % divisor2 != 0 && !arr1.contains(num)) {
                arr2.add(num);
            }
            num++;
        }

        // Return the minimum possible maximum integer
        return Math.max(Collections.max(arr1), Collections.max(arr2));
    }

    public static void main(String[] args) {
        // Example 1
        int divisor1 = 12, divisor2 = 3, uniqueCnt1 = 2, uniqueCnt2 = 10;
        System.out.println(minimizeSet(divisor1, divisor2, uniqueCnt1, uniqueCnt2));

        // Example 2
        divisor1 = 3; divisor2 = 5; uniqueCnt1 = 2; uniqueCnt2 = 1;
        System.out.println(minimizeSet(divisor1, divisor2, uniqueCnt1, uniqueCnt2));

        // Example 3
        divisor1 = 2; divisor2 = 4; uniqueCnt1 = 8; uniqueCnt2 = 2;
        System.out.println(minimizeSet(divisor1, divisor2, uniqueCnt1, uniqueCnt2));
    }
}
