
class stack{

    int arr;
    int top;

    stack(){
        arr=new int[n];
        top=-1;
    }

    void push(int x){

        if(top==n-1){
            cout<<"Stack overflow"<<endl;
            return;
        }

        top++;
        arr[top]=x;
    }

    void pop(){

        if(top==-1){
            cout<<"No element to pop"<<endl;
            return;
        }

        top--;
    }

    int Top(){
        if(top==-1){
            cout<<"No element in stack"<<endl;
            return -1;
        }
        return arr[top];
    }

    bool empty(){
        return top==-1;
    }
}

