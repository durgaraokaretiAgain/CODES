import java.util.*;
class DelMidEleLL{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    static Node Delete(Node head){
        Node temp1 = head;
        Node temp2 = head;
        Node prev = null;
        while(temp2.next!=null && temp2.next.next!=null){
            prev = temp1;
            temp1 = temp1.next;
            temp2 = temp2.next.next;

        }
        if(temp2.next!=null){
            temp1.next = temp1.next.next;
            return head;
        }
        prev.next = temp1.next;
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

        System.out.println("After deleting mid element : ");
        head = Delete(head);
        Display(head);

    }
}