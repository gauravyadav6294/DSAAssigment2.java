
/*

brute force approach-

● We will iterate from the end and also we need to create an answer array. ● If we are not able to find 
the greater element than our current element then we will simply store -1 at that position, otherwise we
 will store the greater element at that place.


 optimised-approach-

 ● We will take a stack. ● We will take an answer array. ● We need to iterate from the end.

 ● Now we will check if the element present at the top of the stack is less than or equal to the current 
 element then we will pop the element present at the top of the stack.

 ● If the stack is empty then put -1 in the answer array otherwise put the current element to the answer array.


● In the end we will simply push the current element into the stack.


Now in the end we will return the answer array and that’s it for this question.
*/


class Solution{

  public static int[] nextGreater(int arr[]){

      int nge[]=new int[arr.length];

      Stack<Integer> st=new Stack<>();

      
      st.push(arr[arr.length-1]);
      nge[arr.length-1]=-1;

      while(st.size()==0 && arr[i]>st.peek()){
          st.pop();
      }

      if(st.size()==0){
          nge[i]==-1;
      }
      else{
          nge[i]=st.peek();
      }

      st.push(arr[i]);
  }

  return nge;
}

// time-complexity=O(n).
// space-complexity=O(n).