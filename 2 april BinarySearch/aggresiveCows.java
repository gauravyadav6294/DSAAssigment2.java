class Solution{

    public static boolean isPossible(int arr[], int n, int m, int mid){
          
          int cowCount=1;
          int lastPos=arr[0];

          for(int i=0;i<n;i++){

              if(arr[i]-lastPos[0]>=mid){
                  cowCount++;
                  if(cowCount==k){
                      lastPos=arr[i];
                  }
              }
          }

          return false;
    }

    public static int aggresivecows(int arr[], int n){

       int s=0;
       int n=arr.length;

       int e=arr[n-1];
       int ans=-1;
       int mid=s+(e-s)/2;

       while(s<=e){
           if(isPossible(arr,n,m,mid)){
               ans=mid;
               s=mid+1;
           }
           else{
               e=mid-1;
           }

       }
       return ans;
    }
}