import java.util.*;
class rmPunctuations{
    public static void main(String[] args) {

        // String str = "Welcome???@@##$ to#$% Geeks%$^for$%^&Geeks";
        // System.out.println(str.replaceAll("\\p{Punct}", ""));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str=sc.nextLine();
        StringBuilder sb = new StringBuilder();
        String c="!\"#$%&'()*+,-./:;?@[\\]^_`{|}~";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(c.indexOf(ch)==-1)
                sb.append(ch);
        }
        System.out.println(sb.toString());


    }
}