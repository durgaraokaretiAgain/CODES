import java.util.Scanner;
class HeightOfBST{
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
    static int height(Node root){
        if(root == null )
            return 0;

        else{
            int lh = height(root.left);
            int rh = height(root.right);

            return Math.max(lh , rh)+1;
        }
    }

    static int diameter(Node root){

        if(root == null)
            return 0;
        int lh = height(root.left);
        int rh = height(root.right);

        int ld = diameter(root.left);
        int rd = diameter(root.right);

        return Math.max(lh+rh+1 , Math.max(ld , rd));
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
        System.out.println("Height of the tree :"+height(root));

        System.out.println("Diameter of tree :"+diameter(root));
        
    }
}