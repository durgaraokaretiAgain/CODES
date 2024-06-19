import java.util.*;
class FindStringByUsingEncriptionPattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        String str[] = new String[l];
        System.out.println("Enter Array of Strings:");
        for(int i=0;i<l;i++){
            str[i]=sc.next();
        }
        System.out.println("Enter Encription pattern:");
        String pat = sc.next();
        ArrayList<String> ar = new ArrayList();
        ar = FindString(str,pat);
        System.out.println("Encripted string :");
        for(String s : ar){
            System.out.println(s);
        }
    }
    static   ArrayList<String> FindString(String[] str,String pat){
        ArrayList<String> ar = new ArrayList();
        for(String s : str){
            if(isValidString(s,pat)){
                ar.add(s);
            }

        }
        return ar;
    }
    static boolean isValidString(String s,String pat){
        int upperCount = Integer.parseInt(pat.substring(0,1));
        String reverseEnd = new StringBuilder(pat.substring(1,4)).reverse().toString();
        int sum = Integer.parseInt(pat.substring(4,pat.length()));
        int sumDigits=0;
        for(char c : s.toCharArray()){
            if(Character.isDigit(c))
                sumDigits+=Character.getNumericValue(c);
        }
        if(s.endsWith(reverseEnd) &&(sumDigits==sum)&&isAllUpperCases(s.substring(0,upperCount)))
            return true;
        else
            return false;
    }
    static boolean isAllUpperCases(String upper){
        for(char c : upper.toCharArray()){
            if(!Character.isUpperCase(c))
                return false;
        }
        return true;
    }
}