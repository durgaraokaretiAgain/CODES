import java.lang.reflect.Array;
import java.util.*;
class FloarAndCielOfNode{
    static ArrayList<Integer>arr = new ArrayList<>();
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
            arr.add(root.data);
            System.out.print(" "+root.data);
            display(root.right);
        }

    }

    static ArrayList<Integer> FindValues(Node root , int key){
        if(key < arr.get(0))
            return new ArrayList<Integer>(Arrays.asList(-1, arr.get(0)));
        if(key == arr.get(0))
            return new ArrayList<Integer>(Arrays.asList(arr.get(0), arr.get(0)));
        
        for(int i=1;i<arr.size();i++){
            if(key == arr.get(i))
                return new ArrayList<Integer>(Arrays.asList(arr.get(i), arr.get(i)));
            if(arr.get(i-1)<key && arr.get(i)>key)
                return new ArrayList<Integer>(Arrays.asList(arr.get(i-1), arr.get(i)));
        }

        return new ArrayList<Integer>(Arrays.asList(-1, -1));
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No Of Nodes");
        int n = sc.nextInt();
        System.out.println("Enter nodes:");
        for(int i=0;i<n;i++){

            insert(sc.nextInt());
        }

        System.out.println("Tree is :");
        display(root);
        System.out.println();
        System.out.println("Enter Key:");
        int key = sc.nextInt();
        ArrayList<Integer> ar = FindValues(root, key);
        System.out.println("Floar :"+ar.get(0));
        System.out.println("Ciel :"+ar.get(1));
    }
}