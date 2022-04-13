

import java.util.*;
import java.io.*;

public class Main{

  public static void mergeOverIntervals(int arr[][]){

      Pair[] pairs=new pair[arr.length];

      for(int i=0;i<arr.length;i++){
          pairs[i]=new pair(arr[i][0],arr[i][1]);
      }

      Arrays.sort(pairs[i]);

      Stack<Pair> st=new Stack<>();

      for(int i=0;i<pairs.length();i++){
          if(i==0){
              st.push(pairs[i]);
          }
          else{
              pair top=st.peek();
              pair curr=pairs[i];

              if(curr.st>top.et){
                st.push(curr);
              }
              else{
                  top.et=Math.max(top.et,pairs[i].et);
              }
          }
      }

      Stack<Pair> rs=new Stack<>();
      while(st.size>0){
          rs.push(st.pop());
      }

      while(rs.size()>0){
          Pair p=rs.pop();
          System.out.println(p.st+""+p.et);
      }


      public static class Pair implements comprable<Pair>{
          int st;
          int et;

          public Pair(int st, int et){
              this.st=st;
              this.et=et;
          }

          public int compareTo(Pair other){
              if(this.st!=other.st){
                  return this.st-other.st;
              }
              else{
                  return this.et-other.et;
              }
          }
      }
  }
}
