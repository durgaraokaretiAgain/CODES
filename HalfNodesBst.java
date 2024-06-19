import java.util.Scanner;
class HalfNodesBst{

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

    static Node removeHalfNodes(Node root){
        if(root == null)
            return null;
        root.left = removeHalfNodes(root.left);
        root.right = removeHalfNodes(root.right);

        if(root.left == null && root.right != null)
            return root.right;
        if(root.right == null && root.left != null)
            return root.left;

        return root;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        System.out.println("Enter the elements");
        for(int i = 0; i < n; i++){
            insert(sc.nextInt());
        }
        System.out.println("The elements in the tree are");
        display(root);
        System.out.println();
        removeHalfNodes(root);
        System.out.println("The elements in the tree after removing half nodes are");
        display(root);
        
    }
}