import java.util.*;
class initialOfNameWithSurname{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a full name: ");
        String str =sc.nextLine();
        String[] arr = str.split(" ");
        String res = "";
        for(int i=0;i<arr.length-1;i++){
            res += arr[i].charAt(0)+". ";
        }
        res+=arr[arr.length-1];
        System.out.println(res);
    }
}