import java.util.*;
class DistinctStrings{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str=new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }
        System.out.println(CountStrings(str));

    }
    static int CountStrings(String[] str){
        Set<String> S = new HashSet<>();
        for(String st :str){
            S.add(st);
        }
        return S.size();
    }
}