import java.util.*;
class DelCycLL{
    
    static Node head;

    static class Node{
        int data;
        Node next;
    
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

static void MakeCycle(Node head,int pos,Node tail){
    if(pos==0){
        tail.next = head;
        return;
    }
    Node temp = head;
    for(int i=0;i<pos-1;i++){
        temp = temp.next;
    }
    tail.next = temp.next;
    
}

    
static void Display(Node head){
    Node curr = head;
    if(head==null)
        System.out.println("List is Empty ");
    else{
        do{
            System.out.print(curr.data+" ");
            curr = curr.next;
        }while(curr!=head);
    }
    System.out.println();


}

static Node RemLoop(Node head){
    Node temp = head;
    Node curr=null;
    HashSet<Integer> hs = new HashSet();
    while(temp!=null){
        if(hs.contains(temp.data)){
            curr.next = temp.next;
            return head;
        }
        hs.add(temp.data);
        curr = temp;
        temp = temp.next;
    }
    return head;
}

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter size :");
    int n = sc.nextInt();

    System.out.println("Enter Nodes:");
    Node head = new Node(sc.nextInt());
    Node tail = head;
    for(int i=0;i<n-1;i++){
        int val = sc.nextInt();
        tail.next = new Node(val);
        tail = tail.next;
        
    }
    System.out.println("Enter the position to create a cycle : ");
    int pos = sc.nextInt();
    MakeCycle(head,pos,tail);

    System.out.println(" Display Nodes : ");
    Display(head);

    System.out.println("After deleting the Cycle : ");
    head = RemLoop(head);
    Display(head);
   
}

}