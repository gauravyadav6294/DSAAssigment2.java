

public class Solution{

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this,right=null;
        }
    }

    static int search(int inOrder[], int start,int end,int curr){

        for(int i=start;i<=end;i++){
            if(inOrder[i]==curr){
                return i;
            }
        }
        
        return -1;
    }

    static void inOrderPrint(Node root){

        if(root==null){
            return;
        }

        inOrderPrint(root.left);
        System.out.println(root.data);
        inOrderPrint(root.right);
    }

    static void buildTree(int postOrder[],int inOrder[], int start, int end){
        

        if(start>end){
            return null;
        }

        static int idx=postOrder.length;

        int curr=postOrder[idx];
        curr--;
        Node node=new node(curr);

        if(start==end){
            return;
        }

        int pos=search(inOrder,start,end,curr);

        node.left=buildTree(postOrder,inOrder,start,pos-1);

        node.right=buildTree(postOrder,inOrder,pos+1,end);

        return;
    }

    public static void main(string [] args){
        int postOrder[]={};
        int inOrder[]={};

        Node root=buildTree(postOrder,inOrder,start,end);
        inOrderPrint(root);

    }
}