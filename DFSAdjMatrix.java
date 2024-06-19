import java.util.*;
class DFSAdjMatrix{
    static int[][] graph;
    static boolean[] visited;
    static int n;

    static void dfs(int v){

        Stack<Integer> stack = new Stack<>();
        stack.push(v);
        visited[v] = true;
        while(!stack.isEmpty()){
            int node = stack.pop();
            System.out.print(node + " ");
            for(int i = 0; i < n; i++){
                if(graph[node][i] == 1 && !visited[i]){
                    stack.push(i);
                    visited[i] = true;
                }
            }
        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices: ");
        n = sc.nextInt();
        graph = new int[n][n];
        visited = new boolean[n];
        
        System.out.println("Enter the adjacency matrix: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.println("Enter the edge b/w " + i + " and " + j + ": ");
                graph[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the starting vertex: ");
        int start = sc.nextInt();
        dfs(start);

    }
}