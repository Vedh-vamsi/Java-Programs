package merge;
import java.util.*;
import java.lang.*;
import java.io.*;
class Dijkstra {
	public static final int num_ver=6;
	static int minDistance(int path_arr[],boolean sptset[]) {
		int min=Integer.MAX_VALUE,min_index=-1;
		for(int i=0;i<num_ver;i++) {
			if(sptset[i]!=false&&path_arr[i]<min)
			{
				min=path_arr[i];
				min_index=i;
			}
		}
		return min_index;
	}
	void printMinDistance(int path_arr[]) {
		System.out.println("Vertex# \t Minimum distance from source");
		for(int i=0;i<num_ver;i++) {
			System.out.println(i+"\t\t\t"+path_arr[i]);
		}
	}
	static void algo_dijkstra(int graph[][],int src_node) {
		int path_arr[]=new int[num_ver];
		boolean sptset[]=new boolean[num_ver];
		for(int i=0;i<num_ver;i++) {
			path_arr[i]=Integer.MAX_VALUE;
			sptset[i]=false;
		}
		path_arr[src_node]=0;
		for(int c=0;c<num_ver;c++) {
			int u=minDistance(path_arr,sptset);
			sptset[u]=true;
			for(int v=0;v<num_ver;v++) {
				if(!sptset[u]&&graph[u][v]!=0&&path_arr[u]!=Integer.MAX_VALUE&&path_arr[u]+graph[u][v]<path_arr[v]) {
					path_arr[v]=path_arr[u]+graph[u][v];
				}
			}
			
		}
	}
}