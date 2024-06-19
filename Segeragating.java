import java.util.*;
class SegeragatingLL{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    static Node EvenAndOdd(Node head){
        Node evenStart = null;
        Node evenEnd = null;
        Node oddStart = null;
        Node oddEnd = null;
        Node current = head;

        while(current!=null){
            int element = current.data;
            if(element%2==0){
                if(evenStart==null){
                    evenStart = current;
                    evenEnd = evenStart;
                }
                else{
                    evenEnd.next = current;
                    evenEnd = evenEnd.next;
                }
            }
            else{
                if(oddStart==null){
                    oddStart = current;
                    oddEnd = oddStart;
                }
                else{
                    oddEnd.next = current;
                    oddEnd = oddEnd.next;
                }
            }
            current = current.next;
        }
        if(oddStart==null || evenStart==null)
            return head;
        evenEnd.next = oddStart;
        oddEnd.next = null;
        head = evenStart;
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
        head = EvenAndOdd(head);
        System.out.println("Linked List Data after Segeragating : ");
        Display(head);
        

    

    }
}