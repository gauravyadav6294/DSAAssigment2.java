

public static Solution{

    static void flattern(Node root){

        if(root==null || (root.left==null  && root.right==null)){
            return ;
        }


      // first flatern left subtree.
        if(root.left!=null){
            flattern(root.left);
        
    
    // store right subtree into temp node and attached left flattern tree to root of the binary tree.
        Node temp=root.right;
        root.right=root.left;
        root.left=null;

      // store right tree into temp node.
        Node t=root.right;
        while(t.right!=null){
            t=t.right;
        }

        t.right=temp;
    }
      
      // after that falttern right sub tree which is stored in temp node .
    flattern(root.right);
  }

  static void preOrderprint(Node root){

      if(root==null){
          return;
      }

      System.out.println(root.data+" ");
      preOrderPrint(root.left);
      
      preOrderPrint(root.right);
  }

  public static void main(String [] args){

      Node root=new Node(1);
      root.left=new Node(2);
      root.right=new Node(3);
      root.right.right=new Node(4);
      root.right.right.right=new Node(5);

      preOrderPrint(root);
      flatern(root);
      preOrder(root);

  }
}