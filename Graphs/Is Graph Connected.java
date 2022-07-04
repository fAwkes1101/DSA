import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt) {
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }
   public static void DFS(int src, ArrayList<Edge>[] graph, boolean[] vis,ArrayList<Integer> comp){
         if(vis[src]==true) return;

         vis[src]= true;
         comp.add(src);
         for(Edge e: graph[src]){
            DFS(e.nbr, graph, vis, comp);
         }
   }
   public static void isGraph(ArrayList<Edge>[] graph){
      
      boolean[] vis = new boolean[graph.length];
      List<List<Integer>> comps = new ArrayList<>();

      for(int i=0; i<graph.length; i++){
         if(vis[i]==false){
            ArrayList<Integer> comp = new ArrayList<>();
            DFS(i, graph, vis, comp);
            comps.add(comp);
            if(comps.size()>1){
               System.out.println(false);
               return;
            }
         }
      }
      System.out.println(true);
   }
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }
      isGraph(graph);
      // write your code here
   }
}
