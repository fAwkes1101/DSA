import java.io.*;
import java.util.*;

public class Main {
  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      
    }
  }

  public static class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
      this.node = node;
      this.state = state;
    }
  }

  public static Node construct(Integer[] arr) {
     Stack<Pair> stk = new Stack<>();
     Node root = new Node(arr[0]);
     stk.push(new Pair(root,-1));
     int idx=0;

     while(!stk.isEmpty()){
         
         Pair par = stk.peek();

         if(par.state==-1){
           idx++;
           if(arr[idx]!=null){
             Node child = new Node(arr[idx]);
             par.node.left = child;
             stk.push(new Pair(child, -1));

           }
           par.state++;
         }
         else if(par.state==0){
           idx++;
           if(arr[idx]!=null){
             Node child = new Node(arr[idx]);
             par.node.right = child;
             stk.push(new Pair(child, -1));

           }
           par.state++;

         }
         else if(par.state==1){
           stk.pop();
         }
      
     }
     return root;
  }

  public static void display(Node node) {
    if (node == null) {
      return;
    }

    String str = "";
    str += node.left == null ? "." : node.left.data + "";
    str += " <- " + node.data + " -> ";
    str += node.right == null ? "." : node.right.data + "";
    System.out.println(str);

    display(node.left);
    display(node.right);
  }

  public static int size(Node node) {
     if(node==null) return 0;
     int mysize=1;
     int leftSize= size(node.left);
     int rightSize= size(node.right);

     mysize +=leftSize+rightSize;
     return mysize;

  }

  public static int sum(Node node) {
     if(node==null) return 0;
     int myValue = node.data;
     int leftSum = sum(node.left);
     int rightSum = sum(node.right);

     myValue += leftSum+ rightSum;

     return myValue;
  }

  public static int max(Node node) {
    if(node==null) return Integer.MIN_VALUE;

    int data= node.data;
    int leftMax = max(node.left);
    int rightMax = max(node.right);

    return Math.max(Math.max(data, leftMax),rightMax);
    
      
  }

  public static int height(Node node) {
    if(node==null) return 0;

    int leftHeight = height(node.left);
    int rightHeight = height(node.right);

    return Math.max(leftHeight,rightHeight)+1;
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Integer[] arr = new Integer[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      if (values[i].equals("n") == false) {
        arr[i] = Integer.parseInt(values[i]);
      } else {
        arr[i] = null;
      }
    }

    Node root = construct(arr);

    int size = size(root);
    int sum = sum(root);
    int max = max(root);
    int ht = height(root);
    System.out.println(size);
    System.out.println(sum);
    System.out.println(max);
    System.out.println(ht-1);
  }

}
