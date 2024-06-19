import java.util.*;
public class LLlastfirstSwitch{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    static Node head;
    static Node SwitchLastFirst(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node secLast = null;
        Node last = head;
        while(last.next != null){
            secLast = last;
            last = last.next;
        }
        secLast.next = null;
        last.next = head;
        head = last;
        return head;
    }
    static void Insert(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;

        }
        temp.next = new_node;

    }
    static void DisplayList(Node head){

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the list");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the list");
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            Insert(x);
        }
        System.out.println("The list is: ");
        DisplayList(head);
        head = SwitchLastFirst(head);
        System.out.println("The list after switching the first and last element is: ");
        DisplayList(head);
        
    }

}