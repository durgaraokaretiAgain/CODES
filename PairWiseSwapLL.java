import java.util.*;
class PairWiseSwapLL{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    static Node Swap(Node head){
        Node temp = head;
        while(temp!=null && temp.next!=null){
            int t = temp.data;
            temp.data = temp.next.data;
            temp.next.data = t;
            
            temp = temp.next.next;
        }

        return head;
    }

    static void Insert(int data){ 
        Node temp = new Node(data);
        if(head == null)
            head = temp;
        else{
                Node last = head;
                while(last.next!=null){
                    last = last.next;
                }
                last.next = temp;
        }

    }

    static void Display(Node head){
        Node temp = head;

        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of LinkedList : ");
        int n = sc.nextInt();
        System.out.println("Enter Node data : ");
        for(int i=0;i<n;i++){
            int data = sc.nextInt();
            Insert(data);

        }
        System.out.println("Linked List Data : ");
        Display(head);

        head = Swap(head);
        System.out.println("After swapping Pairs : ");
        Display(head);

    }
}