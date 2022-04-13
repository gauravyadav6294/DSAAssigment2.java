class Solution{

    public static int firstOcc(int arr[], int target){

        int low=0;
        int high=arr.length-1;

        while(low<high){

        int mid=low+(high-low)/2;
        int ans=-1;

        if(arr[mid]==target){
            ans=arr[mid];
            high=mid-1;  // to find last occurence shift search space toward right side.
            return ans;
        }
        else if(arr[mid]<target){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
      }

      return -1;
    }
}