import java.util.*;
class DFSAdjMatrixRecursion{
    static int[][] graph;
    static boolean[] visited;
    static int n;

    static void dfs(int start){
        System.out.print(start + " ");
        visited[start] = true;
        for(int i = 0; i < n; i++){
            if(graph[start][i] == 1 && !visited[i]){
                dfs(i);
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
        System.out.println("The DFS traversal is: ");
        dfs(start);

    }
}