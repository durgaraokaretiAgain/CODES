import java.util.*;
import java.util.LinkedList;
class NextRightNode{
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

    static Node FindNode(Node root, int key) {
        // ...

            LinkedList<Node> queue = new LinkedList<>();
            queue.offer(root);

            // boolean found = false;
        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Node current = queue.poll();

                if (current.data == key) {
                    if (i == size - 1)
                        return null;
                    return queue.peek();
                }


                if (current.left != null)
                    queue.offer(current.left);
                if (current.right != null)
                    queue.offer(current.right);
            }
        }

        return null;
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
        System.out.println("Enter the node to find next right node :");
        int key = sc.nextInt();

        System.out.println("Next Right Node is :"+ FindNode(root , key).data);
        
    }

}