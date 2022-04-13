// first make cycle 

void makeCycle(Node &head, int pos){

    Node temp=head;
    Node stratNode;

    int count=0;
    while(temp.next!=null){
        
        if(count==pos){
            stratNode=temp;
        }

        temp=temp.next;
        count++;
    }
    temp.next=stratNode;
}

// detect cycle 

boold detectCycle(Node &head){

    Node fast=head;
    Node slow=head;

    while(fast!=null && slow!=null){
        fast=fast.next.next;
        slow=slow.next;

        if(fast==slow){
            return true;
        }
    }
    return false;
}

// remove cycle 

Node removeCycle(Node &head){
     
     Node fast=head;
     Node slow=head;

    do{
        fast=fast.next.next;
        slow=slow.next;
    }while(fast!=slow);

    fast=head;
    while(fast.next != slow.next){
        fast=fast.next;
        slow=slow.next;
    }

    slow.next=null;
}