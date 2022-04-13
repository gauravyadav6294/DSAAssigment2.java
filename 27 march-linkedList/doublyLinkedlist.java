
class Solution{

    int data;
    Node prev;
    Node next;

    Node (int val){
        this.data=val;
        prev=null;
        next=null;

    }
}

// insert at head

void insertAtHead(Node &head, int val){

    Node n=new Node(val);

    n.next=head;
    if(head==null){
        head.prev=n;
    }

    head=n;
}

// insert at tail

void insertAtTail(Node &head, int val){

   Node n=new Node(val);
    if(head==null){

    }

    Node temp=head;
    while(temp.next!=null){
        temp=temp.next;
    }

    temp.next=n;
    n-prev=temp;
}

// deletion

void deletionAtHead(Node &head, int val){

    Node todelete=head;

    head=head.next;
    head.prev=null;


}

void deletion(Node &head, int pos){

    if(pos==1){
        deletionAtHead(head,pos);
        return;
    }

    Node temp=head;
    int count=1;

    while(temp!=null && count!=pos){
        temp=temp.next;
        count++;
    }

    temp.prev.next=temp.next;
    if(temp.next!=null){
         temp-next-prev=temp.prev;
    }

    delete temp;
}