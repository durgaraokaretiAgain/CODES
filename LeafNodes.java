import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
class  LeafNodes{
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

    static void maxWidth(Node root){
        if(root == null)
            return;

        int result = 0;
        PriorityQueue<Node> q = new PriorityQueue<>(Comparator.comparingInt(node -> node.data));
        q.add(root);
        while(!q.isEmpty()){
            int count = q.size();
            result = Math.max(count , result);
            while(count-- > 0){
                Node temp = q.poll();
                if(temp.left != null)
                    q.add(temp.left);
                if(temp.right != null)
                    q.add(temp.right);
            }
        }
        System.out.println(result);
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
        System.out.println("Max width :");
        maxWidth(root);
    }

}