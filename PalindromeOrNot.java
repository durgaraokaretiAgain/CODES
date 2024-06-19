import java.util.*;
class PalindromeOrNot{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    static boolean isPalindrome(Node head){
        Node temp = head;
        Stack<Integer> stack = new Stack<Integer>();
        while(temp!=null){
            stack.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while(temp!=null){
            if(temp.data!=stack.pop())
                return false;
            temp = temp.next;
        }
        return true;
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
        
        System.out.println("Is Palindrome : "+isPalindrome(head));
        

    

    }
}