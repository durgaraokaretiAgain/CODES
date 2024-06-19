import java.util.*;
class MaxNoOfThiefCanCought{
    static int MaxThiefs(char[] ch ,int n,int k){
        int res=0;
        ArrayList<Integer> pol = new ArrayList<>();
        ArrayList<Integer> the = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(ch[i]=='P'){
                pol.add(i);
                
            }
            else{
                the.add(i);
            }
        }
        int i=0,j=0;
        while(i<pol.size() && j<the.size()){
            if(Math.abs(pol.get(i)-the.get(j))<=k){
                res++;
                i++;
                j++;
            }
            else if(pol.get(i)<the.get(j)){
                i++;
                
            }
            else{
                j++;
            }
        }
        return res;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
        System.out.println("Enter the value of k");
        int k = sc.nextInt();
        System.out.println("Enter the array");
        char[] ch = new char[n];
        for(int i=0;i<n;i++){
            ch[i] = sc.next().charAt(0);
        }
        System.out.println("Max No Of Thiefs are cought "+MaxThiefs(ch, n, k));
        
    }   
}