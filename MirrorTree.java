import java.util.Scanner;
class MirrorTree{

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

    static void mirror(Node root){
        if(root == null)
            return;
        else{
            Node temp;
            mirror(root.left);
            mirror(root.right);
            temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
    }
    
    

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes");
        int n = sc.nextInt();
        System.out.println("Enter the nodes");
        for(int i=0;i<n;i++){
            insert(sc.nextInt());
        }
        System.out.println("The tree is");
       
        display(root);
        System.out.println();
        System.out.println("The mirror tree is");
        mirror(root);
        display(root);
        

    }
}