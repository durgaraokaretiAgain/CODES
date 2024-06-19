import java.util.*;
class GraphAdjList{

    static HashMap<Integer, List<Integer>> graph = new HashMap<>();

    static void addEdge(int u, int v){
        if(!graph.containsKey(u)){
            graph.put(u, new ArrayList<>());
        }
        graph.get(u).add(v);
    }

    static void printGraph(){
        for(Map.Entry<Integer, List<Integer>> entry : graph.entrySet()){
            System.out.print(entry.getKey() + " -> ");
            for(int v : entry.getValue()){
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of edges: ");
        int e = sc.nextInt();
        System.out.println("Enter the edges: ");
        while(true){
            System.out.println("Enetr edges b/w 0 to "+(e-1)+" Enter -1 -1 to stop");
            int u = sc.nextInt();
            int v = sc.nextInt();
            if(u == -1 && v == -1){
                break;
            }
            addEdge(u, v);
        }

        System.out.println("The graph is: ");
        printGraph();
    }

}