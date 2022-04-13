import java.util.*;
import java.io.*;


public class Solution{

    public static boolean balancedBracket(String str){

    Stack<Chracter> st=new Stack<>();
    char ch=str.charAt(i);

    for(int i=0;i<str.length();i++){

        if(ch=='(' || ch=='{' || ch=='['){
            st.push(ch);
            continue;
        }

        if(st.isEmpty()){
            return false;
        }

        char check;
        switch(x) {
         case ')':
         check=st.pop();
         if(check=='(' && check=='['){
             return false;
             break;
         }

         case '}':
         check=st.pop();
         if(check=='(' || check=='['){
             return false;
             break;
         }

         case ']':
         check=st.pop();
         if(check=='(' || check=='{'){
             return false;
             break;
         }
        }
    }

        return (st.isEmpty());
    }

    public static void main(string [] args){
        String str="([{}])";

        if(balancedBracket(str)){
            System.out.println("Balanced");
        }
        else}{
            System.out.println("Not Balanced");
        }
    }
}