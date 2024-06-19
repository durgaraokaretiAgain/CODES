import java.util.*;
class GraphAdjMatrix{
    static Scanner sc = new Scanner(System.in);

    static int[][] Store(int n){
        int[][] graph = new int[n][n];

        while(true){
            System.out.println("Enter the edges b/w 0 to " + (n-1) + " and -1 -1 to exit");

            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a == -1 && b == -1)
                break;
            graph[a][b] = 1;
        }
        return graph;
    }

    static void print(int[][] graph){
        System.out.println("The graph is: ");
        for(int i = 0; i < graph.length; i++){
            for(int j = 0; j < graph[0].length; j++){
                if(graph[i][j] == 1)
                    System.out.println(i + " -> " + j + " ");
            }
        }
    }

    public static void main(String[] args){
        System.out.println("Enter the number of vertices: ");
        int n = sc.nextInt();
        int[][] graph = Store(n);
        print(graph);
    }
}