import java.util.Scanner;
import java.util.Comparator;
import java.util.PriorityQueue;
class LevelOrderTraversal{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left = null;
            right = null;
        }
    }

    static Node root;
    
    static void insert(int x){
        root = insertrec(root , x);
    }
    static Node insertrec(Node root , int x){
        if(root == null){
            root = new Node(x);
            return root;

        }

        if(x < root.data)
            root.left = insertrec(root.left , x);
        else if(x > root.data)
            root.right = insertrec(root.right , x);

        return root;
    }

    static void display(Node root){
        if(root != null){
            display(root.left);
            System.out.print(" "+root.data);
            display(root.right);
        }

    }

    static int Traversal(Node root) {
        if (root == null) {
          return 0;
        }
      
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(node -> node.data));
        pq.add(root);
        pq.add(null);
        int h = 0;
        while(!pq.isEmpty()){
            Node temp = pq.poll();
            if(temp == null){
                h++;
                if(!pq.isEmpty())
                    pq.add(null);
            } else {
                if(temp.right!= null)
                    pq.add(temp.right);
                    
                if(temp.left!=null)
                    pq.add(temp.left);
            }
        }
        return h;
    }
    

    public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
    
            int n = sc.nextInt();
            root = null;
    
            for(int i=0;i<n;i++){
                insert(sc.nextInt());
            }
    
            System.out.println("The tree is :");
            display(root);
            System.out.println();
            System.out.println("Reverse Level Order Traversa :"+ Traversal(root));

            
    }
    
}