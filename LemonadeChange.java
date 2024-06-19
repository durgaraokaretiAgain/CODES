import java.util.*;
class LemonadeChange{
    static boolean lemonadeChange(int[] A) {
        int five = 0, ten = 0;
        for(int bill : A){
            if(bill == 5){
                five++;
            }else if(bill == 10){
                if(five == 0){
                    return false;
                }
                five--;
                ten++;
            }else{
                if(five > 0 && ten > 0){
                    five--;
                    ten--;
                }else if(five >= 3){
                    five -= 3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        if(lemonadeChange(arr))
            System.out.println("YES");
        else
            System.out.println("NO");
        
    }
}