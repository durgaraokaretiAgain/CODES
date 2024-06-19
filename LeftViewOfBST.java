import java.util.*;
import java.util.LinkedList;
class LeftViewOfBST{

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
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

    static void PrintLeftView(Node root){

        if(root == null)
            return;
        

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int n = q.size();
            for(int i=1;i<=n;i++){
                Node temp = q.poll();
                if(i == n)
                    System.out.print(temp.data+" ");
                if(temp.left != null)
                    q.add(temp.left);
                if(temp.right != null)
                    q.add(temp.right);
            }
        }
    }

       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes :");
        int n = sc.nextInt();
        

        root =null;
        System.out.println("Enter the nodes :");
        for(int i=1;i<=n;i++){
            insert(sc.nextInt());
        }

        System.out.println("Tree is :");
        display(root);
        System.out.println();
        System.out.println("Left View of BSt :");
        PrintLeftView(root);
    }
}