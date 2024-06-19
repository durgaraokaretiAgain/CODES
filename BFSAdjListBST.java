import java.util.*;
import java.util.LinkedList;
class BFSAdjListBST{

    static HashMap<Integer , List<Integer>> hm = new HashMap<>();
    static HashMap<Integer , Boolean> visited = new HashMap<>();
    static int n;

    static void addEdge(int v1 , int v2){
        hm.get(v1).add(v2);
    }

    static void bfs(int v){

        Queue<Integer> q = new LinkedList<>();

        q.add(v);
        visited.put(v ,true);
        while(!q.isEmpty()){
            int t = q.poll();

            System.out.print(t+" ");
            for(int i=0;i<hm.get(t).size();i++){
                int vertex = hm.get(t).get(i);
                if(!visited.get(vertex)){
                    q.add(vertex);
                    visited.put(vertex , true);
                }
            }
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No of Nodes");
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            hm.put(i , new ArrayList<>());
            visited.put(i , false);
        }

        while(true){
            System.out.println("Enter edge b/w 0 to"+ (n-1));
            int vertex1 = sc.nextInt();
            int vertex2 = sc.nextInt();
            if(vertex1 == -1 && vertex2 == -1)
                break;

            addEdge(vertex1,vertex2);
            
        }
        
        System.out.println("Enter Starting Node :");
        int node = sc.nextInt();

        System.out.println("Breath first Serach Traversal: ");
        bfs(node);
    }
}