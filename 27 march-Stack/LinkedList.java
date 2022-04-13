

class node{

    
    int data;
    node* next;

    node(int val){
        data=val;
        next=NULL;
    }
}

class stack{

    node* top;
    public:
    stack(){
        top=NULL;
    }

    void push(int x){
        node* n=new node(x);
        n->next=top;
        top=n;
    }

    void pop(){
        if(top==NULL){
            cout<<"Nothing to pop in stack"<<endl;
            return;
        }
        node* todelete = top;
        top=top->next;

        delete todelete;
    }

    int Top(){
        if(top==NULL){
            cout<<"no element in stack"<<endl;
            return -1;
        }

        return top->data;
    }

    bool empty(){
        return top==NULL;
    }
};

