import java.util.*;
class SmallestAndLargestNodeBSt{
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

    static int Smallest(Node root){
        if(root == null)
            return 0;

        while(root.left!=null){
            root = root.left;
        }

        return root.data;
    }

    static int Largest(Node root){
        if(root == null)
            return 0;

        while(root.right!=null){
            root = root.right;
        }

        return root.data;
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
        System.out.println("Smallest Node in BST :"+Smallest(root));

        System.out.println("Largest Node in BST :"+Largest(root));

    }


}