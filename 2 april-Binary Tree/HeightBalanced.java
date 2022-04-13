
 // time-complexity=O(n*n).

public static boolean balancedHeight(Node root){

    if(root==null){
        return true;
    }

    if(isbalanceHeight(root.left)==false){
        return false;
    }

    if(isbalanceHeight(root.right)==false){
        return false;
    }

    int lh=height(root.left);
    int rh=height(root.right);

    if(abs(lh-rh)<=1){
        return true;
    }
    else{
        return false;
    }
}