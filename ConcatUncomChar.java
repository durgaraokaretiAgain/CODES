import java.util.*;
class ConcatUncomChar{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Strings: ");
        String str1 = sc.next();
        String str2 = sc.next();
        String str3="";
        for(char ch : str1.toCharArray()){

            if(str2.indexOf(ch)==-1)
                str3+=ch;
        }
        for(char ch : str2.toCharArray()){
            if(str1.indexOf(ch)==-1)
                str3+=ch;
        }
        System.out.println("Result:"+str3);
    }
}