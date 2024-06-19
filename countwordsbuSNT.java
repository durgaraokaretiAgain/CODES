import java.util.Scanner;
class countwordsbySNT{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentance: ");
        String s = sc.nextLine();
        String[] sep = {" ","\\n","\\t"};
        for(String str:sep){
            s=s.replace(str," ");
        }
        String[] words = s.split(" ");
        System.out.println("Number of words in the sentance is "+words.length);
    }
}