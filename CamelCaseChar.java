import java.util.*;
class CamelCaseChar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string :");
        String str = sc.next();
        int count=0;
        for(char ch:str.toCharArray()){
            if(Character.isUpperCase(ch))
                count++;
        }
        System.out.println("Number of camel case characters :"+count);
    }
}