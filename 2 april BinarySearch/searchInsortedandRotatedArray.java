class Solution{

    public static int getPivot(int arr[], int n){

        int s=0;
        int e=n-1;

        int mid=s+(e-s)/2;

        while(s<e){
            if(arr[mid]>=arr[0]){
                s=mid+1;
            }
            else{
                e=mid;
            }
        }
        return s;
    }

    public static int binarySearch(int arr[], int s, int e, int n,int key){

        int start=s;
        int end=e;

        int mid=start+(end-start)/2;

        while(s<e){
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }

    public static int findPosition(int arr[],int n, int k){
        
        int pivot=getPivot(arr, n){
            if(k>=arr[pivot] && k<=arr[n-1]){
              return binarySearch(arr,pivot,n-1,k);
            }
            else{
                return binarySearch(arr,0,pivot-1,k);
            }
        }
    }
}