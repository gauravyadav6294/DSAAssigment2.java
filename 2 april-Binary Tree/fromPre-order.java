
// build binary tree from preOrder or Inorder.

/*

algorithum-
1. pick element from preorder and create a node.
2. increment preorder idx.
3. search for picked element pos in inorder.
4. call to build left subtree from inorder 0 to pos-1.
5. call to build right subtree from inorder pos+1 to n.
6. return the node.

*/

public class Solution{
  
  static class Node{

      int data;
      Node left;
      Node right;

      Node(int data){
          this.data=data;
          this.left=null;
          this.right=null;
      }
  }

//  search for picked element pos in inorder.
  static int search(int inOrder[],int strat, int end,int curr){

    for(int i=strat;i<=end;i++){
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
  static Node buildTree(int preOrder[],int inOrder[],int start, int end){

    if(start>end){
       return null;
    }

    static int idx=0;
   
   //1. pick element from preorder and create a node increment preorder idx.
    int curr=preOrder[idx];
    curr++;
    Node node=new Node(curr);

    if(start==end){
       return;
    }
   
   //2. search for picked element pos in inorder.
    int pos=search(inOrder,strat,end,curr);

 //3. call to build left subtree from inorder 0 to pos-1.
    node.left=buildTree(preOrder,inOrder,start,pos-1);
 //4. call to build right subtree from inorder pos+1 to n.
    node.right=buildTree(preOrder,inOrder,pos+1,end);

    return;

    }

    public static void main(String[] args){

      int preOrder[]={1,2,3,4,5};
      int inOrder[]={4,2,1,5,3};

      Node root=buildTree(preOrder,inOrder,0,4);
      inOrderPrint(root);
    }


  }

}