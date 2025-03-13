public class insert_in_begining_LinkedList{

   public static void main(String ... args){

     //creating new list 
    Node linkedList = new Node(1);
    linkedList.next = new Node(2);
    linkedList.next.next = new Node(3);

     // calling method to add value in the beginning
    insert_in_beg(linkedList,10);
     
   }
  
    public static void  insert_in_beg(Node node, int data){

      // created new node using data and pointed head of the existing node to our new node
        Node newNode = new Node(data);
        newNode.next = node;
        print_Linked_list(newNode);

    }

    public static void print_Linked_list(Node node){

       Node head = node;
      
        while(head.next != null){
            System.out.println(head.data);
            head = head.next;
        }
         System.out.println(head.data);
    }
}


class Node{
    int data;
    Node next;
    Node(int x){
        this.data = x;
        this.next = null;
    }
    Node(){}
}
