
static void printLevelOrder(Node root){

    if(root==null){
        return;
    }

    Queue<Node> q=new LinkedList<>();

    q.add(root);
    q.add(null);

    int level=0;
    int sum=0;

    while(!q.isEmpty()){
        Node curr=q.remove();

        if(curr==null){
            System.out.println();

            if(q.isEmpty()){
                break;
            }
            else{
                q.add(null);
            }
        }
        else{
            if(level==k){
                sum+=curr.data;
            }
            System.out.println(curr.data+" ");
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
        return sum;
    }

  