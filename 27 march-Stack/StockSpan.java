
/*
1• Iterate through the string and :

1• Create a new stack and initialize the span array's first value, 0. 2• Loop through all the elements 
from 1 to n.


1• If the stack top is greater than equals to the current value keep popping. 2• (a) If the stack now is
 empty then span[index] will be index+1. 3• (b) Else span[index] will have index - (value at the top of 
 the stack). 4• Finally push the current index into the stack.
*/


class Solution{

    public static int[] solve(int arr[]){

        int span[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();

        st.push(0);
        span[0]=1;

        for(int i=1;i<arr.length;i++){
            while(st.size()>0 && arr[i]>arr[st.peek()]){
                st.pop();
            }

            if(st.size()==0){
               span[i]=i+1;
            }
            else{
              span[i]=i-st.peek();
            }

            st.push(i);
        }

        return span;
    }
}

// time-complexity=O(n).
// space-complexity=O(n)  beacuse we are using auxillary stack.