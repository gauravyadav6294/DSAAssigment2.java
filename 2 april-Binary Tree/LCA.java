
// time-complexity=O(n).
public class Solution{

    static class Node{

        int data;
        Node left;
        Node right;

        Node(){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }

    static boolean getPath(Node root, int key, ArrayList<Intgere> &path){

        path.add(root.data);
        if(root.data==key){
            return true;
        }

        if(getPath(root.left,key,path) || getPath(root.right,key,path)){
            return true;
        }

        path.remove(root.data);
        return false;
    }

    static int LCA(Node root, int n1, int n2){
         
        ArrayList<Integer> path1=new ArrayList<>();
        ArrayList<Integer> path2=new ArrayList<>();

        if(!getPath(root,n1,path1) || !getPath(root,n2,path2)){
            return -1;
        }

        int pc;
        for( pc=0, pc<path1.size() && path2.size();i++){
            if(path1[pc]!=path2[pc]){
                break;
            }
        }
        return path1[pc-1];
    }
}


// second method    Time-complexity=O(n).

static Node LCA2(Node root, int n1, int n2){

    if(root==null){
      return null;
    }

    if(root.data==n1 && root.data==n2){
        return root;
    }

    Node leftLCA=LCA2(root.left,n1,n2);
    Node rightLCA=LCA2(root.right,n1,n2);


    if(leftLCA && rightLCA){
        return root;
    }

    if(leftLCA!=null){
        return leftLCA;
    }
      return rightLCA;
}