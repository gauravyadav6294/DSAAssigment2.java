

public class BinaryTreeYT{

    static class Node{
        int data;
        int left;
        int right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.rigth=null;
        }
    }

    static class BinaryTree{
        static int idx=-1;

        // method define inside class.
        public static Node buildTree(int nodes[]){
            idx++;

            if(nodes[idx]==-1){
                return null;
            }

            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }
    }

        public static void main(String [] args){
            int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

            BinaryTree tree=new BinaryTree();
            Node root=tree.buildTree(nodes);
            System.out.println(root.data);
        }
}


// imp -point root is like a pointer in binary tree which is used in traversal of tree.lca