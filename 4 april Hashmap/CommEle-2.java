import java.io.*;
import java.util.*;

class Solution{

    public static void main(String [] args){
        Scanner scn=new Scanner(System.in){

            int n1=scn.nextInt();
            int a1[]=new int[n1];
            for(int i=0;i<n1;i++){
                a1[i]=scn.nextInt();
            }

            int n2=scn.nextInt();
            int a2[]=new int[n2];
            for(int i=0;i<n2;i++){
                a2[i]=scn.nextInt();

            }

            HashMap<Integer,Integer> hm=new HashMap<>();

            for(int val:a1){
                if(hm.containkeys(val)){
                    int old=hm.get(val);
                    int new=old+1;
                    hm.put(val,new);
                }
                else{
                    hm.put(val,1);

                }
            }

            for(int val:a2){
                if(hm.containkeys(val)){
                    System.out.println(val);
                    int old=hm.get(val);
                    if(old>1){
                        hm.put()
                    }
                    else{
                        hm.remove(val);
                    }
                }
            }


        }
    }
}