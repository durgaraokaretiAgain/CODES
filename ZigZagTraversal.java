import java.util.*;
class ZigZagTraversal{
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

    static void ZZTree(Node root){

        if(root == null)
            return ;

        Stack<Node> Cl = new Stack<>();

        Stack<Node> Nl = new Stack<>();

        Cl.push(root);
        boolean flag = true;

        while(!Cl.isEmpty()){

            Node temp = Cl.pop();

            if(temp!=null){
                System.out.print(temp.data+" ");
            }

            if(flag){

                if(temp.left!=null)
                    Nl.push(temp.left);
                
                if(temp.right!=null)
                    Nl.push(temp.right);
            }
            else{

                if(temp.left != null)
                    Nl.push(temp.right);
                
                if(temp.right != null)
                    Nl.push(temp.left);
            }

            if(Cl.isEmpty()){
                flag = !flag;
                Stack<Node> t = Cl;
                Cl = Nl;
                Nl = t;
            }
        }
    }

    public static void main(String[] args){

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
        System.out.println("Zig Zag Tree is :");
        ZZTree(root);
    }
}