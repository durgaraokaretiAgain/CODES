import java.util.*;
class freqcharisFactfreqchar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings: ");
        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(Checkingfreq(str1,str2));
    }
    static boolean Checkingfreq(String str1,String str2){
        Map<Character,Integer> freq1 = countFreq(str1);
        Map<Character,Integer> freq2 = countFreq(str2);
        for(Map.Entry<Character,Integer> entry:freq1.entrySet()){
            char key =entry.getKey();
            int f1 = entry.getValue();
            int f2 = freq2.getOrDefault(key,0);
            if(f1!=0 && f2!=0){
                if(f1%f2!=0 && f2%f1!=0){
                    return false;
                }
           
            }
            
        }
        return true;

    }
    static Map<Character,Integer> countFreq(String s){
        HashMap<Character,Integer> freq = new HashMap<>();
        for(char ch:s.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        return freq;
    }
}