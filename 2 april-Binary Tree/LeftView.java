

public static void leftView(Node root){

    if(root==null){
        return;
    }

    Queue<Node> q=new LinkedList<>();

    q.add(root);

    while(!q.isEmpty()){
      int n=q.size();

      for(int i=0;i<=n;i++){
         Node curr=q.front();
         q.remove();
      }

      if(i==1){
          System.out.println(curr.data);
      }

      if(curr.left!=null){
          q.add(curr.left);
      }

      if(curr.right!=null){
          q.add(curr.right);
      }
    }
}