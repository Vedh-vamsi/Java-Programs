package merge;
import java.io.*;
import java.util.*;
public class DVR {
   static int graph[][];
   static int via[][];
   static int rt[][];
   static int v=0,e=0;
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter no. of vertices");
	   v=sc.nextInt();
	   System.out.println("Enter no. of edges");
	   e=sc.nextInt();
	   graph=new int[v][v];
	   via=new int[v][v];
	   rt=new int[v][v];
	   for(int i=0;i<v;i++) {
		   for(int j=0;j<v;j++)
		   {
			   if(i==j)
				   graph[i][j]=0;
			   else
				   graph[i][j]=9999;
		   }
	   }
	   for(int i=0;i<e;i++) {
		   System.out.println("Enter the details of"+(i+1)+"vertice: ");
		   System.out.println("Source: ");
		   int s=sc.nextInt();
		   s--;
		   System.out.println("Destination: ");
		   int d=sc.nextInt();
		   d--;
		   System.out.println("Enter the cost of the edge: ");
		   int c=sc.nextInt();
		   graph[s][d]=c;
		   graph[d][s]=c;
	   }
	   Dvr_calc_disp("Intial routing table: ");
	   System.out.println("Enter the source whose cost has changed: ");
	   int s=sc.nextInt();
	   s--;
	   System.out.println("Enter the destination whose cost has changed: ");
	   int d=sc.nextInt();
	   d--;
	   System.out.println("Enter the changed cost: ");
	   int c=sc.nextInt();
	   graph[s][d]=c;
	   graph[d][s]=c;
	   Dvr_calc_disp("The new Routing tables are: ");
   }
   static void Dvr_calc_disp(String message) {
	   System.out.println();
	   initial_table();
	   update_table();
	   System.out.println("meassge");
	   disp_table();
	   System.out.println();
   }
   static void initial_table() {
	   for(int i=0;i<v;i++) {
		   for(int j=0;j<v;j++) {
			   if(i==j) {
				   rt[i][j]=0;
				   via[i][j]=i;
			   }
			   else
			   {
				   rt[i][j]=9999;
				   via[i][j]=100;
			   }
			   
		   }
	   }
   }
   static void update_table()
   {
	   int k=0;
	   for(int i=0;i<4*v;i++) {
		   update_tables(k);
		   k++;
		   if(k==v)
			   k=0;
	   }
   }
   static void update_tables(int source) {
	   for(int i=0;i<v;i++) {
		   if(graph[source][i]!=9999)
		   {
			   int dist=graph[source][i];
			   for(int j=0;j<v;j++) {
				 int inter_dist=rt[i][j];
				 if(via[i][j]==source) {
					 inter_dist=9999;
				 }
				 if(dist+inter_dist<rt[source][j]) {
					 rt[source][j]=dist+inter_dist;
				     via[source][j]=i;
				 }
			   }
		   }
	   }
   }
   static void disp_table() {
	   for(int i=0;i<v;i++) {
		   for(int j=0;j<v;j++) {
			   System.out.print("Dist:  "+rt[i][j]+"    ");
		   }
		   System.out.println();
	   }
   }
}
