import java.util.*;
import java.io.*;

public class Solution{

    public static void main(String [] args){
        Buffereadaer br=new Buffereadaer(new InputstreamReader(System.in));
        String str=br.readLine();

        Stack<Chracter> st=new Stack<>();
        for(int i=0;str.length();i++){
            char ch=str.charAt(i);
            if(ch==")"){
                if(st.peek()=="("){
                    System.out.println(true);
                    return;
                }
                else{
                    while(st.peek()!="("){
                        st.pop();
                    }
                    st.pop();
                }
            }
                else{
                    st.push(ch);
                }
        }

        System.out.println(false);
    }
}
