import java.io.*;
import java.util.*;

public class Main {

  public static class CustomStack {
    int[] data;
    int top;

    public CustomStack(int cap) {
      data = new int[cap];
      top = -1;
    }

    int size() {
          return top+1;
    }

    void display() {
      for(int i =top; i>=0;i--){
        System.out.print(data[i]+ " ");
      }
      System.out.println();
      
    }

    void push(int val) {
      
      if(size()==data.length){
        System.out.println("Stack overflow");
        return;
      }
      top++;
      data[top]=val;

    }

    int pop() {
      if(size()==0){
        System.out.println("Stack underflow");
        return -1;
      }
        int temp =data[top];
        top--;
        return temp;
    }

    int top() {
      if(top==-1){
        System.out.println("Stack underflow");
        return -1;

      }
       return data[top];
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    CustomStack st = new CustomStack(n);

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("push")){
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push(val);
      } else if(str.startsWith("pop")){
        int val = st.pop();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("top")){
        int val = st.top();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("size")){
        System.out.println(st.size());
      } else if(str.startsWith("display")){
        st.display();
      }
      str = br.readLine();
    }
  }
}
