

public static int height(Node root){

    if(root==null){
        return 0;
    }

    Node leftHeight=height(root.left);
    Node rightHeight=height(root.right);

    return Math.max(leftHeight,rightHeight)+1;
}