import java.io.*;
import java.util.*;

class Solution{
 
   public static int commanEle(int a1[], int a2[], int n1, int n2){

    HashMap<Integer,Integer> hm=new HashMap<>();

    for(int val=0;val<a1.length;val++){
        if(hm.containkeys(val)){
            int old=hm.get(val);
            int new=old+1;
            hm.put(val, new);
        }
        else{
            hm.put(val,1);
        }
    }

    for(int val:a2){
        if(hm.containkey(val)){
            System.out.println(val);
        }
    }
   }
}