import java.util.ArrayList;
import java.util.Scanner;

class wordcountinstring{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s=sc.nextLine();
        ArrayList<String> ar = new ArrayList<String>();
        int n = sc.nextInt();
        System.out.println("Enter "+n+" words:");
        int i=0;
        while(i<n) {
            ar.add(sc.next());
            i++;
        }
        String word[] = s.split(" ");
        int c=0;
        for(String w:word){
            if(ar.contains(w))
                c++;
        }
        System.out.println("Number of words "+c);
    }
}