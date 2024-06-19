import java.util.*;
class LowestCommonAncestor{
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

    static int lca(Node root , int n1 , int n2){
        if(root == null)
            return -1;

        if(root.data > n1 && root.data > n2)
            return lca(root.left , n1 , n2);

        if(root.data < n1 && root.data < n2)
            return lca(root.right , n1 , n2);

        return root.data;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            int x = sc.nextInt();
            insert(x);
        }
        display(root);
        System.out.println();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int t = lca(root , n1 , n2);
        System.out.println(t);
        
    }
}