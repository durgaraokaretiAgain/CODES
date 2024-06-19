import java.util.*;
class DuckNo{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String n =sc.next();
        int num = Integer.parseInt(n);

        while(num!=0)
        {
            int r =num%10;
            if(r==0)
            {
                System.out.println("Duck Number");
                return;
            }
            num=num/10;

        }
        System.out.println("Not a Duck Number");
    }
}