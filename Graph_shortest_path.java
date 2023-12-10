package merge;
import java.io.*;
import java.lang.*;
import java.util.*;
public class Graph_shortest_path {
     static final int no_of_vertices=6;
     static int minDistance(int path_arr[],Boolean sptSet[]) {
    	 int min=Integer.MAX_VALUE;
    	 int min_idx=-1;
    	 for(int i=0;i<no_of_vertices;i++) {
    		 if(sptSet[i]==false&&path_arr[i]<min) {
    			 min=path_arr[i];
    			 min_idx=i;
    		 }
    	 }
    	 return min_idx;
     }
     static void print_path(int path_arr[]) {
    	 System.out.println("Vertex# \t minimum distance from the source");
    	 for(int i=0;i<no_of_vertices;i++)
    		 System.out.println(i+"\t\t\t"+path_arr[i]);
     }
     static void algodijkstra(int graph[][],int src_node) {
    	 int path_arr[]=new int[no_of_vertices];
    	 Boolean sptSet[]=new Boolean[no_of_vertices];
    	 for(int i=0;i<no_of_vertices;i++)
    	 {
    		 path_arr[i]=Integer.MAX_VALUE;
    		 sptSet[i]=false;
    	 }
    	 path_arr[src_node]=0;
    	 for(int c=0;c<no_of_vertices;c++) {
    		 int u=minDistance(path_arr,sptSet);
    		 sptSet[u]=true;
    		 for(int v=0;v<no_of_vertices;v++) {
    			 if(!sptSet[v]&&graph[u][v]!=0&&path_arr[u]!=Integer.MAX_VALUE&&path_arr[u]+graph[u][v]<path_arr[v])
    				 path_arr[v]=path_arr[u]+graph[u][v];
    		 }
    	 }
    	 print_path(path_arr);
     }
     public static void main(String[] args) {
    	 int graph[][] = new int[][] { { 0, 2, 1, 0, 0, 0},
             { 2, 0, 7, 0, 8, 4},
             { 1, 7, 0, 7, 0, 3},
             { 0, 0, 7, 0, 8, 4},
             { 0, 8, 0, 8, 0, 5},
             { 0, 4, 3, 4, 5, 0} };
             algodijkstra(graph,0);
     }
}
