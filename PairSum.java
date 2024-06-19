import java.util.*;
class PairSum{
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
    static int[] FindSum(Node root ,int key){

        int sum= 0;
        int[] a =new int[2];
        a[0] = -1;
        a[1] = -1;

        int i=0,j=arr.size()-1;

        while(i<j){
            sum = arr.get(i)+arr.get(j);
            if(sum == key){
                a[0] = arr.get(i);
                a[1] = arr.get(j);
                return a;
            }
            else if(sum > key)
                j--;

            else{
                i++;
            }
        }

        return a;
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
        int[] a = FindSum(root,key);
        System.out.println("Pair is : "+a[0]+" , "+a[1]);
    }

}