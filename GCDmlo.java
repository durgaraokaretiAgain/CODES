import java.util.*;


class GCDmlo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer>hm = new HashMap();
        for(Integer i : arr)
        {
            if(hm.containsKey(i))
            {
                hm.put(i,hm.get(i)+1);
            }
            else
            {
                hm.put(i,1);
            }
        }
        int[] arr1=new int[hm.size()];
        
        int k=0;
        for(Integer i : hm.keySet()){
            arr1[k++]=hm.get(i);
        }
        Arrays.sort(arr1);
        System.out.println("gcd of most and least occurance  "+ gcd(arr1[0],arr1[hm.size()-1]));

    }
    public static int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b,a%b);
    }
}