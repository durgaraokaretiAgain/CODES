import java.util.*;
class initialOfNames{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();    
        String[] word = name.split(" ");
        ArrayList<String> ar = new ArrayList();
        for(String s : word){
            String str = String.valueOf(s.charAt(0));
            ar.add(str);
        }
        for(String s : ar){
            System.out.print(s.toUpperCase()+" ");
        }
    }
}