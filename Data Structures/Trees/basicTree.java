
class basicTree {
    public static void main(String[] args) {
        Node node= new Node(1);
        node.right = new Node(2);
        node.left = new Node(3);
        node.right.left = new Node(4);
        node.right.right = new Node(5);
        node.left.left = new Node(6);
        node.left.right = new Node(7);
        System.out.println("PreOrder Traversal");
        preOrderTraversal(node);
         System.out.println();
        System.out.println("in order traversal");
        InOrderTraversal(node);
         System.out.println();
         
        System.out.println("Post Order Traversal ");
        PostOrderTraversal(node);
        System.out.println();
        
        // System.out.println("level Order Traversal ");
        // levelOrderTraversal(node);
        
    }
    
    static void preOrderTraversal(Node node){
        if(node ==  null) return;
        System.out.print(node.data);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }
     static void InOrderTraversal(Node node){
        if(node ==  null) return;
        
        InOrderTraversal(node.left);
        System.out.print(node.data);
        InOrderTraversal(node.right);
    }
    static void PostOrderTraversal(Node node){
        if(node ==  null) return;
        PostOrderTraversal(node.left);
        PostOrderTraversal(node.right);
        System.out.print(node.data);
       
    }
}



class Node{

Node right;
int data;
Node left;

 Node(int x){
data = x;
}
}
