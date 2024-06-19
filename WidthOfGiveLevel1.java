import java.util.*;
class WidthOfGiveLevel1{
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

    static int width(Node root , int level){
        if(root == null)
            return 0;
        if(level == 1)
            return 1;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        int width = 0;
        while(!q.isEmpty()){
            int count = q.size();
            width = Math.max(width , count);
            for(int i = 0 ; i < count ; i++){
                Node temp = q.poll();
                if(temp.left != null)
                    q.add(temp.left);
                if(temp.right != null)
                    q.add(temp.right);
            }
        }
        return width; 
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            insert(sc.nextInt());
        }
        display(root);
        System.out.println("Enter the level");
        int level = sc.nextInt();
        System.out.println("Width of the given level is "+width(root , level));
        
    }


}