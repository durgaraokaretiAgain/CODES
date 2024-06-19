import java.util.*;
class LinkedList{
    
    static Node head;

    static class Node{
        int data;
        Node next;
    
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
static void InsertLast(int x){
    Node temp = new Node(x);
    if(head==null)
        head=temp;
    else{
            Node last = head;
            while(last.next!=null){
                last=last.next;
            }
            last.next=temp;
        }
}
static void InsertFirst(int x){
    Node temp = new Node(x);
    if(head==null){
        head=temp;
    }
    else{
        temp.next=head;
        head=temp;
    }
}
static void InsertMid(int p,int x){
    Node temp = new Node(x);
    Node p1;
    Node p2;
    if(head==null)
        head= temp;
    else{
        p1 = head;
        p2 = head.next;

        for(int i=1;i<p-1;i++){
            p1=p1.next;
            p2=p2.next;
        }
        p1.next = temp;
        temp.next = p2;
    }
}
static void DeleteLast(){
    if(head==null || head.next == null){
        head = null;
        return;
    }
    Node temp1 = head;
    Node temp2 = head.next;

    while(temp2.next!=null){
        temp1 = temp1.next;
        temp2 = temp2.next;
    }

    temp1.next = null;

}
    
static void Display(){
    Node curr = head;
    if(head==null)
        System.out.println("List is Empty ");
    System.out.println("Nodes : ");
    while(curr!=null){
        System.out.println(curr.data+" ");
        curr=curr.next;
    }
    System.out.println();
}

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter size :");
    int n = sc.nextInt();

    System.out.println("Enter Nodes:");
    for(int i=0;i<n;i++){
        int val = sc.nextInt();
        InsertFirst(val);
        System.out.println(val+" Inserted.");
    }

    System.out.println(" Display Nodes : ");
    Display();

    System.out.println("Enter a index where the element to be insert ");
    int p = sc.nextInt();
    System.out.println("Enter element to be insert");
    int x1 = sc.nextInt();
    InsertMid(p, x1);

    System.out.println("Delete a Last Node :");
    DeleteLast();

    System.out.println("Updated List");
    Display();
}

}