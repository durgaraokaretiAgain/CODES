import java.util.*;

public class SortStringByFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = sortStringByFrequency(input);
        System.out.println(result);
    }

    private static String sortStringByFrequency(String input) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : input.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        List<Character> charList = new ArrayList<>(frequencyMap.keySet());
        charList.sort((a, b) -> {
            int freqCompare = Integer.compare(frequencyMap.get(b), frequencyMap.get(a));
            return (freqCompare != 0) ? freqCompare : Character.compare(a, b);
        });

        StringBuilder result = new StringBuilder();
        for (char ch : charList) {
                result.append(ch);
            
        }

        return result.toString();
    }
}
