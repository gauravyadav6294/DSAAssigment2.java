

// pre-order Traversal.

public static void preOrder(Node root){

    if(root=null){
       System.out.println(-1+" ");
       return;
    }

    System.out.println(root.data+" "); // root
    preOrder(root.left);     // left
    preOrder(root.right);    // right.
}

// In-order traversal.

public static void inOrder(Node root){

    if(root==null){
     System.out.println(-1+" ");
    }
    inOrder(root.left);
    System.out.println(root.data+" ");
    inOrder(root.right);
}

// post-Order.

public static void postOrder(Node root){

    if(root==null){
        System.out.println(-1+" ");
        return;
    }

    postOrder(root.left);
    postOrder(root.right);
    System.out.println(root.data+"");
}