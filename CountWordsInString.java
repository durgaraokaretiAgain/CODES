import java.util.*;
class CountWordsInString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Enter no of words: ");
        int n = sc.nextInt();   
        String[] words = new String[n];
        for(int i=0;i<n;i++){
            words[i]=sc.next();
        }
        
        
        int count =0;
        for(String w:words){
            if(str.contains(w))
                count++;
        }
        System.out.println("No of words in string: "+count);    
        
    }
}