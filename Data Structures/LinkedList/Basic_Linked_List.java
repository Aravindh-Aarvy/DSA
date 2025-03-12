public class LinkedList{

    public static void main (String ... args){

        System.out.println("bye world");
        
        //create Linked List

        Node curNode = new Node(1);
        Node head = curNode;
      

        curNode.next =  new Node(2);
        curNode.next.next = new Node(3);

        // printing
        while(head.next != null){

            System.out.println(head.data);
            head = head.next;
        }
          System.out.print(head.data);
        System.out.println();
    }
}
class Node{

    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }

}
