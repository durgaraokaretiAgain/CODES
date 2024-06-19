import java.util.Scanner;
class MenuDrivenBinarySearchTree{
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    Node root;
    MenuDrivenBinarySearchTree(){
        root = null;
    }
    void insert(int data){
        root = insertRec(root, data);
    }
    Node insertRec(Node root, int data){
        if(root == null){
            root = new Node(data);
            return root;
        }
        if(data < root.data){
            root.left = insertRec(root.left, data);
        }else if(data > root.data){
            root.right = insertRec(root.right, data);
        }
        return root;
    }
    void delete(int data){
        root = deleteRec(root, data);
    }
    Node deleteRec(Node root, int data){
        if(root == null){
            return root;
        }
        if(data < root.data){
            root.left = deleteRec(root.left, data);
        }else if(data > root.data){
            root.right = deleteRec(root.right, data);
        }else{
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }
            root.data = minValue(root.right);
            root.right = deleteRec(root.right, root.data);
        }
        return root;
    }
    int minValue(Node root){
        int minv = root.data;
        while(root.left != null){
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }
    void inorder(){
        inorderRec(root);
    }
    void inorderRec(Node root){
        if(root != null){
            inorderRec(root.left);
            System.out.print(root.data + " ");      
            inorderRec(root.right);
        }
    }
    void preorder(){
        preorderRec(root);
    }
    void preorderRec(Node root){
        if(root != null){
            System.out.print(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }
    void postorder(){
        postorderRec(root);
    }
    void postorderRec(Node root){
        if(root != null){
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data + " ");
        }
    }
    public static void main(String[] args){
        MenuDrivenBinarySearchTree tree = new MenuDrivenBinarySearchTree();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("****Display****");
            System.out.println("3. Inorder");
            System.out.println("4. Preorder");
            System.out.println("5. Postorder");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the element to be inserted: ");
                    int element = sc.nextInt();
                    tree.insert(element);
                    break;
                case 2:
                    System.out.println("Enter the element to be deleted: ");
                    int element1 = sc.nextInt();
                    tree.delete(element1);
                    break;
                case 3:
                    tree.inorder();
                    System.out.println();
                    break;
                case 4:
                    tree.preorder();
                    System.out.println();
                    break;
                case 5:
                    tree.postorder();
                    System.out.println();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

} 