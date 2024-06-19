import java.util.*;
class ReverseLinkedList{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    static Node reverseOperation(Node head){
        Node temp = head;
        int count =0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        if(count==1)
            return head;
        for(int i=0;i<count-1;i++){
            temp = head;
            for(int j=0;j<count-i-1;j++){
                int tempData = temp.data;
                temp.data = temp.next.data;
                temp.next.data = tempData;
                temp = temp.next;
            }
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
        System.out.println("Reverse Linked List Data : ");
        head = reverseOperation(head);
        Display(head);
        

    

    }
}