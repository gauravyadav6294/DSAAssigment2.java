public class Solution{

    public static int getPivot(int arr[]){

        int s=0;
        int e=arr.length-1;

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
}