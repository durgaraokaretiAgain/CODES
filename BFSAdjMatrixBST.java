import java.util.*;
import java.util.LinkedList;
class BFSAdjMatrixBST{

    static int a[][];
    static boolean visited[];
    static int n;

    static void bfs(int v){

        Queue<Integer> q = new LinkedList<>();

        q.add(v);
        visited[v] = true;
        while(!q.isEmpty()){
            int t = q.poll();

            System.out.print(t+" ");
            for(int i=0;i<n;i++){

                if(!visited[i] && a[t][i]==1){
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No of Nodes");
        n = sc.nextInt();
        a = new int[n][n];
        visited = new boolean[n];

        while(true){
            System.out.println("Enter edge b/w 0 to"+ (n-1));
            int vertex1 = sc.nextInt();
            int vertex2 = sc.nextInt();
            if(vertex1 == -1 && vertex2 == -1)
                break;

            a[vertex1][vertex2] = 1;
            
        }
        
        Arrays.fill(visited , false);

        System.out.println("Enter Starting Node :");
        int node = sc.nextInt();

        System.out.println("Breath first Serach Traversal: ");
        bfs(node);
    }
}