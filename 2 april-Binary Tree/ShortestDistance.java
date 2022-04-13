

public static Solution{

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

    static int findDist(node root,int k, int dist){

        if(root==null){
            return -1;
        }

        if(root.data==k){
            return dist;
        }

        int left=find(root.left,k,dist+1);
         if(left!=-1){
             return left;
         }
         retrun findDist(root.right,k,dist+1);
    }

    static int distBtNodes(Node root,, int n1, int n2){

        Node lca=LCA(root,n1,n2);

        int d1=findDist(lca,n1,0);
        int d2=findDist(lca,n2,0);

        return d1+d2;
    }

    public static void main(String [] args){

        Node root=new Node(1);
         root.left=new Node(2);
         root.right=new Node(3);
         root.left.left=new node(4);
         root.right.right=new Node(5);
         System.out.println(root,4,5);
    }

}