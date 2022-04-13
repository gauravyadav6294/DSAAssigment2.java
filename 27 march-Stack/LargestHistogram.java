class Solution{

    public static void main(String [] args)throws Exception{

        Buffereadaer br=new Buffereadaer(new InputstreamReader(System.in));

        int n=Integer.parseInt(br.readLine());
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
      // first find right boundary.(rigth smallest element).
     
        int rb[]=new int[arr.length];

        Stack<Integer> st=new Stack<>();
        st.push(arr.length-1);

        rb[arr.length-1]=arr.length;

        for(int i=arr.length-2;i>=0;i--){
            while(st.size()>0 && arr[i]<=arr[st.peek()]){
                st.pop();
            }

            if(st.size()==0){
                rb[i]=arr.length;
            }
            else{
                rb[i]=st.peek();
            }
            
            st.push(i);
        }

      // find left boundary(left smallest element).

        int lb[]=new int[arr.length];

        Stack<Integer> st=new Stack<>();
        lb[0]=-1;

        for(int i=1;i<arr.length;i++){
            while(st.size()>0 && arr[i]<=arr[st.peek()]){
                st.pop();
            }
\
            if(st.size()==0){
                lb[i]=-1;
            }
            else{
                lb[i]=st.peek();
            }

            st.push(i);
        }

    // we have left or right boundary find max width and area.
        int maxArea=0;

        for(int i=0;i<arr.length;i++){

            int width=rb[i]-lb[i]-1;
            int area=arr[i]*width;

            if(area>maxArea){
                maxArea=area;
            }
        }

        System.out.println(maxArea);
    }
}