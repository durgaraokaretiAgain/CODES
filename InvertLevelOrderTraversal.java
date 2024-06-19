import java.util.*;
class InvertLevelOrderTraversal{
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

    static void invertLevelOrderTraversal(Node root){
        if(root == null)
            return;
            PriorityQueue<Node> q = new PriorityQueue<>(Comparator.comparingInt(node -> node.data));
            Stack<Integer> s = new Stack<>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp = q.poll();
            if(temp.right != null)
                q.add(temp.right);
            if(temp.left != null)
                q.add(temp.left);
            s.push(temp.data);
        }
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        System.out.println("Enter the elements");
        for(int i = 0 ; i < n ; i++){
            insert(sc.nextInt());
        }
        System.out.println("Inorder Traversal");
        display(root);
        System.out.println();
        System.out.println("Invert Level Order Traversal");
        invertLevelOrderTraversal(root);

    }
}