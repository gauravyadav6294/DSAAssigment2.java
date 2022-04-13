

public static void sumReplace(Node root){

    if(root==null){
        return;
    }

    sumReplace(root.left);
    sumReplace(root.right);

    if(root.left!=null){
        root.data=root.left.data;
    }

    if(root.right!=null){
        root.right=root.right.data;
    }


    static void preOrder(Node root){

        if(root==null){
            return;
        }

        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(string [] args){
        preOrder(root);
        sumReplace(root);
        preOrder(root);
    }
}