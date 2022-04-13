import java.io.*;
import java.util.*;

class Solution{
 
 public static void main(String [] args) throws Exception{
       
       Scanner scn=new Scanner(System.in);
       String str=scn.next();
       HashMap<String,Integer> hm=new HashMap<>();

       for(int i=0;i<str.length();i++){

           char ch=str.CharAt(i);
           if(hm.containskey(ch)){
               int old=hm.get(ch);
               int new=old+1;
               hm.put(ch,new);
           }
           else{
               hm.put(ch,1);
                
       }
    }
      char max=str.CharAt(0);
       for(int val:hm.keySet()){
           if(hm.get(key)>hm.get(max)){
               max=key;
           }
       }
       System.out.println(max);

 }