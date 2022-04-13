class Solution{

    Node reverseNodes(Node &head, int k){

        Node prevptr=null;
        Node currptr=head;
        Node nextptr;
        int count=0;

        while(currptr!=null){

            nextptr=currptr.next;
            currptr.next=prevptr;

            prevptr=currptr;
            currptr=nextptr;
            count++;

        }

        if(nextptr!=null){
            head.next=reverseK(next,k);
        }

        return prevptr;
    }
}