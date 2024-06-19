import java.util.Scanner;
class BST{
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
        
        root = insertrec(root,x);
    }

    static Node insertrec(Node root , int x){
        if(root == null){
            root = new Node(x);
            return root;
        }
        
        if(x < root.data){
            root.left = insertrec(root.left , x);
        }
        else if(x > root.data){
            root.right = insertrec(root.right , x);
        }

        return root;
    }

   static void delete(int x){
        
        root = deleterec(root,x);

    }
    
    static Node deleterec(Node root , int x){
        if(root == null){
            return root;
        }

        if(x < root.data){
            root.left = deleterec(root.left,x);
        }
        else if(x > root.data){
            root.right = deleterec(root,x);

        }
        else{
            if(root.left == null && root.right == null){
                return null;
            }
            else if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            root.data = Successor(root.right);
            root.right = deleterec(root.right,root.data);
        }

        return root;
    }

    static int Successor(Node root){
        
        int val = root.data;
        while(root.left != null){
            val = root.left.data;
            root = root.left;
        }
        return val;

    }

    static void display(){

    }

    static void inorder(){
        inorderrec(root);

    }
    static void inorderrec(Node root){
        if(root != null){
            inorderrec(root.left);
            System.out.println(root.data + " ");
            inorderrec(root.right);
        }
    
    }

    public static void main(String[] ars){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        System.out.println("Enter the elements");
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            insert(x);
        }
        System.out.println("Inorder Traversal");
        inorder();
        System.out.println("Enter the number of elements to be deleted");
        int m = sc.nextInt();
        System.out.println("Enter the elements to be deleted");
        for(int i = 0; i < m; i++){
            int x = sc.nextInt();
            delete(x);
        }
        System.out.println("Inorder Traversal");
        inorder();
    }
}