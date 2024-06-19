import java.util.*;
class DFSAdjList{
    static HashMap<Integer, List<Integer>> graph;
    static HashMap<Integer, Boolean> visited;
    static void addEdge(int u, int v){
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
    static void dfs(int node){
        
        Stack<Integer> stack = new Stack<>();
        stack.push(node);
        visited.put(node, true);
        while(!stack.isEmpty()){
            int n = stack.pop();
            System.out.print(n + " ");
            for(int i=0; i<graph.get(n).size(); i++){
                int v = graph.get(n).get(i);
                if(!visited.get(v)){
                    stack.push(v);
                    visited.put(v, true);
                }
            }
        }
     
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices and edges");
        int n = sc.nextInt();
        int e = sc.nextInt();
        graph = new HashMap<>();
        visited = new HashMap<>();
        for(int i=0; i<n; i++){
            graph.put(i, new ArrayList<>());
            visited.put(i, false);
        }
        System.out.println("Enter the edges");
        for(int i=0; i<e; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            addEdge(u, v);
        }
        System.out.println("Enter the starting node");
        int start = sc.nextInt();
        dfs(start);
        
    }
}