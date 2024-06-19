import java.util.*;
class MaxUnitsOntruck{
    static int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b) -> b[1] - a[1]);
        int maxUnits = 0;
        for(int[] box : boxTypes){
            int numBoxes = Math.min(box[0], truckSize);
            maxUnits += numBoxes * box[1];
            truckSize -= numBoxes;
            if(truckSize == 0)
                break;
        }
        return maxUnits;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] boxTypes = new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                boxTypes[i][j] = sc.nextInt();
            }
        }
        int truckSize = sc.nextInt();
        System.out.println("Maximum units: ");
        System.out.println(maximumUnits(boxTypes, truckSize));
    }

}