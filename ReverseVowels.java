import java.util.*;
class ReverseVowels{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("Result:"+reverseVowels(str));
    }
    static String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            while(i < j && !isVowel(arr[i])){
                i++;
            }
            while(i < j && !isVowel(arr[j])){
                j--;
            }
            if(i < j){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            i++;
            j--;
        }
        return new String(arr);
    }
    
    static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c =='u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c =='U';
    }
}