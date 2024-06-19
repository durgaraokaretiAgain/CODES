import java.util.*;
import java.util.LinkedList;
class LevelWithMaxNoOfNodes{
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

    static void MaxNodesLevel(Node root){
        if(root == null)
            return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int level = 1;
        int max = 0;
        int level_no = 0;
        while(!q.isEmpty()){
            int n = q.size();
            if(n > max){
                max = n;
                level_no = level;
            }
            for(int i = 0; i < n; i++){
                Node temp = q.poll();
                if(temp.left != null)
                    q.add(temp.left);
                if(temp.right != null)
                    q.add(temp.right);
            }
            level++;
        }
        System.out.println("Level with max no of nodes is : "+level_no);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            insert(sc.nextInt());
        }
        display(root);
        System.out.println();
        MaxNodesLevel(root);
    }
}