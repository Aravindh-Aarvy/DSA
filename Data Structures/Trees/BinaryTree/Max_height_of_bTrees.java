class Max_height_of_bTrees {
  
     static int findMaxHeight(Node node){
       if(node==null) return 0;
       
       int l = findMaxHeight(node.left);
       int r = findMaxHeight(node.right);
        
        return 1+Math.max(l,r);
    }

  
    public static void main(String[] args) {
            Node node = new Node(1);
        node.left = new Node(3);
        node.right = new Node(2);
        node.left.left = new Node(6);
        node.left.right = new Node(7);
        node.right.left = new Node(4);
        node.right.right = new Node(5);
        node.right.right.right = new Node(9);
         node.right.right.right.left = new Node(10);
         int k = findMaxHeight(node);
        System.out.println("Max hight" + k);
    }
 
}

class Node {
    int data;
    Node left, right;

    Node(int x) {
        data = x;
    }
}
