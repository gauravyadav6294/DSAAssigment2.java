

// count nodes in binary tree.

public static int countNodes(Node root){

    if(root==null){
        return 0;
    }

    int leftNodes=countNodes(root.left);
    int rigthNodes=countNodes(root.right);

    return leftNodes+rightNodes+1;
}

// sum of nodes in binary tree.

public static int sumofNodes(Node root){

    if(root==null){
        return 0;
    }

    int leftSum=sumofNodes(root.left);
    int rightSum=sumofNodes(root.right);

    return leftSum+rightSum+root.data;
}