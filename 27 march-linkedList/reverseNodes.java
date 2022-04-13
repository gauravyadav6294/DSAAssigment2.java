class Solution{

    Node reverseNodes(Node &head){

        Node prevptr=null;
        Node currptr=head;
        Node nextptr;

        while(currptr!=null){

            nextptr=currptr.next;
            prevptr=currptr.next;

            prevptr=currptr;
            currptr=nextptr;

        }

        return prevptr;
    }
}


// using recursive

Node reverseRecursive(Node &head){

    Node newHead=reverseRecursive(head.next);
    head.next.next=head;
    head.next=null;
}