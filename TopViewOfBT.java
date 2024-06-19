import java.util.*;

import java.util.LinkedList;
class TopViewOfBT{
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
    static class Pair{
        Node node;
        int hd;
        Pair(Node n, int h){
            node = n;
            hd = h;
        }
    }
    static void topView(Node root){
        if(root == null) return;
        Queue<Pair> q = new LinkedList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        q.add(new Pair(root, 0));
        while(!q.isEmpty()){
            Pair p = q.poll();
            Node curr = p.node;
            int hd = p.hd;
            if(!map.containsKey(hd)){
                map.put(hd, curr.data);
            }
            if(curr.left != null){
                q.add(new Pair(curr.left, hd-1));
            }
            if(curr.right != null){
                q.add(new Pair(curr.right, hd+1));
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.print(entry.getValue() + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            int x = sc.nextInt();
            insert(x);
        }
        System.out.println("Top View of the tree is: ");
        topView(root);
        
    }
}