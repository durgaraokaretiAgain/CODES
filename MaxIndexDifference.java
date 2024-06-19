import java.util.*;

public class MaxIndexDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++)
            arr1[i]=sc.nextInt();
        int result1 = maxDifference(arr1);
        System.out.println("Output for arr1: " + result1);


    }

    public static int maxDifference(int[] arr) {
        HashMap<Integer, Integer> firstIndexMap = new HashMap<>();
        HashMap<Integer, Integer> lastIndexMap = new HashMap<>();
        int maxDifference = 0;

        for (int i = 0; i < arr.length; i++) {
            int currentElement = arr[i];

            if (!firstIndexMap.containsKey(currentElement)) {
                // First occurrence of the element
                firstIndexMap.put(currentElement, i);
            }

            // Update the last occurrence for each element
            lastIndexMap.put(currentElement, i);
        }

        // Calculate the maximum difference
        for (int key : firstIndexMap.keySet()) {
            int difference = lastIndexMap.get(key) - firstIndexMap.get(key);
            maxDifference = Math.max(maxDifference, difference);
        }

        return maxDifference;
    }
}
