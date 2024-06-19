import java.util.*;
class  KthSmallestValueBST{

    static ArrayList<Integer> ar = new ArrayList<>();
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
            ar.add(root.data);
            display(root.right);
        }

    }

    static int FindValue(Node root , int k){
        if(root == null || k>ar.size())
            return -1;

        return ar.get(ar.size()-k);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            insert(sc.nextInt());
        }
        display(root);
        System.out.println();
        System.out.println("Enter the value of k");
        int k = sc.nextInt();
        System.out.println(k+"th smallest value: "+FindValue(root , k));
        
    }
}