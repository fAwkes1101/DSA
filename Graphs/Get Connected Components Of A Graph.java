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
   public static void connectedComponent(ArrayList<Edge>[] graph){
      int n= graph.length;

      boolean[] vis = new boolean[n];

      ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
    
      for(int i=0; i<n; i++){
          if(vis[i]==false){
            ArrayList<Integer> comp= new ArrayList<>();
            DFS(i, vis, graph, comp);
            comps.add(comp);
          }
      }
      System.out.println(comps);
   }
   public static void DFS(int src, boolean[] vis, ArrayList<Edge>[] graph, ArrayList<Integer> comp ){
             if(vis[src]==true) return;

             vis[src]= true;
             comp.add(src);
             for(Edge e : graph[src]){
                DFS(e.nbr, vis, graph, comp);
             }

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

      connectedComponent(graph);
      
   }
}
