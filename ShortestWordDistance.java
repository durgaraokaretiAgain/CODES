import java.util.*;
class ShortestWordDistance {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];
        for(int i =0;i<n;i++){
            words[i]=sc.next();
        }
        System.out.println("Enter w1 w2:");
        String w1=sc.next();
        String w2=sc.next();
        System.out.println(shortestDistance(words,w1,w2));
    }
    static int shortestDistance(String[] words, String word1, String word2) {
        int index1 = -1; 
        int index2 = -1; 
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                index1 = i;
            } else if (words[i].equals(word2)) {
                index2 = i;
            }

            if (index1 != -1 && index2 != -1) {
                minDistance = Math.min(minDistance, Math.abs(index1 - index2));
            }
        }

        return minDistance;
    }

    
}
